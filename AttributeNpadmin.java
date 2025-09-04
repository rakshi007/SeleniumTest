package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.TestCase24Page;
import util.ConfigReader;
import util.ExtentReportManager;


public class AttributeNpadmin {


    private TestCase24Page tc = new TestCase24Page(DriverFactory.getDriver());

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

    @When("user is creating attribute character to verify attribute NP chart")
    public void user_is_creating_attribute_character_to_verify_attribute_np_chart() {
        tc.AddingChar();

    }
    @When("user updates sequence to verify attribute NP chart")
    public void user_updates_sequence_to_verify_attribute_np_chart() {
       tc.sequence();
    }




    }
