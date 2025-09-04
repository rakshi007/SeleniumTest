package util;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.Point;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.Assert.*;
import static util.LoggerUtil.info;

public class UIActions {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;

    public UIActions(WebDriver driver) {
        if (driver == null) {
            throw new IllegalArgumentException("WebDriver must not be null");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        this.actions = new Actions(driver);
    }

    private String getCurrentTimestamp() {
        return new SimpleDateFormat("hh:mm:ss a").format(new Date());
    }

    public void clickAndWait(By locator, String logMessage) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            // Optional scroll into view if element might be off-screen
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            // Optional small delay for stability
            Thread.sleep(500);

            element.click();
            System.out.println("✅ " + logMessage);

        } catch (TimeoutException e) {
            System.out.println(" Timeout: Element not visible: " + logMessage);
            throw new RuntimeException("Timeout waiting for element: " + locator);
        } catch (Exception e) {
            System.out.println(" Click failed: " + logMessage + " - " + e.getMessage());
            throw new RuntimeException("Click failed: " + locator);
        }
    }

    public void performClick(WebElement element, String logMessage) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
        System.out.println("✅ " + logMessage);
    }



    public WebElement waitForElementToBeClickable(By locator, int timeoutInSeconds, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            LoggerUtil.info(" Element is clickable: " + elementName);
            return element;
        } catch (TimeoutException e) {
            LoggerUtil.warning("⚠ Timeout: Element not clickable: " + elementName + " | Reason: " + e.getMessage());
            return null;
        } catch (Exception e) {
            LoggerUtil.error(" Error while waiting for element to be clickable: " + elementName + " | " + e.getMessage());
            return null;
        }
    }

    public WebElement waitForElementVisible(By locator, int timeoutInSeconds, String elementName) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            LoggerUtil.info("✅ Element visible: " + elementName);
            return element;
        } catch (TimeoutException e) {
            LoggerUtil.warning("⚠️ Timeout: Element not visible: " + elementName + " | Reason: " + e.getMessage());
            return null;
        } catch (Exception e) {
            LoggerUtil.error("❌ Error while waiting for element: " + elementName + " | " + e.getMessage());
            return null;
        }
    }

    public void enterTextAndWait(By locator, String text, String elementName) {
        String timestamp = getCurrentTimestamp();
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            try {
                LoggerUtil.info("Attempt " + (attempts + 1) + " to enter text in: " + elementName);
                WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                wait.until(ExpectedConditions.elementToBeClickable(locator));

                scrollToElement(input);
                input.clear();
                input.sendKeys(text);

                ExtentCucumberAdapter.addTestStepLog("<b>✅ [" + timestamp + "] Entered '<i>" + text + "</i>' in: " + elementName + "</b>");
                LoggerUtil.info("✅ Entered text in: " + elementName);
                return;

            } catch (Exception e) {
                LoggerUtil.warning("⚠️ Attempt " + (attempts + 1) + " failed for: " + elementName + " | Reason: " + e.getMessage());

                if (attempts == maxAttempts - 1) {
                    try {
                        WebElement input = driver.findElement(locator);
                        forceSetTextWithJS(input, text);
                        ExtentCucumberAdapter.addTestStepLog("<b>⚠️ [" + timestamp + "] JS Fallback entered '<i>" + text + "</i>' in: " + elementName + "</b>");
                        LoggerUtil.warning("⚠️ JS Fallback used for: " + elementName);
                    } catch (Exception jsEx) {
                        ExtentCucumberAdapter.addTestStepLog("<b>❌ [" + timestamp + "] Failed to enter text in: " + elementName + "</b>");
                        LoggerUtil.error("❌ Failed to enter text in: " + elementName + " | Reason: " + jsEx.getMessage());
                        throw jsEx;
                    }
                }
            }
            attempts++;
            sleep(1000); // small wait before retry
        }
    }


    public void assertInputFieldIsDisabled(By locator, String fieldName) {
        WebElement inputField = driver.findElement(locator);
        assertFalse(fieldName + " is expected to be disabled", inputField.isEnabled());
        ExtentCucumberAdapter.addTestStepLog("🔒 <b>" + fieldName + "</b> is <b>disabled</b> as expected ✅");
    }


    public void rightClick(By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                scrollToElement(element);
                actions.contextClick(element).perform();
                return;
            } catch (StaleElementReferenceException e) {
                attempts++;
                sleep(300);
            } catch (Exception e) {
                throw new RuntimeException("Failed to right-click on element: " + locator, e);
            }
        }
        throw new RuntimeException("Unable to right-click on element after retries: " + locator);
    }

    public void EnterTextAndWait(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        forceSetTextWithJS(element, text);
    }

    public void dragAndDropMultiple(List<WebElement> sources, WebElement target) {
        Actions act = new Actions(driver);
        for (WebElement source : sources) {
            act.dragAndDrop(source, target).perform();
        }
    }

    public void clearAndType(By locator, String text, String logMessage)  {
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

                // Ensure element is visible and clickable
                WebElement element = wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(locator)));

                // Scroll into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

                // Extra wait for stability
                Thread.sleep(500);

                // Try normal typing
                element.click();
                element.clear();
                element.sendKeys(text);

                System.out.println(" " + logMessage + " -> " + text);
                return; // Success
            } catch (StaleElementReferenceException | ElementClickInterceptedException e) {
                System.out.println("️ Retry clearAndType due to: " + e.getClass().getSimpleName());
            } catch (org.openqa.selenium.ElementNotInteractableException e) {
                System.out.println(" Element not interactable, trying JS typing...");

                try {
                    WebElement element = driver.findElement(locator);
                    ((JavascriptExecutor) driver).executeScript("arguments[0].value = arguments[1];", element, text);
                    System.out.println(" (JS) " + logMessage + " -> " + text);
                    return; // Success
                } catch (Exception jsEx) {
                    System.out.println(" JS typing failed too: " + jsEx.getMessage());
                }
            } catch (Exception e) {
                System.err.println(" Failed to type " + logMessage + ": " + e.getMessage());
            }
            attempts++;
        }
        throw new RuntimeException(" Failed to type after 3 retries: " + locator);
    }

    public void clickEditIcon(By locator, String elementName) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement element = wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(locator)));
                element.click();
                System.out.println("Clicked on: " + elementName);
                return;
            } catch (StaleElementReferenceException e) {
                System.out.println("Stale element encountered for: " + elementName + ". Retrying...");
            } catch (Exception e) {
                System.err.println("Failed to click " + elementName + ": " + e.getMessage());
                throw e;
            }
            attempts++;
        }
        throw new RuntimeException("Failed to click " + elementName + " after 3 retries.");
    }


    public void waitUntilPageLoads(By logo) {
        ExpectedCondition<Boolean> pageLoadCondition = drv -> {
            if (!(drv instanceof JavascriptExecutor)) {
                throw new IllegalStateException("Driver does not support JavaScript execution");
            }
            Object state = ((JavascriptExecutor) drv).executeScript("return document.readyState");
            return "complete".equals(state);
        };
        try {
            wait.until(pageLoadCondition);
        } catch (TimeoutException e) {
            throw new TimeoutException("Page did not load completely within timeout.", e);
        }
    }

    public void selectFromDropdown(By locator, String visibleText) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Select(dropdown).selectByVisibleText(visibleText);
    }

    public void selectByIndex(By locator, int index) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    public void selectByVisibleText(By locator, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    public void selectByValue(By locator, String value) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        WebElement dropdown = driver.findElement(locator);
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }


    public String getAlertTextAndAccept() {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
        return text;
    }

    public void dragAndDrop(By source, By target) {
        int attempts = 3;
        while (attempts > 0) {
            try {
                WebElement sourceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(source));
                WebElement targetElement = wait.until(ExpectedConditions.visibilityOfElementLocated(target));

                Actions actions = new Actions(driver);
                actions.dragAndDrop(sourceElement, targetElement).perform();
                return;
            } catch (StaleElementReferenceException e) {
                System.out.println("Stale element detected, retrying drag and drop...");
            }
            attempts--;
        }
        throw new RuntimeException("Failed to drag and drop after retries: " + source + " -> " + target);
    }


    public void checkCheckbox(By locator) {
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(locator));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }


    public void forceSetTextWithJS(WebElement element, String text) {
        if (element == null) {
            throw new IllegalArgumentException("Target WebElement is null!");
        }

        if (text == null) {
            throw new IllegalArgumentException("Text to be set is null!");
        }

        // Log the text being set for debugging
        System.out.println("Setting text using JS: " + text);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Clear the field
        js.executeScript("arguments[0].value = '';", element);

        // Set the value and dispatch necessary events
        js.executeScript(
                "arguments[0].value = arguments[1];" +
                        "arguments[0].dispatchEvent(new Event('input', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('change', {bubbles:true}));" +
                        "arguments[0].dispatchEvent(new Event('blur', {bubbles:true}));",
                element, text
        );

        // Verify the text is set correctly
        boolean set = false;
        for (int i = 0; i < 5; i++) {
            try {
                String val = (String) js.executeScript("return arguments[0].value;", element);
                if (text.equals(val)) {
                    set = true;
                    break;
                }
                Thread.sleep(300);
            } catch (InterruptedException ignored) {
            }
        }

        if (!set) {
            throw new TimeoutException("Text '" + text + "' was not set after retries.");
        }
    }


    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", element);
    }

    private void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    private void sleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ignored) {
        }
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitForVisibility(By locator) {
        int attempts = 3;
        while (attempts > 0) {
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.visibilityOfElementLocated(locator)
                ));
                return; // ✅ success, exit method
            } catch (StaleElementReferenceException e) {
                System.out.println(" Stale element, retrying waitForVisibility: " + locator);
            }
            attempts--;
        }
        throw new RuntimeException(" Element not visible after retries: " + locator);
    }


    public void waitForVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForJQuerySmart() {
        if (isJQueryDefined()) {
            wait.until(drv -> {
                Object result = ((JavascriptExecutor) drv).executeScript("return jQuery.active");
                if (result == null) return true;
                try {
                    return Long.valueOf(0).equals(result);
                } catch (Exception e) {
                    return true;
                }
            });
        }
    }


    public void waitForAngularSmart() {
        if (isAngularDefined()) {
            wait.until(drv -> {
                Object result = ((JavascriptExecutor) drv)
                        .executeScript("return window.getAllAngularTestabilities ? window.getAllAngularTestabilities().findIndex(x => !x.isStable()) === -1 : true");
                if (result == null) return true;
                try {
                    return Boolean.TRUE.equals(result);
                } catch (Exception e) {
                    return true;
                }
            });
        }
    }


    private boolean isJQueryDefined() {
        try {
            Object result = ((JavascriptExecutor) driver)
                    .executeScript("return typeof jQuery !== 'undefined' && jQuery != null");
            return Boolean.TRUE.equals(result);
        } catch (Exception e) {
            return false;
        }
    }

    public WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    private boolean isAngularDefined() {
        try {
            Object result = ((JavascriptExecutor) driver)
                    .executeScript("return typeof window.getAllAngularTestabilities === 'function'");
            return Boolean.TRUE.equals(result);
        } catch (Exception e) {
            return false;
        }
    }


    public void waitForTextToBe(By locator, String expectedText) {
        wait.until(ExpectedConditions.textToBe(locator, expectedText));
    }

    public void waitForTextToContain(By locator, String expectedSubstring) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedSubstring));
    }

    public void fetchLogAndValidateText(By locator, String expected, String fieldName) {
        try {
            // 1) Wait for element to be visible
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

            // 2) Wait for the expected text to appear in the element
            wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expected));

            // 3) Fetch the actual text from the element
            String actual = driver.findElement(locator).getText().trim();

            // 4) Print and log
            System.out.println(" Actual text from '" + fieldName + "': " + actual);
            info(" Actual text from '" + fieldName + "': " + actual);
            ExtentCucumberAdapter.getCurrentStep()
                    .log(Status.INFO, "Actual text from '" + fieldName + "': " + actual);

            // 5) Validation
            if (actual.equals(expected)) {
                System.out.println(" " + fieldName + " matches expected text.");
                ExtentCucumberAdapter.getCurrentStep()
                        .log(Status.PASS, fieldName + " matches expected: " + expected);
            } else {
                System.out.println(" " + fieldName + " mismatch. Expected: '" + expected + "', Actual: '" + actual + "'");
                ExtentCucumberAdapter.getCurrentStep()
                        .log(Status.FAIL, fieldName + " mismatch. Expected: '" + expected + "', Actual: '" + actual + "'");
                throw new AssertionError("Mismatch in " + fieldName + ". Expected: '" + expected + "', but was: '" + actual + "'");
            }

        } catch (TimeoutException e) {
            String errorMsg = " Timeout waiting for text in '" + fieldName + "'. Expected: '" + expected + "'";
            System.out.println(errorMsg);
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, errorMsg);
            throw new RuntimeException(errorMsg, e);
        } catch (Exception e) {
            String errorMsg = " Error validating text in '" + fieldName + "': " + e.getMessage();
            System.out.println(errorMsg);
            ExtentCucumberAdapter.getCurrentStep().log(Status.FAIL, errorMsg);
            throw new RuntimeException(errorMsg, e);
        }
    }

    // ensure validateText remains available
    public void validateText(String actual, String expected, String fieldName) {
        if (!actual.equals(expected)) {
            throw new AssertionError("Mismatch in " + fieldName + " | Expected: " + expected + " | Actual: " + actual);
        }
    }

    public void enterLargeText(By locator, String text) {
        WebElement input = wait.until(ExpectedConditions.elementToBeClickable(locator));
        scrollToElement(input);
        input.clear();

        int chunkSize = 50;
        for (int i = 0; i < text.length(); i += chunkSize) {
            String chunk = text.substring(i, Math.min(text.length(), i + chunkSize));
            input.sendKeys(chunk);
            try {
                Thread.sleep(50); // slight delay helps for long inputs
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void doubleClick(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            actions.doubleClick(element).perform();
            System.out.println(" Double-clicked on element: " + locator);
        } catch (Exception e) {
            System.out.println(" Failed to double-click: " + locator);
            e.printStackTrace();
        }
    }

    public void retryingClick(By locator) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement element = driver.findElement(locator);
                element.click();
                break;
            } catch (Exception e) {
                attempts++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    public void waitForPageToLoad() {
        wait.until(driver -> ((JavascriptExecutor) driver)
                .executeScript("return document.readyState").equals("complete"));
    }

    public void hoverAndClick(By locator) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        actions.moveToElement(element).perform();
        Thread.sleep(300);
        element.click();
    }


    public void jsClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        scrollToElement(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        LoggerUtil.info("✅ JS Clicked: " + locator);
    }


    public boolean waitForDefectToAppear(String defectName, int timeoutInSeconds) {
        By defectLocator = By.xpath("//span[contains(text(),'" + defectName + "')]");
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
            wait.until(ExpectedConditions.visibilityOfElementLocated(defectLocator));
            LoggerUtil.info("✅ Defect appeared in grid: " + defectName);
            return true;
        } catch (TimeoutException e) {
            LoggerUtil.warning("⚠️ Timeout: Defect not found in grid: " + defectName);
            return false;
        }
    }


    public String getPopupText(By popupLocator, String contextName) {
        try {
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(popupLocator));
            String message = popup.getText().trim();
            LoggerUtil.info(" Popup message received in [" + contextName + "]: " + message);
            ExtentCucumberAdapter.addTestStepLog("<b> Popup in " + contextName + ":</b> " + message);

            return message;
        } catch (TimeoutException e) {
            LoggerUtil.warning("⚠ Timeout: Popup not visible in " + contextName + " | " + e.getMessage());
            return null;
        } catch (Exception e) {
            LoggerUtil.error(" Failed to fetch popup message in " + contextName + " | " + e.getMessage());
            return null;
        }
    }


    public List<String> getLast3DropdownValues(By dropdownToggleLocator, By optionsLocator) {
        driver.findElement(dropdownToggleLocator).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(optionsLocator, 2)); // Wait for at least 3 options

        List<WebElement> allOptions = driver.findElements(optionsLocator);

        // ✅ Get only last 3 options
        List<WebElement> last3Options = allOptions.subList(allOptions.size() - 3, allOptions.size());

        return last3Options.stream()
                .map(e -> e.getText().trim())
                .collect(Collectors.toList());
    }

    public List<String> getDropdownValues(By optionsLocator) {
        List<WebElement> options = driver.findElements(optionsLocator);
        List<String> values = new ArrayList<>();
        for (WebElement option : options) {
            String text = option.getText().trim();
            if (!text.isEmpty()) {
                values.add(text);
            }
        }
        return values;
    }
    // Already defined: login, logout, assignSatellites...

    public void verifySatellites(List<String> expected, By dropdownButton, By dropdownOptions) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownButton));
            dropdown.click();

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dropdownOptions));
            List<String> actual = getDropdownValues(dropdownOptions);

            boolean allMatch = true;
            for (String sat : expected) {
                if (!actual.contains(sat)) {
                    System.out.println("❌ Missing satellite: " + sat);
                    allMatch = false;
                } else {
                    System.out.println("✅ Found satellite: " + sat);
                }
            }

            if (!allMatch) {
                throw new AssertionError("Mismatch in satellites. Expected: " + expected + ", Actual: " + actual);
            }

        } catch (Exception e) {
            System.out.println("Verification failed: " + e.getMessage());
            throw e;
        }
    }

    public void validateSatellites(List<String> expectedSatellites, By dropdownBtn, By dropdownOptions) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownBtn));
            dropdown.click();

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dropdownOptions));
            List<WebElement> options = driver.findElements(dropdownOptions);

            List<String> actual = options.stream()
                    .map(WebElement::getText)
                    .map(String::trim)
                    .filter(text -> !text.isEmpty())
                    .collect(Collectors.toList());

            boolean allMatch = true;
            for (String sat : expectedSatellites) {
                if (!actual.contains(sat)) {
                    System.out.println("❌ Missing satellite: " + sat);
                    allMatch = false;
                } else {
                    System.out.println("✅ Found satellite: " + sat);
                }
            }

            if (!allMatch) {
                throw new AssertionError("Mismatch! Expected: " + expectedSatellites + " Actual: " + actual);
            } else {
                System.out.println("✅ All satellites validated.");
            }

        } catch (Exception e) {
            throw new RuntimeException("Validation failed: " + e.getMessage());
        }
    }


    public void validateSatellites(By dropdownBtn, By satelliteItems) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click dropdown
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownBtn));
            dropdown.click();

            // Wait for dropdown items to be visible
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(satelliteItems));

            List<WebElement> elements = driver.findElements(satelliteItems);

            // ✅ Extract each satellite individually
            List<String> actualSatellites = new ArrayList<>();
            for (WebElement el : elements) {
                String text = el.getText().trim();
                if (!text.isEmpty()) {
                    actualSatellites.add(text);
                }
            }

            // ✅ Expected satellites
            List<String> expectedSatellites = Arrays.asList(
                    "Communication Satellites", "Navigation Satellites",
                    "Weather Satellites", "Military Satellites", "Space Station Modules"
            );

            // ✅ Compare expected vs actual
            boolean allMatch = true;
            for (String satellite : expectedSatellites) {
                if (!actualSatellites.contains(satellite)) {
                    System.out.println("❌ Missing satellite: " + satellite);
                    allMatch = false;
                } else {
                    System.out.println("✅ Found satellite: " + satellite);
                }
            }

            if (!allMatch) {
                throw new AssertionError("Mismatch! Expected: " + expectedSatellites + " Actual: " + actualSatellites);
            } else {
                System.out.println("✅ All satellites validated.");
            }

        } catch (Exception e) {
            throw new RuntimeException("Validation failed: " + e.getMessage());
        }
    }

    public boolean isElementDisabled(By locator) {
        WebElement element = driver.findElement(locator);
        boolean isDisabled = !element.isEnabled() || element.getAttribute("disabled") != null;

        // Print status clearly
        System.out.println("Input field at [" + locator.toString() + "] is disabled? ➜ " + isDisabled);

        return isDisabled;
    }

    // Method with assertion and print
    public void assertElementDisabled(By locator) {
        boolean isDisabled = isElementDisabled(locator);

        // Print assertion status
        if (isDisabled) {
            System.out.println(" Assertion PASSED: Input field is disabled.");
        } else {
            System.out.println(" Assertion FAILED: Input field is NOT disabled.");
        }

        assertTrue("Input field should be disabled", isDisabled);
    }

    public void validateAlertText(By locator, String expectedText, String fieldName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));

            String actualText = driver.findElement(locator).getText().trim();
            System.out.println(fieldName + " - Actual: " + actualText);

            assertEquals(fieldName + " mismatch", expectedText, actualText);
            ExtentCucumberAdapter.getCurrentStep().log(Status.PASS, fieldName + " validated.");
        } catch (TimeoutException e) {
            throw new RuntimeException("Timeout waiting for text in " + fieldName);
        }
    }

    public void validateNotificationIconVisible() {
        By notificationIcon = By.xpath("//img[contains(@src, 'notification_manager_icon.svg')]");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement icon = wait.until(ExpectedConditions.visibilityOfElementLocated(notificationIcon));

            assertTrue(" Notification icon is NOT visible!", icon.isDisplayed());
            System.out.println(" Notification icon is truly visible.");
        } catch (TimeoutException e) {
            System.out.println(" Notification icon not visible within 10 seconds.");
            Assert.fail("Notification icon did not appear.");
        }
    }


    // Strong click with retry and JS fallback
    public void strongClick(By locator) {
        int attempts = 0;
        while (attempts < 3) {  // Try up to 3 times
            try {
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                WebElement element = driver.findElement(locator);
                try {
                    element.click();  // First try normal click
                    System.out.println("Clicked element using normal click.");
                    return;
                } catch (ElementClickInterceptedException e) {
                    // Try JS Click as fallback
                    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                    System.out.println("Clicked element using JavaScript click.");
                    return;
                }
            } catch (Exception e) {
                System.out.println("Click attempt " + (attempts + 1) + " failed.");
                attempts++;
                try {
                    Thread.sleep(1000);  // Wait 1 sec before retry
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
        throw new RuntimeException("Failed to click element after multiple attempts: " + locator);
    }

    public void assertElementFocused(By locator) {
        long endTime = System.currentTimeMillis() + 5000; // 5 sec timeout

        while (System.currentTimeMillis() < endTime) {
            try {
                WebElement targetElement = driver.findElement(locator);
                WebElement activeElement = driver.switchTo().activeElement();

                String targetId = targetElement.getDomAttribute("id");
                String activeId = activeElement.getDomAttribute("id");

                if (targetId != null && targetId.equals(activeId)) {
                    System.out.println("✅ Cursor is blinking inside the expected element: " + targetId);
                    return; // Success
                }

            } catch (StaleElementReferenceException e) {
                System.out.println("Stale element, retrying...");
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException ignored) {
            }
        }

        Assert.fail("❌ Expected element is not focused - cursor is not blinking.");
    }


    public void printDateAndTime(By dateLocator, By timeLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Wait until date has a non-empty value
        WebElement dateElement = wait.until(driver -> {
            WebElement el = driver.findElement(dateLocator);
            return el.getDomProperty("value") != null && !el.getDomProperty("value").isBlank() ? el : null;
        });

        // Wait until time has a non-empty value
        WebElement timeElement = wait.until(driver -> {
            WebElement el = driver.findElement(timeLocator);
            return el.getDomProperty("value") != null && !el.getDomProperty("value").isBlank() ? el : null;
        });

        String dateValue = dateElement.getDomProperty("value");
        String timeValue = timeElement.getDomProperty("value");

        if ((dateValue == null || dateValue.isBlank()) || (timeValue == null || timeValue.isBlank())) {
            System.out.println("There is no auto time and date.");
        } else {
            System.out.println("Date: " + dateValue);
            System.out.println("Time: " + timeValue);
        }
    }


    /**
     * Clicks the save button, then measures the time taken for the target element to appear,
     * asserting that it appears within [minSeconds, maxSeconds].
     */
    public void assertElementAppearsAfterClick(By saveButtonLocator, By targetLocator, double minSeconds, double maxSeconds) {
        // Click Save button


        long startTime = System.nanoTime();

        try {
            // Wait up to maxSeconds + 1 to be safe
            new WebDriverWait(driver, Duration.ofSeconds((long) maxSeconds + 1))
                    .until(ExpectedConditions.visibilityOfElementLocated(targetLocator));
        } catch (Exception e) {
            String msg = String.format("FAIL: Element [%s] did not appear within %d seconds", targetLocator, (long) maxSeconds + 1);
            System.out.println(msg);
            throw new AssertionError(msg, e);
        }

        long endTime = System.nanoTime();
        double actualSeconds = (endTime - startTime) / 1_000_000_000.0;

        if (actualSeconds >= minSeconds && actualSeconds <= maxSeconds) {
            System.out.printf(
                    "PASS: Element [%s] appeared in %.3f seconds (expected between %.2f and %.2f seconds)%n",
                    targetLocator.toString(), actualSeconds, minSeconds, maxSeconds
            );
        } else {
            String failMsg = String.format(
                    "FAIL: Element [%s] appeared in %.3f seconds, outside expected range (%.2f - %.2f seconds)",
                    targetLocator.toString(), actualSeconds, minSeconds, maxSeconds
            );
            System.out.println(failMsg);
            throw new AssertionError(failMsg);
        }
    }


    public void assertDateTimeEmpty(By dateLocator, By timeLocator) {
        // ✅ Check date field empty
        WebElement dateElement = driver.findElement(dateLocator);
        String dateValue = dateElement.getTagName().equalsIgnoreCase("input")
                ? dateElement.getAttribute("value")
                : dateElement.getText();

        Assert.assertTrue("Expected date field to be empty, but found: " + dateValue,
                dateValue == null || dateValue.trim().isEmpty());
        System.out.println("✅ Date field is empty");

        // ✅ Check time field empty
        WebElement timeElement = driver.findElement(timeLocator);
        String timeValue = timeElement.getTagName().equalsIgnoreCase("input")
                ? timeElement.getAttribute("value")
                : timeElement.getText();

        Assert.assertTrue("Expected time field to be empty, but found: " + timeValue,
                timeValue == null || timeValue.trim().isEmpty());
        System.out.println("✅ Time field is empty");
    }


    public void assertDynamicCountdown(By countdownLocator) {
        WebElement countdownElement = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(countdownLocator));

        int lastValue = Integer.parseInt(countdownElement.getText().trim());
        System.out.println("⏳ Countdown started at: " + lastValue);
        System.out.println(lastValue); // print first value

        while (true) {
            try {
                int currentValue = Integer.parseInt(countdownElement.getText().trim());

                // Only print when value changes
                if (currentValue != lastValue) {
                    Assert.assertTrue(
                            "Countdown increased instead of decreasing! Previous: " + lastValue + " Current: " + currentValue,
                            currentValue < lastValue
                    );
                    System.out.println(currentValue);
                    lastValue = currentValue;
                }

                // Exit when 0 is reached
                if (currentValue <= 0) {
                    System.out.println("✅ Countdown reached 0");
                    break;
                }
            } catch (StaleElementReferenceException e) {
                System.out.println("✅ Countdown element disappeared - assuming finished");
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException ignored) {
            }
        }

    }


    public void assertHeaderLabel(By labelLocator, String expectedText, int timeoutSeconds) {
        WebElement labelElement = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(ExpectedConditions.visibilityOfElementLocated(labelLocator));

        String actualText = labelElement.getText().trim();

        System.out.println(" Expected: " + expectedText);
        System.out.println(" Actual:   " + actualText);

        Assert.assertEquals(
                " FAIL: Header label does not match expected value.",
                expectedText,
                actualText
        );

        System.out.println("✅ PASS: Header label matches expected value.");
    }


    public String getText1(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String text = driver.findElement(locator).getText().trim();
        System.out.println("Got text from " + text + ": " + text);
        return text;
    }



        // Method to verify and log cursor position
        public static void logCursorPosition(String testLogger) {
            Point point = MouseInfo.getPointerInfo().getLocation();
            int x = (int) point.getX();
            int y = (int) point.getY();

            // Print in Console
            System.out.println("Cursor Position => X: " + x + ", Y: " + y);

            // If you are also writing to log file
            // Logger log = Logger.getLogger(Utils.class);
            // log.info("Cursor Position => X: " + x + ", Y: " + y);
        }


    public void getCursorPosition(By locator) {
        try {
            WebElement element = driver.findElement(locator);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            Long pos = (Long) js.executeScript("return arguments[0].selectionStart;", element);
            assert pos != null;

        } catch (Exception e) {
            System.out.println("Error getting cursor position: " + e.getMessage());
        }
    }

    public void validateAndEnterParameter(By locator, String value) {
        WebElement element = driver.findElement(locator);

        // Step 1: Check if empty before entering
        String currentValue = element.getDomProperty("value").trim();
        if (currentValue.isEmpty()) {
            System.out.println("No value is entered in the field. Proceeding to enter: " + value);

            // Step 2: Enter the value
            element.clear();
            element.sendKeys(value);
        } else {
            throw new IllegalStateException(
                    " Field already has a value -> '" + currentValue + "'. Expected empty before entering new value."
            );
        }
    }

    public void validateClearedParameter(By locator) {
        WebElement element = driver.findElement(locator);

        // Step 3: Validate cleared after moving to next char
        String currentValue = element.getDomProperty("value").trim();
        if (currentValue.isEmpty()) {
            System.out.println(" Field is cleared for the new char");
        } else {
            throw new IllegalStateException(
                    " Field still has value -> '" + currentValue + "'. Expected it to be cleared."
            );
        }
    }

    public String getText(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        String text = element.getText().trim();

        // If text is empty, try to get from value attribute (for input fields)
        if (text.isEmpty()) {
            text = element.getAttribute("value").trim();
        }

        System.out.println("Got text from element: " + text);
        return text;
    }


    public void safeClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            // 1️⃣ Wait until overlay modal disappears (if present)
            By modalOverlay = By.id("alertmodal");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(modalOverlay));

            // 2️⃣ Wait for element to be clickable
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

            // 3️⃣ Try normal click
            element.click();

        } catch (ElementClickInterceptedException e) {
            System.out.println("⚠ Click intercepted, trying with JavaScript: " + locator);

            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", element);
        } catch (TimeoutException te) {
            throw new RuntimeException(" Element not clickable within timeout: " + locator, te);
        }
    }


    public void forceClick(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        try {
            // Scroll into view first
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            // Try normal click
            wait.until(ExpectedConditions.elementToBeClickable(element)).click();
            System.out.println("✅ Clicked normally: " + locator);

        } catch (Exception e) {
            System.out.println("⚠ Normal click failed, trying JavaScript click: " + locator);

            // Use JS click as fallback
            ((JavascriptExecutor) driver).executeScript(
                    "arguments[0].dispatchEvent(new MouseEvent('mousedown', {bubbles:true}));" +
                            "arguments[0].dispatchEvent(new MouseEvent('mouseup', {bubbles:true}));" +
                            "arguments[0].dispatchEvent(new MouseEvent('click', {bubbles:true}));", element
            );
        }
    }

    public boolean isPopupDisplayed(By popupLocator) {
        try {
            List<WebElement> modals = driver.findElements(popupLocator);
            if (!modals.isEmpty() && modals.get(0).isDisplayed()) {
                System.out.println("Popup is displayed with locator: " + popupLocator);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Popup not found: " + e.getMessage());
        }
        return false;
    }

    // ✅ Check if input is disabled

    public boolean isInputDisabled(By locator) {
        WebElement element = driver.findElement(locator);
        // Check both disabled attribute and enabled status
        String disabledAttr = element.getAttribute("disabled");
        return (disabledAttr != null && (disabledAttr.equals("true") || disabledAttr.equals("disabled")))
                || !element.isEnabled();
    }



    // ✅ Check if input is enabled
    public boolean isInputEnabled(By locator) {
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return element.isEnabled();
        } catch (Exception e) {
            System.out.println("Failed to check if input is enabled: " + e.getMessage());
            return false;
        }
    }

    public void assertInputDisabled(By locator) {
        boolean disabled = isInputDisabled(locator);

        if (disabled) {
            System.out.println(" Input field is disabled as expected: " + locator.toString());
        } else {
            System.out.println(" Input field is NOT disabled: " + locator.toString());
        }

        Assert.assertTrue(" Expected input field to be disabled, but it was enabled", disabled);
    }



    // Overloaded method with WebElement
    public void clearAndType2(WebElement element, String text, String logMessage) {
        try {
            element.clear();
            element.sendKeys(text);
            System.out.println("✅ Typed '" + text + "' into element: " + logMessage);
        } catch (Exception e) {
            System.out.println("❌ Failed to type into element: " + logMessage + " | " + e.getMessage());
            throw e;
        }
    }

    public void strongClick1(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

            // ✅ First try normal Selenium click
            element.click();
            LoggerUtil.info("✅ Normal Click successful: " + locator);
            return;

        } catch (Exception e1) {
            LoggerUtil.info("⚠️ Normal click failed, trying Actions click: " + locator);
            try {
                WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

                Actions actions = new Actions(driver);
                actions.moveToElement(element).pause(Duration.ofMillis(200)).click().perform();

                LoggerUtil.info("✅ Actions Click successful: " + locator);
                return;

            } catch (Exception e2) {
                LoggerUtil.info("⚠️ Actions click failed, trying JS click: " + locator);
                try {
                    WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

                    JavascriptExecutor js = (JavascriptExecutor) driver;

                    // Dispatch full mouse events (mousedown, mouseup, click)
                    js.executeScript(
                            "var el = arguments[0];" +
                                    "['mousedown','mouseup','click'].forEach(function(eventType){" +
                                    "  var evt = new MouseEvent(eventType,{bubbles:true,cancelable:true,view:window});" +
                                    "  el.dispatchEvent(evt);" +
                                    "});", element
                    );

                    LoggerUtil.info("✅ JS Click successful: " + locator);
                    return;

                } catch (Exception e3) {
                    LoggerUtil.error("❌ Click failed for locator: " + locator);
                    throw new RuntimeException("Click failed: " + locator, e3);
                }
            }
        }
    }


    public void clickWithRetry(By locator, int attempts) {
        int count = 0;
        while (count < attempts) {
            try {
                WebElement element = driver.findElement(locator);
                element.click();
                return;
            } catch (StaleElementReferenceException e) {
                count++;
            }
        }
        throw new RuntimeException("Element still stale after " + attempts + " attempts");
    }


}









































