package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.Definecategories;
import pages.TestCase22Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class Defects {

    private Definecategories tc = new Definecategories(DriverFactory.getDriver());

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




    @When("user is creates defect categories")
    public void user_is_creates_defect_categories() {
        tc.DefectCategory();
    }
}
