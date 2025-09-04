package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase16Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class avgtrnddownsatellite {

	private TestCase16Page tc = new TestCase16Page(DriverFactory.getDriver());

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
	  
	
	
	
	
	
	@When("user clicks on network icon to verify Avg Trend down  status")
	public void user_clicks_on_network_icon_to_verify_avg_trend_down_status() {
tc.network1();

	}

	@Then("user clicks on page name to edit to verify Avg Trend down status")
	public void user_clicks_on_page_name_to_edit_to_verify_avg_trend_down_status() {
tc.clickvaripage();

	}

	@Then("user clicks on edit icon to verify to verify Avg Trend down status")
	public void user_clicks_on_edit_icon_to_verify_to_verify_avg_trend_down_status() {
tc.editpencil();

	}

	@Then("user clicks on date input field to verify Avg Trend down status")
	public void user_clicks_on_date_input_field_to_verify_avg_trend_down_status() {
tc.date();

	}

	@Then("user clicks on time input field to verify Avg Trend down status")
	public void user_clicks_on_time_input_field_to_verify_avg_trend_down_status() {
tc.time();

	}

	@Then("user enters subgroup size1 to verify Avg Trend down status")
	public void user_enters_subgroup_size1_to_verify_avg_trend_down_status() {
tc.defectsub01();

	}

	@Then("user enters subgroup size2 to verify Avg Trend down status")
	public void user_enters_subgroup_size2_to_verify_avg_trend_down_status() {
		tc.defectsub02();

	}

	@Then("user enters subgroup size4 to verify Avg Trend down status")
	public void user_enters_subgroup_size4_to_verify_avg_trend_down_status() {
		tc.defectsub04();

	}

	@Then("user enters subgroup size5 to verify Avg Trend down status")
	public void user_enters_subgroup_size5_to_verify_avg_trend_down_status() {
		tc.defectsub05();

	}

	@Then("user enters total inspected value for subgroup size01 to verify Avg Trend down status")
	public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_avg_trend_down_status() {
tc.total01();

	}

	@Then("user click on save1 button for chart01 to verify Avg Trend down status")
	public void user_click_on_save1_button_for_chart01_to_verify_avg_trend_down_status() {
tc.savechart();

	}

	@Then("user fetch the status01 of the page to verify Avg Trend down status")
	public void user_fetch_the_status01_of_the_page_to_verify_avg_trend_down_status() {

tc.getText();
	}

	@Then("user click on time2 inputfield to verify Avg Trend down status")
	public void user_click_on_time2_inputfield_to_verify_avg_trend_down_status() {
tc.time2();

	}

	@Then("user enters subgroup size11 to verify Avg Trend down status")
	public void user_enters_subgroup_size11_to_verify_avg_trend_down_status() {
tc.defectsub11();

	}

	@Then("user enters subgroup size12 to verify Avg Trend down status")
	public void user_enters_subgroup_size12_to_verify_avg_trend_down_status() {
		tc.defectsub12();

	}

	@Then("user enters subgroup size13 to verify Avg Trend down status")
	public void user_enters_subgroup_size13_to_verify_avg_trend_down_status() {
		tc.defectsub13();

	}

	@Then("user enters subgroup size14 to verify Avg Trend down status")
	public void user_enters_subgroup_size14_to_verify_avg_trend_down_status() {
		tc.defectsub14();

	}

	@Then("user enters total inspected value for subgroup size02 to verify Avg Trend down status")
	public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_avg_trend_down_status() {
tc.total02();

	}

	@Then("user enters parameter entry Restricted value to verify Avg Trend down status")
	public void user_enters_parameter_entry_restricted_value_to_verify_avg_trend_down_status() {

tc.parameterdp13();
	}

	@Then("user click on save2 button for chart01 to verify Avg Trend down status")
	public void user_click_on_save2_button_for_chart01_to_verify_avg_trend_down_status() {

tc.savechart2();
	}

	@Then("user fetch the status02 of the page to verify to verify Avg Trend down status")
	public void user_fetch_the_status02_of_the_page_to_verify_to_verify_avg_trend_down_status() {
tc.getText2();

	}

	@Then("user click on time3 inputfield to verify to verify Avg Trend down status")
	public void user_click_on_time3_inputfield_to_verify_to_verify_avg_trend_down_status() {
tc.time3();

	}

	@Then("user enters subgroup size21 to verify to verify Avg Trend down status")
	public void user_enters_subgroup_size21_to_verify_to_verify_avg_trend_down_status() {
tc.defectsub21();

	}

	@Then("user enters subgroup size22 to verify to verify Avg Trend down status")
	public void user_enters_subgroup_size22_to_verify_to_verify_avg_trend_down_status() {

		tc.defectsub22();
	}

	@Then("user enters subgroup size24 to verify to verify Avg Trend down status")
	public void user_enters_subgroup_size24_to_verify_to_verify_avg_trend_down_status() {

		tc.defectsub23();
	}

	@Then("user enters total inspected value for subgroup size03 to verify Avg Trend down status")
	public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_avg_trend_down_status() {


	}

	@Then("user click on save3 button for chart01 to verify Avg Trend down status")
	public void user_click_on_save3_button_for_chart01_to_verify_avg_trend_down_status() {


	}

	@Then("user fetch the status03 of the page  to verify Avg Trend down status")
	public void user_fetch_the_status03_of_the_page_to_verify_avg_trend_down_status() {


	}

	@Then("user enters subgroup size31 to verify Avg Trend down status")
	public void user_enters_subgroup_size31_to_verify_avg_trend_down_status() {
		tc.defectsub31();

	}

	@Then("user enters subgroup size32 to verify Avg Trend down status")
	public void user_enters_subgroup_size32_to_verify_avg_trend_down_status() {
tc.defectsub32();

	}

	@Then("user enters total inspected value for subgroup size04 to verify Avg Trend down status")
	public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_avg_trend_down_status() {
tc.total04();

	}

	@Then("user click on save4 button for chart01 to verify Avg Trend down status")
	public void user_click_on_save4_button_for_chart01_to_verify_avg_trend_down_status() {
tc.savechart4();

	}

	@Then("user fetch the status04 of the page to verify to verify Avg Trend down status")
	public void user_fetch_the_status04_of_the_page_to_verify_to_verify_avg_trend_down_status() {
tc.getText4();

	}

	@Then("user click on time5 inputfield to verify Avg Trend down status")
	public void user_click_on_time5_inputfield_to_verify_avg_trend_down_status() {
tc.time5();

	}

	@Then("user enters subgroup size41 to verify Avg Trend down status")
	public void user_enters_subgroup_size41_to_verify_avg_trend_down_status() {
tc.defectsub41();

	}

	@Then("user enters total inspected value for subgroup size05 to verify Avg Trend down status")
	public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_avg_trend_down_status() {
tc.total05();

	}

	@Then("user click on save5 button for chart01 to verify Avg Trend down status")
	public void user_click_on_save5_button_for_chart01_to_verify_avg_trend_down_status() {

tc.Save05();
	}

	@Then("user clicks on cancel button to verify Avg Trend down status")
	public void user_clicks_on_cancel_button_to_verify_avg_trend_down_status() {

tc.cancel();
	}

	@Then("user fetch the status05 of the page to verify Avg Trend down status")
	public void user_fetch_the_status05_of_the_page_to_verify_avg_trend_down_status() {

tc.getText5();
	}

}
