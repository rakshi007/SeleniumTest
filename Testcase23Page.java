package pages;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.AssertionUtils;
import util.UIActions;

import java.time.Duration;

public class Testcase23Page {


    private WebDriver driver;
    private WebDriverWait wait;

    UIActions actions;



    private By gettitle = By.xpath("//div[text()='Data Group Name']");
    private By addnew1 = By.id("new");
    private By addgrp = By.xpath("//a[text()='Add Data Group ']");
    private By enterGrpName = By.id("AddGroup");
    private By clickAdd = By.xpath("//button[text()=' Add ']");


    //part
    private By addnew = By.xpath("//img[@src=\"./assets/images/new.svg?v=1010108\"]");
    private By clkpart = By.xpath("//a[text()='Add Part ']");
    private By clickdrop = By.xpath("//div[@class='dx-dropdowneditor-icon']");
    private By slctGrp = By.xpath("//div[text()='SPC_ForgeLine _Group']");
    private By Enterpart = By.id("AddPart");
    private By ClkADD = By.xpath("//button[text()=' Add ']");


//Char

    private By  addchar= By.id("AddChar");
    private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
    private By  dropdownatt = By.xpath("(//lib-devextreme-selectbox)[3]");
    private By select1 = By.xpath("//div[contains(text(),'Attribute')]");
    private By inspection = By.id("inspecunit");
    private By Defects = By.id("//a[text()='Defects']");

    private By add01 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect1 = By.id("defectName");
    private By Save01 = By.xpath("(//button[text()=' Save '])[2]");


    private By add02 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect2 = By.id("defectName");
    private By Save02 = By.xpath("(//button[text()=' Save '])[2]");


    private By add03 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect3 = By.id("defectName");
    private By Save03 = By.xpath("(//button[text()=' Save '])[2]");


    private By add04 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect4 = By.id("defectName");
    private By Save04 = By.xpath("(//button[text()=' Save '])[2]");


    private By add05 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect5 = By.id("defectName");
    private By Save05 = By.xpath("(//button[text()=' Save '])[2]");

    private By add06 = By.xpath("//span[@class=\"qual_plus\"]");
    private By defect6 = By.id("defectName");
    private By Save06 = By.xpath("(//button[text()=' Save '])[2]");

    private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
    private By  closechar= By.xpath("(//button[text()=' Close '])[1]");

//Add sequence


    private By addseqlink = By.xpath("//img[@id=\"new\"]");
    private By addsequece= By.xpath("//a[text()='Add Sequence ']");
    private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private By selectdatagrp = By.xpath("//div[text()='SPC_ForgeLine _Group']");
    private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private By selectpart = By.xpath("//div[text()='Quality Lab']");
    private By clickonadd = By.xpath("//button[text()=' Add ']");
    private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
    private By SelectallCB= By.xpath("(//span[@class=\"checkmark\"])[4]");
    private By Kebab = By.xpath("//span[@class='layout-btn btn-more none']//img");
    private By assign = By.xpath("//a[text()='Assign']");
    private By save = By.xpath("//button[text()='Save']");
    private By close1 = By.xpath("//button[text()=' Close ']");


    //network

    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
    private By kebab = By.xpath("//a[@class='moreimg']//img");
    private By Addpaegsatellite = By.xpath("(//span[text()='Add Page'])[2]");
    private By Enterpagenamesatellite = By.xpath("(//input[@placeholder='Page Name'])[1]");
    private By Addsatellitepage = By.xpath("//button[text()=' Add ']");
    private By Dragsequencname = By.xpath("//p[text()=' Alphanumeric Codes ']");
    private By savesatellitepage = By.xpath("(//button[text()=' Save '])[1]");
    private By closesatellitepage = By.xpath("(//button[text()=' Close '])[2]");
    private By clickeditpage = By.xpath("(//div[@class=\"dl_dashrow\"])[2]");



    //edit chart01
    private By network1 = By.xpath("(//img)[7]");
    private By clickvaripage = By.xpath("//h5[text()='Brake System']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[1]");
    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By line1 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By line2 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By totalcount = By.id("totSubgroup_0");
    private By savechart = By.id("sequencebychartsave");
    private By getText = By.id("linkheader");


//edit chart02

    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By line3 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By line4 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By line5 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By line6 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By total02 = By.id("totSubgroup_0");
    private By savechart2 = By.id("sequencebychartsave");
    private By getText2 = By.id("linkheader");


//edit chart03

    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By line7 = By.xpath("//input[@id='Subgroup_0_0'])[1]");
    private By line8 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By line9 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By line10 = By.xpath("(//input[@id='Subgroup_4_0'])[1]");
    private By total03 = By.id("totSubgroup_0");;
    private By savechart3 = By.id("sequencebychartsave");
    private By getText3 = By.id("linkheader");


//edit chart04

    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By lin11 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By savechart4 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");



//edit chart05

    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By line12 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By line13 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By line14 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By line15 = By.xpath("(//input[@id='Subgroup_5_0'])[1]");
    private By total05 = By.id("totSubgroup_0");
    private By savechart5 = By.id("sequencebychartsave");
    private By getText5 = By.id("linkheader");

