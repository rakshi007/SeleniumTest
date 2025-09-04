package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase17Page;
import pages.TestCase18Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class rundownsatelite {

	
	private TestCase18Page tc = new TestCase18Page(DriverFactory.getDriver());

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
	
	@When("user clicks on network icon to verify hide characterstic status")
	public void user_clicks_on_network_icon_to_verify_avg_run_down_status() {
tc.network1();

	}

	@Then("user clicks on page name to edit to verify hide characterstic status")
	public void user_clicks_on_page_name_to_edit_to_verify_avg_run_down_status() {
tc.clickvaripage();

	}

	@Then("user clicks on edit icon to verify to verify hide characterstic status")
	public void user_clicks_on_edit_icon_to_verify_to_verify_avg_run_down_status() {
tc.editpencil();

	}

	@Then("user clicks on date input field to verify hide characterstic status")
	public void user_clicks_on_date_input_field_to_verify_avg_run_down_status() {

tc.date();
	}

	@Then("user clicks on time input field to verify hide characterstic status")
	public void user_clicks_on_time_input_field_to_verify_avg_run_down_status() {
tc.time2();

	}

	@Then("user enters subgroup size1 to verify hide characterstic status")
	public void user_enters_subgroup_size1_to_verify_avg_run_down_status() {
tc.defectsub01();

	}

	@Then("user enters subgroup size2 to verify hide characterstic status")
	public void user_enters_subgroup_size2_to_verify_avg_run_down_status() {
		tc.defectsub02();


	}

	@Then("user enters subgroup size4 to verify hide characterstic status")
	public void user_enters_subgroup_size4_to_verify_avg_run_down_status() {
		tc.defectsub04();


	}

	@Then("user enters subgroup size5 to verify hide characterstic status")
	public void user_enters_subgroup_size5_to_verify_avg_run_down_status() {
		tc.defectsub05();


	}

	@Then("user enters total inspected value for subgroup size01 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_avg_run_down_status() {
tc.total01();

	}

	@Then("user enters values in allow all parameter section to verify hide characterstic status")
	public void user_enters_values_in_allow_all_parameter_section_to_verify_avg_run_down_status() {


	}

	@Then("user click on save1 button for chart01 to verify hide characterstic status")
	public void user_click_on_save1_button_for_chart01_to_verify_avg_run_down_status() {

tc.savechart();
	}

	@Then("user fetch the status01 of the page to verify hide characterstic statu")
	public void user_fetch_the_status01_of_the_page_to_verify_avg_run_down_statu() {
tc.getText();

	}

	//2
	@Then("user click on time2 inputfield to verify hide characterstic status")
	public void user_click_on_time2_inputfield_to_verify_avg_run_down_status() {

tc.time2();
	}

	@Then("user enters subgroup size11 to verify hide characterstic status")
	public void user_enters_subgroup_size11_to_verify_avg_run_down_status() {
tc.defectsub11();

	}

	@Then("user enters subgroup size12 to verify hide characterstic status")
	public void user_enters_subgroup_size12_to_verify_avg_run_down_status() {
		tc.defectsub12();

	}

	@Then("user enters subgroup size13 to verify hide characterstic status")
	public void user_enters_subgroup_size13_to_verify_avg_run_down_status() {

		tc.defectsub13();
	}

	@Then("user enters subgroup size14 to verify hide characterstic status")
	public void user_enters_subgroup_size14_to_verify_avg_run_down_status() {
		tc.defectsub14();

	}

	@Then("user enetrs subgroup Size15 to verify hide characterstic status")
	public void user_enetrs_subgroup_size15_to_verify_avg_run_down_status() {
		tc.defectsub15();

	}

	@Then("user enters total inspected value for subgroup size02 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_avg_run_down_status() {
tc.total02();

	}

	@Then("user click on save2 button for chart01 to verify hide characterstic status")
	public void user_click_on_save2_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart2();

	}

	@Then("user fetch the status02 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status02_of_the_page_to_verify_to_verify_avg_run_down_status() {

tc.getText2();
	}

	//3
	@Then("user click on time3 inputfield to verify to verify hide characterstic status")
	public void user_click_on_time3_inputfield_to_verify_to_verify_avg_run_down_status() {
tc.time3();

	}

	@Then("user enters subgroup size21 to verify to verify hide characterstic status")
	public void user_enters_subgroup_size21_to_verify_to_verify_avg_run_down_status() {
tc.defectsub21();

	}

	@Then("user enters subgroup size22 to verify to verify hide characterstic status")
	public void user_enters_subgroup_size22_to_verify_to_verify_avg_run_down_status() {
		tc.defectsub22();

	}

	@Then("user enters subgroup size23 to verify to verify hide characterstic status")
	public void user_enters_subgroup_size23_to_verify_to_verify_avg_run_down_status() {
		tc.defectsub23();

	}

	@Then("user enters subgroup size24 to verify to verify hide characterstic status")
	public void user_enters_subgroup_size24_to_verify_to_verify_avg_run_down_status() {

		tc.defectsub24();
	}

	@Then("user enters subgroup size25 to verify to verify hide characterstic status")
	public void user_enters_subgroup_size25_to_verify_to_verify_avg_run_down_status() {
		tc.defectsub25();

	}

	@Then("user enters total inspected value for subgroup size03 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_avg_run_down_status() {
tc.total03();

	}

	@Then("user click on save3 button for chart01 to verify hide characterstic status")
	public void user_click_on_save3_button_for_chart01_to_verify_avg_run_down_status() {
tc.Save03();

	}

	@Then("user fetch the status03 of the page  to verify hide characterstic status")
	public void user_fetch_the_status03_of_the_page_to_verify_avg_run_down_status() {
tc.getText3();

	}

	//4
	@Then("user click on time4 inputfield to verify hide characterstic status")
	public void user_click_on_time4_inputfield_to_verify_avg_run_down_status() {
tc.time4();

	}

	@Then("user enters subgroup size31 to verify hide characterstic status")
	public void user_enters_subgroup_size31_to_verify_avg_run_down_status() {
tc.defectsub31();

	}

	@Then("user enters subgroup size32 to verify hide characterstic status")
	public void user_enters_subgroup_size32_to_verify_avg_run_down_status() {
		tc.defectsub32();

	}

	@Then("user enters subgroup size33 to verify hide characterstic status")
	public void user_enters_subgroup_size33_to_verify_avg_run_down_status() {
		tc.defectsub33();

	}

	@Then("user enters subgroup size34 to verify hide characterstic status")
	public void user_enters_subgroup_size34_to_verify_avg_run_down_status() {
		tc.defectsub34();

	}



	@Then("user enters total inspected value for subgroup size04 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_avg_run_down_status() {
tc.total04();

	}

	@Then("user click on save4 button for chart01 to verify hide characterstic status")
	public void user_click_on_save4_button_for_chart01_to_verify_avg_run_down_status() {

tc.savechart4();
	}

	@Then("user fetch the status04 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status04_of_the_page_to_verify_to_verify_avg_run_down_status() {

tc.getText4();
	}
