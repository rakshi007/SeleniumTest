package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;

import static util.LoggerUtil.logFail;

public class SequencePage {

    private WebDriver driver;
    private WebDriverWait wait;

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





    private By expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
    private By down = By.xpath("//img[@class=\"dropdown_icon\"]");
    private By DDG = By.xpath("(//p[text()=' SPC_Control_Group '])[2]");
    private By okg = By.xpath("//button[text()=' OK ']");
    private By DDG1 = By.xpath("(//p[@class='qual_groups_label'][normalize-space()='SPC_Control_Group'])[1]");
    private By DDd = By.xpath("//span[@id='showBy']//img");
    private By Sequenc = By.xpath("//a[text()=' Sequences']");
    private By rightClick = By.xpath("//td[contains(text(),\"Hierarchical Names\")]");
    private By editsequence = By.xpath("//span[text()='Edit Sequence']");
    private By datatime = By.xpath("(//input[@role='combobox'])[2]");
    private By Automatic = By.xpath("(//div[contains(text(),'Automatic')])[1]");
    private By EntryMode = By.xpath("(//input[@role='combobox'])[1]");
    private By ByPart = By.xpath("(//div[contains(text(),'By Part')])[1]");
    private By SaveEdit = By.xpath("(//button[@class='btn save'])[1]");
    private By General = By.xpath("(//div[contains(text(),'General Operation')])[1]");
    private By DelayCharts = By.xpath("(//input[@id='delay'])[1]");
    private By Parameters = By.xpath("(//label[normalize-space()='Parameters'])[1]");
    private By SaveButton = By.xpath("(//button[@class='btn save'])[1]");
    private By close1 = By.xpath("(//button[text()=' Close '])[1]");

    private By delete = By.xpath("(//span[normalize-space()='Delete Sequence'])[1]");
    private By deleteyes = By.xpath("(//button[normalize-space()='Delete'])[1]");



    public SequencePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }

    public void Variable() {

        try {


            actions.clickAndWait(expand,"User clicked on add icon button");
            actions.clickAndWait(DDG,"User clicked on add sequence button");
            actions.clickAndWait(DDd,"User clicked on add icon button");
            actions.clickAndWait(Sequenc,"User clicked on add icon button");

            actions.rightClick(rightClick);
            actions.clickAndWait(editsequence,"User clicked on add icon button");
            actions.clickAndWait(datatime,"User clicked on add icon button");
            actions.clickAndWait(Automatic,"");
            actions.clickAndWait(EntryMode,"User clicked on add icon button");
            actions.clickAndWait(ByPart,"User clicked on add icon button");
            actions.clickAndWait(SaveEdit,"User clicked on add icon button");
            Thread.sleep(1000);
            actions.clickAndWait(General, "User clicked on add icon button");
            actions.enterTextAndWait(DelayCharts,"3","delaycharts");

            actions.clickAndWait(Parameters, "User clicked on add icon button");
            actions.clickAndWait(SaveButton, "User clicked on add icon button");
            Thread.sleep(1000);
            actions.clickAndWait(close1, "User clicked on add icon button");
            Thread.sleep(1000);
            actions.rightClick(rightClick);
            actions.clickAndWait(delete,"");
            actions.clickAndWait(deleteyes,"");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }




}
