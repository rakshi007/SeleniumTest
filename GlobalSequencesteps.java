package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GlobalPage;
import util.ExtentReportManager;

public class GlobalSequencesteps {
    private GlobalPage tc = new GlobalPage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


    @Given("when user validates sequence preferences")
    public void when_user_validates_sequence_preferences() {
       tc.sequenceglobal();
    }

    @Then("user validating notification")
    public void user_validating_notification() {
        tc.Notification();
    }


}
