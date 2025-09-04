package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase13Page;
import util.ConfigReader;
import util.ExtentReportManager;







public class Nostatus {

	
	private TestCase13Page tc = new TestCase13Page(DriverFactory.getDriver());

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
	  
	
	
	
	@When("user clicks on network icon to verify no  Attribute chart")
	public void user_clicks_on_network_icon_to_verify_no__attribute_chart() throws InterruptedException {
Thread.sleep(1000);
tc.network1();
	}

	@Then("user clicks on page name to edit no  Attribute chart")
	public void user_clicks_on_page_name_to_edit_no__attribute_chart() {
tc.clickvaripage();

	}

	@Then("user clicks on edit icon to verify no  Attribute chart")
	public void user_clicks_on_edit_icon_to_verify_no__attribute_chart() {
tc.editpencil();

	}

	@Then("user clicks on date input field to verify no  Attribute chart")
	public void user_clicks_on_date_input_field_to_verify_no__attribute_chart() {
tc.date();

	}

	@Then("user clicks on time input field to verify no  Attribute chart")
	public void user_clicks_on_time_input_field_to_verify_no__attribute_chart() {
tc.time();

	}

	@Then("user enters subgroup size1 to verify no  Attribute chart")
	public void user_enters_subgroup_size1_to_verify_no__attribute_chart() {
tc.defectsub01();

	}

	@Then("user enters subgroup size2 to verify no  Attribute chart")
	public void user_enters_subgroup_size2_to_verify_no__attribute_chart() {
tc.defectsub02();

	}

	

	@Then("user enters subgroup size4 to verify no  Attribute chart")
	public void user_enters_subgroup_size4_to_verify_no__attribute_chart() {

tc.defectsub04();
	}


	@Then("user enters total inspected value for subgroup size01 to verify no  Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_no__attribute_chart() {
tc.total01();

	}

	@Then("user click on save1 button for chart01 to verify no  Attribute chart")
	public void user_click_on_save1_button_for_chart01_to_verify_no__attribute_chart() {
tc.savechart();

	}

	@Then("user fetch the 1 of the page  to verify no  Attribute chart")
	public void user_fetch_the_1_of_the_page_to_verify_no__attribute_chart() {
tc.getText();

	}

	
	//2
	
