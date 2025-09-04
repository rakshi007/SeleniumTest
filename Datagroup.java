package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ExcelReader;
import util.UIActions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Datagroup {

    UIActions actions;
    private WebDriver driver;
    private WebDriverWait wait;

    // Excel-related
    private final String filePath = "C:\\Users\\RakshithR\\Downloads\\Test.xlsx.xlsx"; // ✅ Correct
    private final String sheetName = "DataGroup";

    // Locators
    private By addlink = By.id("new");
    private By addgrp = By.xpath("//a[text()='Add Data Group ']");
    private By enterGrpName = By.id("AddGroup");
    private By clickAdd = By.xpath("//button[text()='Add']");

    // Constructor
    public Datagroup(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new UIActions(driver);
    }

    public void addnew() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));
        WebElement addLink = driver.findElement(addlink);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", addLink);
    }

    public void clickaddgrp() {
        wait.until(ExpectedConditions.elementToBeClickable(addgrp));
        actions.clickAndWait(addgrp, "Clicked on 'Add Data Group'");
    }

    public void entergrpnameFromExcel(String groupName) {
        WebElement element = driver.findElement(enterGrpName);
        if (groupName == null || groupName.trim().isEmpty()) {
            throw new IllegalArgumentException("Group name from Excel is null or empty!");
        }
        System.out.println("Setting group name using JS: " + groupName);  // ✅ for debug
        actions.forceSetTextWithJS(element, groupName);
    }



    public void clickaddbtn() {
        wait.until(ExpectedConditions.elementToBeClickable(clickAdd));
        actions.clickAndWait(clickAdd, "Clicked on Add button");
    }
}
