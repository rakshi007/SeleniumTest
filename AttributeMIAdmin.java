package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase26Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class AttributeMIAdmin {


    private TestCase26Page tc = new TestCase26Page(DriverFactory.getDriver());

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


    @When("user creates attribute charts for measuring instructions")
    public void user_creates_attribute_charts_for_measuring_instructions()
    {
        tc.Measuring();
    }

    @Then("user creats and update sequence to verify defect instruction")
    public void user_creats_and_update_sequence_to_verify_defect_instruction() {
        tc.sequence();
    }
}

    