//5
	@Then("user click on time5 inputfield to verify hide characterstic status")
	public void user_click_on_time5_inputfield_to_verify_avg_run_down_status() {
tc.time5();

	}

	@Then("user enters subgroup size41 to verify hide characterstic status")
	public void user_enters_subgroup_size41_to_verify_avg_run_down_status() {
tc.defectsub41();

	}

	@Then("user enters subgroup size42 to verify hide characterstic status")
	public void user_enters_subgroup_size42_to_verify_avg_run_down_status() {
tc.defectsub43();

	}

	@Then("user enters subgroup size43 to verify hide characterstic status")
	public void user_enters_subgroup_size43_to_verify_avg_run_down_status() {
tc.defectsub44();

	}

	@Then("user enters subgroup size44 to verify hide characterstic status")
	public void user_enters_subgroup_size44_to_verify_avg_run_down_status() {

tc.defectsub43();
	}

	@Then("user enters total inspected value for subgroup size05 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_avg_run_down_status() {

tc.total04();
	}

	@Then("user click on save5 button for chart01 to verify hide characterstic status")
	public void user_click_on_save5_button_for_chart01_to_verify_avg_run_down_status() {

tc.savechart5();
	}
//06
	@Then("user fetch the status05 of the page to verify hide characterstic status")
	public void user_fetch_the_status05_of_the_page_to_verify_avg_run_down_status() {

tc.time6();
	}

	@Then("user enters subgroup size51 to verify hide characterstic status")
	public void user_enters_subgroup_size51_to_verify_avg_run_down_status() {
tc.defectsub51();

	}

	@Then("user enters subgroup size52 to verify hide characterstic status")
	public void user_enters_subgroup_size52_to_verify_avg_run_down_status() {

tc.defectsub52();
	}

	@Then("user enters subgroup size53 to verify hide characterstic status")
	public void user_enters_subgroup_size53_to_verify_avg_run_down_status() {
		tc.defectsub53();

	}

	@Then("user enters subgroup size54 to verify hide characterstic status")
	public void user_enters_subgroup_size54_to_verify_avg_run_down_status() {
tc.defectsub54();

	}

	@Then("user enters total inspected value for subgroup size06 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size06_to_verify_avg_run_down_status() {
tc.total06();
	}

	@Then("user click on save6 button for chart01 to verify hide characterstic status")
	public void user_click_on_save6_button_for_chart01_to_verify_avg_run_down_status() {

tc.savechart6();
	}

	@Then("user fetch the status06 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status06_of_the_page_to_verify_to_verify_avg_run_down_status() {
tc.getText6();

	}

	
	//07
	@Then("user click on time7 inputfield to verify hide characterstic status")
	public void user_click_on_time7_inputfield_to_verify_avg_run_down_status() {
tc.time7();

	}

	@Then("user enters subgroup size61 to verify hide characterstic status")
	public void user_enters_subgroup_size61_to_verify_avg_run_down_status() {
tc.defectsub61();

	}

	@Then("user enters subgroup size63 to verify hide characterstic status")
	public void user_enters_subgroup_size63_to_verify_avg_run_down_status() {
tc.defectsub63();

	}

	@Then("user enters subgroup size64 to verify hide characterstic status")
	public void user_enters_subgroup_size64_to_verify_avg_run_down_status() {
tc.defectsub64();

	}

	@Then("user enters subgroup size65 to verify hide characterstic status")
	public void user_enters_subgroup_size65_to_verify_avg_run_down_status() {

tc.defectsub65();
	}

	@Then("user enters total inspected value for subgroup size07 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size07_to_verify_avg_run_down_status() {
tc.total07();

	}

	@Then("user click on save7 button for chart01 to verify hide characterstic status")
	public void user_click_on_save7_button_for_chart01_to_verify_avg_run_down_status() {

tc.savechart7();
	}

	@Then("user fetch the status07 of the page to verify hide characterstic status")
	public void user_fetch_the_status07_of_the_page_to_verify_avg_run_down_status() {
tc.getText7();

	}
