package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import com.cucumber.pages.AmendOrder;
import com.cucumber.pages.CreateOrder;
import com.cucumber.pages.ReportsPage;
import com.cucumber.pages.Workflow;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class ReportsStepDefs extends Genericfunction {
	ReportsPage reportspage = new ReportsPage();
	CreateOrder createOrders = new CreateOrder();
	AmendOrder amendorders = new AmendOrder();
	Workflow workflowpage = new Workflow();
	Map<String, String> Order_data;

	@When("^User should be able to go reports$")
	public void User_should_be_able_to_go_reports() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore(Order_data);
		System.out.println(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports for call on preview$")
	public void User_should_be_able_to_go_reportscall_on_preview() throws ParseException {
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports searching  for Order received report$")
	public void User_should_be_able_to_go_reports_order_received_report() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("User should be able to go reports for Goodwill payment report")
	public void user_should_be_able_to_go_reports_for_goodwill_payment_report() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore_for_goodwill(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("User should be able to go reports for Delivery Information by day report")
	public void user_should_be_able_to_go_reports_for_delivery_information_by_day_report() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports for Emergency Orders For Routing Report$")
	public void User_should_be_able_to_go_reports_Emergency_Orders_For_Routing_Report() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports for searching TBA report$")
	public void User_should_be_able_to_go_reports_for_tba_report() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports for Substitutions Report$")
	public void User_should_be_able_to_go_reports_for_Substitutions_Report()
			throws ParseException, InterruptedException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore_for_substitution_report(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@When("^User should be able to go reports for items to follow$")
	public void User_should_be_able_to_go_reports_items_fllow() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore_for_items_to_follow(Order_data);
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@Then("^User should be able to select the Confirmed Delivery report$")
	public void User_should_be_able_to_select_the_Confirmed_Delivery_report() {
		clickOnElement(WebElements.confirm_Delhivery_Report);
	}

	@Then("^User should be able to select the Emergency Orders For Routing Report$")
	public void User_should_be_able_to_select_the_Emergency_Orders_For_Routing_Report() {
		clickOnElement(WebElements.Emergency_Orders_For_Routing_Report);
	}

	@Then("^User should be able to select the Delivery Information by day report$")
	public void User_should_be_able_to_select_the_Delivery_Information_by_day_report() {
		clickOnElement(WebElements.Delivery_Information_By_Day);
	}

	@Then("^User should be able to select the Substitutions Report$")
	public void User_should_be_able_to_select_the_Substitutions_Report() {
		clickOnElement(WebElements.Substitutions_Report);
	}

	@Then("^User should be able to select the Goodwill payment report$")
	public void User_should_be_able_to_select_the_Goodwill_payment_report() {
		clickOnElement(WebElements.Goodwill_Payments_Report);
	}

	@Then("^User should be able to select the for TBA report$")
	public void User_should_be_able_to_select_the_tba_report() {
		clickOnElement(WebElements.TBA_Report);
	}

	@Then("^User should be able to select the items To Follow$")
	public void User_should_be_able_to_select_the_items_To_Follow() {
		clickOnElement(WebElements.Items_To_Follow_Report);
	}

	@Then("^User should be able to select the Order received report$")
	public void User_should_be_able_to_select_the_order_received_report() {
		clickOnElement(WebElements.order_received_report);
	}

	@Then("^User should  be able to filter the date for confirmed delihvery$")
	public void User_should_be_able_to_filter_the_date_for_confirmed_delihvery() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("User should  be able to filter the date for Substitutions Report")
	public void user_should_be_able_to_filter_the_date_for_substitutions_report() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("User should  be able to filter the date for Goodwill payment report")
	public void user_should_be_able_to_filter_the_date_for_goodwill_payment_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("User should  be able to filter the date for Emergency Orders For Routing Report")
	public void user_should_be_able_to_filter_the_date_for_Emergency_Orders_For_Routing() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("visit date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("^User should  be able to filter the date for Delivery Information by day report$")
	public void User_should_be_able_to_filter_the_date_for_Delivery_Information_by_day_report()
			throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("^User should  be able to filter the date for Order received report$")
	public void User_should_be_able_to_filter_the_date_for_order_received_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("^User should  be able to filter for TBA report$")
	public void User_should_be_able_to_filter_the_date_for_tba_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		clickOnElement(WebElements.report_view_button);
	}

	@Then("^User should  be able to filter the date for items To Follow$")
	public void User_should_be_able_to_filter_the_date_for_items_To_Follow()
			throws InterruptedException, ParseException {
		reportspage.Frameswitching_for_date_table();
		Select objSelect = new Select(driver.findElement(By.id("p_vcOutbase")));
		objSelect.selectByVisibleText(Order_data.get("outbase value"));
		System.out.println(date_formatter_items_to_follow(Order_data.get("ordered date")));
		reportspage.Month_and_year_selecting_function(date_formatter_items_to_follow(Order_data.get("ordered date")));
		clickOnElement(WebElements.report_view_button);
	}

	@Then("^Confirmed orders should be shown for confirmed delhivery$")
	public void Confirmed_orders_should_be_shown_for_confirmed_delhivery() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for Substitutions Report$")
	public void Confirmed_orders_should_be_shown_for_Substitutions_Report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for Emergency Orders For Routing Report$")
	public void Confirmed_orders_should_be_shown_for_Emergency_Orders() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for Goodwill payment report$")
	public void Confirmed_orders_should_be_shown_for_Goodwill_payment_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for Delivery Information by day report$")
	public void Confirmed_orders_should_be_shown_for_Delivery_Information_by_day_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for Order received report$")
	public void Confirmed_orders_should_be_shown_for_order_received_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for TBA report$")
	public void Confirmed_orders_should_be_shown_for_tba_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("^Confirmed orders should be shown for items To Follow$")
	public void Confirmed_orders_should_be_shown_for_items_To_Follow() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("WMS order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for confirmed delhivery")
	public void User_should_see_the_details_as_expected_for_confirmed_delhivery() {
		reportspage.Validating_confirm_delhivery(Order_data);
	}

	@Then("User passes the orderid {string} in searchbox for reporting")
	public void User_passes_the_orderid_in_searchbox_for_reporting(String s) throws InterruptedException {
		amendorders.searchorderids(s);
		createOrders.switchframehere();
		Thread.sleep(2000);
	}

	@Then("User should see the details as expected for TBA report")
	public void User_should_see_the_details_as_expected_for_tba_report() {
		reportspage.Validating_TBA_report(Order_data);
	}

	@Then("User should see the details as expected for items To Follow")
	public void User_should_see_the_details_as_expected_for_items_To_Follow() {
		reportspage.Validating_items_to_follow(Order_data);
	}

	@Then("User should see the details as expected for Order received report")
	public void User_should_see_the_details_as_expected_for_order_received_report() {
		reportspage.Validating_order_received_report(Order_data);
	}

	@Then("User should see the details as expected for Delivery Information by day report")
	public void User_should_see_the_details_as_expected_for_Delivery_Information_by_day_report() {
		reportspage.Validating_Delivery_Information_by_day_report(Order_data);
	}

	@Then("User should see the details as expected for Goodwill payment report")
	public void User_should_see_the_details_as_expected_for_Goodwill_payment_report() {
		reportspage.Validating_Goodwill_payment_report(Order_data);
	}

	@Then("User should see the details as expected for Emergency Orders For Routing Report")
	public void User_should_see_the_details_as_expected_for_Emergency_Orders_For_Routing() {
		reportspage.Validating_Emergency_Orders(Order_data);
	}

	@Then("User should see the details as expected for Substitutions Report")
	public void User_should_see_the_details_as_expected_for_Substitutions_Report() {
		reportspage.Validating_substution_report(Order_data);
	}

	@Then("User should able to validate the Customer (.*) , contact (.*) and order details are valid")
	public void User_should_able_to_validate_customer_contact_and_order_details(String cust, String contact) {
		reportspage.verify_In_visit_breakdown_for_mixed_order_with_status(cust, contact, Order_data);
	}

	@And("^User navigate to summary tab to get and validate the data$")
	public void User_navigate_to_summary_tab_and_validate_data() throws ParseException {
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore_for_items_to_follow(Order_data);

	}

	@And("^User navigate to summary tab to get the data$")
	public void User_navigate_to_summary_tab() throws ParseException {
		driver.switchTo().frame(0);
		Order_data = new HashMap<String, String>();
		Order_data = reportspage.DataStore_for_items_to_follow(Order_data);
		driver.switchTo().defaultContent();
	}

	@Then("User should see the details as expected for the above workflow")
	public void User_should_see_the_details_as_expected() throws InterruptedException {
		System.out.println(Order_data);
		workflowpage.verify_In_workflow_table(Order_data);

	}

	@When("User able able click on Go to Reports")
	public void user_able_able_click_on_go_to_reports() {
		clickOnElement(WebElements.Report_tab);
	}

	@Then("User able Select Orders in pipeline reports")
	public void user_able_select_orders_in_pipeline_reports() {
		clickOnElement(WebElements.Orders_In_Pipeline_report);
	}

	@Then("User able Select Units in pipeline reports")
	public void user_able_Select_Units_in_pipeline_pipeline_reports() {
		clickOnElement(WebElements.Units_In_Pipeline_report);
	}

	@Then("User able Select Order book")
	public void user_able_Order_book_reports() {
		clickOnElement(WebElements.OrderBook_report);
	}

	@When("User able to Filter the {string} and enter {string}")
	public void user_able_to_filter_the_and_enter(String string, String string2) throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(string);
		Select objSelect = new Select(findElement(WebElements.outbase3));
		objSelect.selectByVisibleText(string2);
	}

	@When("User able to Click on Search")
	public void user_able_to_click_on_search() {
		clickOnElement(WebElements.report_view_button);
	}

	@When("User able to Click on Search for order book")
	public void user_able_to_click_on_search_for_order_book() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		clickOnElement(WebElements.report_view_button);
	}

	@When("User able to Click on Search for report by week")
	public void user_able_to_click_on_search_for_report_by_week() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		clickOnElement(WebElements.report_view_button);
	}
	@Then("User able Select report by week")
	public void user_able_report_by_week() {
		clickOnElement(WebElements.OrderBookByWeek_report);
	}


	@Then("User should be able to select the Customer Notifications Report")
	public void user_should_be_able_to_select_the_customer_notifications_report() {
		clickOnElement(WebElements.Customer_Notifications_report);
	}
	@Then("User should  be able to filter the date for Customer Notifications Report")
	public void user_should_be_able_to_filter_the_date_for_customer_notifications_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);

	}
	@Then("Confirmed orders should be shown for Customer Notifications Report")
	public void confirmed_orders_should_be_shown_for_customer_notifications_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}
	@Then("User should see the details as expected for Customer Notifications Report")
	public void user_should_see_the_details_as_expected_for_customer_notifications_report() {
		reportspage.Validating_Customer_Notifications(Order_data);
	}


	@Then("User should be able to select the Line Walk Report")
	public void user_should_be_able_to_select_the_line_walk_report() {
		clickOnElement(WebElements.Line_Walk_Report_report);
	}

	@Then("User should  be able to filter the date for Line Walk Report")
	public void user_should_be_able_to_filter_the_date_for_line_walk_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("visit date"));
		clickOnElement(WebElements.report_view_button);

	}

	@Then("Confirmed orders should be shown for Line Walk Report")
	public void confirmed_orders_should_be_shown_for_line_walk_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("WMS order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for Line Walk Report")
	public void user_should_see_the_details_as_expected_for_line_walk_report() {
		reportspage.Validating_Line_Walk(Order_data);
	}

	@Then("User should be able to select the Spares report")
	public void user_should_be_able_to_select_the_spares_report() {
		clickOnElement(WebElements.SparesReport_report);
	}

	@Then("User should  be able to filter the date for Spares report")
	public void user_should_be_able_to_filter_the_date_for_spares_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));
		clickOnElement(WebElements.report_view_button);

	}

	@Then("Confirmed orders should be shown for Spares report")
	public void confirmed_orders_should_be_shown_for_spares_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for Spares report")
	public void user_should_see_the_details_as_expected_for_spares_report() {
		reportspage.Validating_Spares_walk(Order_data);
	}

	@Then("User should be able to select the Catch all preview report New Report.")
	public void user_should_be_able_to_select_the_catch_all_preview_report_new_report() {
		clickOnElement(WebElements.Catch_All_Preview_report);
	}


	@Then("User should  be able to filter the date for Catch all preview report New Report \"\"{int} January {int}\"\"  \"\"{int} January {int}\"\"  {string}.")
	public void user_should_be_able_to_filter_the_date_for_catch_all_preview_report_new_report_january_january(Integer int1, Integer int2, Integer int3, Integer int4, String string) throws InterruptedException {
		String Date1=int1+" "+string+" "+int2;
		String Date2=int3+" "+string+" "+int4;
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Date1);
		reportspage.Month_and_year_selecting_function2(Date2);
		clickOnElement(WebElements.report_view_button);
	}

	@Then("Confirmed orders should be shown for Catch all preview report New Report for {string}.")
	public void confirmed_orders_should_be_shown_for_catch_all_preview_report_new_report_for(String string) {
		reportspage.Frameswitching_for_grid_table();
		String order = string;
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + string + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for Catch all preview report New Report for {string}.")
	public void user_should_see_the_details_as_expected_for_catch_all_preview_report_new_report_for(String string) {
		reportspage.Validating_catch_all_preview(string);
	}




	@Then("User should be able to select the Workflow Queue Contents Report")
	public void user_should_be_able_to_select_the_workflow_queue_contents_report() {
		clickOnElement(WebElements.Workflow_Queue_Contents_Report);
	}

	@Then("User should  be able to filter the {string} and {string} in Workflow Queue Contents Report")
	public void user_should_be_able_to_filter_the_and_in_workflow_queue_contents_report(String string, String string2) throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		Select objSelect = new Select(findElement(WebElements.Workflow_Queue_Number));
		objSelect.selectByVisibleText(string);
		objSelect = new Select(findElement(WebElements.Workflow_Action_Number));
		objSelect.selectByVisibleText(string2);
		clickOnElement(WebElements.report_view_button);
	}

	@Then("Confirmed orders should be shown for Workflow Queue Contents Report")
	public void confirmed_orders_should_be_shown_for_workflow_queue_contents_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for Workflow Queue Contents Report")
	public void user_should_see_the_details_as_expected_for_workflow_queue_contents_report() {
		reportspage.Validating_Workflow_Queue_Contents_Report(Order_data);
	}
	@Then("User should be able to select the stock Movement Manifest report")
	public void user_should_be_able_to_select_the_stock_movement_manifest_report() {
		clickOnElement(WebElements.Stock_Movement_Manifest_report);
	}

	@Then("User should  be able to filter the Filter the date and {string} for stock Movement Manifest report")
	public void user_should_be_able_to_filter_the_filter_the_date_and_for_stock_movement_manifest_report(String string) throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("visit date"));
		Select objSelect = new Select(findElement(WebElements.outbase4));
		objSelect.selectByVisibleText(string);
		clickOnElement(WebElements.report_view_button);
	}

	@Then("Confirmed orders should be shown for stock Movement Manifest report")
	public void confirmed_orders_should_be_shown_for_stock_movement_manifest_report() {
		reportspage.Frameswitching_for_grid_table();
		//String order = Order_data.get("order code");
		//String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		//reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for stock Movement Manifest report")
	public void user_should_see_the_details_as_expected_for_stock_movement_manifest_report() {
		reportspage.Validating_stock_Movement_Manifest_Report(Order_data);
	}
	@Then("User should be able to select the delivery and collection report")
	public void user_should_be_able_to_select_the_delivery_and_collection_report() {
		clickOnElement(WebElements.DeliveryCollection_report);
	}

	@Then("User should be able to filter the date for delivery and collection report")
	public void user_should_be_able_to_filter_the_date_for_delivery_and_collection_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));

		clickOnElement(WebElements.report_view_button);

	}

	@Then("Confirmed orders should be shown for delivery and collection report")
	public void confirmed_orders_should_be_shown_for_delivery_and_collection_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for delivery and collection report")
	public void user_should_see_the_details_as_expected_for_delivery_and_collection_report() {
		reportspage.Validating_delivery_and_collection(Order_data);
	}

	@Then("User should be able to select the New Remedials Report")
	public void user_should_be_able_to_select_the_new_remedials_report() {
		clickOnElement(WebElements.New_Remedials_report);

	}

	@Then("User should be able to filter the date for New Remedials Report")
	public void user_should_be_able_to_filter_the_date_for_new_remedials_report() throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(Order_data.get("ordered date"));

		clickOnElement(WebElements.report_view_button);
	}

	@Then("Confirmed orders should be shown for New Remedials Report")
	public void confirmed_orders_should_be_shown_for_new_remedials_report() {
		reportspage.Frameswitching_for_grid_table();
		String order = Order_data.get("order code");
		String order_xapth = "//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']";
		reportspage.Scrolling_particular_order_in_table(order_xapth, order);
	}

	@Then("User should see the details as expected for New Remedials Report")
	public void user_should_see_the_details_as_expected_for_new_remedials_report() {
		reportspage.Validating_new_remedials(Order_data);
	}
	@When("User should be able to go reports for Remedials Report")
	public void user_should_be_able_to_go_reports_for_remedials_report() {
		driver.switchTo().defaultContent();
		clickOnElement(WebElements.Report_tab);
	}

	@Then("User should be able to select the Remedials Report")
	public void user_should_be_able_to_select_the_remedials_report() {
		clickOnElement(WebElements.Remedials_report);
	}

	@Then("User should  be able to filter the {string} for Remedials Report")
	public void user_should_be_able_to_filter_the_for_remedials_report(String string) throws InterruptedException {
		reportspage.Frameswitching_for_date_table();
		reportspage.Month_and_year_selecting_function(string);
		reportspage.Month_and_year_selecting_function2(string);
		clickOnElement(WebElements.report_view_button);
	}


	@Then("User should see the details as expected for Remedials Report for details {string} and {string}")
	public void user_should_see_the_details_as_expected_for_remedials_report_for_details_and(String string, String string2) {
		reportspage.Frameswitching_for_grid_table();
		reportspage.Validating_remedials_report(string,string2);
	}











}