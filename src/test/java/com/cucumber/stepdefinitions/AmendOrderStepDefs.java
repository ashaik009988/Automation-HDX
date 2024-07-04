package com.cucumber.stepdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cucumber.pages.AmendOrder;
import com.cucumber.pages.CreateOrder;
import com.cucumber.pages.CreateOrderPage;

import GenericFunction.Genericfunction;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Scenario.*;
import io.restassured.response.Response;

public class AmendOrderStepDefs extends Genericfunction {

	CreateOrder createOrders = new CreateOrder();
	AmendOrder amendorders = new AmendOrder();
	Response response;
	Map<String, String> orderMap;
	Map<String, String> cancelledskuMap;
	Map<String, String> neworderMap;
	Map<String, String> skuMap;
	Map<String, String> skuMapcancelled;
	static String Orderid;

	String path = System.getProperty("user.dir");
	String excelFilePath = path+"\\src\\test\\resources\\TestData\\CreateData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\RoutingData.xlsx";
//	String excelFilePath = path+"\\src\\test\\resources\\TestData\\SubstitutionData.xlsx";
//	String excelFilePath = path+"\\src\\test\\resources\\TestData\\SplitData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\OverrideData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\DebriefData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\SuspendData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\GoodwillData.xlsx";
	//String excelFilePath = path+"\\src\\test\\resources\\TestData\\PickReleaseData.xlsx";
	
	
	public static String return_order_id() {
		return Orderid;
	}
	

	@Given("^User have Excel file containing order datas in sheet (.*) , with columnnames (.*) and (.*)$")
	public void iHaveamendordersAnExcelFileContainingOrderData(String sheetname, String column1name, String column2name)
			throws InterruptedException, IOException {

		orderMap = amendorders.DataMap(excelFilePath,sheetname, column1name, column2name);

	}

	@Given("^User have Excel file containing Cancelled order datas in sheet (.*) , with columnnames (.*) and (.*)$")
	public void iHaveamendordersAnExcelFileContainingCancelledData(String sheetname, String column1name,
			String column2name) throws InterruptedException, IOException {

		cancelledskuMap = amendorders.DataMap(excelFilePath,sheetname, column1name, column2name);

	}

	@And("User passes the orderid in searchbox")
	public void send_order_id_in_searchbox() throws InterruptedException {
//		amendorders.searchorderids(Orderid);
		 Thread.sleep(3000);
		amendorders.searchorderids("808304-8804-V");
		createOrders.switchframehere();
		Thread.sleep(5000);
		

	}

	@And("User passes the orderid second time in searchbox")
	public void send_order_id_in_second_time_searchbox() throws InterruptedException {
		// amendorders.searchorderids(Orderid);
		driver.switchTo().defaultContent();
		amendorders.searchorderids2("808868-8804-V");
		createOrders.switchframehere();
		Thread.sleep(5000);


	}
	@And("User passes the order_id in searchbox with {string}")
	public void send_order_id_in_searchbox2(String string) throws InterruptedException {
		amendorders.searchorderids(string);
		Thread.sleep(3000);
		createOrders.switchframehere();


	}

	@Then("^User validates the skus from Expected and Actual results$")
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
	
	@And("^User passes the orderid (.*) in searchbox in HDX$")
	public void send_order_id_in_searchbox_manually(String orderidm) throws InterruptedException {
		 amendorders.searchorderids(orderidm);
		 Thread.sleep(2000);
		//amendorders.searchorderids("804324-8804-V");
		// createOrders.switchframehere();

	}

	@Then("^User validates the Cancelled skus from Expected and Actual results$")
	public void validateactualandexpectedcancelledskus() throws Exception {
		boolean isValid = createOrders.validateskumaps(cancelledskuMap, skuMapcancelled);

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

	@Then("^User will get the skus in visit breakdown screen for (.*) Order$")
	public void Verifying_the_skus_in_visit_breakdown_screen_amend(String ordertype) throws Exception {
		// skuMap = createOrders.validateskusamend();
		// skuMapcancelled = createOrders.validateskusamendcancelled();
		// skuMap = createOrders.validateskus();
		createOrders.visititems(ordertype);
		skuMap = createOrders.validateskusamend();
		skuMapcancelled = createOrders.validateskusamendcancelled();

	}
	
	@Then("^User expand the visit in visit breakdown screen for (.*) Order$")
	public void Clicking_the_visit_plus_in_visit_breakdown_screen_amend(String ordertype) throws Exception {
		
		createOrders.visititemsclick(ordertype);
	}
	
	

	@Then("^User will get the skus in visit breakdown screen$")
	public void Verifying_the_skus_in_visit_breakdown_screen() throws Exception {
		skuMap = createOrders.validateskus();

	}

	@When("User send request to create a new order")
	public void iSendARequestToCreateAnOrder() {

		// response = amendorders.sendApiRequestforamend(orderMap);
		response = amendorders.sendApiRequestforcreate(orderMap);

	}

	@When("User send request to amend an order")
	public void iSendARequestToAmendAnOrder() {

		response = amendorders.sendApiRequestforamend(orderMap);
		// amendorders.sendApiRequestforamend(orderMap);
	}

	@Then("orders should be successfully created in API")
	public void theOrderShouldBeSuccessfullyCreated() throws InterruptedException {

		Orderid = amendorders.validations(response);
		Thread.sleep(5000);

	}

	@Then("^order should be Amend successfully$")
	public void theOrderShouldBeSuccessfullyAmended() {

		Orderid = amendorders.validationsamend(response);

	}
	
	@And("^User provide Skus and Quantity$")
	public void Provide_sku_and_quantity() throws InterruptedException {
		createOrders.Provide_sku_and_quantity(orderMap);
	}

	@And("User provide Skus and Quantity with {string}")
	public void Provide_sku_and_quantity_with_notes(String string) throws InterruptedException {
		createOrders.Provide_sku_and_quantity_with_notes(orderMap,string);
	}
}
