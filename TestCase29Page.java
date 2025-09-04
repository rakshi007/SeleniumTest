package pages;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.LoggerUtil;
import util.UIActions;
import java.time.Duration;

import static util.LoggerUtil.logFail;

public class TestCase29Page {

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
    private By Achar =By.xpath("//button[text()=' Add ']");
    private By  inspection = By.id("inspecunit");
    private By operation = By.xpath("//ul[@id='myTab']//li[2]//a[1]");
    private By Defects = By.xpath("//a[text()='Defects']");
    private By selectC = By.xpath("(//select[@class='col-8 dftctg ng-untouched ng-pristine ng-valid'])[1]");
    private By chcekbox= By.xpath("//label[text()='Defect Families']");
    private By  add01= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect1 = By.id("defectName");
    private By DFdrop = By.xpath("(//input[@role='combobox'])[5]");
    private By DFSelect01 = By.xpath("(//div[contains(text(),'Material Defects')])[1]");
    private By Save01= By.xpath("(//button[text()=' Save '])[2]");


    private By  add02= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect2 = By.id("defectName");
    private By DFdrop2 = By.xpath("(//input[@role='combobox'])[5]");
    private By DFSelect02 = By.xpath("(//div[contains(text(),'Material Defects')])[1]");

    private By Save02= By.xpath("(//button[text()=' Save '])[2]");


    private By  add03= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect3 = By.id("defectName");
    private By DFdrop3 = By.xpath("(//input[@role='combobox'])[5]");
    private By DFSelect03 = By.xpath("(//div[contains(text(),'Material Defects')])[1]");
    private By Save03= By.xpath("(//button[text()=' Save '])[2]");



    private By  add04= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect4 = By.id("defectName");
    private By DFdrop4 = By.xpath("(//input[@role='combobox'])[5]");
    private By DFSelect04 = By.xpath("(//div[contains(text(),'Dimensional Defects')])[1]");
    private By Save04= By.xpath("(//button[text()=' Save '])[2]");


    private By  add05= By.xpath("//span[@class=\"qual_plus\"]");
    private By defect5 = By.id("defectName");
    private By DFdrop5 = By.xpath("(//input[@role='combobox'])[5]");
    private By DFSelect05 = By.xpath("(//div[contains(text(),'Dimensional Defects')])[1]");
    private By Save05= By.xpath("(//button[text()=' Save '])[2]");



    private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
    private By  closechar= By.xpath("(//button[text()=' Close '])[1]");

//Add sequence



    private By expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
    private By DDG1 = By.xpath("(//p[@class='qual_groups_label'][normalize-space()='SPC_ForgeLine _Group'])[1]");
    private By DDd = By.xpath("//span[@id='showBy']//img");
    private By Sequenc = By.xpath("//a[text()=' Sequences']");
    private By right = By.xpath("//td[text()='Alphanumeric Codes']");
    private By editsequence = By.xpath("//span[text()='Edit Sequence']");
    private By drag = By.xpath("//p[text()=' Attribute_DF ']");
    private By drop = By.xpath("//p[text()=' Characteristics in Sequence ']");
    private By save = By.xpath("//button[text()='Save']");
    private By close1 = By.xpath("//button[text()=' Close ']");


    //checkbox

    private By  addchar1= By.id("AddChar");
    private By drag1 = By.xpath("//p[text()=' Attribute_CS ']");

    private By select2 = By.xpath("//select[@class=\"ng-untouched ng-pristine ng-valid\"]");
    private By csb2 = By.xpath("(//span[@class='checkmark'])[5]");






    //edit chart
    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("//h5[text()='Cooling System']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[5]");
    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup01 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup02 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup03 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup04 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup05 = By.xpath("(//input[@id='Subgroup_4_0'])[1]");

    private By totalcount = By.id("totSubgroup_0");
    private By savechart = By.id("sequencebychartsave");
    private By getText = By.id("linkheader");


//edit chart02

    private By time2= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By DD = By.xpath("(//select[@class='Defect_select form-control form-select ng-dirty ng-valid ng-touched'])[1]");
    private By Subgroup06 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup07 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup08 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By check08 = By.xpath("(//span[@class='checkmark'])[14]");
    private By total02 = By.id("totSubgroup_0");
    private By savechart2 = By.id("sequencebychartsave");
    private By getText2 = By.id("linkheader");


//edit chart03

