package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase31Page;
import pages.TestCasePage32;
import util.ConfigReader;
import util.ExtentReportManager;

public class DageInputAdmin {



    private TestCasePage32 tc = new TestCasePage32(DriverFactory.getDriver());

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




    @When("user creates attribute charts for dage mode failure")
    public void user_creates_attribute_charts_for_dage_mode_failure() {
     tc.Test1();
    }

    @When("user Updates Variable charts for dage more failure")
    public void user_updates_variable_charts_for_dage_more_failure() {
       tc.Variable();

    }
    @Then("user creates sequence for dage input")
    public void user_creates_sequence_for_dage_input() {
     tc.sequence();
    }

    @Then("user updates satellite")
    public void user_updates_satellite() {
       tc.seteilte();
    }


}
