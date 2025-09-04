package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase09Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class MyStepdefs
{

    private TestCase09Page tc = new TestCase09Page(DriverFactory.getDriver());

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


    @When("user clicks on the network icon to verify No status")
    public void user_clicks_on_the_network_icon_to_verify_no_status() {
       tc.network1();
    }

    @Then("user clicks on the page name for edit to verify No status")
    public void user_clicks_on_the_page_name_for_edit_to_verify_no_status() {
        tc.clickvaripage();
    }

    @Then("user clicks on the edit icon to verify No status")
    public void user_clicks_on_the_edit_icon_to_verify_no_status() {
       tc.editpencil();
    }

    @When("user clicks on the date input field to verify No status")
    public void user_clicks_on_the_date_input_field_to_verify_no_status() {
        tc.date();
    }

    @Then("user clicks on the time1 input field to verify No status")
    public void user_clicks_on_the_time1_input_field_to_verify_no_status() {
        tc.time();
    }

    @Then("user enters subgroup size for one11 to verify No status")
    public void user_enters_subgroup_size_for_one11_to_verify_no_status() {
      tc.subgroup01();
    }

    @Then("user enters subgroup size for two12 to verify No status")
    public void user_enters_subgroup_size_for_two12_to_verify_no_status() {
        tc.subgroup02();
    }

    @Then("user clicks on the save button for chart1 to verify No status")
    public void user_clicks_on_the_save_button_for_chart1_to_verify_no_status() {
        tc.savechart01();
    }

    //
    @Then("user fetches the {int} data from the page to verify No status")
    public void user_fetches_the_data_from_the_page_to_verify_no_status(Integer int1) {
        tc.getText();
    }

    @When("user clicks on the time2 input field to verify No status")
    public void user_clicks_on_the_time2_input_field_to_verify_no_status() {
      tc.time2();
    }

    @Then("user enters subgroup size for one21 to verify No status")
    public void user_enters_subgroup_size_for_one21_to_verify_no_status() {
        tc.subgroup11();
    }

    @Then("user enters subgroup size for two22 to verify No status")
    public void user_enters_subgroup_size_for_two22_to_verify_no_status() throws InterruptedException {
        tc.subgroup12();
    }

    @Then("user enters a parameter value in allow user to add list01 to verify No status")
    public void user_enters_a_parameter_value_in_allow_user_to_add_list01_to_verify_no_status() {
        tc.allowuser01();
    }

    @Then("user fetches the validation data01 to verify No status")
    public void user_fetches_the_validation_data01_to_verify_no_status() {
        tc.validateDataValues01();
    }

    @Then("user clicks on the save button for chart2 to verify No status")
    public void user_clicks_on_the_save_button_for_chart2_to_verify_no_status() throws InterruptedException {
        tc.Savechart02();
    }


    @Then("user fetches the data from the page to verify No status")
    public void userFetchesTheDataFromThePageToVerifyNoStatus() {
        tc.GetText02();
    }

    @When("user clicks on the time3 input field to verify No status")
    public void user_clicks_on_the_time3_input_field_to_verify_no_status() {
      tc.time3();
    }

    @Then("user enters subgroup size for one31 to verify No status")
    public void user_enters_subgroup_size_for_one31_to_verify_no_status() {
        tc.subgroup21();
    }

    @Then("user enters subgroup size for two32 to verify No status")
    public void user_enters_subgroup_size_for_two32_to_verify_no_status() {
        tc.subgroup22();
    }

    @Then("user fetches the validation data02 to verify No status")
    public void user_fetches_the_validation_data02_to_verify_no_status() {
        tc.validateDataValues02();
    }

    @Then("user clears the entered parameter to verify No status")
    public void user_clears_the_entered_parameter_to_verify_no_status() {
        tc.allowuserclear();
    }

    @Then("user enters a parameter value in allow user to add list02 to verify No status")
    public void user_enters_a_parameter_value_in_allow_user_to_add_list02_to_verify_no_status() {
        tc.allowuser02();
    }

    @Then("user clicks on the save button for chart3 to verify No status")
    public void user_clicks_on_the_save_button_for_chart3_to_verify_no_status() {
        tc.savechart331();
    }

    @Then("user fetches the {int} data from the page to verify No status{int}")
    public void userFetchesTheDataFromThePageToVerifyNoStatus(int arg0, int arg1) {
        tc.getText3();
    }

    @When("user clicks on the time4 input field to verify No status")
    public void user_clicks_on_the_time4_input_field_to_verify_no_status() {
tc.time4();
    }

    @Then("user enters subgroup size for one41 to verify No status")
    public void user_enters_subgroup_size_for_one41_to_verify_no_status() {
        tc.subgroup31();
    }

    @Then("user enters subgroup size for two42 to verify No status")
    public void user_enters_subgroup_size_for_two42_to_verify_no_status() {
        tc.subgroup32();
    }

    @Then("user verifies the added users in the dropdown list to verify No status")
    public void user_verifies_the_added_users_in_the_dropdown_list_to_verify_no_status() {
        tc.default02();
    }

    @Then("user fetches the validation data03 to verify No status")
    public void user_fetches_the_validation_data03_to_verify_no_status() {
        tc.validateDataValues03();
    }

    @Then("user clicks on the save button for chart4 to verify No status")
    public void user_clicks_on_the_save_button_for_chart4_to_verify_no_status() {
        tc.savechart4();
    }
    @Then("user fetches the data from the page to verify No status{int}")
    public void userFetchesTheDataFromThePageToVerifyNoStatus(int arg0) {

        tc.getText4();
    }
    

    @When("user clicks on the time5 input field to verify No status")
    public void user_clicks_on_the_time5_input_field_to_verify_no_status() {
        tc.time5();
    }

    @Then("user enters subgroup size for one51 to verify No status")
    public void user_enters_subgroup_size_for_one51_to_verify_no_status() {
     tc.subgroup41();
    }

    @Then("user enters subgroup size for two52 to verify No status")
    public void user_enters_subgroup_size_for_two52_to_verify_no_status() {
        tc.subgroup42();
    }

    @Then("user selects order list from order by dropdown to verify No status")
    public void user_selects_order_list_from_order_by_dropdown_to_verify_no_status() throws InterruptedException {
        tc.orderdropdown();
    }

    @Then("user fetches the validation data53 to verify No status")
    public void user_fetches_the_validation_data53_to_verify_no_status() {
        tc.validateDataValues04();
    }

    @Then("user clicks on the save button for chart5 to verify No status")
    public void user_clicks_on_the_save_button_for_chart5_to_verify_no_status() throws InterruptedException {
        tc.savechart5();
    }

    @Then("user fetches the validation chart data05 to verify No status")
    public void user_fetches_the_validation_chart_data05_to_verify_no_status() {
        tc.getText5();
    }

    @Then("user fetches the validation chart data{int} to verify No status{int}")
    public void userFetchesTheValidationChartDataToVerifyNoStatus(int arg0, int arg1) {
        tc.validateDataValues05();
    }
}
