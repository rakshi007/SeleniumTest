package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import pages.InSubgroupPage;
import pages.SequencePage;
import util.ExtentReportManager;

public class AEDAdminSteps {



    private SequencePage tc = new SequencePage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();
    @Given("when user edit the sequence")
    public void when_user_edit_the_sequence() {
        tc.Variable();
    }


}
