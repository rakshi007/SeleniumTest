package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase27Page;
import pages.TestCase28Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class Attribute11DStatus {


    private TestCase28Page tc = new TestCase28Page(DriverFactory.getDriver());

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


    @When("user validating subgroup01 without check box")
    public void user_validating_subgroup01_without_check_box() {
        tc.edit01();
    }

    @Then("user validating subgroup02 without check box")
    public void user_validating_subgroup02_without_check_box() {
        tc.edit02();
    }

    @Then("user validating subgroup03 without check box")
    public void user_validating_subgroup03_without_check_box() {
        tc.edit03();
    }

    @Then("user validating subgroup04 without check box")
    public void user_validating_subgroup04_without_check_box() {
        tc.edit04();
    }



}