	@Then("user click on time2 inputfield to verify no  Attribute chart")
	public void user_click_on_time2_inputfield_to_verify_no__attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
	   tc.time2();
	}
	
	
	@Then("user enters subgroup size11 to verify no  Attribute chart")
	public void user_enters_subgroup_size11_to_verify_no__attribute_chart() {
tc.defectsub11();
	}
	
	

	@Then("user enters subgroup size12 to verify no  Attribute chart")
	public void user_enters_subgroup_size12_to_verify_no__attribute_chart() {
tc.defectsub12();

	}

	@Then("user enters subgroup size13 to verify no  Attribute chart")
	public void user_enters_subgroup_size13_to_verify_no__attribute_chart() {
tc.defectsub13();

	}

	@Then("user enters subgroup size14 to verify no  Attribute chart")
	public void user_enters_subgroup_size14_to_verify_no__attribute_chart() {
tc.defectsub14();

	}


	@Then("user enters total inspected value for subgroup size02 to verify no  Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_no__attribute_chart() {
tc.total02();

	}

	@Then("user click on password protection dropdown to verify enter password")
	public void user_click_on_password_protection_dropdown_to_verify_enter_password() {
tc.parameterdp();

	}

	@Then("user enter password in password input textfield")
	public void user_enter_password_in_password_input_textfield() {
tc.ppenter();

	}

	@Then("user click on validate button to verify password protection")
	public void user_click_on_validate_button_to_verify_password_protection() {

tc.validate();
	}

	@Then("user click on save2 button for chart01 to verify no  Attribute chart")
	public void user_click_on_save2_button_for_chart01_to_verify_no__attribute_chart() {
tc.savechart();

	}

	@Then("user fetch the 2 of the page to verify no  Attribute chart")
	public void user_fetch_the_2_of_the_page_to_verify_no__attribute_chart() throws InterruptedException {
		Thread.sleep(2000);
tc.getText2();

	}

	////
	
	
	@Then("user click on time3 inputfield to verify no  Attribute chart")
	public void user_click_on_time3_inputfield_to_verify_no__attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
	   tc.time3();
	}
	
	@Then("user enters subgroup size21 to verify no  Attribute chart")
	public void user_enters_subgroup_size21_to_verify_no__attribute_chart() {
tc.defectsub21();

	}

	@Then("user enters subgroup size22 to verify no  Attribute chart")
	public void user_enters_subgroup_size22_to_verify_no__attribute_chart() {
		tc.defectsub22();

	}

	

	@Then("user enters subgroup size24 to verify no  Attribute chart")
	public void user_enters_subgroup_size24_to_verify_no__attribute_chart() {
		tc.defectsub24();

	}

	@Then("user enters subgroup size25 to verify no  Attribute chart")
	public void user_enters_subgroup_size25_to_verify_no__attribute_chart() {
		tc.defectsub25();

	}

	@Then("user enters total inspected value for subgroup size03 to verify no  Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_no__attribute_chart() {
tc.total03();

	}

	@Then("user enter Numeric Values to verify no  Attribute chart")
	public void user_enter_numeric_values_to_verify_no__attribute_chart() {

tc.NumricValu();
	}

	@Then("user click on save3 button for chart01 to verify no  Attribute chart")
	public void user_click_on_save3_button_for_chart01_to_verify_no__attribute_chart() {
tc.savechart3();

	}

	@Then("user fetch the 3 of the page  to verify no  Attribute chart")
	public void user_fetch_the_3_of_the_page_to_verify_no__attribute_chart() {
tc.getText3();

	}

	//4
	
	
	@Then("user click on time4 inputfield to verify no  Attribute chart")
	public void user_click_on_time4_inputfield_to_verify_no__attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
	    tc.time4();
	}
	
	@Then("user enters subgroup size31 to verify no  Attribute chart")
	public void user_enters_subgroup_size31_to_verify_no__attribute_chart() {
	   tc.defectsub31();
	}

	@Then("user enters subgroup size32 to verify no  Attribute chart")
	public void user_enters_subgroup_size32_to_verify_no__attribute_chart() {
		   tc.defectsub32();

	}

	



	
	@Then("user enters total inspected value for subgroup size04 to verify no  Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_no__attribute_chart() {
tc.total04();

	}

	@Then("user click on password protection dropdown for second time to verify enter password")
	public void user_click_on_password_protection_dropdown_for_second_time_to_verify_enter_password() {
    tc.parameterdp13();

	}

	@Then("user enter password in password input textfield for second time")
	public void user_enter_password_in_password_input_textfield_for_second_time() {
		tc.ppenter12();

	}

	@Then("user click on validate button to verify password protection to verify no  Attribute chart")
	public void user_click_on_validate_button_to_verify_password_protection_to_verify_no__attribute_chart() {
tc.validate12();

	}

	@Then("user click on save4 button for chart01 to verify no  Attribute chart")
	public void user_click_on_save4_button_for_chart01_to_verify_no__attribute_chart() {

tc.Save04();
	}

	@Then("user fetch the 4 of the page to verify no  Attribute chart")
	public void user_fetch_the_4_of_the_page_to_verify_no__attribute_chart() {
tc.getText4();

	}

	
	
	//5
	

	@Then("user click on time5 inputfield to verify no  Attribute chart")
	public void user_click_on_time5_inputfield_to_verify_no__attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
tc.time5();

	}

	@Then("user enters subgroup size41 to verify no  Attribute chart")
	public void user_enters_subgroup_size41_to_verify_no__attribute_chart() {
tc.defectsub41();

	}

	

	@Then("user enters subgroup size43 to verify no  Attribute chart")
	public void user_enters_subgroup_size43_to_verify_no__attribute_chart() {

		tc.defectsub43();
	}

	@Then("user enters subgroup size44 to verify no  Attribute chart")
	public void user_enters_subgroup_size44_to_verify_no__attribute_chart() {
		tc.defectsub44();

	}

	@Then("user enters subgroup size45 to verify no  Attribute chart")
	public void user_enters_subgroup_size45_to_verify_no__attribute_chart() {
		tc.defectsub45();

	}

	@Then("user enters total inspected value for subgroup size05 to verify no  Attribute chart")
	public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_no__attribute_chart() {
tc.total05();

	}
	
	@Then("user click on save5 button for chart01 to verify no  Attribute chart")
	public void user_click_on_save5_button_for_chart01_to_verify_no__attribute_chart() {
tc.Save05();

	}

	@Then("user fetch the 5 of the page to verify no  Attribute chart")
	public void user_fetch_the_5_of_the_page_to_verify_no__attribute_chart() {
   tc.getText5();

	}
}
