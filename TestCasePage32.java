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

public class TestCasePage32 {


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





    private By addnew1 = By.id("new");
    private By addgrp = By.xpath("//a[text()='Add Data Group ']");
    private By enterGrpName = By.id("AddGroup");
    private By clickAdd = By.xpath("//button[text()=' Add ']");


    //part
    private By addnew = By.xpath("//img[@src=\"./assets/images/new.svg?v=1010108\"]");
    private By clkpart = By.xpath("//a[text()='Add Part ']");
    private By clickdrop = By.xpath("//div[@class='dx-dropdowneditor-icon']");
    private By slctGrp = By.xpath("//div[text()='SPC_DAGE']");
    private By Enterpart = By.id("AddPart");
    private By ClkADD = By.xpath("//button[text()=' Add ']");


//Char

    private By  addchar= By.id("AddChar");
    private By  charaaddbutton= By.xpath("//button[text()=' Add ']");
        private By  dropdownatt = By.xpath("(//lib-devextreme-selectbox)[3]");
    private By select1 = By.xpath("//div[contains(text(),'Attribute')]");
    private By Defects = By.xpath("//a[text()='Defects']");

    private By  DageBar= By.xpath("//span[@class=\"slider round\"]");
    private By DrpDage= By.xpath("(//div[@class='dx-dropdowneditor-icon'])[4]");


    private By  SelectDage= By.xpath("//div[text()='Test']");

    private By saveAttribute = By.xpath("(//button[text()=' Save '])[1]");
    private By toast = By.xpath("//span[@class=\"sidepan_msg\"]");
    private By  closechar= By.xpath("(//button[text()=' Close '])[1]");


    //variable char

    private By addseqlinkv = By.xpath("//img[@id=\"new\"]");
    private By AddCharLinkv = By.xpath("//a[text()='Add Characteristic ']");
    private By clickdatagroupv = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private By selectdatagrpv = By.xpath("//div[text()='SPC_DAGE']");
    private By clickpartv = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private By selectpartv = By.xpath("//div[text()='DagePart']");
    private By  addcharv= By.id("AddChar");
    private By  charaaddbuttonv= By.xpath("//button[text()=' Add ']");
    private By upperspecv = By.id("upperlmt");
    private By lowerspecv = By.id("lowerspec");
    private By subsizev = By.id("subgroupsize");
    private By savecharv = By.xpath("//button[text()=' Save ']");
    private By OperatorInformationv = By.xpath("//a[text()='Operator Information']");
    private By LinkAttributev = By.xpath("(//label[normalize-space()='Link Attribute'])[1]");
    private By Drpv = By.xpath("(//input[@role='combobox'])[4]");
    private By Attributev = By.xpath("//div[text()='DageAttribute']");
    private By savec = By.xpath("(//button[text()=' Save '])[1]");
    private By closec = By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]");














