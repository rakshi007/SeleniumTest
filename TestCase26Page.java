package pages;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;
import java.time.Duration;

import static util.LoggerUtil.logFail;

public class TestCase26Page {

    private WebDriver driver;
    private WebDriverWait wait;

    UIActions actions;




    private By addnew1 = By.id("new");
    private By AddCharLink = By.xpath("//a[text()='Add Characteristic ']");
    private By DDN = By.xpath("(//input[@role='combobox'])[1]");
    private By DG= By.xpath("//div[contains(text(),'SPC_ForgeLine _Group')]");
    private By PN = By.xpath("(//input[@role='combobox'])[2]");
    private By PART = By.xpath("//div[contains(text(),'Quality Lab')]");


    private By  addchar= By.id("AddChar");
    private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
    private By  dropdownatt = By.xpath("(//lib-devextreme-selectbox)[3]");
    private By select1 = By.xpath("//div[contains(text(),'Attribute')]");
    private By  inspection = By.id("inspecunit");


    private By Defects = By.xpath("//a[text()='Defects']");
    private By MICB = By.xpath("//span[@class='usedefectinstr_input']//span[@class='checkmark']");


    private By  add01= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect1 = By.id("defectName");
    private By MI1 = By.xpath("(//textarea[@id='defmeasuringinstr'])[1]");
    private By Save01= By.xpath("(//button[text()=' Save '])[2]");


    private By  add02= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect2 = By.id("defectName");
    private By MI2 = By.xpath("(//textarea[@id='defmeasuringinstr'])[1]");
    private By Save02= By.xpath("(//button[text()=' Save '])[2]");


    private By  add03= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect3 = By.id("defectName");
    private By MI3 = By.xpath("(//textarea[@id='defmeasuringinstr'])[1]");
    private By Save03= By.xpath("(//button[text()=' Save '])[2]");



    private By  add04= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect4 = By.id("defectName");
    private By MI4 = By.xpath("(//textarea[@id='defmeasuringinstr'])[1]");
    private By Save04= By.xpath("(//button[text()=' Save '])[2]");



    private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
    private By  closechar= By.xpath("(//button[text()=' Close '])[1]");

//Add sequence



    private By expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
    private By DDG1 = By.xpath("(//p[@class='qual_groups_label'][normalize-space()='SPC_ForgeLine _Group'])[1]");
    private By DDd = By.xpath("//span[@id='showBy']//img");
    private By Sequenc = By.xpath("//a[text()=' Sequences']");
    private By right = By.xpath("//td[text()='Alphanumeric Codes']");
    private By editsequence = By.xpath("//span[text()='Edit Sequence']");
    private By drag = By.xpath("//p[text()=' Attribute_DI ']");
    private By drop = By.xpath("//p[text()=' Characteristics in Sequence ']");
    private By save = By.xpath("//button[text()='Save']");
    private By close1 = By.xpath("//button[text()=' Close ']");


    //edit chart
    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("//h5[text()='Cooling System']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[3]");
    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup1 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup2 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup3 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup4 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup5 = By.xpath("(//input[@id='Subgroup_4_0'])[1]");
    private By Subgroup6 = By.xpath("(//input[@id='Subgroup_5_0'])[1]");

    private By totalcount = By.id("totSubgroup_0");
    private By savechart = By.id("sequencebychartsave");
    private By getText = By.id("linkheader");


//edit chart02

    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup7 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup8 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup9 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup10 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By total02 = By.id("totSubgroup_0");
    private By savechart2 = By.id("sequencebychartsave");
    private By getText2 = By.id("linkheader");


//edit chart03

    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup11 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup12 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup13 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup14 = By.xpath("(//input[@id='Subgroup_5_0'])[1]");
    private By total03 = By.id("totSubgroup_0");;
    private By savechart3 = By.id("sequencebychartsave");
    private By getText3 = By.id("linkheader");


//edit chart04

    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup15 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup16 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup17 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup18 = By.xpath("(//input[@id='Subgroup_4_0'])[1]");
    private By savechart19 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");



//edit chart05

    private By time5= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup19 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup20 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup21 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup22 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup23 = By.xpath("(//input[@id='Subgroup_5_0'])[1]");
    private By total05 = By.id("totSubgroup_0");
    private By savechart5 = By.id("sequencebychartsave");
    private By getText5 = By.id("linkheader");





