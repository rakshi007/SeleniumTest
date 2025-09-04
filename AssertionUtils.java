package util;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.Assert;

public class AssertionUtils {

    // ✅ Accepts By locator (Recommended way to locate elements dynamically)
    public static void assertElementText(WebDriverWait wait, By elementLocator, String expectedText) {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
        String actualText = para.getText().replaceAll("\\s+", " ").trim();

        System.out.println("Expected: '" + expectedText + "'");
        System.out.println("Actual: '" + actualText + "'");

        Assert.assertEquals("The dashboard text does not match!", expectedText, actualText);
    }

    // ✅ Overloaded method to accept WebElement (if element is already found)
    public static void assertElementText(WebElement element, String expectedText) {
        String actualText = element.getText().replaceAll("\\s+", " ").trim();

        System.out.println("Expected: '" + expectedText + "'");
        System.out.println("Actual: '" + actualText + "'");

        Assert.assertEquals("The dashboard text does not match!", expectedText, actualText);
    }
    
    WebDriver driver;

    public AssertionUtils(WebDriver driver) {
        this.driver = driver;
    }
    public void dragAndDrop(By sourceLocator, By targetLocator) {
        WebElement source = driver.findElement(sourceLocator);
        WebElement target = driver.findElement(targetLocator);

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();

        System.out.println("✅ Drag and drop completed: " + sourceLocator + " -> " + targetLocator);
    }
    

    WebDriverWait wait;

    public void ElementUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // customize timeout
    }

    public void clickSaveAndHandlePopup(By saveLocator, By popupLocator) {
        try {
            // Click the Save button
            WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(saveLocator));
            saveBtn.click();

            // Wait for the popup to appear and capture the text
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(popupLocator));
            String popupText = popup.getText().trim();
            System.out.println("✅ Popup Text: " + popupText);

            // You can also return the popupText if needed
        } catch (TimeoutException e) {
            System.err.println("❌ Timeout waiting for save button or popup: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("❌ Exception during save and popup handling: " + e.getMessage());
        }
    }
}
