package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.Map;

import static util.LoggerUtil.logFail;

public class TestCase31Page {

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


    private By Configuration = By.xpath("(//img)[7]");
    private By Expand = By.xpath("//span[@class='right-round']//img[@class='imgsize']");
    private By EC = By.xpath("//img[@class=\"tree_dropdown_icon\"]");
    private By ED = By.xpath("(//img[@class='tree_dropdown_icon'])[4]");
    private By DFM = By.xpath("(//p[normalize-space()='Define Failure Modes'])[1]");
    private By addnew01 = By.xpath("(//img[@class='imgStyle1'])[1]");
    private By DefectNAME = By.xpath("(//input[@id='Addtesttype'])[1]");
    private By Plus01 = By.xpath("//span[@class='hd_plusicon']//img");
    private By INput01 = By.xpath("(//input[@role='textbox'])[4]");
    private By Check01 = By.xpath("(//span[@class='dx-checkbox-icon'])[2]");
    private By save01 = By.xpath("(//a[@title='Save'])[2]");


    private By Plus02 = By.xpath("//span[@class='hd_plusicon']//img");
    private By INput02 = By.xpath("(//input[@role='textbox'])[4]");
    private By Check02 = By.xpath("(//span[@class='dx-checkbox-icon'])[2]");
    private By save02 = By.xpath("(//a[@title='Save'])[2]");


    private By Plus03 = By.xpath("//span[@class='hd_plusicon']//img");
    private By INput03 = By.xpath("(//input[@role='textbox'])[4]");
    private By Check03 = By.xpath("(//span[@class='dx-checkbox-icon'])[2]");
    private By save03 = By.xpath("(//a[@title='Save'])[2]");

    private By Plus04 = By.xpath("//span[@class='hd_plusicon']//img");
    private By INput04 = By.xpath("(//input[@role='textbox'])[4]");
    private By Check04 = By.xpath("(//span[@class='dx-checkbox-icon'])[2]");
    private By save04 = By.xpath("(//a[@title='Save'])[2]");

    private By Plus05 = By.xpath("//span[@class='hd_plusicon']//img");
    private By INput05 = By.xpath("(//input[@role='textbox'])[4]");
    private By Check05 = By.xpath("(//span[@class='dx-checkbox-icon'])[2]");
    private By save05 = By.xpath("(//a[@title='Save'])[2]");


    private By SaveDage = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By close = By .xpath("(//button[normalize-space()='Close'])[1]");



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
    private By operation = By.xpath("//ul[@id='myTab']//li[2]//a[1]");
    private By DPMO = By.xpath("(//label[normalize-space()='Use DPMO'])[1]");
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
    private By drag = By.xpath("//p[text()=' Attribute_DMPO ']");
    private By drop = By.xpath("//p[text()=' Characteristics in Sequence ']");
    private By save = By.xpath("//button[text()='Save']");
    private By close1 = By.xpath("//button[text()=' Close ']");


    //checkbox

    //edit chart
    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("//h5[text()='Cooling System']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[7]");
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
    private By Subgroup09 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup10 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By check12 = By.xpath("(//span[@class='checkmark'])[16]");
    private By total03 = By.id("totSubgroup_0");;
    private By savechart3 = By.id("sequencebychartsave");
    private By getText3 = By.id("linkheader");


//edit chart04

    private By time4= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");

    private By Subgroup11 = By.xpath("(//input[@id='Subgroup_0_0'])[1]");
    private By Subgroup12 = By.xpath("(//input[@id='Subgroup_1_0'])[1]");
    private By Subgroup13 = By.xpath("(//input[@id='Subgroup_2_0'])[1]");
    private By Subgroup14 = By.xpath("(//input[@id='Subgroup_3_0'])[1]");
    private By Subgroup15 = By.xpath("(//input[@id='Subgroup_4_0'])[1]");

    private By savechart19 = By.id("sequencebychartsave");
    private By getText4 = By.id("linkheader");

    public TestCase31Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

