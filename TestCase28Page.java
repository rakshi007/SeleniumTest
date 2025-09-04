package pages;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;
import java.time.Duration;

import static util.LoggerUtil.logFail;

public class TestCase28Page {

    private WebDriver driver;
    private WebDriverWait wait;

    UIActions actions;



    //edit chart
    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("//h5[text()='Cooling System']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[4]");
    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check01 = By.xpath("(//span[@class='checkmark'])[1]");
    private By check02 = By.xpath("(//span[@class='checkmark'])[6]");
    private By check03 = By.xpath("(//span[@class='checkmark'])[11]");
    private By check04 = By.xpath("(//span[@class='checkmark'])[16]");

    private By totalcount = By.id("totSubgroup_0");
    private By savechart = By.id("sequencebychartsave");
    private By getText = By.id("linkheader");


//edit chart02

    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check05 = By.xpath("(//span[@class='checkmark'])[2]");
    private By check06 = By.xpath("(//span[@class='checkmark'])[5]");
    private By check07 = By.xpath("(//span[@class='checkmark'])[10]");
    private By check08 = By.xpath("(//span[@class='checkmark'])[13]");
    private By total02 = By.id("totSubgroup_0");
    private By savechart2 = By.id("sequencebychartsave");
    private By getText2 = By.id("linkheader");


//edit chart03

    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check09 = By.xpath("(//span[@class='checkmark'])[3]");
    private By check010 = By.xpath("(//span[@class='checkmark'])[8]");
    private By check11 = By.xpath("(//span[@class='checkmark'])[11]");
    private By check12 = By.xpath("(//span[@class='checkmark'])[15]");
    private By total03 = By.id("totSubgroup_0");;
    private By savechart3 = By.id("sequencebychartsave");
    private By getText3 = By.id("linkheader");


//edit chart04

    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check13 = By.xpath("(//span[@class='checkmark'])[4]");
    private By check14 = By.xpath("(//span[@class='checkmark'])[7]");
    private By check15 = By.xpath("(//span[@class='checkmark'])[10]");
    private By check16 = By.xpath("(//span[@class='checkmark'])[16]");

    private By savechart19 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");




    public TestCase28Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }


    public void edit01() {

        try {



            actions.clickAndWait(network1,"");
            actions.clickAndWait(clickvaripage,"");
            actions.clickAndWait(editpencil,"");
            actions.clickAndWait(date,"");
            actions.clickAndWait(time,"");
            actions.clickAndWait(check01,"");
            actions.clickAndWait(check02,"");
            actions.clickAndWait(check03,"");
            actions.clickAndWait(check04,"");
            actions.clickAndWait(total03,"");
            actions.enterTextAndWait(total03, "100","");
            actions.clickAndWait(savechart,"");


            actions.fetchLogAndValidateText(
                    getText,                   // locator for the element
                    "No Status!",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
    public void edit02() {

        try {


            actions.clickAndWait(time2,"");
            actions.clickAndWait(check05,"");
            actions.clickAndWait(check06,"");
            actions.clickAndWait(check07,"");
            actions.clickAndWait(check08,"");
            actions.clickAndWait(total03,"");
            actions.enterTextAndWait(total03, "100","");
            actions.clickAndWait(savechart3,"");


            actions.fetchLogAndValidateText(
                    getText3,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
    public void edit03() {

        try {


            actions.clickAndWait(time3,"");
            actions.clickAndWait(check09,"");
            actions.clickAndWait(check010,"");
            actions.clickAndWait(check11,"");
            actions.clickAndWait(check12,"");
            actions.clickAndWait(total03,"");
            actions.enterTextAndWait(total03, "100","");
            actions.clickAndWait(savechart3,"");


            actions.fetchLogAndValidateText(
                    getText3,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}

    public void edit04() {

        try {


            actions.clickAndWait(time4,"");
            actions.clickAndWait(check09,"");
            actions.clickAndWait(check010,"");
            actions.clickAndWait(check13,"");
            actions.clickAndWait(check14,"");
            actions.clickAndWait(check15,"");
            actions.clickAndWait(check16,"");
            actions.enterTextAndWait(total02, "100","");
            actions.clickAndWait(savechart19,"");
            actions.fetchLogAndValidateText(
                    getText4,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}



}


