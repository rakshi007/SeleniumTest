package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase11Page;
import pages.TestCase15Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class AVGABVADMIN {

	
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
	
	@When("user clicks on addgroup icon to verify Avg Run above status for attribute chart")
	public void user_clicks_on_addgroup_icon_to_verify_avg_run_above_status_for_attribute_chart() {
		tc.addnew1();

	}

	@Then("user clicks add charcerteristics to verify Avg Run above status for attribute chart")
	public void user_clicks_add_charcerteristics_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {

		tc.AddCharLink();
	}

	@Then("user clicks on the data group name dropdown to verify Avg Run above status for attribute chart")
	public void user_clicks_on_the_data_group_name_dropdown_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {
		tc.DDN();

	}

	@Then("user selects a data group from the dropdown to verify Avg Run above status for attribute chart")
	public void user_selects_a_data_group_from_the_dropdown_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {
		tc.DG();

	}

	@Then("user clicks on the part dropdown to verify Avg Run above status for attribute chart")
	public void user_clicks_on_the_part_dropdown_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {
		tc.PN();

	}

	@Then("user selects a part from the dropdown to verify Avg Run above status for attribute chart")
	public void user_selects_a_part_from_the_dropdown_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {
		tc.PART();

	}

	@Then("user Enters Attribute chart name to verify Avg Run above status for attribute chart")
	public void user_enters_attribute_chart_name_to_verify_avg_run_above_status_for_attribute_chart() throws InterruptedException {
		tc.addchar();

	}

	@Then("user clicks on Characteristic Type dropdown icon to verify Avg Run above status for attribute chart")
	public void user_clicks_on_characteristic_type_dropdown_icon_to_verify_avg_run_above_status_for_attribute_chart() {
		tc.dropdownatt();

	}

	@Then("user selects attribute type to verify Avg Run above status for attribute chart")
	public void user_selects_attribute_type_to_verify_avg_run_above_status_for_attribute_chart() {
		tc.select1();

	}

	@Then("user clicks add button to verify Avg Run above status for attribute chart")
	public void user_clicks_add_button_to_verify_avg_run_above_status_for_attribute_chart() {
		tc.charaaddbutton();

	}

	@Then("user clicks defect tab Avg Run above status for chart")
	public void user_clicks_defect_tab_avg_run_above_status_for_chart() {
		tc.Defects();

	}

	@Then("user clicks on add icon01 to add defect name Avg Run above status for chart")
	public void user_clicks_on_add_icon01_to_add_defect_name_avg_run_above_status_for_chart() {
		tc.add01();

	}

	@Then("user enters defect name01 Avg Run above status for chart")
	public void user_enters_defect_name01_avg_run_above_status_for_chart() {
		tc.defect1();

	}

	@Then("user clicks on save button01 Avg Run above status for  chart")
	public void user_clicks_on_save_button01_avg_run_above_status_for_chart() {
		tc.Save01();

	}

	@Then("user clicks on add icon02 to add defect name Avg Run above status for chart")
	public void user_clicks_on_add_icon02_to_add_defect_name_avg_run_above_status_for_chart() {

		tc.add02();
	}

	@Then("user enters defect name02 Avg Run above status for  chart")
	public void user_enters_defect_name02_avg_run_above_status_for_chart() {
tc.defect2();

	}

	@Then("user clicks on save button02 Avg Run above status for  chart")
	public void user_clicks_on_save_button02_avg_run_above_status_for_chart() {
tc.Save02();

	}

	@Then("user clicks on add icon03 to add defect name Avg Run above  status for chart")
	public void user_clicks_on_add_icon03_to_add_defect_name_avg_run_above_status_for_chart() {
		tc.add03();

	}

	@Then("user enters defect name03 Avg Run above status for  chart")
	public void user_enters_defect_name03_avg_run_above_status_for_chart() {
tc.defect3();

	}

	@Then("user clicks on save button03 Avg Run above status for chart")
	public void user_clicks_on_save_button03_avg_run_above_status_for_chart() {
tc.Save03();

	}

	@Then("user clicks on add icon04 to add defect name Avg Run above status for chart")
	public void user_clicks_on_add_icon04_to_add_defect_name_avg_run_above_status_for_chart() {

		tc.add04();
	}

	@Then("user enters defect name04 Avg Run above status status for chart")
	public void user_enters_defect_name04_avg_run_above_status_status_for_chart() {

tc.defect4();
	}

	@Then("user clicks on save button04 Avg Run above status status for chart")
	public void user_clicks_on_save_button04_avg_run_above_status_status_for_chart() {

tc.Save04();
	}

	@Then("user clicks on add icon05 to add defect name Avg Run above status for chart")
	public void user_clicks_on_add_icon05_to_add_defect_name_avg_run_above_status_for_chart() {
		tc.add05();

	}

	@Then("user enters defect name05 Avg Run above status  for  chart")
	public void user_enters_defect_name05_avg_run_above_status_for_chart() {
tc.defect5();

	}

	@Then("user clicks on save button05 Avg Run above status for  chart")
	public void user_clicks_on_save_button05_avg_run_above_status_for_chart() {

tc.Save05();
	}

	@Then("user clicks on save button to save characterstics Avg Run above status for chart")
	public void user_clicks_on_save_button_to_save_characterstics_avg_run_above_status_for_chart() {

tc.saveAttribute();
	}

	@Then("user clicks on close button Avg Run above status for chart")
	public void user_clicks_on_close_button_avg_run_above_status_for_chart()
			throws InterruptedException {

tc.closechar();
	}

	@Given("the user initiates the parameter addition process by clicking the Files icon Avg Run above  status for chart")
	public void the_user_initiates_the_parameter_addition_process_by_clicking_the_files_icon_avg_run_above_status_for_chart() {
tc.Addptp();

	}

	@When("the user clicks the Add icon to begin adding a new parameter01 Avg Run above status for chart")
	public void the_user_clicks_the_add_icon_to_begin_adding_a_new_parameter01_avg_run_above_status_for_chart() {
		tc.Assignparaicon();

	}

	@Then("the user verifies the assignment by clicking the Assign Parameter to Part link01 Avg Run above status for chart")
	public void the_user_verifies_the_assignment_by_clicking_the_assign_parameter_to_part_link01_avg_run_above_status_for_chart() {
		tc.Assignparaicon();
	

	}

	@Then("the user views available groups by clicking the Group dropdown01 Avg Run above status for chart")
	public void the_user_views_available_groups_by_clicking_the_group_dropdown01_avg_run_above_status_for_chart() {
		tc.datadropdown();
		

	}

	@Then("the user selects the appropriate data group from the dropdown01 Avg Run above status for chart")
	public void the_user_selects_the_appropriate_data_group_from_the_dropdown01_avg_run_above_status_for_chart() {
		tc.selectgrp();
		
	}

	@Then("views available parts by clicking the Part dropdown01 Avg Run above status for chart")
	public void views_available_parts_by_clicking_the_part_dropdown01_avg_run_above_status_for_chart() {
		tc.partdropdown();
	

	}

	@Then("the user selects the part to which the parameter will be added01 Avg Run above status for chart")
	public void the_user_selects_the_part_to_which_the_parameter_will_be_added01_avg_run_above_status_for_chart() {
		tc.selectpartpara();

	}

	@Then("the user drags and drops the required parameter into the part01 Avg Run above status for chart")
	public void the_user_drags_and_drops_the_required_parameter_into_the_part01_avg_run_above_status_for_chart() {
		tc.checkallbox();
		tc.checkallbox1();

	}

	@Then("confirms the addition by clicking the Save button01 Avg Run above status for chart")
	public void confirms_the_addition_by_clicking_the_save_button01_avg_run_above_status_for_chart() {
		tc.saveassign();

	}

	@Then("the user completes the process by clicking the Close button01 Avg Run above status for chart")
	public void the_user_completes_the_process_by_clicking_the_close_button01_avg_run_above_status_for_chart() {
		tc.closeassign();

	}

	
	//seq
	@Then("the user clicks on the Files button to verify Avg Run above")
	public void the_user_clicks_on_the_files_button_to_verify_avg_run_above() {

		tc.addseqlink();
	}

	@Then("the user clicks the expand button next to the Files icon to verify Avg Run above")
	public void the_user_clicks_the_expand_button_next_to_the_files_icon_to_verify_avg_run_above() {
		tc.expand();

	}

	@Then("user clicks on down arrow button in the grid to verify Avg Run above")
	public void user_clicks_on_down_arrow_button_in_the_grid_to_verify_avg_run_above() {
		tc.down();

	}

	@Then("user clicks on datagroup check box to verify Avg Run above")
	public void user_clicks_on_datagroup_check_box_to_verify_avg_run_above() {
		tc.DDG();

	}

	@Then("user click on ok button to close the to verify Avg Run above")
	public void user_click_on_ok_button_to_close_the_to_verify_avg_run_above() {
		tc.okg();

	}

	@Then("the user selects a group name in the grid by clicking on it  to verify Avg Run above")
	public void the_user_selects_a_group_name_in_the_grid_by_clicking_on_it_to_verify_avg_run_above() {
		tc.DDG1();

	}

	@Then("the user clicks on the arrow icon to expand the options to verify Avg Run above")
	public void the_user_clicks_on_the_arrow_icon_to_expand_the_options_to_verify_avg_run_above() {
		tc.DDd();

	}

	@Then("the user clicks on the Sequence link to open it to verify Avg Run above")
	public void the_user_clicks_on_the_sequence_link_to_open_it_to_verify_avg_run_above() {
		tc.Sequenc();

	}

	@Then("the user right-clicks on the sequence name to access additional options  to verify Avg Run above")
	public void the_user_right_clicks_on_the_sequence_name_to_access_additional_options_to_verify_avg_run_above() {
		tc.editsequence();

	}

	@Then("the user selects Edit Sequence by clicking on it to verify Avg Run above")
	public void the_user_selects_edit_sequence_by_clicking_on_it_to_verify_avg_run_above() throws InterruptedException {
		tc.Sequenc1();

	}

	@Then("the user drags and drops the characteristics to rearrange them to verify Avg Run above")
	public void the_user_drags_and_drops_the_characteristics_to_rearrange_them_to_verify_avg_run_above() {
		tc.draganddrop();

	}

	@Then("the user saves the changes by clicking the Save button to verify Avg Run above")
	public void the_user_saves_the_changes_by_clicking_the_save_button_to_verify_avg_run_above() {
		tc.save();

	}

	@Then("the user closes the sequence by clicking the Close button to verify Avg Run above")
	public void the_user_closes_the_sequence_by_clicking_the_close_button_to_verify_avg_run_above() {
		tc.close1();

	}






	
}