        this.testData = testData;
    }


    public void Dage() {

        try {



            actions.clickAndWait(addnew1,"User clicked on add button");
            actions.clickAndWait(AddCharLink,"user clicked on AddCharLink");
            actions.clickAndWait(DDN,"User clicked on DataGroup DropDown");
            actions.clickAndWait(DG,"User Selected DataGroup");
            actions.clickAndWait(PN,"User Clicked on Part DropDown");
            actions.clickAndWait(PART,"User Selected Part from DropDown");
            actions.enterTextAndWait(addchar, "Attribute_DMPO","User Entered Attribute CharName");
            actions.clickAndWait(dropdownatt,"User Clicked on Type DropDown");
            actions.clickAndWait(select1,"User select Attribute Type From DropDown");
            actions.clickAndWait(Achar,"User clicked on AddChar Link ");

            actions.clickAndWait(operation,"User Clicked on Operation Tab");
            actions.clickAndWait(DPMO,"User Clicked DPMO CheckBox");
            actions.clickAndWait(Defects,"User Clicked On Defects Tab");
            actions.clickAndWait(add01,"User clicked on Add Button");
            actions.clickAndWait(defect1,"User Clicked on defect text Field");

            actions.enterTextAndWait(defect1, "P_Stain","User Entered Defect Name");
            actions.clickAndWait(Save01,"User Clicked On Save Button");


            actions.clickAndWait(add02,"User clicked on Add Button");
            actions.clickAndWait(defect2,"User Clicked on defect text Field");
            actions.enterTextAndWait(defect2, "P_Bulging","User Entered Defect Name");
            actions.clickAndWait(Save02,"User Clicked On Save Button");



            actions.clickAndWait(add03,"User clicked on Add Button");
            actions.clickAndWait(defect3,"User Clicked on defect text Field");
            actions.enterTextAndWait(defect3, "P_White Spot","User Entered Defect Name");
            actions.clickAndWait(Save03,"User Clicked On Save Button");


            actions.clickAndWait(add04,"User clicked on Add Button");
            actions.clickAndWait(defect4,"User Clicked on defect text Field");
            actions.enterTextAndWait(defect4, "P_Flow Mark","User Entered Defect Name");
            actions.clickAndWait(Save04,"User Clicked On Save Button");




            actions.clickAndWait(add05,"User clicked on Add Button");
            actions.clickAndWait(defect5,"User Clicked on defect text Field");
            actions.enterTextAndWait(defect5, "P_Flow Tour","User Entered Defect Name");
            actions.clickAndWait(Save05,"User Clicked On Save Button");


            actions.clickAndWait(SaveDage,"User Clicked On Save");
            Thread.sleep(1000);
            actions.clickAndWait(close,"User Clicked On close Button");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}


    public void sequence() {

        try {

            actions.clickAndWait(Configuration,"User Clicked on Configuration Button");
            actions.clickAndWait(Configuration,"");
            actions.clickAndWait(Expand,"User Clicked on Expand Button");
            Thread.sleep(Long.parseLong("1000"));
            actions.clickAndWait(EC,"User Clicked on configuration expand  DropDown");
            actions.clickAndWait(ED,"User Clicked on Expand Defect dropdown");
            actions.clickAndWait(DFM,"User Clicked on Define Failure Modes");
            actions.clickAndWait(addnew01,"User Clicked on add template Button");
            actions.enterTextAndWait(DefectNAME, "testdata","Defect");
            actions.clickAndWait(Plus01,"User Clicked on Plus Button");
            actions.enterTextAndWait(INput01,"Defect 01","User entered Defect name");
            actions.clickAndWait(Check01,"User checked check box");
            actions.clickAndWait(save01,"User clicked on save button");


            actions.clickAndWait(Plus02,"User Clicked on Plus Button");
            actions.enterTextAndWait(INput02,"Defect 02","User entered defect name");
            actions.clickAndWait(Check02,"User checked check box");
            actions.clickAndWait(save02,"User checked check box");



            actions.clickAndWait(Plus03,"User Clicked on plus button Button");
            actions.enterTextAndWait(INput03,"Defect 03","User entered defect name");
            actions.clickAndWait(Check03,"User checked check box");
            actions.clickAndWait(save03,"User checked check box");


            actions.clickAndWait(Plus04,"User Clicked on Close Button");
            actions.enterTextAndWait(INput04,"Defect 04","User entered defect name");
            actions.clickAndWait(Check04,"User checked check box");
            actions.clickAndWait(save04,"User checked check box");


            actions.clickAndWait(Plus05,"User Clicked on Close Button");
            actions.enterTextAndWait(INput05,"Defect 05","User entered defect name");
            actions.clickAndWait(Check05,"User checked check box");
            actions.clickAndWait(save05,"User checked check box");


            actions.clickAndWait(SaveDage,"user clicked on Save Button");
            actions.clickAndWait(close,"user clicked on Close Button");

            actions.clickAndWait(save05,"User clicked on save button");




        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }


    public void edit01() {

        try {



            actions.clickAndWait(network1,"User Clicked on Network Icon");
            actions.clickAndWait(clickvaripage,"User Clicked on Variable Pag Name");
            actions.clickAndWait(editpencil,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time,
                    "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, testData.get("Subgroup01"), "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, testData.get("Subgroup02"), "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, testData.get("Subgroup03"), "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, testData.get("Subgroup04"), "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, testData.get("Subgroup05"), "User Entered Value in Subgroup Field");

            actions.clickAndWait(total03,"User Clicked on Total Value");
            actions.enterTextAndWait(total03, "100","User Entered Values in Total Field ");
            actions.clickAndWait(savechart,"User Clicked on Save Button");


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


            actions.clickAndWait(time2,"User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup06,"3","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup07,"2","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup08,"1","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(total03, "100","User Entered Value in Total Text Filed");
            actions.clickAndWait(savechart2,"User Clicked on Save Button");


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


            actions.clickAndWait(time3,"User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup09,"3","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup10,"4","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup11,"6","User Entered Value in Subgroup Filed");

            actions.clickAndWait(total03,"User Clicked on Total Input Field");
            actions.enterTextAndWait(total03, "100","User Entered Value in Total Text Filed");
            actions.clickAndWait(savechart3,"User Clicked on Save Button");


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


            actions.clickAndWait(time4,"User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup11,"5","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup12,"4","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup13,"3","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup14,"2","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(Subgroup15,"1","User Entered Value in Subgroup Filed");
            actions.enterTextAndWait(total02, "100","User Entered Value in Total Text Filed");
            actions.clickAndWait(savechart19,"User Clicked on Save Button");
            actions.fetchLogAndValidateText(
                    getText4,                   // locator for the element
                    "Process in Control",         // expected text
                    "Attribute Name"              // friendly name for logging/assertion
            );

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}


}
