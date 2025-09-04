package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.CustomDropdownUtils;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class GlobalPage {

    private final WebDriver driver;
    private final WebDriverWait wait;
    private Map<String, String> testData;

    UIActions actions;


    private ExtentTest test;

    {
        // Initialize a new test
        {
            this.test = ExtentReportManager.getTest();
        }
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();





    private final By Settings = By.xpath("(//img)[10]");
    private final By SyD = By.xpath("(//span[normalize-space()='System Definitions'])[1]");
    private final By Header1 = By.xpath("(//input[@type='text'])[3]");


    private final By Header2 = By.xpath("(//input[@type='text'])[4]");
    private final By Header3 = By.xpath("(//input[@type='text'])[5]");
    private final By CharName = By.xpath("//input[@placeholder='Char Name Prompt']");
    private final By SaveG = By.xpath("//button[normalize-space()='Save']");



//Char

    private final By  Email= By.xpath("//a[@id='email-tab']");
    private final By  Name= By.xpath("(//input[@type='text'])[7]");
    private final By  Eadress = By.xpath("(//lib-devextreme-selectbox)[3]");
    private final By Smtp = By.xpath("//div[contains(text(),'Attribute')]");
    private final By port = By.xpath("(//input[@type='Number'])[1]");
    private final By  smtpcheck= By.xpath("(//label[contains(text(),'SMTP Server Authentication')])[1]");

    private final By  USERN= By.xpath("(//input[@type='text'])[10]");

    private final By password = By.xpath("(//input[@id='password'])[1]");
    private final By repassword = By.xpath("(//input[@id='password'])[2]");
    private final By google = By.xpath("(//label[contains(text(),'Google Apps/Office365 SSL/TLS')])[1]");
    private final By saveemail = By.xpath("(//button[normalize-space()='Save'])[1]");


    //Header Option

    private final By Header  = By.xpath("(//span[normalize-space()='Header options'])[1]");
    private final By Entry  = By.xpath("//input[@maxlength=\"24\"]");
    private final By Add  = By.xpath("//span[@class='hd_plusicon']//img");
    private final By option2  = By.xpath("//input[@value='part']");
    private final By option3  = By.xpath("//input[@value='operation']");
    private final By save  = By.xpath("//button[contains(text(),\" Save \")]");
    private final By close  = By.xpath("//button[contains(text(),\" Close \")]");

//char
    private final By Files  = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
    private final By AddIcon  = By.xpath("//img[@id=\"new\"]");
    private final By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");

    private final By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private final By selectdatagrp = By.xpath("//div[text()='SPC_Control_Group']");
    private final By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private final By selectpartv = By.xpath("//div[text()='Car Spare parts']");
    private final By  addcharv= By.id("AddChar");
    private final By  charaaddbuttonv= By.xpath("//button[text()=' Add ']");
    private final By upperspecv = By.id("upperlmt");
    private final By lowerspecv = By.id("lowerspec");
    private final By subsizev = By.id("subgroupsize");
    private final By savecharv = By.xpath("//button[text()=' Save ']");
    private final By Drop1 = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private final By Drop2 = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private final By Drop3 = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[3]");

    private final By optionLocator = By.xpath("//div[@role='option']//div[contains(@class, 'dx-list-item-content')]");
    private final By globalse = By.xpath("(//span[contains(text(),\"Global Settings\")])[1]");
    private final By ATL = By.cssSelector("label[title='Select this option if you want to log data changes in the Audit Trial'] span[class='checkmark']");
    private final By UOFO = By.cssSelector("label[title='Select this option if you want to show OOC in Orange color'] span[class='checkmark']");
    private final By AWR = By.cssSelector("label[title='Select this option to apply weight regulation on preferred characteristics'] span[class='checkmark']");
    private final By Test = By.cssSelector("label[title='Select this option to allow the use of identical Part Names across different DataGroups'] span[class='checkmark']");
    private final By oosc = By.xpath("//input[@class=\"form-control ng-untouched ng-pristine ng-valid\"]");
    private final By dashboard = By.xpath("(//input[@maxlength=\"7\"])[1]");
    private final By alerts = By.xpath("(//input[@maxlength=\"7\"])[2]");
    private final By hidepage = By.xpath("//input[@maxlength=\"10\"]");
    private final By saveglobal = By.xpath("//button[contains(text(),\" Save \")]");
    private final By closeglobal = By.xpath("//button[contains(text(),\" Close \")]");


//Satellite mapping

    private final By Satellite = By.xpath("//span[contains(text(),\"Satellite Mapping\")]");
    private final By Rakshith = By.xpath("(//span[@class=\"checkmark\"])[18]");
    private final By Roja = By.xpath("(//span[@class=\"checkmark\"])[20]");
    private final By SaveSM = By.xpath("//button[contains(text(),\" Save \")]");
    private final By CloseSM = By.xpath("(//button[contains(text(),\" Cancel \")])[4]");
    private final By net = By.xpath("(//img)[6]");
    private final By optionsatellite = By.xpath("//div[@class=\"dropdown-menu show\"]");
    By dropdownBtn = By.xpath("//span[@class='satdrop']//img");
    private final By reports  = By.xpath("//div[@class='qual_inline_sidebar']//div[8]//span[1]//img[1]");
    private final By runSequence  = By.xpath("(//span[@class=\"qual_resize\"])[1]");
    private final By dropodown  = By.xpath("//a[@role='button']//i//img");
    private final By satellite  = By.cssSelector("#satellitetab");
    private final By satedropodown  = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[4]");
    private final By options  = By.xpath("//div[@role=\"option\"]");

    private final By datadropo  = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");


//Datagroup mapping

    private final By dataGtroup = By.xpath("//span[contains(text(),\"Data Group Mapping\")]");
    private final By RakshithData = By.xpath("(//li[2]/label/span)[1]");
    private final By RojaData = By.xpath("(//li[2]/label/span)[2]");
    private final By Closedata = By.xpath("(//button[contains(text(),\" Cancel \")])[9]");
    private final By expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");

//database coonection


    private final By Database  = By.xpath("//span[text()='Database Connection']");
    private final By Win  = By.xpath("//label[contains(text(),\"Windows Authentication\")]");
    private final By un  = By.xpath("//input[@formcontrolname=\"userName\"]");
    private final By pw = By.xpath("//input[@formcontrolname=\"password\"]");
    private final By sql  = By.xpath("//label[contains(text(),\"SQL Server Authentication\")]");
    private final By LoadDB  = By.xpath("//button[contains(text(),\" Load Database \")]");
    private final By Aleart  = By.xpath("//div[@id=\"alertmsg\"]");
    private final By OK  = By.xpath("(//button[@id=\"btn0\"])[1]");
    private final By Succesfull  = By.xpath("//span[text()='Database list loaded successfully!']");
    private final By servername  = By.xpath("(//input[@type=\"text\"])[3]");
    private final By LoadSR  = By.xpath("//button[contains(text(),\" Load Server \")]");
    private final By serverok  = By.xpath("//button[contains(text(),' OK ')]");


//sequence preferences


    private final By sequence  = By.xpath("(//span[normalize-space()='Sequence Preferences'])[1]");
    private final By bypart  = By.xpath("(//input[@type=\"radio\"])[2]");
    private final By bychar  = By.xpath("(//input[@type=\"radio\"])[1]");
    private final By parameters  = By.xpath("(//input[@name='CursorPosition_radio'])[2]");
    private final By samples  = By.xpath("(//input[@name='CursorPosition_radio'])[3]");
    private final By date  = By.xpath("(//input[@name='CursorPosition_radio'])[1]");
    private final By carry  = By.xpath("(//input[@name='ParameterHandling_radio'])[2]");
    private final By forward1  = By.xpath("(//input[@name='ParameterHandling_radio'])[3]");
    private final By clear  = By.xpath("(//input[@name='ParameterHandling_radio'])[1]");
    private final By manual  = By.xpath("(//input[@name='DateTime_radio'])[2]");
    private final By automatic  = By.xpath("(//input[@name='DateTime_radio'])[1]");
    private final By delay  = By.xpath("(//input[@id='delay'])[1]");
    private final By savep  = By.xpath("(//button[normalize-space()='Save'])[1]");
    private final By closep  = By.xpath("(//button[normalize-space()='Close'])[1]");


//notification global

    private final By notificationtab  = By.xpath("//span[contains(text(),'Notification Setting')]");
    private final By checkbox  = By.xpath("//label[contains(text(),' Enable Notification ')]");
    private final By saven  = By.xpath("//button[contains(text(),' Save ')]");
    private final By closen  = By.xpath("//button[contains(text(),' Close ')]");
    private final By NIcon  = By.xpath("(//img)[14]");



    public GlobalPage(WebDriver driver) {
        this.driver = driver;
        CustomDropdownUtils dropdownUtils;

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);
        dropdownUtils = new CustomDropdownUtils(driver);
    }


    public void SystemD() {
        try {
            //  General
            actions.clickAndWait(Settings, "User clicked on Add button");
            actions.clickAndWait(SyD, "User clicked on Add Data Group link");
            actions.clearAndType(Header1, "PLANT/ACADEMY","");
            actions.clearAndType(Header2, "PLANT NUMBER", "User entered Data Group name");
                actions.clearAndType(Header3, "OPERATION","");

            actions.clearAndType(CharName, "TestPromt","");
            actions.clickAndWait(SaveG, "User clicked on Add Part link");

            //Email


        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }

    public void Email() {
        try {


            actions.clickAndWait(Email, "");
            actions.clearAndType(Name, "Rakshith","");
            actions.clearAndType(Eadress, "rakshithrarchakarahalli@gmail.com", "Entered USL: "  );
            actions.clearAndType(Smtp, "smtp.gmail.com", "Entered LSL: " );
            actions.clearAndType(port, "587", "Entered Subgroup Size: ");

            actions.clickAndWait(smtpcheck, "Saved the Characteristic");
            Thread.sleep(2000);

            actions.clearAndType(USERN, "ee","");
            actions.clearAndType(password, "rwlp thov syll kjuf","");
            actions.clearAndType(repassword, "rwlp thov syll kjuf", "Entered Subgroup value: " );

            actions.clickAndWait(google, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(saveemail, "Closed Subgroup dialog");

        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }


    public void Header() {
        try {


            actions.strongClick(Settings);
            actions.clickAndWait(Header, "user clicked on header option");
            actions.clearAndType(Entry, "Test","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "Plant","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "Hold","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clickAndWait(save, "Saved the Characteristic");


            actions.clickAndWait(option2, "smtp.gmail.com");
            actions.clearAndType(Entry, "NUMBER01","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "NUMBER02","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "NUMBER03","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clickAndWait(save, "Saved the Characteristic");

            actions.clickAndWait(option3, "587");
            actions.clearAndType(Entry, "OPERATION01","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "OPERATION02","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clearAndType(Entry, "OPERATION03","");
            actions.clickAndWait(Add, "rakshithrarchakarahalli@gmail.com");
            actions.clickAndWait(save, "Saved the Characteristic");

            Thread.sleep(1000);
            actions.clickAndWait(close, "Saved the Characteristic");


        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }


    public void Headertest() {
        try {


            actions.strongClick(Files);
            actions.clickAndWait(AddIcon, "Rakshith");
            actions.clickAndWait(AddCharLink,"");
            actions.clickAndWait(clickdatagroup, "rakshithrarchakarahalli@gmail.com"  );
            actions.clickAndWait(selectdatagrp, "smtp.gmail.com");
            actions.clickAndWait(clickpart, "587");
            actions.clickAndWait(selectpartv, "Saved the Characteristic");
            actions.clearAndType(addcharv, "HeaderOption","");
            actions.clickAndWait(charaaddbuttonv, "");




            Thread.sleep(2000);
            List<String> expectedStatus = Arrays.asList("Test", "Plant", "Hold");
            List<String> actualStatus = actions.getLast3DropdownValues(Drop1, optionLocator);
            Assert.assertEquals("Status dropdown mismatch", expectedStatus, actualStatus);


            List<String> expectedOperation = Arrays.asList("OPERATION01", "OPERATION02", "OPERATION03");
            List<String> actualOperation = actions.getLast3DropdownValues(Drop3, optionLocator);
            Assert.assertEquals("Operation dropdown mismatch", expectedOperation, actualOperation);


            List<String> expectedNumber = Arrays.asList("NUMBER01", "NUMBER02", "NUMBER03");
            List<String> actualNumber = actions.getLast3DropdownValues(Drop2, optionLocator);
            Assert.assertEquals("Number dropdown mismatch", expectedNumber, actualNumber);




            System.out.println("Status: " + actualStatus);
            System.out.println("Operation: " + actualOperation);
            System.out.println("Number: " + actualNumber);



            actions.clearAndType(upperspecv, "10.00", "Entered Subgroup value: " );
            actions.clearAndType(lowerspecv, "7.00","");
            Thread.sleep(1000);
            actions.clearAndType(subsizev, "2","");
            actions.clickAndWait(savecharv, "Closed Subgroup dialog");
        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }



    public void GlobalSettings() {
        try {


            actions.clickAndWait(Settings, "");
            actions.clickAndWait(globalse, "Rakshith");
            actions.clickAndWait(ATL,"");
            actions.clickAndWait(UOFO, "rakshithrarchakarahalli@gmail.com"  );
            actions.clickAndWait(AWR, "smtp.gmail.com");
            actions.clickAndWait(Test, "587");
            actions.clickAndWait(saveglobal, "Closed Subgroup dialog");
            Thread.sleep(1000);

            actions.clearAndType(oosc, "9","");
            actions.clearAndType(dashboard, "35","");
            actions.clearAndType(alerts, "20", "Entered Subgroup value: " );
            actions.clearAndType(hidepage, "1","");
            Thread.sleep(1000);
            actions.clickAndWait(saveglobal, "Closed Subgroup dialog");
            actions.clickAndWait(closeglobal, "Closed Subgroup dialog");


        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }


    public void satelliteadmin(){


        try {


            actions.clickAndWait(Settings, "");
            actions.clickAndWait(Satellite, "Rakshith");
            actions.clickAndWait(Rakshith,"");
            actions.clickAndWait(Roja, "rakshithrarchakarahalli@gmail.com"  );
            actions.clickAndWait(SaveSM, "smtp.gmail.com");
            actions.clickAndWait(CloseSM, "587");


        } catch (Exception e) {
            System.out.println(" Error reading Excel file or executing actions:");
            e.printStackTrace();
        }

    }

    public void validateSatellitesIndividually() {
        try {
            actions.clickAndWait(net, ""); // Open the dropdown
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Click dropdown
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownBtn));
            dropdown.click();

            Thread.sleep(1000); // Allow dropdown to open

            List<String> expectedSatellites = Arrays.asList(
                    "Communication Satellites", "Navigation Satellites",
                    "Weather Satellites", "Military Satellites", "Space Station Modules"
            );

            System.out.println("Expected Satellites: " + expectedSatellites);

            boolean allMatch = true;
            for (String satellite : expectedSatellites) {
                String xpath = "//a[normalize-space()='" + satellite + "']";
                By locator = By.xpath(xpath);
                try {
                    wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                    System.out.println(" Found satellite: " + satellite);
                } catch (TimeoutException e) {
                    System.out.println(" Missing satellite: " + satellite);
                    allMatch = false;
                }
            }

            if (!allMatch) {
                throw new AssertionError(" Satellite mismatch. Check missing satellites above.");
            } else {
                System.out.println(" All satellites validated successfully.");
            }

            actions.clickAndWait(reports,"");
            actions.clickAndWait(runSequence,"");
            actions.clickAndWait(dropodown,"");
            actions.clickAndWait(satellite,"");
            actions.clickAndWait(satedropodown,"");

             Thread.sleep(2000);
            List<String> expectedStatus = Arrays.asList(
                    "Communication Satellites", "Navigation Satellites",
                    "Weather Satellites", "Military Satellites", "Space Station Modules"
            );

// Get actual values from dropdown
            List<String> actualStatus = actions.getDropdownValues(options);

//  Print both lists clearly
            System.out.println("Expected Status: " + expectedStatus);
            System.out.println("Actual Status:   " + actualStatus);

//  Sort both lists to compare ignoring order
            List<String> expectedSorted = new ArrayList<>(expectedStatus);
            List<String> actualSorted = new ArrayList<>(actualStatus);
            Collections.sort(expectedSorted);
            Collections.sort(actualSorted);

//  Assert ignoring order
            Assert.assertEquals("Status dropdown mismatch (order ignored)", expectedSorted, actualSorted);

//  Success log
            System.out.println("✅ Dropdown status validation passed.");





        } catch (Exception e) {
            throw new RuntimeException(" Validation failed: " + e.getMessage());
        }
    }

    public void validateDataGroups(List<String> expectedGroups, By dropdownBtn, By groupItemTextNodes) {
        try {
            // Click to open the dropdown
            actions.clickAndWait(expand, "Open DataGroup Dropdown");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Ensure dropdown is clickable
            WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownBtn));
            dropdown.click();

            // Wait until the dropdown items are visible
            List<WebElement> items = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(groupItemTextNodes));

            // Extract actual group names
            List<String> actualGroups = items.stream()
                    .map(WebElement::getText)
                    .map(String::trim)
                    .filter(text -> !text.isEmpty() && !text.equalsIgnoreCase("Select All"))
                    .collect(Collectors.toList());

            // Logging
            System.out.println("Expected Groups: " + expectedGroups);
            System.out.println("Actual Groups:   " + actualGroups);

            // Validate
            Set<String> expectedSet = new HashSet<>(expectedGroups);
            Set<String> actualSet = new HashSet<>(actualGroups);

            if (!actualSet.containsAll(expectedSet)) {
                expectedSet.removeAll(actualSet); // Remaining items are missing
                throw new AssertionError(" Group mismatch. Missing: " + expectedSet);
            }

            System.out.println(" All data groups validated successfully.");



            actions.clickAndWait(reports,"");
            actions.clickAndWait(runSequence,"");
            actions.clickAndWait(datadropo,"");



        } catch (Exception e) {
            throw new RuntimeException(" Validation failed: " + e.getMessage(), e);
        }
    }




    public void DB(){


        try {


            actions.clickAndWait(Settings,"user clicked on settings icon");
            actions.clickAndWait(Database, "user clicked on database link");
//            actions.clearAndType(servername,"DESKTOP-QQJ1VCI\\SQLEXPRESS2012","user entered server name");
//            actions.clickAndWait(LoadSR,"user clicked on load server");
            actions.clickAndWait(Win, "");
            actions.assertElementDisabled(un);
            actions.assertElementDisabled(pw);
            actions.clickAndWait(sql, "smtp.gmail.com");


            actions.clearAndType(un,"Test","user entered user name ");
            actions.clearAndType(pw,"data@1234","user entered password");
            actions.clickAndWait(LoadDB,"User clicked on LoadBase button");
            actions.validateAlertText(By.id("alertmsg"),
                    "Database connection failed : Login failed for user 'Test'.",
                    "POP-UP Text");
            actions.clickAndWait(OK,"user clicked on ok button");


            actions.clearAndType(un,"sa","user entered user name");
            actions.clearAndType(pw,"data@123","user entered password");
            actions.clickAndWait(LoadDB,"User clicked on LoadBase button");
            actions.validateAlertText(By.id("alertmsg"),
                    "Database connection failed : Login failed for user 'sa'.",
                    "POP-UP Text");
            actions.clickAndWait(OK,"user clicked on ok button");


            actions.clearAndType(un,"qualis","user entered user name");
            actions.clearAndType(pw,"12345","user entered password");
            actions.clickAndWait(LoadDB,"User clicked on LoadBase button");
            actions.validateAlertText(By.id("alertmsg"),
                    "Database connection failed : Login failed for user 'qualis'.",
                    "POP-UP Text");
            actions.clickAndWait(OK,"user clicked on ok button");


            actions.clearAndType(un,"sa","user entered user name");
            actions.clearAndType(pw,"data@1234","user entered password");
            actions.clickAndWait(LoadDB,"User clicked on LoadBase button");
            actions.validateAlertText(By.xpath("//span[@class=\"sidepan_msg\"]"),
                    "Database list loaded successfully!",
                    "POP-UP Text");




        } catch (Exception e) {
            System.out.println(" Error to validate database connection:");
            e.printStackTrace();
        }

    }


    public void sequenceglobal(){


        try {

            actions.clickAndWait(Settings,"user clicked on settings icon");
            actions.clickAndWait(sequence,"user clicked on sequence tab");
            actions.clickAndWait(bypart,"user clicked on bypart radio button");
            actions.clickAndWait(bychar,"user clicked on bychar radio button");
            actions.clickAndWait(parameters,"user clicked on parameters radio button");
            actions.clickAndWait(samples,"user clicked on samples radio button");
            actions.clickAndWait(date,"user clicked on date radio button");
            actions.clickAndWait(carry,"user clicked Carry Forward radio button");
            actions.clickAndWait(forward1,"user clicked on Carry Forward By Characteristic radio button");
            actions.clickAndWait(clear,"user clicked on clear radio button");
            actions.clickAndWait(manual,"user clicked on manual radio button");
            actions.clickAndWait(automatic,"user clicked on automatic radio button");
            actions.clearAndType(delay,"3","TextField");
            actions.clickAndWait(savep,"user clicked on save button");
            actions.clickAndWait(closep,"user clicked on close button");

        } catch (Exception e) {
            System.out.println(" Error to validate database connection:");
            e.printStackTrace();
        }}

        public void Notification() {


            try {


                actions.clickAndWait(notificationtab, "user clicked on notification tab");
                actions.clickAndWait(checkbox, "user clicked on Enable Notification checkbox");
                actions.clickAndWait(saven, "user clicked on save button");
                actions.clickAndWait(closen, "user clicked on close button");
                actions.validateNotificationIconVisible();

            } catch (Exception e) {
                System.out.println(" Error to validate database connection:");
                e.printStackTrace();
            }

        }

}















