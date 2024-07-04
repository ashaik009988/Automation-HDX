package com.cucumber.stepdefinitions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.cucumber.pages.AmendOrder;
import com.cucumber.pages.SplitPage;
import com.cucumber.pages.VisitBreakDownPage;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class SplitStepDefs extends Genericfunction{ 
	
	SplitPage  splitpage = new SplitPage();
	AmendOrder amendorders = new AmendOrder();
	Map<String, String> map = new HashMap<>();
	VisitBreakDownPage visitBreakDown = new VisitBreakDownPage();
	Map<String, String> itemMap = new HashMap<>();
	String path = System.getProperty("user.dir");
	String excelFilePath = path+"\\src\\test\\resources\\TestData\\SplitData.xlsx";
	
	

	@Then("^User should able to split the (.*) visit and check status (.*)$")
	public void User_should_able_to_split_the_visit_and_check_status(String item, String status) throws InterruptedException {
	    //checking the split visit button is enabled or not
	    boolean sp = button_enabled(WebElements.spilit);

	    //creating hash maps of skus
	    

	    //skus spiliting function
	    splitpage.skus_Spilit_Functionality(sp,map);

	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_Home_Page_Spilit_Is_Happend_With_Status(item, status);
	}
	 
	
	@Given("^User have an Excel containing order datas for split (.*) , with columnnames (.*) and (.*)$")
	public void iHaveamendordersAnExcelFileContainingOrderData(String sheetname, String column1name, String column2name)
			throws InterruptedException, IOException {

		  map = amendorders.DataMap(excelFilePath, sheetname, column1name, column2name);

	}
	@Given("^User have an Excel containing item details for validation (.*) , with columnnames (.*) and (.*)$")
	public void iHaveamendordersAnExcelFileContainingiteamdetails(String sheetname, String column1name, String column2name)
			throws InterruptedException, IOException {

		  itemMap = amendorders.DataMap(excelFilePath, sheetname, column1name, column2name);

	}
	
	@Then("^User should able to validate the visit (.*) and status (.*)$")
	public void User_should_able_to_validate_visit_and_check_status(String item, String status) throws InterruptedException {
	   
	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_Home_Page_Spilit_Is_Happend_With_Status(item, status);
	}

	
	@Then("^User should validate debrief the visit (.*) and status (.*)$")
	public void verify_In_Home_Page_debrief_With_Status(String item, String status) throws InterruptedException {
	   
	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_Home_Page_debrief_With_Status(item, status);
	}
	@Then("^User should cross validate debrief the visit (.*) and status (.*)$")
	public void verify_In_Home_Page_debrief_With_Status2(String item, String status) throws InterruptedException {

		//Verifying whether the spilit happend or not with status of the visit
		splitpage.verify_In_Home_Page_debrief_With_Status2(item, status);
	}

	@Then("^After override user should able to validate the visit (.*) and status (.*)$")
	public void verify_In_Home_Page_Override_Is_Happend_With_Status(String item, String status) throws InterruptedException {
	   
	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_Home_Page_Override_Is_Happend_With_Status(item, status);
	}
	
	@Then("^User validate the address after changing the address$")
	public void verify_In_Home_Page_Override_Is_Happend_With_Status() throws InterruptedException {
	   
	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_Home_Page_Override_Is_Happend_With_address();
	}
	
	@Then("^User should able to validate the visit and status$")
	public void User_should_able_to_validate_multiple_visit_and_status() throws Throwable {
		Thread.sleep(4000);
		splitpage.click_for_Split(map,itemMap);

	}
	
	@Then("^User should validate the Mixed order With Supplier Visit and Other visit (.*) and status (.*)$")
	public void User_should_able_to_validate_mixed_order_visit_and_check_status(String item, String status) throws InterruptedException {
	   
	    //Verifying whether the spilit happend or not with status of the visit
	    splitpage.verify_In_visit_breakdown_for_mixed_order_with_status(item, status);
	}
	@Then("^User should validate the order visit (.*) and status (.*)$")
	public void User_should_able_to_validate_order_visit_and_check_status(String item, String status) throws InterruptedException {

		//Verifying whether the spilit happend or not with status of the visit
		splitpage.verify_In_visit_breakdown_for_order_with_status(item,status);
	}






}
