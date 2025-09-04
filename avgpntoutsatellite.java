package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase14Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class avgpntoutsatellite {

	private TestCase14Page tc = new TestCase14Page(DriverFactory.getDriver());

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
	  
	
	
	
	
	
	
	@When("user clicks on network icon to verify avg pnt out status for Attribute chart")
	public void user_clicks_on_network_icon_to_verify_avg_pnt_out_status_for_attribute_chart() {
tc.network();

	}

	@Then("user clicks on page name to edit to verify avg pnt out status for  Attribute chart")
	public void user_clicks_on_page_name_to_edit_to_verify_avg_pnt_out_status_for_attribute_chart() {
tc.clickvaripage();

	}

	@Then("user clicks on edit icon to verify avg pnt out status for Attribute chart")
	public void user_clicks_on_edit_icon_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.editpencil();
	}

	@Then("user clicks on date input field to verify avg pnt out status for Attribute chart")
	public void user_clicks_on_date_input_field_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.date();
	}

	@Then("user clicks on time01 input field to verify avg pnt out status for  Attribute chart")
	public void user_clicks_on_time01_input_field_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.time();
	}

	@Then("user enters subgroup size1 to verify avg pnt out status for Attribute chart")
	public void user_enters_subgroup_size1_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.defectsub01();
	}

	@Then("user enters total inspected value for subgroup size01 to verify avg pnt out for Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_avg_pnt_out_for_attribute_chart() {
tc.total01();

	}

	@Then("user click on save1 button for chart01 to verify avg pnt out for Attribute chart")
	public void user_click_on_save1_button_for_chart01_to_verify_avg_pnt_out_for_attribute_chart() {
tc.savechart();

	}

	@Then("user fetch the status of the subgroup01 to verify avg pnt out for Attribute chart")
	public void user_fetch_the_status_of_the_subgroup01_to_verify_avg_pnt_out_for_attribute_chart() {

tc.getText();
	}

	
	
	@Then("user clicks on time02 input field to verify avg pnt out status for  Attribute chart")
	public void user_clicks_on_time02_input_field_to_verify_avg_pnt_out_status_for_attribute_chart() {
tc.time2();

	}

	@Then("user enters subgroup size2 to verify avg pnt out status for Attribute chart")
	public void user_enters_subgroup_size2_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.defectsub11();
	}

	@Then("user enters total inspected value for subgroup size02 to verify avg pnt out Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_avg_pnt_out_attribute_chart() {
tc.total02();

	}

	@Then("user click on save2 button for chart01 to verify avg pnt out Attribute chart")
	public void user_click_on_save2_button_for_chart01_to_verify_avg_pnt_out_attribute_chart() {

tc.savere();
	}

	@Then("user click on ok button on the popup  to verify avg pnt out")
	public void user_click_on_ok_button_on_the_popup_to_verify_avg_pnt_out() throws InterruptedException {
tc.clickok();
	}

	@Then("user enter value for require parameter field  to verify avg pnt out")
	public void user_enter_value_for_require_parameter_field_to_verify_avg_pnt_out() {
tc.parameterdp2();

	}

	@Then("user click on save2 button for chart02 to verify avg pnt out")
	public void user_click_on_save2_button_for_chart02_to_verify_avg_pnt_out() {
tc.savechart2();

	}

	@Then("user fetch the status of the subgroup02 Attribute chart")
	public void user_fetch_the_status_of_the_subgroup02_attribute_chart() {
tc.getText2();

	}

	@Then("user clicks on time03 input field to verify avg pnt out status for  Attribute chart")
	public void user_clicks_on_time03_input_field_to_verify_avg_pnt_out_status_for_attribute_chart() {

tc.time3();
	}

	@Then("user enters subgroup size3 to verify avg pnt out status for Attribute chart")
	public void user_enters_subgroup_size3_to_verify_avg_pnt_out_status_for_attribute_chart() {
tc.defectsub21();

	}

	@Then("user enters total inspected value for subgroup size03 to verify avg pnt out Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_avg_pnt_out_attribute_chart() {
tc.total03();

	}

	@Then("user click on save3 button for chart03 to verify avg pnt out Attribute chart")
	public void user_click_on_save3_button_for_chart03_to_verify_avg_pnt_out_attribute_chart() {
tc.savechart3();

	}

	@Then("user click on ok button to verify avg pnt out status Attribute chart")
	public void user_click_on_ok_button_to_verify_avg_pnt_out_status_attribute_chart() throws InterruptedException {
	   tc.clickok();
	}

	@Then("user Enters user note in the note filed")
	public void user_enters_user_note_in_the_note_filed() throws InterruptedException {
	   tc.usernote();
	}

	@Then("user clicks on submit button to save user note")
	public void user_clicks_on_submit_button_to_save_user_note() throws InterruptedException {
	    tc.submit();
	}
	
	
	@Then("user fetch the status of the subgroup03 Attribute chart")
	public void user_fetch_the_status_of_the_subgroup03_attribute_chart() {
tc.getText3();

	}

}  
 