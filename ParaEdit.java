package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.PrintGroup;
import util.ExtentReportManager;

public class ParaEdit {




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



    @Given("when user edit parameter")
    public void when_user_edit_parameter() {

        tc.ParaMeter();
    }

    @Then("user edit increment parameter")
    public void user_edit_increment_parameter() {

        tc.Increment();
    }

    @Then("user edit lookup parameter")
    public void user_edit_lookup_parameter() {
        tc.Lookup();
    }

    @Then("user edit Function parameter")
    public void user_edit_function_parameter() {

        tc.Function();
    }

}
