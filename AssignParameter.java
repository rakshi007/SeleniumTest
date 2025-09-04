package pages;


import Base.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignParameter extends BasePage {

    // Locators
    private By filesIcon = By.xpath("//div[@class='iconpos-top']//div[1]//span[1]//img[1]");
    private By addPtp = By.id("new");
    private By assignParaIcon = By.xpath("//a[text()='Assign Parameters to Part ']");
    private By dataDropdown = By.xpath("(//input[@role='combobox'])[1]");
    private By selectGroup = By.xpath("//div[contains(text(),'SPC_Control_Group')]");
    private By partDropdown = By.xpath("(//input[@role='combobox'])[2]");
    private By selectPartPara = By.xpath("//div[contains(text(),'Car Spare parts')]");
    private By dndCheckbox = By.xpath("(//span[@class='checkmark'])[4]");
    private By kebabIcon = By.xpath("//span[@class='layout-btn btn-more none']//img");
    private By assignLink = By.xpath("//a[text()='Assign']");
    private By saveAssign = By.xpath("//button[text()='Save']");
    private By closeAssign = By.xpath("(//button[text()='Close'])[2]");

    // Constructor
    public AssignParameter(WebDriver driver) {
        super(driver);
    }

    // Actions (methods for interacting with elements)

    public void clickFilesIcon() {
        clickElement(filesIcon);
    }

    public void clickAddPtp() {
        clickElement(addPtp);
    }

    public void clickAssignParametersIcon() {
        clickElement(assignParaIcon);
    }

    public void selectDataFromDropdown() {
        clickElement(dataDropdown);
        clickElement(selectGroup);
    }

    public void selectPartFromDropdown() {
        clickElement(partDropdown);
        clickElement(selectPartPara);
    }

    public void checkDndCheckbox() {
        clickElement(dndCheckbox);
    }

    public void clickKebabIcon() {
        clickElement(kebabIcon);
    }

    public void clickAssignLink() {
        clickElement(assignLink);
    }

    public void saveAssignment() {
        clickElement(saveAssign);
    }

    public void closeAssignment() {
        clickElement(closeAssign);
    }
}
