package stepdefinitions;

import DriverFactory.DriverFactory;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Testcase23Page;
import util.ConfigReader;
import util.ExtentReportManager;


public class Attributechub {

    private Testcase23Page tc = new Testcase23Page(DriverFactory.getDriver());

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

    @When("user is on home page to verify attribute chart c")
    public void user_is_on_home_page_to_verify_attribute_chart_c() {
    }

    @Then("user clicks add icon to verify attribute chart c")
    public void user_clicks_add_icon_to_verify_attribute_chart_c() {
         tc.addnew11();
    }

    @Then("user clicks on add datagroup link to verify attribute chart c")
    public void user_clicks_on_add_datagroup_link_to_verify_attribute_chart_c() {
       tc.clickaddgrp();
    }



    @Then("user enters datagroup name to verify attribute chart c")
    public void user_enters_datagroup_name_to_verify_attribute_chart_c() {
        tc.entergrpname();
    }

    @Then("user clicks on add button to verify attribute chart c")
    public void user_clicks_on_add_button_to_verify_attribute_chart_c() {
        tc.clickaddbtn();
    }

    @Then("user clicks on add icon to creat new part to verify attribute chart c")
    public void user_clicks_on_add_icon_to_creat_new_part_to_verify_attribute_chart_c() {
        tc.addnew1();
    }


    @Then("user clicks on add part link to verify attribute chart c")
    public void user_clicks_on_add_part_link_to_verify_attribute_chart_c() {
         tc.clickpart1();
    }

    @Then("user clicks group dropdown to verify attribute chart c")
    public void user_clicks_group_dropdown_to_verify_attribute_chart_c() {
        tc.selectdropdown();
    }

    @Then("user select datagroup name to verify attribute chart c")
    public void user_select_datagroup_name_to_verify_attribute_chart_c() {
        tc.selectgroup();
    }


    @Then("user enters part name to verify attribute chart c")
    public void user_enters_part_name_to_verify_attribute_chart_c() {
       tc.enterpartname();
    }

    @Then("user clicks on add link to verify attribute chart c")
    public void user_clicks_on_add_link_to_verify_attribute_chart_c() {
       tc.clickAdd();
    }


    @Then("user enters characteristics name to verify attribute chart c")
    public void user_enters_characteristics_name_to_verify_attribute_chart_c() {
        tc.addchar();
    }

    @Then("user clicks on characteristic type dropdown to verify attribute chart c")
    public void user_clicks_on_characteristic_type_dropdown_to_verify_attribute_chart_c() {
        tc.dropdownatt();
    }

    @Then("user selects characteristic type as attribute to verify attribute chart c")
    public void user_selects_characteristic_type_as_attribute_to_verify_attribute_chart_c() {
        tc.select1();
    }

    @Then("user clicks on add link to add characteristics to verify attribute chart c")
    public void user_clicks_on_add_link_to_add_characteristics_to_verify_attribute_chart_c() {
        tc.charaaddbutton();
    }

    @Then("user enters value for inspection unit to verify attribute chart c")
    public void user_enters_value_for_inspection_unit_to_verify_attribute_chart_c() throws InterruptedException {
        Thread.sleep(2000);
        tc.inspection();
    }

    @Then("user clicks on defect tab to verify attribute chart c")
    public void user_clicks_on_defect_tab_to_verify_attribute_chart_c() {
        tc.Defects();
    }

    @Then("user clicks on add icon01 to verify attribute chart c")
    public void user_clicks_on_add_icon01_to_verify_attribute_chart_c() {
        tc.add01();
    }

    @Then("user enters defect name01 to verify attribute chart c")
    public void user_enters_defect_name01_to_verify_attribute_chart_c() {
        tc.defect1();
    }


    @Then("user clicks on save button01 to verify attribute chart c")
    public void user_clicks_on_save_button01_to_verify_attribute_chart_c() {
        tc.Save01();
    }

    @Then("user clicks on add icon02 to verify attribute chart c")
    public void user_clicks_on_add_icon02_to_verify_attribute_chart_c() {
        tc.add02();
    }

    @Then("user enters defect name02 to verify attribute chart c")
    public void user_enters_defect_name02_to_verify_attribute_chart_c() {
        tc.defect2();
    }


    @Then("user clicks on save button02 to verify attribute chart c")
    public void user_clicks_on_save_button02_to_verify_attribute_chart_c() {
        tc.Save02();
    }

    @Then("user clicks on add icon03 to verify attribute chart c")
    public void user_clicks_on_add_icon03_to_verify_attribute_chart_c() {
        tc.add03();
    }

    @Then("user enters defect name03 to verify attribute chart c")
    public void user_enters_defect_name03_to_verify_attribute_chart_c() {
        tc.defect3();
    }



    @Then("user clicks on save button03 to verify attribute chart c")
    public void user_clicks_on_save_button03_to_verify_attribute_chart_c() {
        tc.Save03();
    }

    @Then("user clicks on add icon04 to verify attribute chart c")
    public void user_clicks_on_add_icon04_to_verify_attribute_chart_c() {
        tc.add04();
    }

