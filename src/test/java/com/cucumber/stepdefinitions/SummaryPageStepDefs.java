package com.cucumber.stepdefinitions;

import com.cucumber.pages.SummaryPage;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SummaryPageStepDefs extends Genericfunction {
	
	SummaryPage summaryPageObj = new SummaryPage();
	
	@Then("^User is able to see AXS number of order$")
	public void User_is_able_to_see_AXS_number_of_order() throws Throwable {
		List<WebElement> wms=findElements(WebElements.wms_order_code);
		System.out.println(wms.size());
		System.out.println(wms.get(wms.size()-1).getText());
	}

	@Then("^user clicks on Summary Tab$")
	public void user_clicks_on_summary_tab() throws Throwable {
		summaryPageObj.user_click_on_Summary_Tab();
	}


	@When("^read details from workbook (.*), sheetName (.*), rownumber (.*)$")
	public void verify_user_details_in_summary_page_from_workbook_name_sheet_name_row_number(String workbookName, String sheetName,int rowNumber) throws Exception {
		readData(workbookName, sheetName, rowNumber);
		System.out.println(getValue("UserName"));
	}
	
	@Then("verify user details Name,Home,Mobile and Email")
	public void verify_user_details_name_home_mobile_and_email() {
		summaryPageObj.verifyUserDetails();
	}
}
