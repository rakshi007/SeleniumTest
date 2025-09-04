package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.LoggerUtil;
import util.UIActions;
import util.ExcelReader;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static util.LoggerUtil.logFail;

public class InSubgroupPage {


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
    private By slctGrp = By.xpath("//div[text()='SPC_IS']");
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
    private By selectdatagrpv = By.xpath("//div[text()='SPC_IS']");
    private By clickpartv = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private By selectpartv = By.xpath("//div[text()='INPart']");
    private By  addcharv= By.id("AddChar");
    private By  charaaddbuttonv= By.xpath("//button[text()=' Add ']");
    private By upperspecv = By.id("upperlmt");
    private By lowerspecv = By.id("lowerspec");
    private By subsizev = By.id("subgroupsize");
    private By savecharv = By.xpath("//button[text()=' Save ']");
    private By AR = By.xpath("(//img[@id='AR'])[1]");
    private By insg = By.xpath("//p[text()='Allow incomplete subgroups']");
    private By dataig = By.xpath("//input[@type=\"number\"]");
    private By savec = By.xpath("(//button[text()=' Save '])[1]");
    private By closec = By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]");







//Add sequence


    private By addseqlink = By.xpath("//img[@id=\"new\"]");
    private By addsequece= By.xpath("//a[text()='Add Sequence ']");
    private By clickdatagroup = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[1]");
    private By selectdatagrp = By.xpath("//div[text()='SPC_IS']");
    private By clickpart = By.xpath("(//div[@class='dx-dropdowneditor-icon'])[2]");
    private By selectpart = By.xpath("//div[text()='INPart']");
    private By clickonadd = By.xpath("//button[text()=' Add ']");
    private By EnterSequencename = By.xpath("//input[@maxlength=\"40\"]");
    private By char1= By.xpath("(//p[@title='Subgroup_5'])[1]");
    private By char2= By.xpath("(//p[@title='Subgroup_50'])[1]");
    private By char3= By.xpath("(//p[@title='Subgroup_10'])[1]");
    private By char4= By.xpath("(//p[@title='Subgroup_100'])[1]");
    private By char5= By.xpath("(//p[@title='Subgroup_22'])[1]");
    private By char6= By.xpath("(//p[@title='Subgroup_222'])[1]");




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
    private By Dragsequencname = By.xpath("//p[text()=' incompleteSubgroup ']");
    private By drop = By.xpath("//p[text()=' Space incomplete ']");

    private By savesatellitepage = By.xpath("(//button[text()=' Save '])[1]");
    private By closesatellitepage = By.xpath("(//button[text()=' Close '])[2]");
    private By clickeditpage = By.xpath("(//div[@class=\"dl_dashrow\"])[2]");


    //edit chart
    private By network1 = By.xpath("(//img)[6]");
    private By clickvaripage = By.xpath("//h5[text()='Space incomplete']");
    private By editpencil = By.xpath("(//img[@class='EDIT_BLUE'])[1]");
    private By date= By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]");
    private By time= By.xpath("//input[@placeholder=\"HH:mm:ss\"]");
    private By Subgroup01 = By.xpath("(//input[@id='Subgroup_0'])[1]");
    private By Subgroup02 = By.xpath("(//input[@id='Subgroup_1'])[1]");
    private By alert = By.xpath("//div[@id=\"alertmsg\"]");
    private By okalert  =By.xpath("(//button[@id=\"btn0\"])[1]");
    private By Subgroup03 = By.xpath("(//input[@id='Subgroup_2'])[1]");
    private By Subgroup04 = By.xpath("(//input[@id='Subgroup_3'])[1]");
    private By Subgroup05 = By.xpath("(//input[@id='Subgroup_4'])[1]");
    private By Subgroup06 = By.xpath("(//input[@id='Subgroup_5'])[1]");
    private By Subgroup07 = By.xpath("(//input[@id='Subgroup_6'])[1]");
    private By Subgroup08 = By.xpath("(//input[@id='Subgroup_7'])[1]");
    private By Subgroup09 = By.xpath("(//input[@id='Subgroup_8'])[1]");
    private By Subgroup10 = By.xpath("(//input[@id='Subgroup_9'])[1]");
    private By Subgroup11 = By.xpath("(//input[@id='Subgroup_10'])[1]");
    private By Subgroup12 = By.xpath("(//input[@id='Subgroup_11'])[1]");
    private By Subgroup13 = By.xpath("(//input[@id='Subgroup_12'])[1]");
    private By Subgroup14 = By.xpath("(//input[@id='Subgroup_13'])[1]");
    private By Subgroup15 = By.xpath("(//input[@id='Subgroup_14'])[1]");
    private By Subgroup16 = By.xpath("(//input[@id='Subgroup_15'])[1]");
    private By Subgroup17 = By.xpath("(//input[@id='Subgroup_16'])[1]");
    private By Subgroup18 = By.xpath("(//input[@id='Subgroup_17'])[1]");
    private By Subgroup19 = By.xpath("(//input[@id='Subgroup_18'])[1]");
    private By Subgroup20 = By.xpath("(//input[@id='Subgroup_19'])[1]");
    private By Subgroup21 = By.xpath("(//input[@id='Subgroup_20'])[1]");
    private By Subgroup22 = By.xpath("(//input[@id='Subgroup_21'])[1]");

    private By savechart = By.id("sequencebychartsave");
    private By closealert = By.xpath("//button[text()=' Close ']");
    private By editpencil02 = By.xpath("(//img[@class='EDIT_BLUE'])[2]");
    private By editpencil03 = By.xpath("(//img[@class='EDIT_BLUE'])[3]");
    private By editpencil04 = By.xpath("(//img[@class='EDIT_BLUE'])[4]");
    private By editpencil05 = By.xpath("(//img[@class='EDIT_BLUE'])[5]");
    private By editpencil06 = By.xpath("(//img[@class='EDIT_BLUE'])[6]");

    private By yesb = By.xpath("//button[text()=' Yes ']");

    public InSubgroupPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);
    }


    public void Subsize5() {
        try {
            // ✅ Read Excel data dynamically from provided path and sheet
            // 🔹 Data Group creation
            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(addgrp, "User clicked on Add Data Group link");
            actions.clickAndWait(enterGrpName, "User clicked on Add Data Group link");
            actions.enterTextAndWait(enterGrpName, "SPC_IS", "User entered Data Group name");
            actions.clickAndWait(clickAdd, "User clicked on Add Group button");

            // 🔹 Part creation
            actions.clickAndWait(addnew1, "User clicked on Add button again");
            actions.clickAndWait(clkpart, "User clicked on Add Part link");
            actions.clickAndWait(clickdrop, "User clicked on Data Group dropdown");
            actions.clickAndWait(slctGrp, "User selected Data Group");
            actions.enterTextAndWait(Enterpart, "INPart", "User entered Part name");
            actions.clickAndWait(ClkADD, "User clicked on Add Part button");


                    actions.enterTextAndWait(addcharv, "Subgroup_5", "Entered Characteristic Name: " );
                    actions.clickAndWait(charaaddbuttonv, "Clicked Add Characteristic");

                    actions.enterTextAndWait(upperspecv, "10.00", "Entered USL: "  );
                    actions.enterTextAndWait(lowerspecv, "5.00", "Entered LSL: " );
                    actions.enterTextAndWait(subsizev, "5", "Entered Subgroup Size: ");

                    actions.clickAndWait(savecharv, "Saved the Characteristic");
                    Thread.sleep(2000);

                    actions.clickAndWait(AR, "Clicked AR Button");
                    actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
                    actions.enterTextAndWait(dataig, "50", "Entered Subgroup value: " );

                    actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
                    Thread.sleep(1000);
                    actions.clickAndWait(closec, "Closed Subgroup dialog");

        } catch (Exception e) {
            System.out.println("❌ Error reading Excel file or executing actions:");
            e.printStackTrace();
        }
    }


    public void subsize51() {

        try {

            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"Subgroup_50","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10.00","User clicked on add icon button");
            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5.00","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");
            actions.enterTextAndWait(subsizev,"5","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");

            Thread.sleep(2000);
            actions.clickAndWait(AR, "Clicked AR Button");
            actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
            actions.enterTextAndWait(dataig, "100", "Entered Subgroup value: " );

            actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(closec, "Closed Subgroup dialog");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }



    public void subsize10() {

        try {


            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"Subgroup_10","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10.00","User clicked on add icon button");
            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5.00","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");
            actions.enterTextAndWait(subsizev,"10","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");

            Thread.sleep(2000);
            actions.clickAndWait(AR, "Clicked AR Button");
            actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
            actions.enterTextAndWait(dataig, "50", "Entered Subgroup value: " );

            actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(closec, "Closed Subgroup dialog");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }

    public void subsize100() {

        try {

            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"Subgroup_100","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10.00","User clicked on add icon button");
            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5.00","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");
            actions.enterTextAndWait(subsizev,"10","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");

            Thread.sleep(2000);
            actions.clickAndWait(AR, "Clicked AR Button");
            actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
            actions.enterTextAndWait(dataig, "100", "Entered Subgroup value: " );

            actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(closec, "Closed Subgroup dialog");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }

    public void subsize225() {

        try {

            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"Subgroup_22","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10.00","User clicked on add icon button");
            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5.00","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");
            actions.enterTextAndWait(subsizev,"22","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");

            Thread.sleep(2000);
            actions.clickAndWait(AR, "Clicked AR Button");
            actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
            actions.enterTextAndWait(dataig, "50", "Entered Subgroup value: " );

            actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(closec, "Closed Subgroup dialog");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }
    }
    public void subsize221() {

        try {

            actions.clickAndWait(addnew1, "User clicked on Add button");
            actions.clickAndWait(AddCharLinkv,"User clicked on add sequence button");
            actions.clickAndWait(clickdatagroupv,"User clicked on add icon button");
            actions.clickAndWait(selectdatagrpv,"User clicked on add icon button");
            actions.clickAndWait(clickpartv,"User clicked on add icon button");
            actions.clickAndWait(selectpartv,"User clicked on add icon button");
            actions.enterTextAndWait(addcharv,"Subgroup_222","User clicked on add icon button");
            actions.clickAndWait(charaaddbuttonv,"User clicked on add icon button");
            actions.clickAndWait(upperspecv,"");
            actions.enterTextAndWait(upperspecv,"10.00","User clicked on add icon button");
            actions.clickAndWait(lowerspecv,"");
            actions.enterTextAndWait(lowerspecv,"5.00","User clicked on add icon button");
            actions.clickAndWait(subsizev,"");
            actions.enterTextAndWait(subsizev,"22","User clicked on add icon button");
            actions.clickAndWait(savecharv,"User clicked on save button");

            Thread.sleep(2000);
            actions.clickAndWait(AR, "Clicked AR Button");
            actions.clickAndWait(insg, "clicked Incomplete Subgroup checkbox");
            actions.enterTextAndWait(dataig, "100", "Entered Subgroup value: " );

            actions.clickAndWait(savec, "Clicked Save Incomplete Subgroup button");
            Thread.sleep(1000);
            actions.clickAndWait(closec, "Closed Subgroup dialog");



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
            actions.enterTextAndWait(EnterSequencename,"incompleteSubgroup","User clicked on add icon button");
            List<WebElement> characteristics = Arrays.asList(
                    actions.getElement(char1),
                    actions.getElement(char2),
                    actions.getElement(char3),
                    actions.getElement(char4),
                    actions.getElement(char5),
                    actions.getElement(char6)
            );
            UIActions actions = new UIActions(driver);
            WebElement dropArea = actions.getElement(Dropv); // Dropv is a By locator

            Actions act = new Actions(driver); // Initialize native Selenium Actions

            for (WebElement characteristic : characteristics) {
                act.dragAndDrop(characteristic, dropArea).perform();
                Thread.sleep(500); // Optional: add delay to see the drag action
            }


            actions.dragAndDropMultiple(characteristics, (WebElement) Dropv);

            Thread.sleep(1000);
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
            actions.enterTextAndWait(Enterpagenamesatellite,"Space incomplete","User clicked on add icon button");
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
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
    public void edit02() {

        try {


            actions.clickAndWait(editpencil02,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");

        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}
    public void edit03() {

        try {


            actions.clickAndWait(editpencil03,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup06, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup07, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup08, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup09, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup10, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}

    public void edit04() {

        try {


            actions.clickAndWait(editpencil04,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup06, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup07, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup08, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup09, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup10, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");



        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}

    public void edit05() {

        try {


            actions.clickAndWait(editpencil05,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup06, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup07, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup08, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup09, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup10, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup11, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup12, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup13, "7", "User Entered Value in Subgroup Field");

            actions.enterTextAndWait(Subgroup14, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup15, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup16, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup17, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup18, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup19, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup20, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup21, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup22, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}


    public void edit06() {

        try {


            actions.clickAndWait(editpencil06,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup06, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup07, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup08, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup09, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup10, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup11, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup12, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup13, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup14, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup15, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup16, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup17, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup18, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup19, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup20, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup21, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup22, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}


    public void edit07() {

        try {


            actions.clickAndWait(editpencil06,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}

    public void edit08() {

        try {


            actions.clickAndWait(editpencil06,"User Clicked on Edit Pencil Icon");
            actions.clickAndWait(date,"User Clicked on Date text Data TextField");
            actions.clickAndWait(time, "User Clicked on Time InputText Field");
            actions.enterTextAndWait(Subgroup01, "7" ,"User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup02, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup03, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.getPopupText(alert,"System alarm!" +
                    "Reading of sample #2 is empty");
            Thread.sleep(1000);
            actions.clickAndWait(okalert,"User Entered Values in Total Field ");
            actions.enterTextAndWait(Subgroup04, "7", "User Entered Value in Subgroup Field");
            actions.enterTextAndWait(Subgroup05, "7", "User Entered Value in Subgroup Field");
            actions.clickAndWait(savechart,"User Clicked on Save Button");
            actions.clickAndWait(closealert,"User Clicked on Save Button");
            actions.clickAndWait(yesb,"user clicked on close button");


        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}



}
