package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.InSubgroupPage;
import DriverFactory.DriverFactory;
import util.ConfigReader;
import util.ExtentReportManager;


public class insubgrouyp {


    private InSubgroupPage tc = new InSubgroupPage(DriverFactory.getDriver());
    private ExtentTest test;

    {
        this.test = ExtentReportManager.getTest();
        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
    }

    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();

    @Given("user adds characteristics subsize01")
    public void user_adds_characteristics_subsize01() {
        tc.Subsize5();
    }

    @Then("user adds characteristics subsize02")
    public void user_adds_characteristics_subsize02() {
      tc.subsize51();
    }

    @Then("user adds characteristics subsize03")
    public void user_adds_characteristics_subsize03() {
   tc.subsize10();
    }

    @Then("user adds characteristics subsize04")
    public void user_adds_characteristics_subsize04() {
    tc.subsize100();
    }

    @Then("user adds characteristics subsize05")
    public void user_adds_characteristics_subsize05() {

        tc.subsize225();
    }

    @Then("user adds characteristics subsize06")
    public void user_adds_characteristics_subsize06() {

        tc.subsize221();
    }

    @Then("user creates sequence for incomplete subgroup")
    public void user_creates_sequence_for_incomplete_subgroup() {

        tc.sequence();
    }

    @Then("user creates page for incomplete subgroup")
    public void user_creates_page_for_incomplete_subgroup() {

        tc.seteilte();
    }



}
