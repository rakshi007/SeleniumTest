package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.LoggerUtil;
import util.UIActions;

import java.time.Duration;
import java.util.Map;

import static util.LoggerUtil.logFail;

public class MultiNotePage {


    private WebDriver driver;
    private WebDriverWait wait;
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





    //edit 01

    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("(//div[@class='col-lg-10'])[1]");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[8]");
    private By date = By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup01 = By.id("Subgroup_0");
    private By subgroup02 = By.id("Subgroup_1");
    private By default01 = By.xpath("(//input[@cursorposition=\"1\"])[1]");
    private By savechart01 = By.id("sequencebychartsave");
    private By getText = By.id("linkheader");


    //  edit chart02

    private By time2 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup11 = By.id("Subgroup_0");
    private By subgroup12 = By.id("Subgroup_1");
    private By ALL1 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
    private By GetText = By.xpath("(//div[@class=\"errormsg\"])[1]");
    private By Savechart02 = By.id("sequencebychartsave");
    private By cancelooc = By.xpath("(//button[text()=' Cancel '])[1]");
    private By data = By.xpath("//td[text()=' 2 ']");
    private By GetText02 = By.id("linkheader");


    //  edit chart03

    private By time03 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup21 = By.id("Subgroup_0");
    private By subgroup22 = By.id("Subgroup_1");
    private By savechart331 = By.id("sequencebychartsave");
    private By ALL2 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
    private By getText3 = By.id("linkheader");


    //  edit chart04

    private By time4 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup31 = By.id("Subgroup_0");
    private By subgroup32 = By.id("Subgroup_1");
    private By default02 = By.xpath("(//input[@cursorposition=\"1\"])[1]");
    private By savechart4 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");


    //  edit chart05

    private By time5 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup41 = By.id("Subgroup_0");
    private By subgroup42 = By.id("Subgroup_1");
    private By ALL3 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
    private By savechart5 = By.id("sequencebychartsave");
    private By submit01 = By.xpath("//button[text()='Submit']");
    private By getText5 = By.id("linkheader");


    //edit 06


    private By time6 = By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By subgroup61 = By.id("Subgroup_0");
    private By subgroup62 = By.id("Subgroup_1");
    private By ALL4 = By.xpath("(//input[@cursorposition=\"1\"])[2]");
    private By savechart6 = By.id("sequencebychartsave");
    private By ok = By.xpath("//lib-alertbox//button[@id='btn0']");
    private By user01 = By.xpath("//input[@id=\"User\"]");
    private By cause = By.xpath("//select[@id=\"Cause\"]");
    private By action = By.xpath("//select[@id=\"Action\"]");
    private By usernote = By.xpath("//textarea[@id=\"UserNote\"]");

    private By add01 = By.xpath("//img[@style=\"opacity: 0.7;\"]");
    private By user02 = By.xpath("//input[@id=\"User\"]");
    private By cause2 = By.xpath("//select[@id=\"Cause\"]");
    private By action2 = By.xpath("//select[@id=\"Action\"]");
    private By usernote2 = By.xpath("//textarea[@id=\"UserNote\"]");

    private By add02 = By.xpath("//img[@style=\"opacity: 0.7;\"]");
    private By user03 = By.xpath("(//input[@id=\"User\"])[2]");
    private By cause3 = By.xpath("(//select[@id=\"Cause\"])[2]");
    private By action3 = By.xpath("(//select[@id='Action'])[2]");
    private By usernote3 = By.xpath("(//textarea[@id='Postnote'])[1]");
    private By submitnote = By.xpath("(//button[normalize-space()='Submit'])[1]");
    private By getText6 = By.id("linkheader");

    private By note = By.xpath("//img[@class=\"NOTE\"]");
    private By left = By.xpath("(//span[@class=\"subgroup_edit_left\"])[3]");

    private By delete = By.xpath("//span[@class='iconsright']//span[2]//img[1]");
    private By oknote = By.xpath("(//button[text()=' OK '])[1]");
    private By edituser = By.xpath("//input[@id=\"User\"]");
    private By cause4 = By.xpath("//select[@id=\"Cause\"]");
    private By action4 = By.xpath("//select[@id=\"Action\"]");
    private By usernote4 = By.xpath("//textarea[@formcontrolname=\"Note\"]");
    private By savechart7 = By.id("sequencebychartsave");
    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");


    public MultiNotePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

        this.testData = testData;
    }


    public void edit01() {

        try {


            actions.clickAndWait(network1, "User Clicked on Network Icon");
            actions.clickAndWait(clickvaripage, "User Clicked on Variable Pag Name");
            actions.clickAndWait(editpencil, "User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date, "User Clicked on Date text Data TextField");
            actions.clickAndWait(time,
                    "User Clicked on Time InputText Field");
            actions.enterTextAndWait(subgroup01, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(subgroup02, "7", "User Entered Value in Subgroup Field");


            actions.clickAndWait(savechart01, "User Clicked on Save Button");


            actions.fetchLogAndValidateText(
                    getText,                   // locator for the element
                    "No Status!",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }

    public void edit02() {

        try {


            actions.clickAndWait(time2, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(subgroup11, "15", "User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(subgroup12, "3", "User Entered Value in Subgroup Filed");

            actions.enterTextAndWait(user01,"Test01","user name01");
            actions.selectByIndex(cause,2);
            actions.selectByIndex(action,2);
            actions.enterTextAndWait(usernote,"User","");
            actions.clickAndWait(add01, "User clicked on addicon");

            actions.enterTextAndWait(user02,"Test01","user name02");
            actions.selectByIndex(cause2,3);
            actions.selectByIndex(action2,3);
            actions.enterTextAndWait(usernote2,"User","");
            actions.clickAndWait(add02, "User entered usernote");
            actions.clickAndWait(Savechart02, "User Clicked on Save Button");
            actions.clickAndWait(cancelooc,"user click on cancel button");
            actions.clickAndWait(data,"user clicked on data table");



            actions.fetchLogAndValidateText(
                    GetText02,                   // locator for the element
                    "",         // expected text
                    "Out of Specification"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }

    public void edit03() {

        try {


            actions.clickAndWait(clickvaripage, "User Clicked on Variable Pag Name");
            actions.clickAndWait(editpencil, "User Clicked on Edit Pencil Icon");
            actions.clickAndWait(data,"user clicked on data table");
            actions.enterTextAndWait(user01,"QualisSpc","User entered note");
            actions.selectByIndex(cause,4);
            actions.selectByIndex(action,4);            actions.enterTextAndWait(usernote,"test01","enter text user note");
            actions.clickAndWait(savechart7,"clicked on save");
            actions.clickAndWait(data,"user clicked on data table");



            actions.fetchLogAndValidateText(
                    getText3,                   // locator for the element
                    "Out of Specification",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }

}