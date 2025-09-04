package stepdefinitions;


import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SequencebyparPage;
import util.ExtentReportManager;

public class ByPartSteps {


    private SequencebyparPage tc = new SequencebyparPage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();



    @When("user is creates chars for validating by part feature")
    public void user_is_creates_chars_for_validating_by_part_feature() throws InterruptedException {

        tc.createDataGroup();
        tc.Partsecond();
        tc.Partthird();
        tc.Partfourth();
        tc.PartFifth();


    }

    @Then("user added sequence for bypart")
    public void userAddedSequenceForBypart() throws InterruptedException {
        tc.Sequence01();
        tc.Sequence02();
        tc.Sequence03();
        tc.Sequence04();
        tc.Sequence05();



    }

    @Then("user creates satellites names for bypart")
    public void userCreatesSatellitesNamesForBypart() throws InterruptedException {
        tc.Addpages();

    }

    @Then("user validates by part options")
    public void userValidatesByPartOptions() throws InterruptedException {

        tc.ByPart01();
        tc.ByPart02();
        tc.ByPart03();
        tc.ByPart04();
        tc.ByPart05();

    }
}
