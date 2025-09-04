package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExtentReportManager;
import util.UIActions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static util.LoggerUtil.logFail;

public class PrintGroup {



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

    private By configuiration =  By.xpath("(//img)[7]");
    private By expand =  By.cssSelector("span[class='right-round'] img[class='imgsize']");
    private By extend =  By.cssSelector(".tree_dropdown_icon");
    private By printgroup =  By.xpath("//p[contains(text(), ' Print Group ')]");
    private By AddIcon =  By.xpath("//img[@id=\"new\"]");
    private By AddprintPrint =  By.cssSelector("li[class='act_drc'] a[class='dropdown-item']");
    private By addprint =  By.xpath("//input[@id=\"AddGroup\"]");
    private By Add =  By.xpath("//button[contains(text(),'Add')]");
    private By AssignPrintgroups  =  By.xpath("//a[contains(text(),'Assign Printgroups')]");
    private By Datagroup =  By.xpath("(//input[@size=\"1\"])[1]");
    private By selectgroup =  By.xpath("//div[contains (text(), \"SPC_Control_Group\")]");
    private By part =  By.xpath("(//input[@size=\"1\"])[2]");
    private By selectpart =  By.xpath("//div[contains (text(), \"Car Spare parts\")]");
    private By selectcd =  By.xpath("(//input[@size=\"1\"])[3]");
    private By checkbox  = By.xpath("(//div[@class='dx-list-select-all-label'][normalize-space()='Select All'])[3]");
    private By apply = By.xpath("//button[text()=' Apply ']");
    private By char01 = By.xpath("//p[@title='Wheel']");
    private By char02 = By.xpath("//p[@title='Engine']");
    private By char03 = By.xpath("//p[@title='Tyre']");
    private By char04 = By.xpath("//p[@title='Air Filter']");
    private By char05 = By.xpath("//p[@title='Spark Plugs']");
    private By char06 = By.xpath("//p[@title='Engine Mounts']");
    private By Drag = By.xpath("//p[normalize-space()='Label_Group_A']");
    private By save = By.cssSelector("button[class='btn save']");
    private By save01 = By.xpath("//button[text()=' Save ']");

    //assign print group

    private By addicon = By.xpath("(//img[@id='new'])[1]");

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
    private By printGroup = By.xpath("//div[contains(text(),\"Print Group\")]");
    private By drag = By.xpath("(//p[@title='Label_Group_A'])[1]");
    private By drop = By.xpath("(//p[normalize-space()='Assigned PrintGroups'])[1]");
    private By saveprint = By.xpath("(//button[normalize-space()='Save'])[1]");



    //control limit

    //parameter grid action
    private By configuration = By.xpath("(//img)[7]");
    private By RightClick = By.xpath("(//td[normalize-space()='Numeric'])[1]");
    private By editpara01 = By.xpath("(//span[normalize-space()='Edit Parameter'])[1]");
    private By ParaName = By.xpath("(//input[@type='text'])[8]");
    private By lenth = By.xpath("(//input[@type='number'])[1]");
    private By DefaultValue = By.xpath("(//input[@type='text'])[9]");
    private By CWPC = By.xpath("(//input[@role='combobox'])[2]");
    private By AllowAll = By.xpath("(//div[contains(text(),'Allow All')])[1]");
    private By Save = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By Closepara = By.xpath("(//button[normalize-space()='Close'])[1]");

   //increment


    private By GoButton = By.xpath("//button[normalize-space()='Go']");
    private By RightClick1 = By.xpath("(//td[normalize-space()='Increment'])[1]");

    private By Prefix = By.xpath("(//input[@type='text'])[8]");
    private By StartValue = By.xpath("(//input[@type='number'])[1]");
    private By Increment = By.xpath("(//input[@type='number'])[2]");
    private By Suffix = By.xpath("//lib-npopup//div[4]//input[1]");
    private By Saveincrement = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By CloseIncrement = By.xpath("(//button[normalize-space()='Close'])[1]");



    //Lookup Table


    private By GoLookUp = By.xpath("(//button[normalize-space()='Go'])[1]");
    private By RightClick2 = By.xpath("(//td[normalize-space()='Lookup Table'])[1]");

    private By IMG1 = By.xpath("(//img[@class='img none'])[1]");
    private By INPUT1 = By.xpath("(//input[@class='ng-pristine ng-valid ng-touched'])[1]");
    private By IMG2 = By.xpath("(//img[@class='img none'])[2]");
    private By INPUT2 = By.xpath("(//input[@type='text'])[14]");
    private By SAVELT = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By closeLT = By.xpath("(//button[normalize-space()='Close'])[1]");

    //Function

    private By GoFunction = By.xpath("(//button[normalize-space()='Go'])[1]");
    private By RightClick3 = By.xpath("(//td[normalize-space()='Function'])[1]");

    private By uslupper = By.xpath("(//li[normalize-space()='USL (Upper Spec)'])[1]");
    private By SAVEF = By.xpath("(//button[normalize-space()='Save'])[1]");
    private By closeF = By.xpath("(//button[normalize-space()='Close'])[1]");










    public PrintGroup(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

        this.testData = testData;
    }


    public void Create() {

        try {


            actions.clickAndWait(configuiration, "User Clicked on configuration Icon");
            actions.clickAndWait(expand, "User Clicked on expand button");
            actions.clickAndWait(extend, "User Clicked on dropdown icon");
            actions.clickAndWait(printgroup, "User Clicked on printGroup");
            actions.clickAndWait(AddIcon, "User Clicked on AddIcon");
            actions.clickAndWait(AddprintPrint, "User clicked on AddPrintPrint");
            actions.enterTextAndWait(addprint, "Label_Group_A", "User Entered Print GroupName");
            actions.clickAndWait(Add, "User Clicked on Add Button");


        } catch (Exception e) {
            logFail("Failed to create printGroup", e);

        }
    }

