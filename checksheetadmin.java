package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase22Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class checksheetadmin {

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






    @When("user clicks on add group icon to verify Checksheet for Attribute chart")
    public void user_clicks_on_add_group_icon_to_verify_checksheet_for_attribute_chart() {
      tc.addnew1();
    }

    @Then("user clicks add characteristics to verify Checksheet for  Attribute chart")
    public void user_clicks_add_characteristics_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
     tc.AddCharLink();
    }

    @Then("user clicks on the data group dropdown to verify Checksheet for  Attribute chart")
    public void user_clicks_on_the_data_group_dropdown_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
    tc.DDN();
    }

    @Then("user selects a data group from the dropdown to verify Checksheet for  Attribute chart")
    public void user_selects_a_data_group_from_the_dropdown_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
    tc.DG();
    }

    @Then("user clicks on the part dropdown to verify Checksheet for Attribute chart")
    public void user_clicks_on_the_part_dropdown_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
    tc.PN();
    }

    @Then("user selects a part from the dropdown to verify Checksheet for Attribute chart")
    public void user_selects_a_part_from_the_dropdown_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
    tc.PART();
    }

    @Then("user Enters Attribute chart name to verify Checksheet for Attribute chart")
    public void user_enters_attribute_chart_name_to_verify_checksheet_for_attribute_chart() throws InterruptedException {
    tc.addchar();
    }

    @Then("user clicks on Characteristic Type dropdown icon to verify Checksheet for Attribute chart")
    public void user_clicks_on_characteristic_type_dropdown_icon_to_verify_checksheet_for_attribute_chart() {
   tc.dropdownatt();
    }

    @Then("user selects attribute type to verify Checksheet for Attribute chart")
    public void user_selects_attribute_type_to_verify_checksheet_for_attribute_chart() {
    tc.select1();
    }

    @Then("user clicks add button to verify Checksheet for Attribute chart")
    public void user_clicks_add_button_to_verify_checksheet_for_attribute_chart() {
   tc.charaaddbutton();
    }

    @Then("user clicks on operator information tab Checksheet for Attribute chart")
    public void user_clicks_on_operator_information_tab_checksheet_for_attribute_chart() {
    tc.operation();
    }

    @Then("user clicks on check sheet check box to verify Checksheet for Attribute chart")
    public void user_clicks_on_check_sheet_check_box_to_verify_checksheet_for_attribute_chart() {
   tc.Checksheet();
    }

    @Then("user click on defects tab to verify Checksheet for Attribute chart")
    public void user_click_on_defects_tab_to_verify_checksheet_for_attribute_chart() {
   tc.Defects();
    }

    @Then("user clicks on add icon01 to add defect name Checksheet for Attribute chart")
    public void user_clicks_on_add_icon01_to_add_defect_name_checksheet_for_attribute_chart() {
  tc.add01();
    }

    @Then("user enters defect name01 Checksheet for Attribute chart")
    public void user_enters_defect_name01_checksheet_for_attribute_chart() {
   tc.defect1();
    }

    @Then("user clicks on save button01 Checksheet for  Attribute chart")
    public void user_clicks_on_save_button01_checksheet_for_attribute_chart() {
    tc.Save01();
    }

    @Then("user clicks on add icon02 to add defect name Checksheet for Attribute chart")
    public void user_clicks_on_add_icon02_to_add_defect_name_checksheet_for_attribute_chart() {
    tc.add02();
    }

    @Then("user enters defect name02 Checksheet for  Attribute chart")
    public void user_enters_defect_name02_checksheet_for_attribute_chart() {
    tc.defect2();
    }

    @Then("user clicks on save button02 Checksheet for  Attribute chart")
    public void user_clicks_on_save_button02_checksheet_for_attribute_chart() {
    tc.Save02();
    }

    @Then("user clicks on add icon03 to add defect name Checksheet for Attribute chart")
    public void user_clicks_on_add_icon03_to_add_defect_name_checksheet_for_attribute_chart() {
    tc.add03();
    }

    @Then("user enters defect name03 Checksheet for  Attribute chart")
    public void user_enters_defect_name03_checksheet_for_attribute_chart() {
    tc.defect3();
    }

    @Then("user clicks on save button03 Checksheet for Attribute chart")
    public void user_clicks_on_save_button03_checksheet_for_attribute_chart() {
    tc.Save03();
    }

    @Then("user clicks on save button to save characterstics to verify Checksheet for Attribute chart")
    public void user_clicks_on_save_button_to_save_characterstics_to_verify_checksheet_for_attribute_chart() {
     tc.saveAttribute();
    }

    @Then("user clicks on close button to verify check sheet for Attribute chart")
    public void user_clicks_on_close_button_to_verify_check_sheet_for_attribute_chart() throws InterruptedException {
    tc.closechar();
    }

    //sequence
    @Then("the user clicks on the Files button to verify Checksheet")
    public void the_user_clicks_on_the_files_button_to_verify_checksheet() {
        tc.addseqlink();
    }

    @Then("the user clicks the expand button next to the Files icon to verify Checksheet")
    public void the_user_clicks_the_expand_button_next_to_the_files_icon_to_verify_checksheet() {
   tc.expand();
    }

    @Then("user clicks on data group check box to verify Checksheet")
    public void user_clicks_on_data_group_check_box_to_verify_checksheet() {
    tc.DDG1();
    }

    @Then("the user clicks on the arrow icon to expand the options to verify Checksheet")
    public void the_user_clicks_on_the_arrow_icon_to_expand_the_options_to_verify_checksheet() {
    tc.DDd();
    }

    @Then("the user clicks on the Sequence link to open it to verify Checksheet")
    public void the_user_clicks_on_the_sequence_link_to_open_it_to_verify_checksheet() {
    tc.Sequenc();
    }

    @Then("the user right-clicks on the sequence name to access additional options  to verify Checksheet")
    public void the_user_right_clicks_on_the_sequence_name_to_access_additional_options_to_verify_checksheet() throws InterruptedException {
    tc.Sequenc1();
    }

    @Then("the user selects Edit Sequence by clicking on it to verify Checksheet")
    public void the_user_selects_edit_sequence_by_clicking_on_it_to_verify_checksheet() {
    tc.editsequence();
    }

    @Then("the user drags and drops the characteristics to rearrange them to verify Checksheet")
    public void the_user_drags_and_drops_the_characteristics_to_rearrange_them_to_verify_checksheet() {
    tc.draganddrop();
    }

    @Then("the user saves the changes by clicking the Save button to verify Checksheet")
    public void the_user_saves_the_changes_by_clicking_the_save_button_to_verify_checksheet() {
     tc.save();
    }

    @Then("the user closes the sequence by clicking the Close button to verify Checksheet")
    public void the_user_closes_the_sequence_by_clicking_the_close_button_to_verify_checksheet() {
    tc.close1();
    }

}
