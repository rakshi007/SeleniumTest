package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import pages.GlobalPage;
import util.ExtentReportManager;

public class GlobalSteps {


    private GlobalPage tc = new GlobalPage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();



    @Given("when user is editing in global settings")
    public void when_user_is_editing_in_global_settings() {
        tc.GlobalSettings();
    }


}
