package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.TestCase24Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class AttributeNPsatellite {


    private TestCase24Page tc = new TestCase24Page(DriverFactory.getDriver());

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


    @When("user edit chart for sub group data01")
    public void user_edit_chart_for_sub_group_data01() {
        tc.edit01();
    }


    @When("user edit chart for sub group data02")
    public void user_edit_chart_for_sub_group_data02() {
        tc.edit02();
    }

    @When("user edit chart for sub group data03")
    public void user_edit_chart_for_sub_group_data03() {
        tc.edit03();
    }

    @When("user edit chart for sub group data04")
    public void user_edit_chart_for_sub_group_data04() {
        tc.edit04();
    }

    @When("user edit chart for sub group data05")
    public void user_edit_chart_for_sub_group_data05() {
       tc.edit05();
    }



}
