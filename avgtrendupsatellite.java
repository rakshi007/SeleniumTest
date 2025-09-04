package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase15Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class avgtrendupsatellite {

	

	private TestCase15Page tc = new TestCase15Page(DriverFactory.getDriver());

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
	  

	
	
	@When("user clicks on network icon to verify Avg Trend Up status")
	public void user_clicks_on_network_icon_to_verify_avg_trend_up_status() {
tc.network1();


	}

	@Then("user clicks on page name to edit to verify Avg Trend Up status")
	public void user_clicks_on_page_name_to_edit_to_verify_avg_trend_up_status() {
tc.clickvaripage();

	}

	@Then("user clicks on edit icon to verify to verify Avg Trend Up status")
	public void user_clicks_on_edit_icon_to_verify_to_verify_avg_trend_up_status() {
tc.editpencil();

	}

	@Then("user clicks on date input field to verify Avg Trend Up status")
	public void user_clicks_on_date_input_field_to_verify_avg_trend_up_status() {

tc.date();
	}

	@Then("user clicks on time input field to verify Avg Trend Up status")
	public void user_clicks_on_time_input_field_to_verify_avg_trend_up_status() {
		tc.time();
	}

	@Then("user enters subgroup size1 to verify Avg Trend Up status")
	public void user_enters_subgroup_size1_to_verify_avg_trend_up_status() {
tc.defectsub01();

	}

	@Then("user enters subgroup size2 to verify Avg Trend Up status")
	public void user_enters_subgroup_size2_to_verify_avg_trend_up_status() {

tc.defectsub02();
	}

	@Then("user enters subgroup size4 to verify Avg Trend Up status")
	public void user_enters_subgroup_size4_to_verify_avg_trend_up_status() {
tc.defectsub04();

	}

	@Then("user enters subgroup size5 to verify Avg Trend Up status")
	public void user_enters_subgroup_size5_to_verify_avg_trend_up_status() {

tc.defectsub05();
	}

	@Then("user enters value for highlights on content to verify Avg Trend Up status")
	public void user_enters_value_for_highlights_on_content_to_verify_avg_trend_up_status() {

tc.Highlites01();
	}

	@Then("user hovers over the highlights on the content field to verify Avg Trend Up status")
	public void user_hovers_over_the_highlights_on_the_content_field_to_verify_avg_trend_up_status() {

tc.mouse();
	}

	@Then("user enters total inspected value for subgroup size01 to verify Avg Trend Up status")
	public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_avg_trend_up_status() {
tc.total01();

	}

	@Then("user click on save1 button for chart01 to verify Avg Trend Up status")
	public void user_click_on_save1_button_for_chart01_to_verify_avg_trend_up_status() {
tc.savechart();

	}

	@Then("user fetch the status01 of the page to verify Avg Trend Up status")
	public void user_fetch_the_status01_of_the_page_to_verify_avg_trend_up_status() {
tc.getText();

	}
	
	//2

	@Then("user click on time2 inputfield to verify Avg Trend Up status")
	public void user_click_on_time2_inputfield_to_verify_avg_trend_up_status() {
tc.time2();

	}

	@Then("user enters subgroup size11 to verify Avg Trend Up status")
	public void user_enters_subgroup_size11_to_verify_avg_trend_up_status() {
tc.defectsub11();

	}

	@Then("user enters subgroup size12 to verify Avg Trend Up status")
	public void user_enters_subgroup_size12_to_verify_avg_trend_up_status() {

tc.defectsub12();
	}

	@Then("user enters subgroup size13 to verify Avg Trend Up status")
	public void user_enters_subgroup_size13_to_verify_avg_trend_up_status() {
tc.defectsub13();

	}

	@Then("user enters subgroup size14 to verify Avg Trend Up status")
	public void user_enters_subgroup_size14_to_verify_avg_trend_up_status() {

tc.defectsub14();
	}

	@Then("user enters subgroup size15 to verify Avg Trend Up status")
	public void user_enters_subgroup_size15_to_verify_avg_trend_up_status() {
tc.defectsub15();

	}

	@Then("user enters total inspected value for subgroup size02 to verify Avg Trend Up status")
	public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_avg_trend_up_status() {
tc.total02();

	}

	@Then("user click on save2 button for chart01 to verify Avg Trend Up status")
	public void user_click_on_save2_button_for_chart01_to_verify_avg_trend_up_status() {
tc.savechart2();

	}

	@Then("user fetch the status02 of the page to verify to verify Avg Trend Up status")
	public void user_fetch_the_status02_of_the_page_to_verify_to_verify_avg_trend_up_status() {
tc.getText2();

	}
	
	//

	@Then("user click on time3 inputfield to verify to verify Avg Trend Up status")
	public void user_click_on_time3_inputfield_to_verify_to_verify_avg_trend_up_status() {
tc.time3();

	}

	@Then("user enters subgroup size21 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size21_to_verify_to_verify_avg_trend_up_status() {
tc.defectsub21();

	}

	@Then("user enters subgroup size22 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size22_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub22();

	}

	@Then("user enters subgroup size23 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size23_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub23();

	}

	@Then("user enters subgroup size24 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size24_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub24();

	}

	@Then("user enters subgroup size25 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size25_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub25();

	}

	@Then("user enters total inspected value for subgroup size03 to verify Avg Trend Up status")
	public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_avg_trend_up_status() {
tc.total03();

	}

	@Then("user click on save3 button for chart01 to verify Avg Trend Up status")
	public void user_click_on_save3_button_for_chart01_to_verify_avg_trend_up_status() {
tc.savechart3();

	}

	@Then("user fetch the status03 of the page  to verify Avg Trend Up status")
	public void user_fetch_the_status03_of_the_page_to_verify_avg_trend_up_status() {
tc.getText3();

	}
	
	//

	@Then("user click on time4 inputfield to verify Avg Trend Up status")
	public void user_click_on_time4_inputfield_to_verify_avg_trend_up_status() {
tc.time4();

	}

	@Then("user enters subgroup size31 to verify Avg Trend Up status")
	public void user_enters_subgroup_size31_to_verify_avg_trend_up_status() {

tc.defectsub31();
	}

	@Then("user enters subgroup size32 to verify Avg Trend Up status")
	public void user_enters_subgroup_size32_to_verify_avg_trend_up_status() {
		tc.defectsub32();

	}

	@Then("user enters subgroup size33 to verify Avg Trend Up status")
	public void user_enters_subgroup_size33_to_verify_avg_trend_up_status() {
		tc.defectsub33();

	}

	@Then("user enters subgroup size34 to verify Avg Trend Up status")
	public void user_enters_subgroup_size34_to_verify_avg_trend_up_status() {
		tc.defectsub34();

	}

	@Then("user enters subgroup size35 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size35_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub35();

	}

	@Then("user enters total inspected value for subgroup size04 to verify Avg Trend Up status")
	public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_avg_trend_up_status() {

tc.total04();
	}

	@Then("user click on save4 button for chart01 to verify Avg Trend Up status")
	public void user_click_on_save4_button_for_chart01_to_verify_avg_trend_up_status() {

tc.savechart4();
	}

	@Then("user fetch the status04 of the page to verify to verify Avg Trend Up status")
	public void user_fetch_the_status04_of_the_page_to_verify_to_verify_avg_trend_up_status() {

tc.getText4();
	}

	@Then("user click on time5 inputfield to verify Avg Trend Up status")
	public void user_click_on_time5_inputfield_to_verify_avg_trend_up_status() {

tc.time4();
	}

	@Then("user enters subgroup size41 to verify Avg Trend Up status")
	public void user_enters_subgroup_size41_to_verify_avg_trend_up_status() {
tc.defectsub41();

	}

	@Then("user enters subgroup size42 to verify to verify Avg Trend Up status")
	public void user_enters_subgroup_size42_to_verify_to_verify_avg_trend_up_status() {
		tc.defectsub42();

	}

	@Then("user enters subgroup size43 to verify Avg Trend Up status")
	public void user_enters_subgroup_size43_to_verify_avg_trend_up_status() {

		tc.defectsub43();
	}

	@Then("user enters subgroup size44 to verify Avg Trend Up status")
	public void user_enters_subgroup_size44_to_verify_avg_trend_up_status() {
		tc.defectsub44();

	}

	@Then("user enters subgroup size45 to verify Avg Trend Up status")
	public void user_enters_subgroup_size45_to_verify_avg_trend_up_status() {
		tc.defectsub45();

	}

	@Then("user enters total inspected value for subgroup size05 to verify Avg Trend Up status")
	public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_avg_trend_up_status() {
tc.total05();

	}

	@Then("user click on save5 button for chart01 to verify Avg Trend Up status")
	public void user_click_on_save5_button_for_chart01_to_verify_avg_trend_up_status() {
tc.savechart5();

	}

	@Then("user fetch the status05 of the page to verify Avg Trend Up status")
	public void user_fetch_the_status05_of_the_page_to_verify_avg_trend_up_status() {
tc.getText5();

	}



}
