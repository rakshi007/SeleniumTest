package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase29Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DefectFamilyStatus {


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




    @When("user enter sungroup01 for defect family")
    public void user_enter_sungroup01_for_defect_family() {

        tc.edit01();
    }

    @Then("user enter sungroup02 for defect family")
    public void user_enter_sungroup02_for_defect_family() {
     tc.edit02();
    }

    @Then("user enter sungroup03 for defect family")
    public void user_enter_sungroup03_for_defect_family() {
       tc.edit03();
    }


}
