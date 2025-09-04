package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase27Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class Attribute11Status {



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


    @When("user validating subgroup01")
    public void user_validating_subgroup01() {
       tc.edit01();
    }

    @Then("user validating subgroup02")
    public void user_validating_subgroup02() {
     tc.edit02();
    }

    @Then("user validating subgroup03")
    public void user_validating_subgroup03() {
     tc.edit03();
    }

    @Then("user validating subgroup04")
    public void user_validating_subgroup04() {
    tc.edit04();
    }





}
