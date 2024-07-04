package com.cucumber.stepdefinitions;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import com.cucumber.pages.AmendOrder;
import com.cucumber.pages.GoodwillPage;
import com.cucumber.pages.ReportsPage;
import com.cucumber.pages.SplitPage;
import com.cucumber.pages.VisitBreakDownPage;
import com.cucumber.pages.Workflow;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class GoodwillStepDefs extends Genericfunction {
	GoodwillPage  goodwillpage = new GoodwillPage();
	
	Map<String, String> map = new HashMap<>();
	VisitBreakDownPage visitBreakDown = new VisitBreakDownPage();
	Map<String, String> itemMap = new HashMap<>();
	String path = System.getProperty("user.dir");
	String excelFilePath = path+"\\src\\test\\resources\\TestData\\SplitData.xlsx";
	String value2;
	String value1;
	String OrderID;
	String custname;
	Map<String, String> Order_data;
	ReportsPage reportspage = new ReportsPage();
	Workflow workflowpage = new Workflow();
	//Order_data = new HashMap<String, String>();
	
	@Then("^User should able to validate the workflow table$")
	public void User_should_able_to_validate_multiple_visit_and_status() throws Throwable {
		Thread.sleep(4000);
		goodwillpage.verify_In_workflow_to_be_sent(value1,value2);				
	}
	
	
	@And("^User click on contact management tab$")
	public void clickonsummary() throws Throwable {
		clickOnElement(WebElements.contactmanagementTab);
			
	}
	
	@And("^User navigate to summary tab to get the required data$")
	public void User_navigate_to_summary_tab() throws ParseException {
		
		Order_data = goodwillpage.DataStore_for_workflow_validation(Order_data);
		
	}
	
	@Then("^User validate if the data provided is valid$")
	public void User_navigate_to_summary_tab_and_validate_data() throws ParseException {
		workflowpage.validate_the_data_is_valid(Order_data);
	}
	
	
	
	@And("^User click on new thread button$")
	public void clickonnewthread() throws Throwable {
		Thread.sleep(3500);
		clickOnElement(WebElements.newthread);
			
	}
	
	@And("^User create a new thread$")
	public void createanewthread() throws Throwable {
		childwindow();
		goodwillpage.create_a_new_thread();
	     		
	}
	
	
	
	@And("^User input the primary reason (.*) and secondary reason (.*)$")
	public void primary_and_secondary_reasons(String pri_reason,String sec_reason) throws Throwable {
		goodwillpage.primary_and_secondary_reasons(pri_reason,sec_reason);
	     		
	}
	
	@And("^User input fields primary responsibility (.*) ,store (.*) and payment (.*) in thread$")
	public void fields_in_thread(String reason,String store,String payment) throws Throwable {
		goodwillpage.fields_in_thread(reason,payment,store);
	     		
	}
	
	@And("^User click on payment authorization$")
	public void clickonpaymentauth() throws Throwable {
		childwindow();	
		Thread.sleep(3500);
		clickOnElement(WebElements.payement_authorization);
		
	}
	
	@And("^User double click goodwill after thread$")
	public void double_click_goodwill_after_thread() throws Throwable {
		goodwillpage.double_click_goodwill_after_thread();		
	}
	
	@And("^User accept payment intilized$")
	public void accept_payment() throws Throwable {
		goodwillpage.accept_the_payment();
	}
	
	@And("^User click on contact management tab again$")
	public void clickoncontactmanagement() throws Throwable {
		switchframe();
		clickOnElement(WebElements.contactmanagementTab);			
	}
	
	@And("^User rejects payment intilized$")
	public void rejects_payment() throws Throwable {
		goodwillpage.reject_the_payment();
	}
	@And("^User back to visit breakdown screen$")
	public void back_to_visit_breakdown_screen() throws Throwable {
		goodwillpage.back_to_visit_breakdown_screen();
	}
	
	@And("^User click on resolve the contact$")
	public void resolve_contact() throws Throwable {
		goodwillpage.resolve_contact();
	}
	
	@And("^User navigate to workflow through order manager$")
	public void user_able_click_on_order_manager_from_main_menu_bar() throws Throwable {
		goodwillpage.user_able_click_on_order_manager_from_main_menu_bar();
	}
	
	@And("^User navigate to workflow through order manager directly$")
	public void user_able_click_on_order_manager_from_main_menu_bar_directly() throws Throwable {
		goodwillpage.user_able_click_on_order_manager_from_main_menu_bar_directly();
	}
	
	
	
	@And("^User create a customer in HDX$")
	public void create_customer() throws Throwable {
		goodwillpage.create_customer();
	}
	
	@Then("^User double click on goodwill to sent for verification$")
	public void double_click_goodwill_to_sent() throws Throwable {
		goodwillpage.double_click_goodwill_to_sent();
	}
	
	@And("^User create a new thread customer$")
	public void createanewthreadcustomer() throws Throwable {
		childwindow();
		goodwillpage.create_a_new_thread_customer();
	     		
	}
	
	@And("^User navigate to page and double click on Short on Allocation – High Priority$")
	public void double_click_short_on_allocation() throws Throwable {
		goodwillpage.double_click_short_on_allocation_high_priority();
	}
	
	@Then("^User double click on goodwill to sent for authorization$")
	public void double_click_goodwill_to_authorized() throws Throwable {
		goodwillpage.double_click_goodwill_to_authorized();
	}
	
	@Then("^User validate the goodwill details for ordercode and custname (.*)$")
	public void validation_for_goodwill_sent(String custname) throws Throwable {
		OrderID=AmendOrderStepDefs.return_order_id();
		System.out.println("The Order ID we retrived here : " + OrderID);
		goodwillpage.verify_In_workflow_to_be_sentagain(OrderID,custname);
	}
	
//	@Then("^User validate the goodwill details for auth with ordercode$")
//	public void validation_for_goodwill_sent_auth() throws Throwable {
//		OrderID=AmendOrderStepDefs.return_order_id();
//		System.out.println("The Order ID we retrived here : " + OrderID);
//		goodwillpage.verify_In_workflow_to_be_auth(OrderID);
//	}
	
	@Then("^User validate the goodwill details for authentication$")
	public void validation_for_goodwill_sent_author() throws Throwable {
		OrderID=AmendOrderStepDefs.return_order_id();
		System.out.println("The Order ID we retrived here : " + OrderID);
	//	goodwillpage.verify_In_workflow_to_be_sent(OrderID,custname);
		workflowpage.verify_In_workflow_table(Order_data);
	}
	
	
	@Then("^User validate the goodwill details for authentication for rejected$")
	public void validation_for_goodwill_sent_author_rejected() throws Throwable {
		OrderID=AmendOrderStepDefs.return_order_id();
		System.out.println("The Order ID we retrived here : " + OrderID);
	//	goodwillpage.verify_In_workflow_to_be_sent(OrderID,custname);
		goodwillpage.verify_In_workflow_table_failed(Order_data);
	}
	

	
	@Then("^User validate the goodwill details for created customer$")
	public void validation_for_goodwill_sent_authorization() throws Throwable {
		custname=goodwillpage.return_cust_name();
		System.out.println("The Cust name we retrived here : " + custname);
		goodwillpage.verify_customer(custname);
	}
	
	
	
	@Then("^User validate the short on allocation high priority details for ordercode (.*) and custname (.*)$")
	public void validate_short_on_allocation_high_priority(String OrderID, String custname) throws Throwable {
		goodwillpage.validate_short_on_allocation_high_priority(OrderID,custname);
	}

	@Then("^User validate the supply chain leg history for status (.*) and reason (.*)$")
	public void validate_leg_history(String OrderID, String custname) throws Throwable {
		goodwillpage.validate_leg_history(OrderID,custname);
	}
	
	
}
