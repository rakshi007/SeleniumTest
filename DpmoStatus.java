package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.When;
import pages.TestCase30Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DpmoStatus {


    private TestCase30Page tc = new TestCase30Page(DriverFactory.getDriver());

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





    @When("user enter values for Dpmo chart subgroup01")
    public void user_enter_values_for_dpmo_chart_subgroup01() {
        tc.edit01();
    }

    @When("user enter values for Dpmo chart subgroup02")
    public void user_enter_values_for_dpmo_chart_subgroup02() {
      tc.edit02();
    }

    @When("user enter values for Dpmo chart subgroup03")
    public void user_enter_values_for_dpmo_chart_subgroup03() {
      tc.edit03();
    }

    @When("user enter values for Dpmo chart subgroup04")
    public void user_enter_values_for_dpmo_chart_subgroup04() {
        tc.edit04();
    }

}
