package com.cucumber.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import GenericFunction.WebElements;
import com.cucumber.pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.gherkin.model.Scenario;

import GenericFunction.Genericfunction;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Scenario.*;
import io.restassured.response.Response;

public class CreateOrderStepDefs extends Genericfunction {

	CreateOrderPage createOrder = new CreateOrderPage();
	CreateOrder createOrders = new CreateOrder();
	AmendOrder amendorders = new AmendOrder();
	Workflow workflowpage = new Workflow();
	RemedialsPage remidialPage = new RemedialsPage();
	Response response;
	Map<String, String> orderMap;
	Map<String, String> skuMap;
	String Orderid;
	private static final Logger logger = LogManager.getLogger(CreateOrderStepDefs.class);
	public static WebDriver driver;
	String path = System.getProperty("user.dir");
	String excelFilePath = path + "\\src\\test\\resources\\TestData\\DatingData.xlsx";

	@When("^run the cmd commands to create order$")
	public void run_the_cmd_commands_to_create_order() throws InterruptedException {
		createOrder.runCommands();
	}

	@Given("^User have an Excel containing order datas in sheet (.*) , with columnnames (.*) and (.*)$")
	public void iHaveamendordersAnExcelFileContainingOrderData(String sheetname, String column1name, String column2name)
			throws InterruptedException, IOException {

		orderMap = amendorders.DataMap(excelFilePath, sheetname, column1name, column2name);

	}

	@When("User send request to create an order")
	public void iSendARequestToCreateAnOrder() {

		response = createOrders.sendApiRequest(orderMap);

	}

	@Then("order should be successfully created")
	public void theOrderShouldBeSuccessfullyCreated() {

		Orderid = createOrders.validations(response);
	}

	@And("User pass the orderid in searchbox")
	public void send_order_id_in_searchbox() throws InterruptedException {

		 createOrders.searchorderid(Orderid);
		//createOrders.searchorderid("802177-8804-V");
		createOrders.switchframehere();
	}

	@Then("^User Validate (.*) and (.*) for the searched order in Visit Breakdown$")
	public void uservalidatestheiutput1(String itemDetail, String status) throws InterruptedException {
		//createOrders.validateorderdetails(itemDetail, status);
		workflowpage.verify_In_visit_breakdown_for_visit_and_status(itemDetail, status);
	}

	@Then("^User Validate date field$")
	public void uservalidatesdate() throws InterruptedException {
		// createOrders.validateorderdetails(itemDetail,status);
		createOrders.validatedatefield();
	}

	@Then("^User Validate Visittypes (.*)$")
	public void uservalidatesvisittypes(ArrayList<String> visittypes) throws Exception {
		// ArrayList<String> visittypes = new ArrayList<>();
		currentScenario.embed(takeScreenshot(driver), "image/png");
		createOrders.validatevisittypes(visittypes);
	}

	@Then("^User validate the skus from Expected and Actual results$")
	public void validateactualandexpectedskus() throws Exception {
		boolean isValid = createOrders.validateskumaps(orderMap, skuMap);

		if (isValid) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("All ProdCode and their SKU's are same in Expected and Actual Results");
			System.out.println("----------------------------------------------------------------------");
			Assert.assertTrue("All ProdCode and their SKU's are same in Expected and Actual Results", isValid);
		} else {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("CHECK AGAIN -ProdCode and their SKU's are different in Expected and Actual Results");
			System.out.println("------------------------------------------------------------------------------------");
			Assert.assertTrue("CHECK AGAIN -ProdCode and their SKU's are different in Expected and Actual Results",
					isValid);
		}

	}

	@Then("^User Validate date field after Dating$")
	public void uservalidatesdateafterdating() throws InterruptedException {
		createOrders.validatedatefieldafterDating();
	}

	@Then("^User get the skus in visit breakdown screen$")
	public void Verifying_the_skus_in_visit_breakdown_screen() throws Exception {
		skuMap = createOrders.validateskus();

	}

	@Then("^verify (.*) is disaplyed with values as (.*)$")
	public void verify_is_disaplyed_with_values_as(String value, ArrayList<String> valuesList) throws Throwable {
		// createNewProjObj.verifyValuesPopulated(value,valuesList);
	}

	@Then("^User exits from Browser$")
	public void user_exit_from_browser() throws InterruptedException {

		createOrders.quitdriver();
	}

	@Then("^User wait for amend$")
	public void user_wait_for_amend() throws InterruptedException {

		// Thread.sleep(300000);
		Thread.sleep(5000);
	}

	@Then("^User Validate (.*) and (.*) for row two$")
	public void uservalidatestheiutput2(String itemDetail, String status) throws InterruptedException {
		logger.info("validating the ItemDetail and Status");
		createOrders.validateorderdetails(itemDetail, status);
	}
	
	@And("^User navigate to Order Manager and click on Add Order$")
	public void user_able_click_on_order_manager_add_order_from_main_menu_bar() throws Throwable {
		createOrders.user_able_click_on_order_manager_add_order_from_main_menu_bar();
	}
	
	@And("^User provide Customer details to create an order in HDX$")
	public void create_customer_in_add_order() throws InterruptedException {
		createOrders.create_customer_in_add_order();
	}
	
	@And("^User provide invalid email input in Customer details to create an order in HDX$")
	public void create_customer_invalid_email() throws InterruptedException {
		createOrders.create_customer_invalid_email();
	}

	@When("User should able to click on the remedial button")
	public void User_should_able_to_click_on_the_remedial_button() throws InterruptedException {
		remidialPage.remidial_button_click();
	}

	@Then("User is able to Enter the Sku and click on search add sku and hit create visit")
	public void User_is_able_to_Enter_the_Sku_and_click_on_search_add_sku_and_hit_create_visit() throws InterruptedException {
		childwindow();
		sendkeys(WebElements.sku_code_Enter,"SX0001");
		sendkeys(WebElements.sku_code_Enter,Keys.ENTER);
		sendkeys(WebElements.sku_code_Enter1, Keys.ENTER);
		Thread.sleep(3000);
		remidialPage.remidial_reason_New_Settlement();
		createOrders.Answer_Functionality1();
		remidialPage.remidial_end_process();
	}
	@Then("User is able to Enter the Sku and click on search add sku and hit create visit without using a dummy sku")
	public void User_is_able_to_Enter_the_Sku_and_click_on_search_add_sku_and_hit_create_visit_without_using_a_dummy_sku() throws InterruptedException {
		childwindow();
		sendkeys(WebElements.sku_code_Enter,"SX0001");
		sendkeys(WebElements.sku_code_Enter,Keys.ENTER);
		sendkeys(WebElements.sku_code_Enter1, Keys.ENTER);
		Thread.sleep(3000);
		remidialPage.remidial_reason_New_Settlement();
		createOrders.Answer_Functionality2();
		remidialPage.remidial_end_process();
	}
}
