package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.ChecksheetTemplate;
import util.ConfigReader;
import util.ExtentReportManager;

public class ChecksheetCreation {


    private ChecksheetTemplate tc = new ChecksheetTemplate(DriverFactory.getDriver());

    ConfigReader configReader = new ConfigReader();

    private ExtentTest test;

    {
        // Initialize a new test
        {
            this.test = ExtentReportManager.getTest();
        }
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();

    @When("user creates checksheet for checkbox template")
    public void user_creates_checksheet_for_checkbox_template() throws InterruptedException {
        tc.checksheet();
    }

}
