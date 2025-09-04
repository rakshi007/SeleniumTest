package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.NetworkPage;
import util.ConfigReader;
import util.ExtentReportManager;

public class GlobalCAsteps {


    private NetworkPage tc = new NetworkPage(DriverFactory.getDriver());
    ConfigReader configReader = new ConfigReader();
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();



    @When("user creates global cause and group")
    public void user_creates_global_cause_and_group() {
        tc.cause();
    }
}
