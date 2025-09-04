package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.GlobalPage;
import pages.LoginPage;
import util.ConfigReader;
import util.ExtentReportManager;
import util.LoginUtil;
import util.UIActions;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class DatamappingtestSteps {


    private GlobalPage tc = new GlobalPage(DriverFactory.getDriver());
    private ExtentTest test;
    private LoginPage loginPage;
    UIActions actions;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


    @Given("validate data groups for user {string}")
    public void validateDataGroupsForUser(String userKey) throws InterruptedException {
        WebDriver driver = DriverFactory.getDriver();
        Properties prop = new ConfigReader().init_prop();

        String username = prop.getProperty(userKey);
        String userNumber = userKey.replaceAll("\\D+", "");
        String password = prop.getProperty("password" + userNumber);

        if (username == null || password == null) {
            throw new IllegalArgumentException("Missing credentials for user key: " + userKey);
        }

        // Login
        LoginUtil.loginWithPopupHandling(driver, username, password);

        // Expected data groups
        List<String> expectedGroups = Arrays.asList(
                "Production Data",
                "Quality Data",
                "Maintenance Data",
                "Financial and Cost Data",
                "Labor Data"
        );

        // Locators
        By dropdownBtn = By.xpath("//span[@id=\"dropdownMenuButton\"]");
        By groupItemTextNodes = By.xpath("//a[contains(@class, 'dropdown-item')]//p[@class='englishText']");

        GlobalPage page = new GlobalPage(driver);
        page.validateDataGroups(expectedGroups, dropdownBtn, groupItemTextNodes);
    }

}