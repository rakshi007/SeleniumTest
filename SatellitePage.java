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

public class SatellitePage {


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


    //network
    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
    private By Kebabsatellite = By.xpath("//span[@class='inline_svg svg_highlight moreimg']//img");
    private By Addpage = By.xpath("(//span[text()='Add Page'])[2]");
    private By Enterpagenamesatellite = By.xpath("//input[@placeholder=\"Page Name\"]");
    private By Addsatellitepage = By.xpath("//button[text()=' Add ']");
    private By Dragsequencname = By.xpath("(//p[@class='groupPartName'][normalize-space()='SPC_Control_Group'])[1]");
    private By drop = By.xpath("(//p[@tooltipclass='ManageLyt-tooltip-custom-class'][normalize-space()='plantManager1'])[1]");
    private By savesatellitepage = By.xpath("(//button[text()=' Save '])[2]");
    private By closesatellitepage = By.xpath("(//button[text()='Close'])[1]");


    private By Dragsequencname1 = By.xpath("(//p[@class='groupPartName'][normalize-space()='SPC_Control_Group'])[1]");
    private By drop1 = By.xpath("(//p[@tooltipclass='ManageLyt-tooltip-custom-class'][normalize-space()='lineSupervisor1'])[1]");



    private By Dragsequencname2 = By.xpath("(//p[@class='groupPartName'][normalize-space()='SPC_Control_Group'])[1]");
    private By drop2 = By.xpath("(//p[@tooltipclass='ManageLyt-tooltip-custom-class'][normalize-space()='qualityInspector1'])[1]");


    public SatellitePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

        this.testData = testData;
    }


    public void Adddage() {

        try {


            //Data group
            actions.clickAndWait(network,"User clicked on add button");
            actions.clickAndWait(Kebabsatellite,"User clicked on add group link");

            actions.clickAndWait(Addpage,"User clicked on add group link");
            actions.enterTextAndWait(Enterpagenamesatellite,"plantManager1","User clicked on add group link");
            actions.clickAndWait(Addsatellitepage,"User clicked on add button");

            actions.dragAndDrop(Dragsequencname,drop);
            actions.clickAndWait(savesatellitepage,"User clicked on add Part");

            //Data group
            actions.clickAndWait(network,"User clicked on add button");
            actions.clickAndWait(Kebabsatellite,"User clicked on add group link");

            actions.clickAndWait(Addpage,"User clicked on add group link");
            actions.enterTextAndWait(Enterpagenamesatellite,"lineSupervisor1","User clicked on add group link");
            actions.clickAndWait(Addsatellitepage,"User clicked on add button");

            actions.dragAndDrop(Dragsequencname1,drop1);
            actions.clickAndWait(savesatellitepage,"User clicked on add Part");


            //Data group
            actions.clickAndWait(network,"User clicked on add button");
            actions.clickAndWait(Kebabsatellite,"User clicked on add group link");

            actions.clickAndWait(Addpage,"User clicked on add group link");
            actions.enterTextAndWait(Enterpagenamesatellite,"qualityInspector1","User clicked on add group link");
            actions.clickAndWait(Addsatellitepage,"User clicked on add button");

            actions.dragAndDrop(Dragsequencname2,drop2);
            actions.clickAndWait(savesatellitepage,"User clicked on add Part");




        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
}