//Add sequence


    private By addseqlink = By.xpath("//img[@id=\"new\"]");
    private By addsequece= By.xpath("//a[text()='Add Sequence ']");
    private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private By selectdatagrp = By.xpath("//div[text()='SPC_DAGE']");
    private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private By selectpart = By.xpath("//div[text()='DagePart']");
    private By clickonadd = By.xpath("//button[text()=' Add ']");
    private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
    private By Drag= By.xpath("//p[text()=' DageAttribute ']");
    private By Drop = By.xpath("//p[text()=' Characteristics in Sequence ']");

    private By Dragv= By.xpath("//p[text()=' DageVariable ']");
    private By Dropv = By.xpath("//p[text()=' Characteristics in Sequence ']");

    private By assign = By.xpath("//a[text()='Assign']");
    private By save = By.xpath("//button[text()='Save']");
    private By close1 = By.xpath("//button[text()=' Close ']");

    //network
    private By network = By.xpath("//div[@class='iconpos-top']//div[2]//span[1]//img[1]");
    private By addsatellite = By.id("new");
    private By satellite= By.xpath("//span[text()='Add Satellite']");
    private By Entersatellitename= By.xpath("//input[@id=\"AddGroup\"]");
    private By Addsetellite = By.xpath("//button[text()='Add']");


    private By Kebabsatellite = By.xpath("//span[@class='inline_svg svg_highlight moreimg']//img");
    private By Addpage = By.xpath("(//span[text()='Add Page'])[2]");
    private By Enterpagenamesatellite = By.xpath("//input[@placeholder=\"Page Name\"]");
    private By Addsatellitepage = By.xpath("//button[text()=' Add ']");
    private By Dragsequencname = By.xpath("//p[text()=' SPC_DAGE ']");
    private By drop = By.xpath("//p[text()=' Space Station Modules ']");

    private By savesatellitepage = By.xpath("(//button[text()=' Save '])[2]");
    private By closesatellitepage = By.xpath("(//button[text()='Close'])[1]");
    private By clickeditpage = By.xpath("(//div[@class=\"dl_dashrow\"])[2]");



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

    public TestCasePage32(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

        this.testData = testData;
    }


    public void Test1() {

        try {


            actions.clickAndWait(addnew1,"User clicked on add button");
            actions.clickAndWait(addgrp,"User clicked on add group link");
            actions.enterTextAndWait(enterGrpName,"SPC_DAGE","User clicked on add group link");
            actions.clickAndWait(clickAdd,"User clicked on add button");


            actions.clickAndWait(addnew1,"User clicked on add button");
            actions.clickAndWait(clkpart,"User clicked on add Part");
            actions.clickAndWait(clickdrop,"User clicked DataGroup button");
            actions.clickAndWait(slctGrp,"User clicked on add button");
            actions.enterTextAndWait(Enterpart,"DagePart","User entered partName");
            actions.clickAndWait(ClkADD,"User clicked on add button");



            actions.enterTextAndWait(addchar,"DageAttribute","User clicked on add button");
            actions.clickAndWait(dropdownatt,"User clicked on add button");
            actions.clickAndWait(select1,"User clicked on add Part");
            actions.clickAndWait(charaaddbutton,"User clicked on add button");
            actions.clickAndWait(Defects,"User clicked on add Part");
            actions.clickAndWait(DageBar,"User clicked on add button");
            actions.clickAndWait(DrpDage,"User clicked on add Part");
            actions.clickAndWait(SelectDage, "User clicked on Dage option");

            boolean defectVisible = actions.waitForDefectToAppear("Defect 02", 15);

            if (defectVisible) {
                actions.clickAndWait(saveAttribute, "User clicked on Save button");
            } else {
                LoggerUtil.error(" Defects not loaded in grid. Save button click skipped.");
            }


            actions.getPopupText(toast,"fatched popup");
            actions.waitForVisibility(closechar);
            actions.clickAndWait(closechar,"");






        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}



    public void Variable() {

        try {


            actions.clickAndWait(addseqlinkv,"User ");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"DageVariable","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10","User clicked on add icon button");

            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");

            actions.enterTextAndWait(subsizev,"2","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");
            actions.waitForElementVisible(OperatorInformationv,5,"waiting");
            actions.clickAndWait(OperatorInformationv,"User clicked on add icon button");
            actions.clickAndWait(LinkAttributev,"User clicked on add icon button");
            actions.clickAndWait(Drpv,"User clicked on add icon button");

            actions.clickAndWait(Attributev, "User clicked on add icon button");

            actions.clickAndWait(savec,"User clicked on save button");
            actions.getPopupText(toast,"getting text");

            actions.waitForElementVisible(closec,5,"waited");
            actions.clickAndWait(closec,"User clicked on close button");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }



    public void sequence() {

        try {


            actions.clickAndWait(addseqlink,"User clicked on add icon button");
            actions.clickAndWait(addsequece,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroup,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrp,"User clicked on add icon button");
            actions.clickAndWait(clickpart,"User clicked on add icon button");
            actions.clickAndWait(selectpart,"User clicked on add icon button");
            actions.clickAndWait(clickonadd,"Clicked on add sequence button");
            actions.enterTextAndWait(EnterSequencename,"Year-Based Codes","User clicked on add icon button");
            actions.dragAndDrop(Drag,Drop);
            actions.dragAndDrop(Dragv,Dropv);

            actions.clickAndWait(save,"User clicked on addicon button");
            actions.getPopupText(toast,"popup");
            actions.waitForVisibility(close1);
            actions.clickAndWait(close1,"User clicked on add icon button");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }



    public void seteilte() {

        try {


            actions.clickAndWait(network,"User clicked on add icon button");
            actions.clickAndWait(Kebabsatellite,"User clicked on add sequence button");
            actions.clickAndWait(Addpage,"User clicked on add icon button");
            actions.enterTextAndWait(Enterpagenamesatellite,"Space Station Modules","User clicked on add icon button");
            actions.clickAndWait(Addsatellitepage,"User clicked on add icon button");
            actions.dragAndDrop(Dragsequencname,drop);
            actions.clickAndWait(savesatellitepage,"User clicked on add icon button");
           actions.waitForVisibility(closesatellitepage);
            actions.clickAndWait(closesatellitepage,"User clicked on add icon button");



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
