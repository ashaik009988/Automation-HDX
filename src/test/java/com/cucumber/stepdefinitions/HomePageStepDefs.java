package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class HomePageStepDefs extends Genericfunction {
	
	@When("^Read data from (.*) workbook, from (.*) sheet and from (.*) rownumber$")
    public void Read_data_from_workbook_from_sheet_and_from_rownumber(String workBookName,String sheetName,int rowNumber) throws Throwable {
		readData(workBookName, sheetName, rowNumber);
    }
	
	@When("^User enters the order number with store number on order code field$")
    public void user_enters_the_order_number_with_store_number_on_order_code_feild() throws Throwable {
    	Thread.sleep(4000);
    	driver.switchTo().defaultContent();
//        sendkeys(WebElements.seachbutton,exceldata("Sheet1"));
    	sendkeys(WebElements.seachbutton,getValue("OrderNumber"));
    	
    }
    @And("^Click on Search$")
    public void click_on_search() throws Throwable {
    	clickOnElement(WebElements.clicksearch);
       
    }

}
