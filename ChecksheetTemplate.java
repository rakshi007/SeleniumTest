package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;
import java.time.Duration;

import static util.LoggerUtil.logFail;

public class ChecksheetTemplate {

    private WebDriver driver;
    private WebDriverWait wait;

    UIActions actions;



    private By Configuration = By.xpath("//span[@class=\"active\"]");
    private By Expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
    private By configuarationE = By.xpath("(//img[@class=\"tree_dropdown_icon\"])[1]");
    private By Template1 = By.xpath("//[@id='node_ConfigurationGroup_3']//img[@class='tree_dropdown_icon']");
    private By ClickCheck = By.xpath("//p[normalize-space()='Checksheet Templates']");
    private By AddTemp = By.xpath("(//img[@class='imgStyle1'])[1]");
    private By checksheetname = By.xpath("(//input[@id='Addchecksheet'])[1]");
    private By value = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS = By.xpath("(//a[@title='Save'])[2]");
    private By addicon01 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By columnHeading1 = By.xpath("(//input[@role='textbox'])[3]");
    private By order1 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value1 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS1 = By.xpath("(//a[@title='Save'])[2]");


    private By addicon02 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By columnHeading2 = By.xpath("(//input[@role='textbox'])[3]");
    private By order2 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value2 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS2 = By.xpath("(//a[@title='Save'])[2]");


    private By addicon03 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By columnHeading3 = By.xpath("(//input[@role='textbox'])[3]");
    private By order3 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value3 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS3 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon3 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");



    private By columnHeading4 = By.xpath("(//input[@role='textbox'])[3]");
    private By order4 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value4 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS4 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon04 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By CHECKSAVE01 = By.xpath("(//button[normalize-space()='Save'])[1]");



    private By addiconD = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By Uncheck = By.xpath("(//span[@class='checkmark'])[1]");
    private By checksheetname1 = By.xpath("(//input[@id='Addchecksheet'])[1]");
    private By columnHeading01 = By.xpath("(//input[@role='textbox'])[3]");
    private By order01 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value01 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS01 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon001 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");


    private By columnHeading02 = By.xpath("(//input[@role='textbox'])[3]");
    private By order02 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value02 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS02 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon002 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");


    private By columnHeading03 = By.xpath("(//input[@role='textbox'])[3]");
    private By order03 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value03 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS03 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon003 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");



    private By columnHeading04 = By.xpath("(//input[@role='textbox'])[3]");
    private By order04 = By.xpath("(//input[@role='spinbutton'])[1]");
    private By value04 = By.xpath("(//input[@role='spinbutton'])[2]");
    private By saveCS04 = By.xpath("(//a[@title='Save'])[2]");
    private By addicon004 = By.xpath("//span[@tooltipclass='ManageLyt-tooltip-custom-class']//img");
    private By CHECKSAVE02 = By.xpath("(//button[normalize-space()='Save'])[1]");





    public ChecksheetTemplate(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }



    public void checksheet() throws InterruptedException {


        try {
            actions.waitForPageToLoad();
            actions.retryingClick(Configuration);
            actions.clickAndWait(Expand,"");
            actions.clickAndWait(configuarationE,"");
            actions.clickAndWait(Template1,"");
            actions.clickAndWait(ClickCheck,"");
            actions.clickAndWait(AddTemp,"");
            actions.enterTextAndWait(checksheetname, "testdata","");
            actions.enterTextAndWait(value, "2","");
            actions.clickAndWait(saveCS,"");
            actions.clickAndWait(addicon01,"");
            actions.enterTextAndWait(columnHeading1, "check 1","");
            actions.enterTextAndWait(order1, "0","");
            actions.enterTextAndWait(value1, "1","");
            actions.clickAndWait(saveCS1,"");

            actions.clickAndWait(addicon02,"");
            actions.enterTextAndWait(columnHeading2, "check 2","");
            actions.enterTextAndWait(order2, "1","");
            actions.enterTextAndWait(value2, "2","");
            actions.clickAndWait(saveCS2,"");

            actions.clickAndWait(addicon03,"");
            actions.enterTextAndWait(columnHeading3, "check 3","");
            actions.enterTextAndWait(order3, "2","");
            actions.enterTextAndWait(value3, "3","");
            actions.clickAndWait(saveCS3,"");


            actions.clickAndWait(addicon04,"");
            actions.enterTextAndWait(columnHeading4, "check 4","");
            actions.enterTextAndWait(order4, "3","");
            actions.enterTextAndWait(value4, "4","");
            actions.clickAndWait(saveCS4,"");
            actions.clickAndWait(CHECKSAVE01,"");

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}



    }




