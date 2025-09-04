package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase27Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class Attribute11Admin {



    private TestCase27Page tc = new TestCase27Page(DriverFactory.getDriver());

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



    @When("user creates char for checksheet with enble checkbox")
    public void user_creates_char_for_checksheet_with_enble_checkbox() {
      tc.CheckSheet();
    }

    @When("user updates sequence for checksheet with enble checkbox")
    public void user_updates_sequence_for_checksheet_with_enble_checkbox() {
        tc.CheckSheet2();

    }

    @Then("user creates char for checksheet without enble chcekbox")
    public void user_creates_char_for_checksheet_without_enble_chcekbox() {
        tc.sequence();
    }

    @When("user updates sequence for checksheet without enble checkbox")
    public void user_updates_sequence_for_checksheet_without_enble_checkbox() {
        tc.sequence2();
    }




}
