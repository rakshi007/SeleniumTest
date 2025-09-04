package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.UIActions;

import java.time.Duration;

import static java.lang.Thread.sleep;
import static util.LoggerUtil.logFail;

public class    Definecategories {


    private WebDriver driver;
    private WebDriverWait wait;

    UIActions actions;


    private final By configuration = By.xpath("(//img)[7]");
    private final By Expand = By.xpath("//span[@class=\"right-round\"]//img");
    private final By ExpandIconFiguration = By.xpath("//span[@class=\"qual_tree_dropdown\"]//img");


    private final By ExpandDefects = By.xpath("(//img[@class='tree_dropdown_icon'])[4]");
    private final By Categories = By.xpath("(//p[normalize-space()='Define Categories'])[1]");
    private final By AddButton = By.xpath("(//img[@id='new'])[1]");

    private final By ClickAddDefectCategories = By.xpath("//a[normalize-space()='Add Defect Category Group']");
    private final By AddGroup = By.id("AddGroup");
    private final By UseDefectFamily = By.xpath("(//span[@class='checkmark'])[5]");

    private final By Add = By.xpath("//button[normalize-space()='Add']");
    private final By AddButton1 = By.xpath("(//img[@id='new'])[1]");
    private final By AddDefectCateGory = By.xpath("//a[text()='Add Defect Category ']");


    private final By DefectCategoryDropDown = By.xpath("(//input[@role='combobox'])[1]");
    private final By selectCategory = By.xpath("//div[contains(text(),'DefectCategories')]");
    private final By DefectCategoryName = By.xpath("//input[@class='none ng-pristine ng-valid ng-touched']");


    private final By Order = By.xpath("(//input[@type='number'])[1]");
    private final By Limit = By.xpath("(//input[@type='number'])[2]");
    private final By SamplingSize = By.xpath("(//input[@type='number'])[3]");


    private final By AcceptanceNo = By.xpath("(//input[@type='number'])[4]");
    private final By URLimit = By.xpath("(//input[@type='number'])[5]");
    private final By UCL = By.xpath("(//input[@type='number'])[6]");


    private final By Save = By.xpath("(//button[normalize-space()='Save'])[1]");



    public Definecategories(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new UIActions(driver);

    }


    public void DefectCategory() {

        try {



            actions.jsClick(configuration);
            Thread.sleep(2000);
            actions.hoverAndClick(Expand);
            actions.hoverAndClick(ExpandIconFiguration);
            actions.hoverAndClick(ExpandDefects);
            actions.clickAndWait(Categories,"Add New Button");
            actions.clickAndWait(AddButton,"");
            actions.clickAndWait(ClickAddDefectCategories,"");
            actions.enterTextAndWait(AddGroup,"DefectCategories","");
            actions.clickAndWait(UseDefectFamily,"");
            actions.clickAndWait(Add,"");

            actions.clickAndWait(AddButton1,"");
            actions.clickAndWait(AddDefectCateGory,"");
            actions.clickAndWait(DefectCategoryDropDown,"");
            actions.clickAndWait(selectCategory,"");
            actions.clickAndWait(DefectCategoryName,"");
            actions.enterTextAndWait( DefectCategoryName,"Check01","");
            actions.enterTextAndWait(Order,"2","");
            actions.enterTextAndWait(Limit,"1","");
            actions.enterTextAndWait(SamplingSize,"3","");
            actions.enterTextAndWait(AcceptanceNo,"4","");
            actions.enterTextAndWait(URLimit,"4","");
            actions.enterTextAndWait(UCL,"6","");
            actions.clickAndWait(Save,"");




        } catch (Exception e) {
            logFail("Failed to add attribute character", e);

        }}





}