//8
	@Then("user click on time08 inputfield to verify Avg Trend Down status")
	public void user_click_on_time08_inputfield_to_verify_avg_trend_down_status() {
tc.time8();

	}

	@Then("user enters subgroup size71 to verify hide characterstic status")
	public void user_enters_subgroup_size71_to_verify_avg_run_down_status() {

tc.defectsub71();
	}

	@Then("user enters subgroup size72 to verify hide characterstic status")
	public void user_enters_subgroup_size72_to_verify_avg_run_down_status() {
tc.defectsub72();

	}

	@Then("user enters subgroup size73 to verify hide characterstic status")
	public void user_enters_subgroup_size73_to_verify_avg_run_down_status() {
tc.defectsub73();

	}

	@Then("user enters subgroup size74 to verify hide characterstic status")
	public void user_enters_subgroup_size74_to_verify_avg_run_down_status() {
tc.defectsub74();

	}

	@Then("user enters total inspected value for subgroup size08 to verify hide characterstic status")
	public void user_enters_total_inspected_value_for_subgroup_size08_to_verify_avg_run_down_status() {
tc.total08();

	}

	@Then("user click on save8 button for chart01 to verify hide characterstic status")
	public void user_click_on_save8_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart8();

	}

	@Then("user fetch the status08 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status08_of_the_page_to_verify_to_verify_avg_run_down_status() {

tc.getText8();
	}