    @Then("user enters defect name04 to verify attribute chart c")
    public void user_enters_defect_name04_to_verify_attribute_chart_c() {
        tc.defect4();
    }

    @Then("user clicks on save button04 to verify attribute chart c")
    public void user_clicks_on_save_button04_to_verify_attribute_chart_c() {
        tc.Save04();
    }

    @Then("user clicks on add icon05 to verify attribute chart c")
    public void user_clicks_on_add_icon05_to_verify_attribute_chart_c() {
        tc.add05();
    }

    @Then("user enters defect name05 to verify attribute chart c")
    public void user_enters_defect_name05_to_verify_attribute_chart_c() {
        tc.defect5();
    }



    @Then("user clicks on save button05 to verify attribute chart c")
    public void user_clicks_on_save_button05_to_verify_attribute_chart_c() {
        tc.Save05();
    }

    @Then("user clicks on add icon06 to verify attribute chart c")
    public void user_clicks_on_add_icon06_to_verify_attribute_chart_c() {
        tc.add06();
    }

    @Then("user enters defect name06 to verify attribute chart c")
    public void user_enters_defect_name06_to_verify_attribute_chart_c() {
       tc.defect6();
    }


    @Then("user clicks on save button06 to verify attribute chart c")
    public void user_clicks_on_save_button06_to_verify_attribute_chart_c() {
           tc.Save06();
    }

    @Then("user clicks on save button to verify attribute chart c")
    public void user_clicks_on_save_button_to_verify_attribute_chart_c() {
         tc.saveAttribute();
    }

    @Then("user clicks on close button to verify attribute chart c")
    public void user_clicks_on_close_button_to_verify_attribute_chart_c() throws InterruptedException {
        tc.closechar();
    }


    @Then("user clciks on add icon to create sequence to verify attribute chart c")
    public void user_clciks_on_add_icon_to_create_sequence_to_verify_attribute_chart_c() {
        tc.addseqlink();

    }

    @Then("user clicks on add sequence link to verify attribute chart c")
    public void user_clicks_on_add_sequence_link_to_verify_attribute_chart_c() {
        tc.addsequece();
    }

    @Then("user clicks on datagroup dropdown to verify attribute chart c")
    public void user_clicks_on_datagroup_dropdown_to_verify_attribute_chart_c() {
        tc.clickdatagroup();
    }

    @Then("user selects datagroup to verify attribute chart c")
    public void user_selects_datagroup_to_verify_attribute_chart_c() {
        tc.selectdatagrp();
    }

    @Then("user clicks on part dropdown to verify attribute chart c")
    public void user_clicks_on_part_dropdown_to_verify_attribute_chart_c() {
        tc.clickpart();
    }

    @Then("user select partname to verify attribute chart c")
    public void user_select_partname_to_verify_attribute_chart_c() {
        tc.selectpart();
    }

    @Then("user clicks on add link button to verify attribute chart c")
    public void user_clicks_on_add_link_button_to_verify_attribute_chart_c() {
        tc.clickonadd();
    }

    @Then("user enetrs sequence name to verify attribute chart c")
    public void user_enetrs_sequence_name_to_verify_attribute_chart_c() {
        tc.EnterSequencename();
    }

    @Then("user drag and drops the characteristics to verify attribute chart c")
    public void user_drag_and_drops_the_characteristics_to_verify_attribute_chart_c() {
        tc.dragchar();
    }

    @Then("user clicks on save button for chart to verify attribute chart c")
    public void user_clicks_on_save_button_for_chart_to_verify_attribute_chart_c() {
        tc.save();
    }

    @Then("user close the sequence popup to verify attribute chart c")
    public void user_close_the_sequence_popup_to_verify_attribute_chart_c() {
        tc.close1();
    }

    @Then("user clicks on the network icon to create new page to verify attribute chart c")
    public void user_clicks_on_the_network_icon_to_create_new_page_to_verify_attribute_chart_c() throws InterruptedException {
        tc.network1();
    }

    @Then("User clicks kebeb icon to verify attribute chart c")
    public void user_clicks_kebeb_icon_to_verify_attribute_chart_c() {
        tc.Kebabsatellite();
    }

    @Then("user clicks on add page to verify attribute chart c")
    public void user_clicks_on_add_page_to_verify_attribute_chart_c() {
        tc.Addpaegsatellite();
    }

    @Then("user enters page name to verify attribute chart c")
    public void user_enters_page_name_to_verify_attribute_chart_c() {
        tc.Enterpagenamesatellite();
    }

    @Then("user clicks on add page link to verify attribute chart c")
    public void user_clicks_on_add_page_link_to_verify_attribute_chart_c() {
        tc.Addsatellitepage();
    }

    @Then("user Drag and drops the sequence to verify attribute chart c")
    public void user_drag_and_drops_the_sequence_to_verify_attribute_chart_c() {
        tc.Dragsequencname();
    }

    @Then("user clicks on save link to verify attribute chart c")
    public void user_clicks_on_save_link_to_verify_attribute_chart_c() {
         tc.savesatellitepage();
    }

}
