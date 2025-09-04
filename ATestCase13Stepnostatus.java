package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase13Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class ATestCase13Stepnostatus {

	
	
	
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
	  
	
	
	
	
	
	@When("user is on home to Verify no  for attribute chart")
	public void user_is_on_home_to_verify_no__for_attribute_chart() {


	}

	@Then("user clicks on add icon no  for attribute chart")
	public void user_clicks_on_add_icon_no__for_attribute_chart() {
tc.addnew11();

	}

	@Then("user clicks on add data group no  for attribute chart")
	public void user_clicks_on_add_data_group_no__for_attribute_chart() throws InterruptedException {
tc.clickaddgrp();

	}

	@Then("user enters data group name no  for attribute chart")
	public void user_enters_data_group_name_no__for_attribute_chart() {
tc.entergrpname();

	}

	@Then("user clicks on add button to save data group and verify no  for attribute chart")
	public void user_clicks_on_add_button_to_save_data_group_and_verify_no__for_attribute_chart() {

tc.clickaddbtn();
	}
	
	//

	@Then("user clicks on add icon to create part and verify no  for attribute chart")
	public void user_clicks_on_add_icon_to_create_part_and_verify_no__for_attribute_chart() {
tc.addnew1();

	}

	@Then("user clicks on add part link to Verify no  for attribute chart")
	public void user_clicks_on_add_part_link_to_verify_no__for_attribute_chart() {
tc.clickpart1();

	}

	@Then("user clicks on group dropdown icon no  for attribute chart")
	public void user_clicks_on_group_dropdown_icon_no__for_attribute_chart() {

tc.selectdropdown();
	}

	@Then("user selects required group no  for attribute chart")
	public void user_selects_required_group_no__for_attribute_chart() {
tc.selectgroup();

	}

	@Then("user Enters part name no  for attribute chart")
	public void user_enters_part_name_no__for_attribute_chart() {
tc.enterpartname();

	}

	@Then("user clicks on add button no  for attribute chart")
	public void user_clicks_on_add_button_no__for_attribute_chart() {
tc.clickAdd();

	}

	@Then("user Enters Attribute chart name no  for attribute chart")
	public void user_enters_attribute_chart_name_no__for_attribute_chart() throws InterruptedException {
tc.addchar();

	}

	@Then("user clicks on Characteristic Type dropdown icon no  for attribute chart")
	public void user_clicks_on_characteristic_type_dropdown_icon_no__for_attribute_chart() {
		tc.dropdownatt();

	}

	@Then("user selects attribute type no  for attribute chart")
	public void user_selects_attribute_type_no__for_attribute_chart() {

tc.select1();
	}

	@Then("user clicks add button no  for attribute chart")
	public void user_clicks_add_button_no__for_attribute_chart() {
tc.charaaddbutton();

	}

	@Then("user clicks defect tab no  for attribute chart")
	public void user_clicks_defect_tab_no__for_attribute_chart() {
tc.Defects();

	}

	@Then("user clicks on add icon01 to add defect name no  for attribute chart")
	public void user_clicks_on_add_icon01_to_add_defect_name_no__for_attribute_chart() {
tc.add01();

	}

	@Then("user enters defect name01 no  for attribute chart")
	public void user_enters_defect_name01_no__for_attribute_chart() {
tc.defect1();

	}

	@Then("user clicks on save button01 no  for attribute chart")
	public void user_clicks_on_save_button01_no__for_attribute_chart() {
tc.Save01();

	}

	@Then("user clicks on add icon02 to add defect name no  for attribute chart")
	public void user_clicks_on_add_icon02_to_add_defect_name_no__for_attribute_chart() {
	  tc.add02();
	}
	
	
	
	@Then("user enters defect name02 no  for attribute chart")
	public void user_enters_defect_name02_no__for_attribute_chart() {
tc.defect2();

	}

	@Then("user clicks on save button02 no  for attribute chart")
	public void user_clicks_on_save_button02_no__for_attribute_chart() {

tc.Save02();
	}
	
	
	
	@Then("user clicks on add icon03 to add defect name no  for attribute chart")
	public void user_clicks_on_add_icon03_to_add_defect_name_no__for_attribute_chart() {
	    tc.add03();
	}

	@Then("user enters defect name03 no  for attribute chart")
	public void user_enters_defect_name03_no__for_attribute_chart() {
tc.defect3();

	}

	@Then("user clicks on save button03 no  for attribute chart")
	public void user_clicks_on_save_button03_no__for_attribute_chart() {
tc.Save03();

	}

	@Then("user clicks on add icon04 to add defect name no  for attribute chart")
	public void user_clicks_on_add_icon04_to_add_defect_name_no__for_attribute_chart() {
	   tc.add04();
	}
	

	@Then("user enters defect name04 no  for attribute chart")
	public void user_enters_defect_name04_no__for_attribute_chart() {
tc.defect4();

	}

	@Then("user clicks on save button04 no  for attribute chart")
	public void user_clicks_on_save_button04_no__for_attribute_chart() {
tc.Save04();

	}
	
	@Then("user clicks on add icon05 to add defect name no  for attribute chart")
	public void user_clicks_on_add_icon05_to_add_defect_name_no__for_attribute_chart() {
	    tc.add05();
	}




	@Then("user enters defect name05 no  for attribute chart")
	public void user_enters_defect_name05_no__for_attribute_chart() {
tc.defect5();

	}

	@Then("user clicks on save button05 no  for attribute chart")
	public void user_clicks_on_save_button05_no__for_attribute_chart() {
tc.Save05();

	}

	@Then("user clicks on save button to save characterstics no  for attribute chart")
	public void user_clicks_on_save_button_to_save_characterstics_no__for_attribute_chart() {
tc.saveAttribute();

	}
	

	@Then("user clicks on close button no  for attribute chart")
	public void user_clicks_on_close_button_no__for_attribute_chart() throws InterruptedException {
tc.closechar();

	}

	
	
	///////para to part

	@Given("the user initiates the parameter addition process by clicking the Files icon no  for attribute chart")
	public void the_user_initiates_the_parameter_addition_process_by_clicking_the_files_icon_no__for_attribute_chart() {

tc.filesicon();
	}

	@When("the user clicks the Add icon to begin adding a new parameter01 no  for attribute chart")
	public void the_user_clicks_the_add_icon_to_begin_adding_a_new_parameter01_no__for_attribute_chart() throws InterruptedException {
Thread.sleep(1000);
tc.Addptp();
	}

	@Then("the user verifies the assignment by clicking the Assign Parameter to Part link01 no  for attribute chart")
	public void the_user_verifies_the_assignment_by_clicking_the_assign_parameter_to_part_link01_no__for_attribute_chart() {
tc.Assignparaicon();

	}

	@Then("the user views available groups by clicking the Group dropdown01 no  for attribute chart")
	public void the_user_views_available_groups_by_clicking_the_group_dropdown01_no__for_attribute_chart() {
tc.datadropdown();

	}

	@Then("the user selects the appropriate data group from the dropdown01 no  for attribute chart")
	public void the_user_selects_the_appropriate_data_group_from_the_dropdown01_no__for_attribute_chart() {
tc.selectgrp();

	}

	@Then("views available parts by clicking the Part dropdown01 no  for attribute chart")
	public void views_available_parts_by_clicking_the_part_dropdown01_no__for_attribute_chart() {
tc.partdropdown();

	}

	@Then("the user selects the part to which the parameter will be added01 no  for attribute chart")
	public void the_user_selects_the_part_to_which_the_parameter_will_be_added01_no__for_attribute_chart() {
tc.selectpartpara();

	}

	

	@Then("the user drags and drops the required parameter into the part01 no  for attribute chart")
	public void the_user_drags_and_drops_the_required_parameter_into_the_part01_no__for_attribute_chart() {

		tc.checkallbox();
	}

	@Then("confirms the addition by clicking the Save button01 no  for attribute chart")
	public void confirms_the_addition_by_clicking_the_save_button01_no__for_attribute_chart() {

tc.saveassign();
	}


	@Then("the user completes the process by clicking the Close button01 no  for attribute chart")
	public void the_user_completes_the_process_by_clicking_the_close_button01_no__for_attribute_chart() {
tc.closeassign();

	}

	
	//files
	

	@Then("user click add icon for squences to verify no  for attribute chart")
	public void user_click_add_icon_for_squences_to_verify_no__for_attribute_chart() {
tc.addseqlink();

	}

	@Then("user click on add sequence to verify no  for attribute chart")
	public void user_click_on_add_sequence_to_verify_no__for_attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
tc.addsequece();

	}

	@Then("user click on data group drop dropdown to verify no  for attribute chart")
	public void user_click_on_data_group_drop_dropdown_to_verify_no__for_attribute_chart() {
tc.clickdatagroup();

	}

	@Then("user select datagroup from dropdown to verify no  for attribute chart")
	public void user_select_datagroup_from_dropdown_to_verify_no__for_attribute_chart() {
tc.selectdatagrp();

	}

	@Then("user click on part drop-down to verify no  for attribute chart")
	public void user_click_on_part_drop_down_to_verify_no__for_attribute_chart() {
tc.clickpart();

	}

	@Then("user select part to verify no  for attribute chart")
	public void user_select_part_to_verify_no__for_attribute_chart() {
tc.selectpart();

	}

	@Then("user click on add button in the popup to verify  no  for attribute chart")
	public void user_click_on_add_button_in_the_popup_to_verify_no__for_attribute_chart() {
tc.clickonadd();

	}

	@Then("user Enter sequence name to verify no  for attribute chart")
	public void user_enter_sequence_name_to_verify_no__for_attribute_chart() throws InterruptedException {

tc.EnterSequencename();
	}

	@Then("user drag and drops the chart to verify no  for attribute chart")
	public void user_drag_and_drops_the_chart_to_verify_no__for_attribute_chart() {
	   tc.draganddrop();
	}

	@Then("user click on save button to verify  no  for attribute chart")
	public void user_click_on_save_button_to_verify_no__for_attribute_chart() {

tc.save();
	}

	@Then("user click on close button to verify no  for attribute chart")
	public void user_click_on_close_button_to_verify_no__for_attribute_chart() {
tc.close1();

	}

	///
	@Then("user clicks on network icon to create attribute sequence page to verify no  for attribute chart")
	public void user_clicks_on_network_icon_to_create_attribute_sequence_page_to_verify_no__for_attribute_chart() {
	  tc.network();
	}
	
	@Then("user click on Add kebab icon to verify no  for attribute chart")
	public void user_click_on_add_kebab_icon_to_verify_no__for_attribute_chart() {
tc.Kebabsatellite();


	}

	@Then("user click on Addpage link to verify no  for attribute chart")
	public void user_click_on_addpage_link_to_verify_no__for_attribute_chart() {
		tc.Addpaegsatellite();

	}

	@Then("user enter satellite page name to verify no  for attribute chart")
	public void user_enter_satellite_page_name_to_verify_no__for_attribute_chart() throws InterruptedException {
		Thread.sleep(1000);
tc.Enterpagenamesatellite();

	}

	@Then("user click on  add link page name to verify no  for attribute chart")
	public void user_click_on_add_link_page_name_to_verify_no__for_attribute_chart() {
		tc.Addsatellitepage();


	}

	@Then("user drag and drops the sequence to verify no  for attribute chart")
	public void user_drag_and_drops_the_sequence_to_verify_no__for_attribute_chart() {
	  tc.Dragsequencname();
	}

	@Then("user click save sequence button to verify no  for attribute chart")
	public void user_click_save_sequence_button_to_verify_no__for_attribute_chart() {
tc.savesatellitepage();

	}


}