    public void Assign() {

        try {

            actions.clickAndWait(AddIcon, "User Clicked on add Icon");
            actions.clickAndWait(AssignPrintgroups, "User Clicked on AssignPrintGroups");
            actions.clickAndWait(Datagroup, "User Clicked on DataGroup dropdown");
            actions.clickAndWait(selectgroup, "User select on datagroup");
            actions.clickAndWait(part, "User Clicked on part");
            actions.clickAndWait(selectpart, "User clicked on selectPart");
            actions.clickAndWait(selectcd, "User clicked on char button");
            actions.clickAndWait(checkbox, "User select on all check box");
            actions.clickAndWait(apply, "User Clicked on apply icon");
            List<WebElement> characteristics = Arrays.asList(
                    actions.getElement(char01),
                    actions.getElement(char02),
                    actions.getElement(char03),
                    actions.getElement(char04),
                    actions.getElement(char05),
                    actions.getElement(char06)
            );
            UIActions actions = new UIActions(driver);
            WebElement dropArea = actions.getElement(Drag); // Dropv is a By locator

            Actions act = new Actions(driver); // Initialize native Selenium Actions

            for (WebElement characteristic : characteristics) {
                act.dragAndDrop(characteristic, dropArea).perform();
                Thread.sleep(500); // Optional: add delay to see the drag action
            }


            actions.dragAndDropMultiple(characteristics, (WebElement) Drag);

            Thread.sleep(1000);

            actions.clickAndWait(save, "");


        } catch (Exception e) {
            logFail("Failed to assign printGroups", e);

        }

    }
    public void print() {

        try {



            actions.clickAndWait(addicon, "User Clicked on configuration Icon");
            actions.clickAndWait(AddCharLinkv, "User Clicked on expand button");
            actions.clickAndWait(clickdatagroupv, "User Clicked on dropdown icon");
            actions.clickAndWait(selectdatagrpv, "User Clicked on printGroup");
            actions.clickAndWait(clickpartv, "User Clicked on AddIcon");
            actions.clickAndWait(selectpartv, "User clicked on AddPrintPrint");
            actions.enterTextAndWait(addcharv, "PrintGroup", "User Entered Print GroupName");
            actions.clickAndWait(charaaddbuttonv, "User Clicked on Add Button");
            actions.enterTextAndWait(upperspecv,"","");
            actions.enterTextAndWait(upperspecv,"","");
            actions.enterTextAndWait(upperspecv,"","");
            actions.clickAndWait(savecharv, "User Clicked on printGroup");
            actions.clickAndWait(printGroup, "User Clicked on printGroup");
            actions.dragAndDrop(drag,drop);
            actions.clickAndWait(saveprint, "User Clicked on printGroup");


        } catch (Exception e) {
            logFail("Failed to create printGroup", e);

        }
    }


public void ParaMeter() {

    try {


        actions.clickAndWait(configuration, "User Clicked on configuration Icon");
        actions.rightClick(RightClick);
        actions.clickAndWait(editpara01,"");
        actions.clearAndType(ParaName, "EditPara", "");
        actions.clearAndType(lenth, "20", "");
        actions.enterTextAndWait(DefaultValue, "Default Value", "");
        actions.clickAndWait(CWPC, "User clicked on AddPrintPrint");
        actions.clickAndWait(AllowAll, "User Clicked on Add Button");
        actions.clickAndWait(Save, "User Clicked on printGroup");
        actions.clickAndWait(Closepara, "User Clicked on printGroup");


    } catch (Exception e) {
        logFail("Failed to create printGroup", e);

    }
}
    public void Increment() {

        try {

            actions.rightClick(RightClick1);
            actions.clickAndWait(editpara01,"");
            actions.clickAndWait(GoButton, "User Clicked on configuration Icon");
            actions.clearAndType(Prefix, "bot", "");
            actions.clearAndType(StartValue, "2", "");
            actions.clearAndType(Increment, "3", "");
            actions.clearAndType(Suffix, "Temp", "");
            actions.clickAndWait(Save, "User Clicked on printGroup");
            actions.clickAndWait(Closepara, "User Clicked on printGroup");


        } catch (Exception e) {
            logFail("Failed to create printGroup", e);

        }
    }
        public void Lookup() {

            try {

                actions.rightClick(RightClick2);
                actions.clickAndWait(editpara01,"");
                actions.clickAndWait(GoLookUp, "User Clicked on configuration Icon");
                actions.clickEditIcon(IMG1, "User clicked on AddPrintPrint");
                actions.clearAndType(INPUT1, "321", "");
                actions.clickEditIcon(IMG2, "User clicked on AddPrintPrint");
                actions.clearAndType(INPUT2, "12345", "");
                actions.clearAndType(lenth, "User Clicked on printGroup", "");
                actions.clickAndWait(Save, "User Clicked on printGroup");
                actions.clickAndWait(Closepara, "User Clicked on printGroup");


            } catch (Exception e) {
                logFail("Failed to create printGroup", e);

            }

        }

            public void Function() {

                try {


                    actions.rightClick(RightClick3);
                    actions.clickAndWait(editpara01,"");
                    actions.clickAndWait(GoFunction, "User Clicked on configuration Icon");
                    actions.clickAndWait(uslupper, "User clicked on AddPrintPrint");
                    actions.clickAndWait(Save, "User Clicked on printGroup");
                    actions.clickAndWait(Closepara, "User Clicked on printGroup");


                } catch (Exception e) {
                    logFail("Failed to create printGroup", e);

                }
        }}