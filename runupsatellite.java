package stepdefinitions;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TestCase17Page;
import util.ConfigReader;
import util.ExtentReportManager;

public class runupsatellite {

	
	private TestCase17Page tc = new TestCase17Page(DriverFactory.getDriver());

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
	  
	
	
	
	
	
	

@When("user clicks on network icon to verify Avg Run Up  status")
public void user_clicks_on_network_icon_to_verify_avg_run_up_status() {
tc.network1();

}

@Then("user clicks on page name to edit to verify Avg Run Up status")
public void user_clicks_on_page_name_to_edit_to_verify_avg_run_up_status() {

tc.clickvaripage();
}

@Then("user clicks on edit icon to verify to verify Avg Run Up status")
public void user_clicks_on_edit_icon_to_verify_to_verify_avg_run_up_status() {
tc.editpencil();

}

@Then("user clicks on date input field to verify Avg Run Up status")
public void user_clicks_on_date_input_field_to_verify_avg_run_up_status() {
tc.date();

}

@Then("user clicks on time input field to verify Avg Run Up status")
public void user_clicks_on_time_input_field_to_verify_avg_run_up_status() {
tc.time();

}

@Then("user enters subgroup size1 to verify Avg Run Up status")
public void user_enters_subgroup_size1_to_verify_avg_run_up_status() {
tc.defectsub01();

}

@Then("user enters subgroup size2 to verify Avg Run Up status")
public void user_enters_subgroup_size2_to_verify_avg_run_up_status() {
	tc.defectsub01();

}

@Then("user enters subgroup size4 to verify Avg Run Up status")
public void user_enters_subgroup_size4_to_verify_avg_run_up_status() {
	tc.defectsub01();

}

@Then("user enters subgroup size5 to verify Avg Run Up status")
public void user_enters_subgroup_size5_to_verify_avg_run_up_status() {

	tc.defectsub01();
}

@Then("user enters total inspected value for subgroup size01 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size01_to_verify_avg_run_up_status() {

tc.total01();
}

@Then("user enters values in allow all parameter section to verify Avg Run Up status")
public void user_enters_values_in_allow_all_parameter_section_to_verify_avg_run_up_status() {


}

@Then("user click on save1 button for chart01 to verify Avg Run Up status")
public void user_click_on_save1_button_for_chart01_to_verify_avg_run_up_status() {
tc.savechart();

}

@Then("user fetch the status01 of the page to verify Avg Run Up status")
public void user_fetch_the_status01_of_the_page_to_verify_avg_run_up_status() {
tc.getText();

}

@Then("user click on time2 inputfield to verify Avg Run Up status")
public void user_click_on_time2_inputfield_to_verify_avg_run_up_status() {
tc.time2();

}

@Then("user enters subgroup size11 to verify Avg Run Up status")
public void user_enters_subgroup_size11_to_verify_avg_run_up_status() {

tc.defectsub11();
}

@Then("user enters subgroup size12 to verify Avg Run Up status")
public void user_enters_subgroup_size12_to_verify_avg_run_up_status() {
	tc.defectsub11();

}

@Then("user enters subgroup size13 to verify Avg Run Up status")
public void user_enters_subgroup_size13_to_verify_avg_run_up_status() {
	tc.defectsub11();

}

@Then("user enters subgroup size14 to verify Avg Run Up status")
public void user_enters_subgroup_size14_to_verify_avg_run_up_status() {

	tc.defectsub11();
}

@Then("user enetrs subgroup Size15 to verify Avg Run Up status")
public void user_enetrs_subgroup_size15_to_verify_avg_run_up_status() {
	tc.defectsub11();

}

@Then("user enters total inspected value for subgroup size02 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size02_to_verify_avg_run_up_status() {
tc.total02();

}

@Then("user click on save2 button for chart01 to verify Avg Run Up status")
public void user_click_on_save2_button_for_chart01_to_verify_avg_run_up_status() {

tc.Save02();
}

@Then("user fetch the status02 of the page to verify to verify Avg Run Up status")
public void user_fetch_the_status02_of_the_page_to_verify_to_verify_avg_run_up_status() {

tc.getText2();
}

@Then("user click on time3 inputfield to verify to verify Avg Run Up status")
public void user_click_on_time3_inputfield_to_verify_to_verify_avg_run_up_status() {

tc.time3();
}

@Then("user enters subgroup size21 to verify to verify Avg Run Up status")
public void user_enters_subgroup_size21_to_verify_to_verify_avg_run_up_status() {
tc.defectsub21();

}

@Then("user enters subgroup size22 to verify to verify Avg Run Up status")
public void user_enters_subgroup_size22_to_verify_to_verify_avg_run_up_status() {
	tc.defectsub21();

}

@Then("user enters subgroup size23 to verify to verify Avg Run Up status")
public void user_enters_subgroup_size23_to_verify_to_verify_avg_run_up_status() {
	tc.defectsub21();

}

@Then("user enters subgroup size24 to verify to verify Avg Run Up status")
public void user_enters_subgroup_size24_to_verify_to_verify_avg_run_up_status() {
	tc.defectsub21();

}

@Then("user enters subgroup size25 to verify to verify Avg Run Up status")
public void user_enters_subgroup_size25_to_verify_to_verify_avg_run_up_status() {

	tc.defectsub21();
}

@Then("user enters total inspected value for subgroup size03 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size03_to_verify_avg_run_up_status() {
tc.total03();

}

@Then("user click on save3 button for chart01 to verify Avg Run Up status")
public void user_click_on_save3_button_for_chart01_to_verify_avg_run_up_status() {
tc.Save03();

}

@Then("user fetch the status03 of the page  to verify Avg Run Up status")
public void user_fetch_the_status03_of_the_page_to_verify_avg_run_up_status() {
tc.getText3();

}

@Then("user click on time4 inputfield to verify Avg Run Up status")
public void user_click_on_time4_inputfield_to_verify_avg_run_up_status() {
tc.time4();

}

@Then("user enters subgroup size31 to verify Avg Run Up status")
public void user_enters_subgroup_size31_to_verify_avg_run_up_status() {
tc.defectsub31();

}

@Then("user enters subgroup size32 to verify Avg Run Up status")
public void user_enters_subgroup_size32_to_verify_avg_run_up_status() {
	tc.defectsub31();

}

@Then("user enters subgroup size33 to verify Avg Run Up status")
public void user_enters_subgroup_size33_to_verify_avg_run_up_status() {
	tc.defectsub31();

}

@Then("user enters subgroup size34 to verify Avg Run Up status")
public void user_enters_subgroup_size34_to_verify_avg_run_up_status() {
	tc.defectsub31();

}

@Then("user enters subgroup size35 to verify Avg Run Up status")
public void user_enters_subgroup_size35_to_verify_avg_run_up_status() {
	tc.defectsub31();

}

@Then("user enters total inspected value for subgroup size04 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size04_to_verify_avg_run_up_status() {


}

@Then("user click on save4 button for chart01 to verify Avg Run Up status")
public void user_click_on_save4_button_for_chart01_to_verify_avg_run_up_status() {
tc.total04();

}

@Then("user fetch the status04 of the page to verify to verify Avg Run Up status")
public void user_fetch_the_status04_of_the_page_to_verify_to_verify_avg_run_up_status() {
tc.getText4();

}

@Then("user click on time5 inputfield to verify Avg Run Up status")
public void user_click_on_time5_inputfield_to_verify_avg_run_up_status() {
tc.time5();

}

@Then("user enters subgroup size41 to verify Avg Run Up status")
public void user_enters_subgroup_size41_to_verify_avg_run_up_status() {
tc.defectsub41();

}

@Then("user enters subgroup size42 to verify Avg Run Up status")
public void user_enters_subgroup_size42_to_verify_avg_run_up_status() {
	tc.defectsub43();

}

@Then("user enters subgroup size43 to verify Avg Run Up status")
public void user_enters_subgroup_size43_to_verify_avg_run_up_status() {
	tc.defectsub41();

}

@Then("user enters subgroup size44 to verify Avg Run Up status")
public void user_enters_subgroup_size44_to_verify_avg_run_up_status() {
	tc.defectsub41();

}

@Then("user enters total inspected value for subgroup size05 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size05_to_verify_avg_run_up_status() {

tc.total05();
}

@Then("user click on save5 button for chart01 to verify Avg Run Up status")
public void user_click_on_save5_button_for_chart01_to_verify_avg_run_up_status() {
tc.Save05();

}

@Then("user fetch the status05 of the page to verify Avg Run Up status")
public void user_fetch_the_status05_of_the_page_to_verify_avg_run_up_status() {
tc.getText5();

}

@Then("user click on time6 inputfield to verify Avg Trend Up status")
public void user_click_on_time6_inputfield_to_verify_avg_trend_up_status() {
tc.time5();

}

@Then("user enters subgroup size51 to verify Avg Run Up status")
public void user_enters_subgroup_size51_to_verify_avg_run_up_status() {
tc.defectsub51();

}

@Then("user enters subgroup size52 to verify Avg Run Up status")
public void user_enters_subgroup_size52_to_verify_avg_run_up_status() {
tc.defectsub52();

}

@Then("user enters subgroup size53 to verify Avg Run Up status")
public void user_enters_subgroup_size53_to_verify_avg_run_up_status() {
	tc.defectsub53();

}

@Then("user enters subgroup size54 to verify Avg Run Up status")
public void user_enters_subgroup_size54_to_verify_avg_run_up_status() {
	tc.defectsub54();

}

@Then("user enters total inspected value for subgroup size06 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size06_to_verify_avg_run_up_status() {
tc.total06();

}

@Then("user click on save6 button for chart01 to verify Avg Run Up status")
public void user_click_on_save6_button_for_chart01_to_verify_avg_run_up_status() {
tc.savechart6();

}

@Then("user fetch the status06 of the page to verify to verify Avg Run Up status")
public void user_fetch_the_status06_of_the_page_to_verify_to_verify_avg_run_up_status() {
tc.getText6();

}

@Then("user click on time7 inputfield to verify Avg Run Up status")
public void user_click_on_time7_inputfield_to_verify_avg_run_up_status() {
tc.time7();

}

@Then("user enters subgroup size61 to verify Avg Run Up status")
public void user_enters_subgroup_size61_to_verify_avg_run_up_status() {
tc.defectsub61();

}

@Then("user enters subgroup size63 to verify Avg Run Up status")
public void user_enters_subgroup_size63_to_verify_avg_run_up_status() {
	tc.defectsub63();

}

@Then("user enters subgroup size64 to verify Avg Run Up status")
public void user_enters_subgroup_size64_to_verify_avg_run_up_status() {
	tc.defectsub64();

}

@Then("user enters subgroup size65 to verify Avg Run Up status")
public void user_enters_subgroup_size65_to_verify_avg_run_up_status() {
	tc.defectsub65();

}

@Then("user enters total inspected value for subgroup size07 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size07_to_verify_avg_run_up_status() {
tc.total07();

}

@Then("user click on save7 button for chart01 to verify Avg Run Up status")
public void user_click_on_save7_button_for_chart01_to_verify_avg_run_up_status() {
tc.savechart7();

}

@Then("user fetch the status07 of the page to verify Avg Run Up status")
public void user_fetch_the_status07_of_the_page_to_verify_avg_run_up_status() {

tc.getText7();
}

@Then("user click on time8 inputfield to verify Avg Trend Up status")
public void user_click_on_time8_inputfield_to_verify_avg_trend_up_status() {
tc.time8();

}

@Then("user enters subgroup size71 to verify Avg Run Up status")
public void user_enters_subgroup_size71_to_verify_avg_run_up_status() {
	tc.defectsub71();

}

@Then("user enters subgroup size72 to verify Avg Run Up status")
public void user_enters_subgroup_size72_to_verify_avg_run_up_status() {
	tc.defectsub72();

}

@Then("user enters subgroup size73 to verify Avg Run Up status")
public void user_enters_subgroup_size73_to_verify_avg_run_up_status() {
	tc.defectsub73();

}

@Then("user enters subgroup size74 to verify Avg Run Up status")
public void user_enters_subgroup_size74_to_verify_avg_run_up_status() {
tc.defectsub74();

}

@Then("user enters total inspected value for subgroup size08 to verify Avg Run Up status")
public void user_enters_total_inspected_value_for_subgroup_size08_to_verify_avg_run_up_status() {

tc.total08();
}

@Then("user click on save8 button for chart01 to verify Avg Run Up status")
public void user_click_on_save8_button_for_chart01_to_verify_avg_run_up_status() {
tc.savechart8();

}

@Then("user clicks on cancel button to verify Avg Run Up status")
public void user_clicks_on_cancel_button_to_verify_avg_run_up_status() {


}

@Then("user fetch the status08 of the page to verify to verify Avg Run Up status")
public void user_fetch_the_status08_of_the_page_to_verify_to_verify_avg_run_up_status() {

tc.getText8();
}

	
}
