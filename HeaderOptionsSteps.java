package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GlobalPage;
import util.ExtentReportManager;

public class HeaderOptionsSteps {


    private GlobalPage tc = new GlobalPage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();

    @Given("user is creating header option")
    public void user_is_creating_header_option() {
       tc.Header();
    }

    @Then("user is validating header option in overview")
    public void user_is_validating_header_option_in_overview() {
        tc.Headertest();
    }

}