//9
	@Then("user click on time09 inputfield to verify Avg Trend Down status")
	public void user_click_on_time09_inputfield_to_verify_avg_trend_down_status() {
tc.time9();

	}

	@Then("user enters subgroup size81 to verify hide characterstic status")
	public void user_enters_subgroup_size81_to_verify_avg_run_down_status() {

tc.defectsub81();
	}

	@Then("user enters subgroup size82 to verify hide characterstic status")
	public void user_enters_subgroup_size82_to_verify_avg_run_down_status() {
tc.defectsub82();

	}

	@Then("user enters subgroup size83 to verify hide characterstic status")
	public void user_enters_subgroup_size83_to_verify_avg_run_down_status() {
tc.defectsub83();

	}

	@Then("user enters subgroup size84 to verify hide characterstic status")
	public void user_enters_subgroup_size84_to_verify_avg_run_down_status() {
tc.defectsub84();

	}

	@Then("user click on save9 button for chart01 to verify hide characterstic status")
	public void user_click_on_save9_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart9();

	}

	@Then("user fetch the status09 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status09_of_the_page_to_verify_to_verify_avg_run_down_status() {
tc.getText09();

	}

	//
	@Then("user click on time10 inputfield to verify Avg Trend Down status")
	public void user_click_on_time10_inputfield_to_verify_avg_trend_down_status() {
tc.time10();

	}

	@Then("user enters subgroup size91 to verify hide characterstic status")
	public void user_enters_subgroup_size91_to_verify_avg_run_down_status() {

tc.defectsub91();
	}

	@Then("user enters subgroup size92 to verify hide characterstic status")
	public void user_enters_subgroup_size92_to_verify_avg_run_down_status() {
tc.defectsub92();

	}

	@Then("user enters subgroup size93 to verify hide characterstic status")
	public void user_enters_subgroup_size93_to_verify_avg_run_down_status() {

tc.defectsub93();
	}

	@Then("user enters subgroup size94 to verify hide characterstic status")
	public void user_enters_subgroup_size94_to_verify_avg_run_down_status() {
tc.defectsub94();

	}

	@Then("user click on save10 button for chart01 to verify hide characterstic status")
	public void user_click_on_save10_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart10();

	}

	@Then("user fetch the status10 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status10_of_the_page_to_verify_to_verify_avg_run_down_status() {
tc.getText10();

	}

	@Then("user click on time11 inputfield to verify Avg Trend Down status")
	public void user_click_on_time11_inputfield_to_verify_avg_trend_down_status() {
tc.time11();

	}

	@Then("user enters subgroup size111 to verify hide characterstic status")
	public void user_enters_subgroup_size111_to_verify_avg_run_down_status() {

tc.defectsub111();
	}

	@Then("user enters subgroup size112 to verify hide characterstic status")
	public void user_enters_subgroup_size112_to_verify_avg_run_down_status() {
tc.defectsub112();

	}

	@Then("user enters subgroup size113 to verify hide characterstic status")
	public void user_enters_subgroup_size113_to_verify_avg_run_down_status() {
tc.defectsub113();

	}

	@Then("user enters subgroup size114 to verify hide characterstic status")
	public void user_enters_subgroup_size114_to_verify_avg_run_down_status() {
tc.defectsub114();

	}

	@Then("user click on save11 button for chart01 to verify hide characterstic status")
	public void user_click_on_save11_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart11();

	}

	@Then("user fetch the status11 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status11_of_the_page_to_verify_to_verify_avg_run_down_status() {

tc.getText11();
	}

	@Then("user click on time12 inputfield to verify Avg Trend Down status")
	public void user_click_on_time12_inputfield_to_verify_avg_trend_down_status() {
tc.time12();

	}

	@Then("user enters subgroup size121 to verify hide characterstic status")
	public void user_enters_subgroup_size121_to_verify_avg_run_down_status() {

tc.defectsub121();
	}

	@Then("user enters subgroup size122 to verify hide characterstic status")
	public void user_enters_subgroup_size122_to_verify_avg_run_down_status() {

tc.defectsub122();
	}

	@Then("user enters subgroup size123 to verify hide characterstic status")
	public void user_enters_subgroup_size123_to_verify_avg_run_down_status() {
tc.defectsub123();

	}

	@Then("user enters subgroup size124 to verify hide characterstic status")
	public void user_enters_subgroup_size124_to_verify_avg_run_down_status() {

tc.defectsub124();
	}

	@Then("user click on save12 button for chart01 to verify hide characterstic status")
	public void user_click_on_save12_button_for_chart01_to_verify_avg_run_down_status() {
tc.savechart12();

	}

	@Then("user clicks on cancel button to verify hide characterstic status")
	public void user_clicks_on_cancel_button_to_verify_avg_run_down_status() {

tc.cancel();
	}

	@Then("user fetch the status12 of the page to verify to verify hide characterstic status")
	public void user_fetch_the_status12_of_the_page_to_verify_to_verify_avg_run_down_status() {
tc.getText12();

	}
}
