package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.TestCase22Page;
import util.ConfigReader;
import util.ExtentReportManager;

import java.time.Duration;

public class checksheetstatus {

    private TestCase22Page tc = new TestCase22Page(DriverFactory.getDriver());

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



    @When("user clicks on network icon to verify Checksheet status")
    public void user_clicks_on_network_icon_to_verify_checksheet_status() {
       tc.network1();
    }

    @Then("user clicks on page name to verify Checksheet status")
    public void user_clicks_on_page_name_to_verify_checksheet_status() {


        tc.clickvaripage();
    }

    @Then("user clicks on edit icon to verify Checksheet status")
    public void user_clicks_on_edit_icon_to_verify_checksheet_status() {
    tc.editpencil();
    }

    @Then("user clicks on date input field to verify Checksheet status")
    public void user_clicks_on_date_input_field_to_verify_checksheet_status() {
    tc.date();
    }

    @Then("user clicks on time input field to verify Checksheet status")
    public void user_clicks_on_time_input_field_to_verify_checksheet_status() {
   tc.time();
    }

    @Then("user selects radio button01 to verify Checksheet status")
    public void user_selects_radio_button01_to_verify_checksheet_status() {
    tc.line1();
    }

    @Then("user selects radio button02 to verify Checksheet status")
    public void user_selects_radio_button02_to_verify_checksheet_status() {
    tc.line2();
    }

    @Then("user selects radio button03 to verify Checksheet status")
    public void user_selects_radio_button03_to_verify_checksheet_status() {
    tc.line3();
    }

    @Then("user enters total inspected value for subgroup size01 to verify Checksheet status")
    public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_checksheet_status() {
   tc.totalcount();
    }

    @Then("user click on save1 button for chart01 to verify Checksheet status")
    public void user_click_on_save1_button_for_chart01_to_verify_checksheet_status() {
    tc.savechart();
    }

    @Then("user fetch the status01 of the page to verify Checksheet status")
    public void user_fetch_the_status01_of_the_page_to_verify_checksheet_status() {
tc.getText();
    }


    //
    @Then("user click on time2 inputfield to verify Checksheet status")
    public void user_click_on_time2_inputfield_to_verify_checksheet_status() {
   tc.time2();
    }

    @Then("user selects radio button04 to verify Checksheet status")
    public void user_selects_radio_button04_to_verify_checksheet_status() {
   tc.line4();
    }

    @Then("user selects radio button05 to verify Checksheet status")
    public void user_selects_radio_button05_to_verify_checksheet_status() {
    tc.line5();
    }

    @Then("user selects radio button06 to verify Checksheet status")
    public void user_selects_radio_button06_to_verify_checksheet_status() {
    tc.line6();
    }

    @Then("user enters total inspected value for subgroup size02 to verify Checksheet status")
    public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_checksheet_status() {
    tc.total02();
    }

    @Then("user click on save2 button for chart01 to verify Checksheet status")
    public void user_click_on_save2_button_for_chart01_to_verify_checksheet_status() throws InterruptedException {
    tc.savechart2();
    }

    @Then("user fetch the status02 of the page to verify to verify Checksheet status")
    public void user_fetch_the_status02_of_the_page_to_verify_to_verify_checksheet_status() {
    tc.getText2();
    }

    @Then("user click on time3 inputfield to verify to verify Checksheet status")
    public void user_click_on_time3_inputfield_to_verify_to_verify_checksheet_status() {
    tc.time3();
    }

    @Then("user selects radio button07 to verify Checksheet status")
    public void user_selects_radio_button07_to_verify_checksheet_status() {
    tc.line7();
    }

    @Then("user selects radio button08 to verify Checksheet status")
    public void user_selects_radio_button08_to_verify_checksheet_status() {
    tc.line8();
    }

    @Then("user selects radio button09 to verify Checksheet status")
    public void user_selects_radio_button09_to_verify_checksheet_status() {
   tc.line9();
    }

    @Then("user enters total inspected value for subgroup size03 to verify Checksheet status")
    public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_checksheet_status() {
    tc.total03();
    }

    @Then("user click on save3 button for chart01 to verify Checksheet status")
    public void user_click_on_save3_button_for_chart01_to_verify_checksheet_status() {
   tc.savechart3();
    }

    @Then("user fetch the status03 of the page  to verify Checksheet status")
    public void user_fetch_the_status03_of_the_page_to_verify_checksheet_status() {
   tc.getText3();
    }

    @Then("user click on time4 inputfield to verify Checksheet status")
    public void user_click_on_time4_inputfield_to_verify_checksheet_status() {
   tc.time4();
    }

    @Then("user selects radio button10 to verify Checksheet status")
    public void user_selects_radio_button10_to_verify_checksheet_status() {
    tc.line10();
    }

    @Then("user selects radio button11 to verify Checksheet status")
    public void user_selects_radio_button11_to_verify_checksheet_status() {
   tc.line11();
    }

    @Then("user selects radio button12 to verify Checksheet status")
    public void user_selects_radio_button12_to_verify_checksheet_status() {
    tc.line12();
    }

    @Then("user enters total inspected value for subgroup size04 to verify Checksheet status")
    public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_checksheet_status() {
    tc.total04();
    }

    @Then("user click on save4 button for chart01 to verify Checksheet status")
    public void user_click_on_save4_button_for_chart01_to_verify_checksheet_status() {
    tc.savechart4();
    }

    @Then("user fetch the status04 of the page to verify to verify Checksheet status")
    public void user_fetch_the_status04_of_the_page_to_verify_to_verify_checksheet_status() {
   tc.getText4();

    }

    @Then("user click on time5 inputfield to verify Checksheet status")
    public void user_click_on_time5_inputfield_to_verify_checksheet_status() {
   tc.time5();
    }

    @Then("user selects radio button13 to verify Checksheet status")
    public void user_selects_radio_button13_to_verify_checksheet_status() {
  tc.line13();
    }

    @Then("user selects radio button14 to verify Checksheet status")
    public void user_selects_radio_button14_to_verify_checksheet_status() {
   tc.line14();
    }

    @Then("user selects radio button15 to verify Checksheet status")
    public void user_selects_radio_button15_to_verify_checksheet_status() {
    tc.line15();
    }

    @Then("user enters total inspected value for subgroup size05 to verify Checksheet status")
    public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_checksheet_status() {
    tc.total05();
    }

    @Then("user click on save5 button for chart01 to verify Checksheet status")
    public void user_click_on_save5_button_for_chart01_to_verify_checksheet_status() {
    tc.savechart5();
    }

    @Then("user fetch the status05 of the page to verify Checksheet status")
    public void user_fetch_the_status05_of_the_page_to_verify_checksheet_status() {
   tc.getText5();
    }



}
