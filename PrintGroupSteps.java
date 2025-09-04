package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PrintGroup;
import util.ExtentReportManager;

public class PrintGroupSteps {



    private PrintGroup tc = new PrintGroup(DriverFactory.getDriver());
    private ExtentTest test;

    {
        // Initialize a new test
        {
            this.test = ExtentReportManager.getTest();
        }
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


    @Given("the user is creating print group")
    public void the_user_is_creating_print_group() {

        tc.Create();
    }

    @Then("the user assigning characters to printGroup")
    public void the_user_assigning_characters_to_print_group() {

        tc.Assign();
    }
}
