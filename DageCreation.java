package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.TestCase22Page;
import pages.TestCase31Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DageCreation {


    private TestCase31Page tc = new TestCase31Page(DriverFactory.getDriver());

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



    @When("User Creating Dage Failure Mode Analysis")
    public void user_creating_dage_failure_mode_analysis() {
       tc.sequence();
    }
}