    public TestCase26Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }



    public void Measuring() {

        try {
            actions.clickAndWait(addnew1,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Add New'");

            actions.clickAndWait(AddCharLink,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Add char link'");

            actions.clickAndWait(DDN,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data group dropdown'");

            actions.clickAndWait(DG,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(PN,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(PART,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.enterTextAndWait(addchar, "Attribute_DI","");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(dropdownatt,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(select1,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(charaaddbutton,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");

            actions.clickAndWait(inspection,"");
            actions.enterTextAndWait(inspection, "20","");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Entered inspection value");

            actions.clickAndWait(Defects,"");
            actions.clickAndWait(MICB,"");
            actions.clickAndWait(add01,"");
            actions.clickAndWait(defect1,"");
            actions.clickAndWait(defect1,"");

            actions.enterTextAndWait(defect1, "P_Stain","");

            String longText = "1234567890123456789012345678901234567890123456789012345678901234567890" +
                    "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890" +
                    "12345";
            // Optional: log the length and content
            System.out.println("Text length: " + longText.length());
            System.out.println("Text: " + longText);

            // Now enter it using UIActions
            actions.enterLargeText(MI1, longText);




            actions.clickAndWait(Save01,"");


            actions.clickAndWait(add02,"");
            actions.clickAndWait(defect2,"");
            actions.enterTextAndWait(defect2, "P_Bulging","");
            actions.enterTextAndWait(MI2,"height gauges for verticals. Record and verify each","");
            actions.clickAndWait(Save02,"");


            actions.clickAndWait(add03,"");
            actions.clickAndWait(defect3,"");
            actions.enterTextAndWait(defect3, "P_White Spot","");
            actions.enterTextAndWait(MI3,"micrometers for precision diameters, calipers for lengths","");
            actions.clickAndWait(Save03,"");


            actions.clickAndWait(add04,"");
            actions.clickAndWait(defect4,"");
            actions.enterTextAndWait(defect4, "P_Flow Mark","");
            actions.enterTextAndWait(MI4,"Use calibrated instruments:","");
            actions.clickAndWait(Save04,"");


            actions.clickAndWait(saveAttribute,"");
            Thread.sleep(1000);
            actions.clickAndWait(closechar,"");
            ExtentCucumberAdapter.getCurrentStep().log(Status.INFO, "Clicked 'Data Group'");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}


    public void sequence() {

        try {

            actions.clickAndWait(expand,"");
            actions.clickAndWait(DDG1,"");
            actions.clickAndWait(DDd,"");
            actions.clickAndWait(Sequenc,"");
            actions.rightClick(right);
            actions.clickAndWait(editsequence,"");
            actions.dragAndDrop(drag, drop);
            actions.clickAndWait(save,"");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }



    public void edit01() {

        try {

            actions.clickAndWait(network1,"");
            actions.clickAndWait(clickvaripage,"");
            actions.clickAndWait(editpencil,"");
            actions.clickAndWait(date,"");
            actions.clickAndWait(time,"");
            actions.enterTextAndWait(Subgroup1, "1","");
            actions.enterTextAndWait(Subgroup2, "2","");
            actions.enterTextAndWait(Subgroup3, "4","");
            actions.enterTextAndWait(Subgroup4, "5","");
            actions.clickAndWait(totalcount,"");
            actions.enterTextAndWait(totalcount, "100","");
            actions.clickAndWait(savechart,"");

            By getText = By.id("linkheader");
            String expected = "No Status!";
            actions.fetchLogAndValidateText(getText, expected, "Attribute Name");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}

    public void edit02() {

        try {


            actions.clickAndWait(time2,"");
            actions.enterTextAndWait(Subgroup1, "1","");
            actions.enterTextAndWait(Subgroup2, "2","");
            actions.enterTextAndWait(Subgroup3, "4","");
            actions.enterTextAndWait(Subgroup4, "5","");
            actions.clickAndWait(total02,"");
            actions.enterTextAndWait(total02, "100","");
            actions.clickAndWait(savechart,"");
            actions.fetchLogAndValidateText(
                    getText2,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
    public void edit03() {

        try {


            actions.clickAndWait(time3,"");
            actions.enterTextAndWait(Subgroup1, "1","");
            actions.enterTextAndWait(Subgroup2, "2","");
            actions.enterTextAndWait(Subgroup3, "4","");
            actions.enterTextAndWait(Subgroup4, "5","");
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
            actions.enterTextAndWait(Subgroup1, "1","");
            actions.enterTextAndWait(Subgroup2, "2","");
            actions.enterTextAndWait(Subgroup3, "4","");
            actions.enterTextAndWait(Subgroup4, "5","");
            actions.clickAndWait(total02,"");
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


    public void edit05() {

        try {


            actions.clickAndWait(time5,"");
            actions.enterTextAndWait(Subgroup19, "3","");
            actions.enterTextAndWait(Subgroup20, "1","");
            actions.enterTextAndWait(Subgroup21, "2","");
            actions.enterTextAndWait(Subgroup22, "1","");
            actions.enterTextAndWait(Subgroup23, "5","");
            actions.clickAndWait(total02,"");
            actions.enterTextAndWait(total02, "100","");
            actions.clickAndWait(savechart,"");
            actions.fetchLogAndValidateText(
                    getText5,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }


    }}