    public Testcase23Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }




//datagroup



    public void verifyHomePageLogoIsVisible() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // wait until the logo <div class="qual_logo"> is visible
        WebElement logoDiv = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class='qual_logo']")));

        // assert that it is displayed
        Assert.assertTrue("Expected the qualification logo to be visible on the Home page.",
                logoDiv.isDisplayed());
    }

    public void addnew11() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for the loader to disappear
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

        // Click on the element using JavaScript
        WebElement addLink = driver.findElement(By.id("new"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", addLink);
    }


    public void clickaddgrp()  {
        WebElement addGrpElement = wait.until(ExpectedConditions.elementToBeClickable(addgrp));
        addGrpElement.click();
    }

    public void entergrpname() {
        WebElement grpNameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(enterGrpName));
        grpNameElement.sendKeys("SPC_ForgeLine _Group");
    }

    public void clickaddbtn() {
        WebElement addBtnElement = wait.until(ExpectedConditions.elementToBeClickable(clickAdd));
        addBtnElement.click();
        try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }
    }



    //part

    public void addnew1() {
        WebElement element = driver.findElement(By.id("new"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void clickpart1() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(clkpart));
        addpart.click();

    }

    public void selectdropdown() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(clickdrop));
        addpart.click();

    }
    public void selectgroup() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(slctGrp));
        addpart.click();

    }

    public void enterpartname() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Enterpart));
        addpart.sendKeys("Quality Lab");

    }

    public void clickAdd() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(ClkADD));
        addpart.click();
        try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }



    }

//Char

    public void addchar() {
        // Step 1: Wait until popup appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Add Characteristic')]")));

        // Step 2: Wait until input is visible and clickable
        WebElement inputField = wait.until(ExpectedConditions.elementToBeClickable(addchar));

        // Step 3: Scroll to field (optional safety)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputField);

        // Step 4: Enter value and wait for confirmation
        inputField.clear();
        inputField.sendKeys("AttributeC");
        wait.until(ExpectedConditions.attributeToBe(inputField, "value", "AttributeC"));
    }



    public void dropdownatt() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(dropdownatt));
        addpart.click();

    }

    public void select1() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(select1));
        addpart.click();

    }

    public void charaaddbutton() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(charaaddbutton));
        addpart.click();

    }



    public void inspection() {


        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(inspection));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addpart);

        addpart.clear();
        addpart.sendKeys("70");

        wait.until(ExpectedConditions.attributeToBe(addpart, "value", "70"));


    }


    public void Defects() {


        WebElement element = driver.findElement(By.xpath("//a[@href=\"#defects\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        element.click();
    }

    public void add01() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add01));
        addpart.click();

    }

    public void defect1() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect1));
        addpart.sendKeys("C_Wet Surface");

    }

    public void Save01() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(Save01));
        addpart.click();

    }


    public void add02() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add02));
        addpart.click();

    }

    public void defect2() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect2));
        addpart.sendKeys("C_Defective Beading");

    }

    public void Save02() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save02));
        addpart.click();

    }

    public void add03() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add03));
        addpart.click();

    }

    public void defect3() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect3));
        addpart.sendKeys("C_Powder Mark");

    }

    public void Save03() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save03));
        addpart.click();

    }


    public void add04() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add04));
        addpart.click();

    }

    public void defect4() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect4));
        addpart.sendKeys("C_Thin Layer");

    }

    public void Save04() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save04));
        addpart.click();

    }


    public void add05() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add04));
        addpart.click();

    }

    public void defect5() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect4));
        addpart.sendKeys("C_Sticky");

    }

    public void Save05() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save04));
        addpart.click();

    }

    public void add06() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(add04));
        addpart.click();

    }

    public void defect6() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(defect4));
        addpart.sendKeys("C_Discolouration");

    }

    public void Save06() {

        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(Save04));
        addpart.click();

    }



    public void saveAttribute() {

        WebElement addpart = wait.until(ExpectedConditions.elementToBeClickable(saveAttribute));
        addpart.click();
        try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//            String expectedText = "Your expected popup text here";
//            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }
    }

    public void closechar() throws InterruptedException {
        Thread.sleep(1000);
        WebElement addpart = wait.until(ExpectedConditions.visibilityOfElementLocated(closechar));
        addpart.click();


    }



    //seq


    public void addseqlink() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(addseqlink));
        para.click();
    }



    public void addsequece() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(addsequece));
        para.click();
    }


    public void clickdatagroup() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickdatagroup));
        para.click();
    }

    public void selectdatagrp() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectdatagrp));
        para.click();
    }


    public void clickpart() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickpart));
        para.click();
    }



    public void selectpart() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(selectpart));
        para.click();
    }



    public void clickonadd() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickonadd));
        para.click();
    }




    public void EnterSequencename() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(EnterSequencename));

        // Scroll into view (optional, if inside modal or hidden)
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", para);

        // Clear and enter the value
        para.sendKeys("Alphanumeric Codes");

    }


    public void dragchar() {



// Find source and target elements
        WebElement source = driver.findElement(By.xpath("//p[@title=\"AttributeC\"]"));
        WebElement target = driver.findElement(By.xpath("//p[text()=\" Characteristics in Sequence \"]"));

// Create Actions instance
        Actions actions = new Actions(driver);

// Perform drag and drop
        actions.dragAndDrop(source, target).build().perform();

    }


    public void Kebab() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Kebab));
        para.click();
    }


    public void assign() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(assign));
        para.click();
    }

    public void save() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(save));
        para.click();

        try {
            // Wait for the popup to appear
            WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"sidepan_msg\"]")));

            // Fetch the text from the popup element
            String popupText = popup.getText();
            System.out.println("Popup text: " + popupText);

            // Validate or use the text
