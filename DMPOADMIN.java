package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase20Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class DMPOADMIN {



    private TestCase20Page tc = new TestCase20Page(DriverFactory.getDriver());

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




    @When("user clicks on add group icon to verify DMPO status for Attribute chart")
    public void user_clicks_on_add_group_icon_to_verify_dmpo_status_for_attribute_chart() {
tc.addnew11();
    }

    @Then("user clicks add characteristics to verify DMPO status for  Attribute chart")
    public void user_clicks_add_characteristics_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
   tc.AddCharLink();
    }

    @Then("user clicks on the data group dropdown to verify DMPO status for  Attribute chart")
    public void user_clicks_on_the_data_group_dropdown_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
   tc.DDN();
    }

    @Then("user selects a data group from the dropdown to verify DMPO status for  Attribute chart")
    public void user_selects_a_data_group_from_the_dropdown_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
   tc.DG();
    }

    @Then("user clicks on the part dropdown to verify DMPO status for Attribute chart")
    public void user_clicks_on_the_part_dropdown_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
   tc.PN();
    }

    @Then("user selects a part from the dropdown to verify DMPO status for Attribute chart")
    public void user_selects_a_part_from_the_dropdown_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
    tc.PART();
    }

    @Then("user Enters Attribute chart name to verify DMPO status for Attribute chart")
    public void user_enters_attribute_chart_name_to_verify_dmpo_status_for_attribute_chart() throws InterruptedException {
   tc.addchar();
    }

    @Then("user clicks on Characteristic Type dropdown icon to verify DMPO status for Attribute chart")
    public void user_clicks_on_characteristic_type_dropdown_icon_to_verify_dmpo_status_for_attribute_chart() {
   tc.dropdownatt();
    }

    @Then("user selects attribute type to verify DMPO status for Attribute chart")
    public void user_selects_attribute_type_to_verify_dmpo_status_for_attribute_chart() {
  tc.select1();
    }

    @Then("user clicks add button to verify DMPO status for Attribute chart")
    public void user_clicks_add_button_to_verify_dmpo_status_for_attribute_chart() {
   tc.charaaddbutton();
    }

    @Then("user clicks on operator information tab DMPO status for Attribute chart")
    public void user_clicks_on_operator_information_tab_dmpo_status_for_attribute_chart() {
    tc.operator();
    }

    @Then("user clicks use DMPO check box to verify DMPO status for Attribute chart")
    public void user_clicks_use_dmpo_check_box_to_verify_dmpo_status_for_attribute_chart() {
    tc.Hide();
    }

    @Then("user click on defects tab to verify DMPO status for Attribute chart")
    public void user_click_on_defects_tab_to_verify_dmpo_status_for_attribute_chart() {
   tc.Defects();
    }

    @Then("user clicks on add icon01 to add defect name DMPO status for Attribute chart")
    public void user_clicks_on_add_icon01_to_add_defect_name_dmpo_status_for_attribute_chart() {
    tc.add01();
    }

    @Then("user enters defect name01 DMPO status for Attribute chart")
    public void user_enters_defect_name01_dmpo_status_for_attribute_chart() {
    tc.defect1();
    }

    @Then("user clicks on save button01 DMPO status for  Attribute chart")
    public void user_clicks_on_save_button01_dmpo_status_for_attribute_chart() {
    tc.Save01();
    }

    @Then("user clicks on add icon02 to add defect name DMPO status for Attribute chart")
    public void user_clicks_on_add_icon02_to_add_defect_name_dmpo_status_for_attribute_chart() {
    tc.add02();
    }

    @Then("user enters defect name02 DMPO status for  Attribute chart")
    public void user_enters_defect_name02_dmpo_status_for_attribute_chart() {
    tc.defect2();
    }

    @Then("user clicks on save button02 DMPO status for  Attribute chart")
    public void user_clicks_on_save_button02_dmpo_status_for_attribute_chart() {
    tc.Save02();
    }

    @Then("user clicks on add icon03 to add defect name DMPO status for Attribute chart")
    public void user_clicks_on_add_icon03_to_add_defect_name_dmpo_status_for_attribute_chart() {
    tc.add03();
    }

    @Then("user enters defect name03 DMPO status for  Attribute chart")
    public void user_enters_defect_name03_dmpo_status_for_attribute_chart() {
    tc.defect3();
    }


    @Then("user clicks on save button03 DMPO status for Attribute chart")
    public void user_clicks_on_save_button03_dmpo_status_for_attribute_chart() {
    tc.Save03();
    }

    @Then("user clicks on save button to save characterstics to verify DMPO status for Attribute chart")
    public void user_clicks_on_save_button_to_save_characterstics_to_verify_dmpo_status_for_attribute_chart() {
    tc.saveAttribute();
    }

    @Then("user clicks on close button DMPO to verify status for Attribute chart")
    public void user_clicks_on_close_button_dmpo_to_verify_status_for_attribute_chart() throws InterruptedException {
   tc.closechar();
    }

    @Then("the user clicks on the Files button to verify DMPO")
    public void the_user_clicks_on_the_files_button_to_verify_dmpo() {
    tc.filesicon();
    }

    @Then("the user clicks the expand button next to the Files icon to verify DMPO")
    public void the_user_clicks_the_expand_button_next_to_the_files_icon_to_verify_dmpo() {
    tc.expand();
    }

    @Then("user clicks on data group check box to verify DMPO")
    public void user_clicks_on_data_group_check_box_to_verify_dmpo() {
    tc.DDG1();
    }

    @Then("the user clicks on the arrow icon to expand the options to verify DMPO")
    public void the_user_clicks_on_the_arrow_icon_to_expand_the_options_to_verify_dmpo() {
    tc.DDd();
    }

    @Then("the user clicks on the Sequence link to open it to verify DMPO")
    public void the_user_clicks_on_the_sequence_link_to_open_it_to_verify_dmpo() {
   tc.Sequenc();
    }

    @Then("the user right-clicks on the sequence name to access additional options  to verify DMPO")
    public void the_user_right_clicks_on_the_sequence_name_to_access_additional_options_to_verify_dmpo() throws InterruptedException {
   tc.Sequenc1();
    }

    @Then("the user selects Edit Sequence by clicking on it to verify DMPO")
    public void the_user_selects_edit_sequence_by_clicking_on_it_to_verify_dmpo() {
    tc.editsequence();
    }

    @Then("the user drags and drops the characteristics to rearrange them to verify DMPO")
    public void the_user_drags_and_drops_the_characteristics_to_rearrange_them_to_verify_dmpo() {
    tc.draganddrop();
    }

    @Then("the user saves the changes by clicking the Save button to verify DMPO")
    public void the_user_saves_the_changes_by_clicking_the_save_button_to_verify_dmpo() {
    tc.save();
    }

    @Then("the user closes the sequence by clicking the Close button to verify DMPO")
    public void the_user_closes_the_sequence_by_clicking_the_close_button_to_verify_dmpo() {
    tc.close1();
    }
}
