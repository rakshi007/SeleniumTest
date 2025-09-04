//package stepdefinitions;
//
//import DriverFactory.DriverFactory;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.testCase21Page;
//import util.ConfigReader;
//import util.ExtentReportManager;
//
//public class networksatellite {
//
//
//
//    private testCase21Page tc = new testCase21Page(DriverFactory.getDriver());
//
//    ConfigReader configReader = new ConfigReader();
//
//    private ExtentTest test;
//
//    {
//        // Initialize a new test
//        {
//            this.test = ExtentReportManager.getTest();
//        }
//        test = ExtentReportManager.createTest("Login Test", "Testing login functionality");
//    }
//
//    ExtentTest test1 = ExtentCucumberAdapter.getCurrentStep();
//
//
//
//
//    @When("user clicks on network icon to verify hide characterstic status")
//    public void user_clicks_on_network_icon_to_verify_hide_characterstic_status() {
//       tc.network1();
//    }
//
//    @Then("user clicks on page name to edit to verify hide characterstic status")
//    public void user_clicks_on_page_name_to_edit_to_verify_hide_characterstic_status() {
//       tc.clickvaripage();
//    }
//
//    @Then("user clicks on edit icon to verify to verify hide characterstic status")
//    public void user_clicks_on_edit_icon_to_verify_to_verify_hide_characterstic_status() {
//       tc.editpencil();
//    }
//
//    @Then("user clicks on date input field to verify hide characterstic status")
//    public void user_clicks_on_date_input_field_to_verify_hide_characterstic_status() {
//       tc.date();
//    }
//
//    @Then("user clicks on time input field to verify hide characterstic status")
//    public void user_clicks_on_time_input_field_to_verify_hide_characterstic_status() {
//       tc.time();
//    }
//
//    @Then("user enters subgroup size1 to verify hide characterstic status")
//    public void user_enters_subgroup_size1_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size2 to verify hide characterstic status")
//    public void user_enters_subgroup_size2_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size3 to verify hide characterstic status")
//    public void user_enters_subgroup_size3_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters total inspected value for subgroup size01 to verify hide characterstic status")
//    public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters values in allow all parameter section to verify hide characterstic status")
//    public void user_enters_values_in_allow_all_parameter_section_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on save1 button for chart01 to verify hide characterstic status")
//    public void user_click_on_save1_button_for_chart01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user fetch the status01 of the page to verify hide characterstic status")
//    public void user_fetch_the_status01_of_the_page_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on time2 inputfield to verify hide characterstic status")
//    public void user_click_on_time2_inputfield_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size11 to verify hide characterstic status")
//    public void user_enters_subgroup_size11_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size12 to verify hide characterstic status")
//    public void user_enters_subgroup_size12_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size13 to verify hide characterstic status")
//    public void user_enters_subgroup_size13_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters total inspected value for subgroup size02 to verify hide characterstic status")
//    public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on save2 button for chart01 to verify hide characterstic status")
//    public void user_click_on_save2_button_for_chart01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user fetch the status02 of the page to verify to verify hide characterstic status")
//    public void user_fetch_the_status02_of_the_page_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on time3 inputfield to verify to verify hide characterstic status")
//    public void user_click_on_time3_inputfield_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size21 to verify to verify hide characterstic status")
//    public void user_enters_subgroup_size21_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size22 to verify to verify hide characterstic status")
//    public void user_enters_subgroup_size22_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size23 to verify to verify hide characterstic status")
//    public void user_enters_subgroup_size23_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters total inspected value for subgroup size03 to verify hide characterstic status")
//    public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on save3 button for chart01 to verify hide characterstic status")
//    public void user_click_on_save3_button_for_chart01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user fetch the status03 of the page  to verify hide characterstic status")
//    public void user_fetch_the_status03_of_the_page_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on time4 inputfield to verify hide characterstic status")
//    public void user_click_on_time4_inputfield_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size31 to verify hide characterstic status")
//    public void user_enters_subgroup_size31_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size32 to verify hide characterstic status")
//    public void user_enters_subgroup_size32_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size33 to verify hide characterstic status")
//    public void user_enters_subgroup_size33_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters total inspected value for subgroup size04 to verify hide characterstic status")
//    public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on save4 button for chart01 to verify hide characterstic status")
//    public void user_click_on_save4_button_for_chart01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user fetch the status04 of the page to verify to verify hide characterstic status")
//    public void user_fetch_the_status04_of_the_page_to_verify_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on time5 inputfield to verify hide characterstic status")
//    public void user_click_on_time5_inputfield_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size41 to verify hide characterstic status")
//    public void user_enters_subgroup_size41_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size42 to verify hide characterstic status")
//    public void user_enters_subgroup_size42_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters subgroup size43 to verify hide characterstic status")
//    public void user_enters_subgroup_size43_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user enters total inspected value for subgroup size05 to verify hide characterstic status")
//    public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user click on save5 button for chart01 to verify hide characterstic status")
//    public void user_click_on_save5_button_for_chart01_to_verify_hide_characterstic_status() {
//
//    }
//
//    @Then("user fetch the status05 of the page to verify hide characterstic status")
//    public void user_fetch_the_status05_of_the_page_to_verify_hide_characterstic_status() {
//
//    }
//
//
//
//
//}