//			            String expectedText = "Your expected popup text here";
//			            Assert.assertEquals("Popup text did not match the expected value!", expectedText, popupText);

        } catch (Exception e) {
            System.err.println("Failed to fetch text from the popup: " + e.getMessage());
        }
    }

    public void close1() {

        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(close1));
        para.click();
    }


//		creating satellite


    //01
    public void network1() throws InterruptedException {
        Thread.sleep(1000);
        int attempts = 0;
        boolean clicked = false;
        while(attempts < 3 && !clicked) {
            try {
                WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network1));
                para.click();
                clicked = true;
            } catch (StaleElementReferenceException e) {
                System.out.println("Attempt " + (attempts + 1) + ": Encountered stale element. Retrying...");
            }
            attempts++;
        }
        if (!clicked) {
            throw new RuntimeException("Unable to click on the element after several attempts due to stale element issues.");
        }

    }



    public void Kebabsatellite() {
//				 WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Kebabsatellite));
//				 para.click();
        WebElement kebabIcon = driver.findElement(By.xpath("//a[@class='moreimg']//img"));

        // Click the element using JavaScript


    }


    public void Addpaegsatellite() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addpaegsatellite));
        para.click();
    }

    public void Enterpagenamesatellite() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Enterpagenamesatellite));
        para.sendKeys("Cooling System");
    }

    public void Addsatellitepage() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Addsatellitepage));
        para.click();
    }


    public void Dragsequencname() {

        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(Dragsequencname));
        WebElement test = driver.findElement(By.xpath("//p[text()=' Cooling System ']"));
        Actions actions02 = new Actions(driver);
        actions02.clickAndHold(para).moveToElement(test).release().build().perform();

    }

    public void savesatellitepage() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savesatellitepage));
        para.click();
    }


//edit01

    public void network12() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(network1));
        para.click();
    }