    private By time3= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check09 = By.xpath("(//span[@class='checkmark'])[2]");
    private By Subgroup09 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup10 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By check12 = By.xpath("(//span[@class='checkmark'])[16]");
    private By total03 = By.id("totSubgroup_0");;
    private By savechart3 = By.id("sequencebychartsave");
    private By getText3 = By.id("linkheader");


//edit chart04

    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By check13 = By.xpath("(//span[@class='checkmark'])[4]");
    private By check14 = By.xpath("(//span[@class='checkmark'])[8]");
    private By check15 = By.xpath("(//span[@class='checkmark'])[12]");
    private By check16 = By.xpath("(//span[@class='checkmark'])[16]");

    private By savechart19 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");




    public TestCase29Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }



    public void DefectCategory() {

        try {


            actions.clickAndWait(addnew1,"");
            ExtentCucumberAdapter.addTestStepLog("user clicked on add link");
            actions.clickAndWait(AddCharLink,"");
            ExtentCucumberAdapter.addTestStepLog("user is clicked on add char button");
            actions.clickAndWait(DDN,"");
            ExtentCucumberAdapter.addTestStepLog("user is clicked on data group dropdown");
            actions.clickAndWait(DG,"");
            actions.clickAndWait(PN,"");
            actions.clickAndWait(PART,"");
            actions.enterTextAndWait(addchar, "Attribute_DF","");
            actions.clickAndWait(dropdownatt,"");
            actions.clickAndWait(select1,"");
            actions.clickAndWait(Achar,"");
            actions.clickAndWait(Defects,"");
            actions.selectByIndex(selectC,2);
            actions.clickAndWait(chcekbox,"");

            actions.clickAndWait(add01,"");
            actions.clickAndWait(defect1,"");
            actions.clickAndWait(defect1,"");

            actions.enterTextAndWait(defect1, "P_Stain","");

            actions.clickAndWait(DFdrop,"");
            actions.clickAndWait(DFSelect01,"");
            // Now enter it using UIActions


            actions.clickAndWait(Save01,"");


            actions.clickAndWait(add02,"");
            actions.clickAndWait(defect2,"");
            actions.enterTextAndWait(defect2, "P_Bulging","");
            actions.clickAndWait(DFdrop2,"");
            actions.clickAndWait(DFSelect02,"");
            actions.clickAndWait(Save02,"");



            actions.clickAndWait(add03,"");
            actions.clickAndWait(defect3,"");
            actions.enterTextAndWait(defect3, "P_White Spot","");
            actions.clickAndWait(DFdrop3,"");
            actions.clickAndWait(DFSelect03,"");
            actions.clickAndWait(Save03,"");


            actions.clickAndWait(add04,"");
            actions.clickAndWait(defect4,"");
            actions.enterTextAndWait(defect4, "P_Flow Mark","");
            actions.clickAndWait(DFdrop4,"");
            actions.clickAndWait(DFSelect04,"");
            actions.clickAndWait(Save04,"");




            actions.clickAndWait(add05,"");
            actions.clickAndWait(defect5,"");
            actions.enterTextAndWait(defect5, "P_Flow Tour","");
            actions.clickAndWait(DFdrop5,"");
            actions.clickAndWait(DFSelect05,"");
            actions.clickAndWait(Save05,"");


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
            actions.dragAndDrop(drag1, drop);
            actions.clickAndWait(save,"");
            Thread.sleep(1000);
            actions.clickAndWait(close1,"");


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
            actions.selectByIndex(DD,1);
            actions.enterTextAndWait(Subgroup01,"3","");
            actions.enterTextAndWait(Subgroup02,"2","");
            actions.enterTextAndWait(Subgroup03,"1","");
            actions.enterTextAndWait(Subgroup04,"5","");
            actions.enterTextAndWait(Subgroup05,"6","");
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
            actions.selectByIndex(DD,1);
            actions.enterTextAndWait(Subgroup06,"3","");
            actions.enterTextAndWait(Subgroup07,"2","");
            actions.enterTextAndWait(Subgroup08,"1","");
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
            actions.selectByIndex(DD,2);
            actions.enterTextAndWait(Subgroup09,"10","");
            actions.enterTextAndWait(Subgroup10,"30","");
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


