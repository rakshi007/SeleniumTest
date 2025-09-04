package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase30Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DpmoADMIN {



    private TestCase30Page tc = new TestCase30Page(DriverFactory.getDriver());

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


    {}
    @When("user creates attribute charts for DMPO Chart")
    public void user_creates_attribute_charts_for_dmpo_chart() {
         tc.DPMOCHART();
    }

    @Then("user update sequence for DPMO charts")
    public void user_update_sequence_for_dpmo_charts() {
     tc.sequence();
    }



}
