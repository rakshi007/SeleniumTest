package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase24Page;
import pages.TestCase29Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DefectsFamily {



    private TestCase29Page tc = new TestCase29Page(DriverFactory.getDriver());

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


    @When("user updates attribute chart for defect family")
    public void user_updates_attribute_chart_for_defect_family() {
       tc.DefectCategory();
    }

    @Then("user updates sequence for defect family")
    public void user_updates_sequence_for_defect_family() {
       tc.sequence();
    }


}