public void clickvaripage() {
    WebElement para = wait.until(ExpectedConditions.elementToBeClickable(clickvaripage));
    para.click();
}


    public void editpencil() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(editpencil));
        para.click();
    }



    public void date() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(date));
        para.click();
    }



    public void time() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time));
        para.click();
    }





    public void line1() {

        // Wait until the element is clickable
        WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(line1));

        // Enter the value into the text field
        String expectedValue = "1.00";
        para.sendKeys(expectedValue);

        // Fetch the value from the UI using getAttribute("value")
        String actualValue = para.getDomAttribute("data-value");

        // Verify the entered value matches the displayed value
        if (actualValue.equals(expectedValue)) {
            System.out.println("Value entered and displayed matches: " + actualValue);
        } else {
            System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
        }
    }






    public void line2() {
        WebElement para = wait.until(ExpectedConditions.visibilityOfElementLocated(line2));

        String expectedValue = "1.00";
        para.sendKeys(expectedValue);

        // Fetch the value from the UI using getAttribute("value")
        String actualValue = para.getDomAttribute("data-value");

        // Verify the entered value matches the displayed value
        if (actualValue.equals(expectedValue)) {
            System.out.println("Value entered and displayed matches: " + actualValue);
        } else {
            System.err.println("Mismatch! Entered value: " + expectedValue + ", Displayed value: " + actualValue);
        }

    }



    public void totalcount() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(totalcount));
        para.sendKeys("100");
    }


    public void savechart() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart));
        para.click();



    }






    @SuppressWarnings("deprecation")
    public void getText() {
        // Wait for the element to be clickable and get its text
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText));
        String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

        // Define the expected result
        String expectedResults = "No Status!";

        // Log both results for debugging
        System.out.println("Expected: '" + expectedResults + "'");
        System.out.println("Actual: '" + actualResults + "'");

        // Assert the actual result matches the expected result
        Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
    }



    public void validateDataValues01() {

        try {
            // Array of XPaths
            String[] xpaths = {
                    "(//div[@class=\"card_content_data stat_col\"])[1]",
                    "(//div[@class=\"card_content_data stat_col\"])[2]",
                    "(//div[@class=\"card_content_data stat_col\"])[3]",
                    "(//div[@class=\"card_content_data stat_col\"])[4]",
                    "(//div[@class=\"card_content_data stat_col\"])[5]",
                    "(//div[@class=\"card_content_data stat_col\"])[6]",
                    "(//div[@class=\"card_content_data stat_col\"])[7]",
                    "(//div[@class=\"card_content_data stat_col\"])[8]",
                    "(//div[@class=\"card_content_data stat_col\"])[9]",
                    "(//div[@class=\"card_content_data stat_col\"])[11]",
                    "(//div[@class=\"card_content_data stat_col\"])[12]",
            };

            // Array of expected values
            String[] expectedValues = {
                    "7.0000", "7.0000", "7.0000",
                    "0.0000", "0.0000", "0.0000",
                    "99.99", "99.99", "9999.00 %",
                    "7.0000", "0.0000"
            };

            // Loop through the XPaths and validate
            for (int i = 0; i < xpaths.length; i++) {
                // Locate the web element
                WebElement element = driver.findElement(By.xpath(xpaths[i]));

                // Get the actual text
                String actualText = element.getText();

                // Validate the text
                if (actualText.equals(expectedValues[i])) {
                    System.out.println("Validation passed for XPath " + xpaths[i] + ": Text matches the expected value."+ actualText);
                } else {
                    System.out.println("Validation failed for XPath " + xpaths[i] + ": Expected '" + expectedValues[i] + "', but found '" + actualText + "error");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



//			editchart02

    // private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");



    public void time2() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time2));
        para.click();
    }


    public void line3() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line3));
        para.sendKeys("2");
    }


    public void line4() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line4));
        para.sendKeys("1");
    }

    public void line5() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line5));
        para.sendKeys("2");
    }

    public void line6() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line6));
        para.sendKeys("1");
    }


    public void total02() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total02));
        para.sendKeys("100");
    }


    public void savechart2() throws InterruptedException {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart2));
        para.click();
        Thread.sleep(2000);
    }



    public void getText2() {

        // Wait for the element to be clickable and get its text
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText2));
        String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

        // Define the expected result
        String expectedResults = "Process in Control";

        // Log both results for debugging
        System.out.println("Expected: '" + expectedResults + "'");
        System.out.println("Actual: '" + actualResults + "'");

        // Assert the actual result matches the expected result
        Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
    }




    //edit03


    public void time3() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time3));
        para.click();
    }



    public void line7() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line7));
        para.sendKeys("3");
    }


    public void line8() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line8));
        para.sendKeys("4");
    }

    public void line9() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line9));
        para.sendKeys("2");

    }

    public void line10() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(line10));

     // Optional: clear before entering value
        para.clear();
        para.sendKeys("2");

      // Wait until the 'value' attribute of the input becomes "2"
        wait.until(ExpectedConditions.attributeToBe(para, "value", "2"));

    }    //

    public void total03() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(total03));
        para.sendKeys("100");
    }


    public void savechart3() throws InterruptedException {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart3));
        para.click();
        Thread.sleep(2000);
    }



    public void getText3() {

        // Wait for the element to be clickable and get its text
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText3));
        String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

        // Define the expected result
        String expectedResults = "Process in Control";

        // Log both results for debugging
        System.out.println("Expected: '" + expectedResults + "'");
        System.out.println("Actual: '" + actualResults + "'");

        // Assert the actual result matches the expected result
        Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
    }



    public void time4() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(time4));
        para.click();
    }



    public void lin11() {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(lin11));
        para.sendKeys("4");
    }


    public void savechart4() throws InterruptedException {
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(savechart4));
        para.click();
        Thread.sleep(2000);
    }



    public void getText4() {

        // Wait for the element to be clickable and get its text
        WebElement para = wait.until(ExpectedConditions.elementToBeClickable(getText4));
        String actualResults = para.getText().replaceAll("\\s+", " ").trim(); // Clean up the actual text

        // Define the expected result
        String expectedResults = "Process in Control";

        // Log both results for debugging
        System.out.println("Expected: '" + expectedResults + "'");
        System.out.println("Actual: '" + actualResults + "'");

        // Assert the actual result matches the expected result
        Assert.assertEquals("The dashboard text does not match!", expectedResults, actualResults);
    }




}


