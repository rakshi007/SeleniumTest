package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase14Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class Avgptoutadmin {
	
	

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
	  

	@When("user clicks on addgroup icon to verify Avg Point out status for attribute chart")
	public void user_clicks_on_addgroup_icon_to_verify_avg_point_out_status_for_attribute_chart() {
		tc.addnew11();

	}

	@Then("user clicks add charcerteristics to verify Avg Point out status for attribute chart")
	public void user_clicks_add_charcerteristics_to_verify_avg_point_out_status_for_attribute_chart() throws InterruptedException {
tc.AddCharLink();

	}

	@Then("user clicks on the data group name dropdown to Avg Point out above status for attribute chart")
	public void user_clicks_on_the_data_group_name_dropdown_to_avg_point_out_above_status_for_attribute_chart() throws InterruptedException {
tc.DDN();

	}

	@Then("user selects a data group from the dropdown to verify Avg Point out status for attribute chart")
	public void user_selects_a_data_group_from_the_dropdown_to_verify_avg_point_out_status_for_attribute_chart() throws InterruptedException {
tc.DG();

	}

	@Then("user clicks on the part dropdown to verify Avg Point out status for attribute chart")
	public void user_clicks_on_the_part_dropdown_to_verify_avg_point_out_status_for_attribute_chart() throws InterruptedException {
tc.PN();

	}

	@Then("user selects a part from the dropdown to verify Avg Point out status for attribute chart")
	public void user_selects_a_part_from_the_dropdown_to_verify_avg_point_out_status_for_attribute_chart() throws InterruptedException {
tc.PART();

	}

	@Then("user Enters Attribute chart name to verify Avg Point out status for attribute chart")
	public void user_enters_attribute_chart_name_to_verify_avg_point_out_status_for_attribute_chart() {

tc.addchar();
	}

	@Then("user clicks on Characteristic Type dropdown icon to verify Avg Point out status for attribute chart")
	public void user_clicks_on_characteristic_type_dropdown_icon_to_verify_avg_point_out_status_for_attribute_chart() {
tc.dropdownatt();

	}

	@Then("user selects attribute type to verify Avg Point out status for attribute chart")
	public void user_selects_attribute_type_to_verify_avg_point_out_status_for_attribute_chart() {
tc.select1();

	}

	@Then("user clicks add button to verifyAvg Point out status for attribute chart")
	public void user_clicks_add_button_to_verify_avg_point_out_status_for_attribute_chart() {
tc.charaaddbutton();

	}
	
	
	@Then("user clicks defect tab to verify Avg Point out status for attribute chart")
	public void user_clicks_defect_tab_to_verify_avg_point_out_status_for_attribute_chart() {
tc.Defects();

	}

	@Then("user clicks on add icon01 to add defect name to verify Avg Point out  for attribute chart")
	public void user_clicks_on_add_icon01_to_add_defect_name_to_verify_avg_point_out_for_attribute_chart() {
tc.add01();

	}

	@Then("user enters defect name01 Avg Point out to verify for attribute chart")
	public void user_enters_defect_name01_avg_point_out_to_verify_for_attribute_chart() {
tc.defect1();

	}

	@Then("user clicks on save button01 Avg Point out to verify  for attribute chart")
	public void user_clicks_on_save_button01_avg_point_out_to_verify_for_attribute_chart() {
tc.Save01();

	}

	@Then("user clicks on save button to save defect settings")
	public void user_clicks_on_save_button_to_save_defect_settings() {
	    tc.saveAttribute();
	}

	@Then("user clicks on Alarms and restrictions tab to Avg Point out for attribute chart")
	public void user_clicks_on_alarms_and_restrictions_tab_to_avg_point_out_for_attribute_chart() throws InterruptedException {
tc.alram();

	}

	@Then("user clicks on Force user note on out of control condition check box for attribute chart")
	public void user_clicks_on_force_user_note_on_out_of_control_condition_check_box_for_attribute_chart() throws InterruptedException {
tc.usernote();

	}
	
	@Then("user click on save butto to save Alarms and restrictions setting")
	public void user_click_on_save_butto_to_save_alarms_and_restrictions_setting() throws Exception {

tc.saveAR();
	}

	
	@Then("user clicks on close button to verify Avg Point out status for attribute chart")
	public void user_clicks_on_close_button_to_verify_avg_point_out_status_for_attribute_chart() throws InterruptedException {
	   tc.closechar();
	}

	
	//parameter
	

	@When("the user clicks the Add icon to begin adding a new parameter01 to verify Avg Point out  for attribute chart")
	public void the_user_clicks_the_add_icon_to_begin_adding_a_new_parameter01_to_verify_avg_point_out_for_attribute_chart() {
	    tc.Addptp();
	}
	
	@Then("the user verifies the assignment by clicking the Assign Parameter to Part link01 Avg Point out for attribute chart")
	public void the_user_verifies_the_assignment_by_clicking_the_assign_parameter_to_part_link01_avg_point_out_for_attribute_chart() {
tc.Assignparaicon();

	}

	@Then("the user views available groups by clicking the Group dropdown01 Avg Point out for attribute chart")
	public void the_user_views_available_groups_by_clicking_the_group_dropdown01_avg_point_out_for_attribute_chart() {
tc.datadropdown();

	}

	@Then("the user selects the appropriate data group from the dropdown01 Avg Point out for attribute chart")
	public void the_user_selects_the_appropriate_data_group_from_the_dropdown01_avg_point_out_for_attribute_chart() {
tc.selectgrp();

	}

	@Then("views available parts by clicking the Part dropdown01 Avg Point out for attribute chart")
	public void views_available_parts_by_clicking_the_part_dropdown01_avg_point_out_for_attribute_chart() {
tc.partdropdown();

	}

	@Then("the user selects the part to which the parameter will be added01 Avg Point out for attribute chart")
	public void the_user_selects_the_part_to_which_the_parameter_will_be_added01_avg_point_out_for_attribute_chart() {
tc.selectpartpara();

	}
	
	@Then("user drag and drop priviously assigned parameters fro atribute chart")
	public void user_drag_and_drop_priviously_assigned_parameters_fro_atribute_chart() {
	   tc.checkallbox();
	}
	
	
	
	@Then("the user drags and drops the required parameter into the part01 to verify Avg Point out  for attribute chart")
	public void the_user_drags_and_drops_the_required_parameter_into_the_part01_to_verify_avg_point_out_for_attribute_chart() {
	    tc.checkallbox1();
	}
	@Then("confirms the addition by clicking the Save button01 Avg Point out for attribute chart")
	public void confirms_the_addition_by_clicking_the_save_button01_avg_point_out_for_attribute_chart() {
tc.saveassign();

	}

	@Then("the user completes the process by clicking the Close button01 Avg Point out for attribute chart")
	public void the_user_completes_the_process_by_clicking_the_close_button01_avg_point_out_for_attribute_chart() {
tc.closeassign();

	}
	
//
	@Then("the user clicks on the Files button to verify Avg Point out")
	public void the_user_clicks_on_the_files_button_to_verify_avg_point_out() {
tc.addseqlink();

	}

	@Then("the user clicks the expand button next to the Files icon to verify Avg Point out")
	public void the_user_clicks_the_expand_button_next_to_the_files_icon_to_verify_avg_point_out() {
tc.expand();

	}

	@Then("user clicks on down arrow button in the grid to verify Avg Point out")
	public void user_clicks_on_down_arrow_button_in_the_grid_to_verify_avg_point_out() {
tc.down();

	}

	@Then("user clicks on datagroup check box to verify Avg Point out")
	public void user_clicks_on_datagroup_check_box_to_verify_avg_point_out() {
tc.DDG();

	}

	@Then("user click on ok button to close the to verify Avg Point out")
	public void user_click_on_ok_button_to_close_the_to_verify_avg_point_out() {
tc.okg();

	}

	@Then("the user selects a group name in the grid by clicking on it  to verify Avg Point out")
	public void the_user_selects_a_group_name_in_the_grid_by_clicking_on_it_to_verify_avg_point_out() {
tc.DDG1();

	}

	@Then("the user clicks on the arrow icon to expand the options to verify Avg Point out")
	public void the_user_clicks_on_the_arrow_icon_to_expand_the_options_to_verify_avg_point_out() {

tc.DDd();
	}

	@Then("the user clicks on the Sequence link to open it to verify Avg Point out")
	public void the_user_clicks_on_the_sequence_link_to_open_it_to_verify_avg_point_out() {
tc.Sequenc();

	}

	@Then("the user right-clicks on the sequence name to access additional options  to verify Avg Point out")
	public void the_user_right_clicks_on_the_sequence_name_to_access_additional_options_to_verify_avg_point_out() throws InterruptedException {
tc.Sequenc1();

	}

	@Then("the user selects Edit Sequence by clicking on it to verify Avg Point out")
	public void the_user_selects_edit_sequence_by_clicking_on_it_to_verify_avg_point_out() {
tc.editsequence();

	}

	@Then("the user drags and drops the characteristics to rearrange them to verify Avg Point out")
	public void the_user_drags_and_drops_the_characteristics_to_rearrange_them_to_verify_avg_point_out() {
tc.draganddrop();

	}

	@Then("the user saves the changes by clicking the Save button to verify Avg Point out")
	public void the_user_saves_the_changes_by_clicking_the_save_button_to_verify_avg_point_out() {

tc.savesatellitepage();
	}

	@Then("the user closes the sequence by clicking the Close button to verify Avg Point out")
	public void the_user_closes_the_sequence_by_clicking_the_close_button_to_verify_avg_point_out() {
tc.close1();

	}

}

	