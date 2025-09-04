package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase26Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class AttributeMIsatellite {

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


    @When("user enters data for subgroup data01")
    public void user_enters_data_for_subgroup_data01() {
       tc.edit01();
    }

    @Then("user enters data for subgroup data02")
    public void user_enters_data_for_subgroup_data02() {
        tc.edit02();
    }

    @Then("user enters data for subgroup data03")
    public void user_enters_data_for_subgroup_data03() {
        tc.edit03();
    }

    @Then("user enters data for subgroup data04")
    public void user_enters_data_for_subgroup_data04() {
        tc.edit04();
    }



}
