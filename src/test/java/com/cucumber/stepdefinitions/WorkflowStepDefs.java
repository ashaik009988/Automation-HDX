package com.cucumber.stepdefinitions;

import java.text.ParseException;
import java.util.HashMap;

import com.cucumber.pages.Workflow;

import GenericFunction.Genericfunction;
import GenericFunction.ScreenshotUtils;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkflowStepDefs extends Genericfunction{
	
	Workflow workflowpage = new Workflow();
	
	
	@When("^User click on the order manager tab from main menu and navigate to workflow$")
	public void user_able_click_on_order_manager_from_main_menu_bar() throws Throwable {		
		workflowpage.user_able_click_on_order_manager_from_main_menu_bar();
	}
	
	
	@Then("^User double click on Failed Pick/Despatch - High Priority$")
	public void double_click_fail_pick_despatch_high_priority() throws Throwable {
		workflowpage.double_click_fail_pick_despatch_high_priority();
	}
	
	@And("^User double click on awaiting carrier debrief$")
	public void double_click_awaiting_carrier_debrief() throws Throwable {
		workflowpage.double_click_awaiting_carrier_debrief();
	}
	
	@And("^User double click on short on Allocation - High Priority$")
	public void double_click_ashort_on_allocation_high_priority() throws Throwable {
		workflowpage.double_click_short_on_allocation_high_priority();
	}

	@And("^User double click on Collection exception - Full failure$")
	public void double_click_collection_excep_full_failure() throws Throwable {
		workflowpage.double_click_collection_excep_full_failure();
	}
	
	@And("^User double click on Collection exception - Partial failure$")
	public void double_click_collection_excep_par_failure() throws Throwable {
		workflowpage.double_click_collection_excep_par_failure();
	}
	
	@And("^User double click on Delivery exception - Partial failure$")
	public void double_click_delivery_excep_par_failure() throws Throwable {
		workflowpage.double_click_delivery_excep_par_failure();
	}
	
	@And("^User double click on Delivery exception - Full failure$")
	public void double_click_delivery_excep_full_failure() throws Throwable {
		workflowpage.double_click_delivery_excep_full_failure();
	}
	
	@And("^User double click on awaiting parcel pack$")
	public void double_click_awaiting_parcel_pack() throws Throwable {
		workflowpage.double_click_awaiting_parcel_pack();
	}
	
	@When("^User click on the tools tab from main menu and navigate to Product Enquiry$")
	public void user_able_click_on_product_enquiry_from_main_menu_bar() throws Throwable {		
		workflowpage.user_able_click_on_product_enquiry_from_main_menu_bar();
	
	}

	@When("User click on the tools tab from main menu and navigate to geosearch code")
	public void user_click_on_the_tools_tab_from_main_menu_and_navigate_to_geosearch_code() throws Throwable {
		workflowpage.user_able_click_on_product_enquiry_from_main_menu_ba_geosearch();

	}
	
	
	@And("^User provide the search input (.*) and select the (.*) option$")
	public void select_the_filter_and_provide_required_input(String search, String option) throws Throwable {		
		workflowpage.select_the_filter_and_provide_required_input(search,option);

	}
	
	@And("^User provide the search client (.*) and select the (.*) filetype$")
	public void select_the_filter_and_provide_required_input_upload(String search, String option) throws Throwable {		
		workflowpage.select_the_filter_and_provide_required_input_upload(search,option);
	}
	@And("User provides enters the geo {string} and click on search")
	public void user_provides_geo_location_code( String string) throws Throwable {
		workflowpage.entering_the_geo_code(string);
	}
	
	@Then("^User validate the results after the Enquiry with valid data$")
	public void verify_In_product_enquiry_table() throws Throwable {		
		workflowpage.verify_In_product_enquiry_table();
	}

	@Then("^User validate the results after the Enquiry with valid data for geo location$")
	public void verify_In_product_enquiry_table_geo_location() throws Throwable {
		workflowpage.verify_In_product_enquiry_table_for_geo_location();
	}
	

	@Then("^User validate the results after the Enquiry with invalid data$")
	public void verify_In_product_enquiry_table_invalid_data() throws Throwable {		
		workflowpage.verify_In_product_enquiry_table_invalid_data();

	}
	
	@When("^User click on the maintenance tab from main menu and navigate to Upload$")
	public void user_able_click_on_upload_from_main_menu_bar() throws Throwable {		
		workflowpage.user_able_click_on_upload_from_main_menu_bar();

	}
	
	@Then("User should see the status as expected for the above filetype")
	public void verify_status_in_upload() throws InterruptedException {
		workflowpage.verify_status_in_upload();

	}
	
}
