package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.InSubgroupPage;
import util.ConfigReader;
import util.ExtentReportManager;

public class IncompleteSatelllite {


    private InSubgroupPage tc = new InSubgroupPage(DriverFactory.getDriver());
    ConfigReader configReader = new ConfigReader();
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();


    @Given("user enter data for incomplete subgroup size05")
    public void user_enter_data_for_incomplete_subgroup_size05() {

        tc.edit01();
    }

    @Then("user enter data for incomplete subgroup size55")
    public void user_enter_data_for_incomplete_subgroup_size55() {

        tc.edit02();
    }

    @Then("user enter data for incomplete subgroup size10")
    public void user_enter_data_for_incomplete_subgroup_size10() {
       tc.edit03();
    }

    @Then("user enter data for incomplete subgroup size100")
    public void user_enter_data_for_incomplete_subgroup_size100() {

        tc.edit04();
    }

    @Then("user enter data for incomplete subgroup size22")
    public void user_enter_data_for_incomplete_subgroup_size22() {

        tc.edit05();
    }

    @Then("user enter data for incomplete subgroup size220")
    public void user_enter_data_for_incomplete_subgroup_size220() {

        tc.edit06();
    }

    @Then("user enter data for globel settings subgroupsize{int}")
    public void userEnterDataForGlobelSettingsSubgroupsize(int arg0) {
        tc.edit07();
    }

    @Then("user enetr data for incompete subgroup{int}")
    public void userEnetrDataForIncompeteSubgroup(int arg0) {
      tc.edit08();

    }
}
