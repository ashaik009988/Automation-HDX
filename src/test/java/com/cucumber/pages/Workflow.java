package com.cucumber.pages;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;

public class Workflow extends Genericfunction {
	Actions action = new Actions(driver);

	public void user_able_click_on_order_manager_from_main_menu_bar() throws Throwable {
		WebElement ele = findElement(WebElements.order_manager);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.workflow);
		Thread.sleep(2000);

	}

	public void user_able_click_on_product_enquiry_from_main_menu_bar() throws Throwable {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement ele = findElement(WebElements.tools);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.product_enquiry);
		Thread.sleep(2000);

	}
	public void user_able_click_on_product_enquiry_from_main_menu_ba_geosearch() throws Throwable {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement ele = findElement(WebElements.tools);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.geocode);
		Thread.sleep(2000);

	}

	public void user_able_click_on_upload_from_main_menu_bar() throws Throwable {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement ele = findElement(WebElements.maintenance);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.upload);
		Thread.sleep(2000);

	}

	public void select_the_filter_and_provide_required_input(String search, String option) throws Throwable {
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		sendkeys(WebElements.find_box, search);
		Thread.sleep(1000);
		String dropdownxpath = "//select[@id='ddlSearchType']/option[contains(text(),'" + option + "')]";
		System.out.println(dropdownxpath);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
		Thread.sleep(2000);
		clickOnElement(WebElements.searchButton);
		Thread.sleep(2000);
		try {
			String alret = driver.switchTo().alert().getText();
			System.out.println(alret + " is the alert");
			driver.switchTo().alert().accept();
		} catch (Exception e) {
		}

	}

	public void entering_the_geo_code( String option) throws Throwable {
		driver.switchTo().frame("ifMain");
		sendkeys(WebElements.geocodevalue,option);
		Thread.sleep(4000);
		doubleclick(WebElements.searchButton5);
	}


	public void select_the_filter_and_provide_required_input_upload(String search, String option) throws Throwable {
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		String dropdownxpath = "//select[@id='cphLeftPanel_ddlClients']/option[text()='" + search + "']";
		System.out.println(dropdownxpath);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));

		String dropdownxpath1 = "//select[@id='ddlFileTypes']/option[contains(text(),'" + option + "')]";
		System.out.println(dropdownxpath1);
		clickOnElement(getByIdentifier(dropdownxpath1, "xpath"));
		Thread.sleep(2000);
		clickOnElement(WebElements.searchButton);
		Thread.sleep(2000);

	}

	public void double_click_short_on_allocation_high_priority() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page4();
		doubleclick(WebElements.short_on_allocation_high_priority);
		Thread.sleep(3000);
		// clickOnElement(WebElements.lastpage);
	}

	public void navigate_to_page4() throws InterruptedException {
		Thread.sleep(2000);
		// clickOnElement(WebElements.workflow_page);
		WebElement page = driver.findElement(By.xpath("//select[@class='tvPageNumDropdown ItemNavListSelectSmall']"));
		Select dropdown = new Select(page);
		List<WebElement> options = dropdown.getOptions();
		WebElement lastoption = options.get(options.size() - 3);
		scrollToElement(driver, lastoption);
		lastoption.click();
		Thread.sleep(1000);
		clickOnElement(WebElements.next_btnn);
		Thread.sleep(1000);

	}

	public void verify_In_workflow_table(Map<String, String> Order_data) throws InterruptedException {
		Thread.sleep(2000);
		boolean bol = false;
		doubleclick(WebElements.visit_datebtn);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
		do {
			for (int i = 1; i <= col1.size(); i++) {
				List<WebElement> out = findElements(
						By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + i + "]/td"));
				String orderNo = out.get(2).getText(); // 807523-8804-V
				String custname = out.get(7).getText(); // Automation, SIT (Mr)
				String creation_date = out.get(5).getText(); // creation date
				String[] statusar = custname.split(",");
				System.out.println(orderNo);
				System.out.println(custname);
				System.out.println(statusar[0]);
				System.out.println(creation_date);
				if (Order_data.get("order code").contains(orderNo) && Order_data.get("cust name").contains(statusar[0])
						&& Order_data.get("creation date").contains(creation_date)) {
					System.out.println("Validation is succesfull ");
					bol = true;
					break;
				}

			}
			if (bol) {
				break;
			} else if (button_enabled(WebElements.next_btnn)) {
				clickOnElement(WebElements.next_btnn);
				Thread.sleep(3000);
			}

		}

		while (!bol);

		Assert.assertTrue(bol);

	}

	public void double_click_fail_pick_despatch_high_priority() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page4();
		doubleclick(WebElements.failed_pick_high_priority);
		Thread.sleep(3000);

	}

	public void double_click_awaiting_carrier_debrief() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page4();
		doubleclick(WebElements.awaiting_carrier_debrief);
		Thread.sleep(3000);

	}

	public void navigate_to_page3() throws InterruptedException {
		Thread.sleep(2000);
		// clickOnElement(WebElements.workflow_page);
		WebElement page = driver.findElement(By.xpath("//select[@class='tvPageNumDropdown ItemNavListSelectSmall']"));
		Select dropdown = new Select(page);
		List<WebElement> options = dropdown.getOptions();
		WebElement lastoption = options.get(options.size() - 4);
		scrollToElement(driver, lastoption);
		lastoption.click();
		Thread.sleep(1000);
		clickOnElement(WebElements.next_btnn);
		Thread.sleep(1000);

	}

	public void double_click_collection_excep_full_failure() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page3();
		doubleclick(WebElements.collection_excep_full_failure);
		Thread.sleep(3000);

	}

	public void double_click_collection_excep_par_failure() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page3();
		doubleclick(WebElements.collection_excep_par_failure);
		Thread.sleep(3000);
		// clickOnElement(WebElements.lastpage);
	}

	public void double_click_delivery_excep_par_failure() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page3();
		doubleclick(WebElements.delivery_excep_par_failure);
		Thread.sleep(3000);

	}

	public void double_click_delivery_excep_full_failure() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page3();
		doubleclick(WebElements.delivery_excep_full_failure);
		Thread.sleep(3000);
	}

	public void double_click_awaiting_parcel_pack() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page4();
		doubleclick(WebElements.awaiting_parcel_pack);
		Thread.sleep(3000);
		// clickOnElement(WebElements.lastpage);
	}

	public void verify_In_visit_breakdown_for_visit_and_status(String item, String status) throws InterruptedException {

		clickOnElement(WebElements.visitbreakdown);
		Thread.sleep(2000);
		clickOnElement(WebElements.refresh);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out2 = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		String item2 = out2.get(0).getText().split("-")[2].trim();
		String status2 = out2.get(5).getText();

		System.out.println("Ac: " + item2);
		System.out.println("Ex: " + item);
		System.out.println("Ac: " + status2);
		System.out.println("Ex: " + status);
		if (item2.contains(item) && status2.contains(status)) {
			System.out.println(" Order Validation is succesful");
			Assert.assertTrue(true, "Validation is successful ");
		} else {
			Assert.assertTrue(false, "Validation is unsuccessful");
		}

	}

	public void validate_the_data_is_valid(Map<String, String> Order_data) throws ParseException {
		Order_data = new HashMap<String, String>();
		System.out.println(Order_data);
		for (String key : Order_data.keySet()) {
			String value = Order_data.get(key);
			Assert.assertTrue(value != null, "Value for the " + key + " is null");
		}
		System.out.println("Result" + Order_data.get("cust name") != null);

	}

	public void verify_In_product_enquiry_table() throws InterruptedException {
        Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(WebElements.tablefound);
		if (rows.size() > 1) {
			Assert.assertTrue(true, "Product found with the search result");
		} else {
			Assert.assertTrue(false, "Product not found with the search result");
		}
	}

	public void verify_In_product_enquiry_table_for_geo_location() throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> rows = driver.findElements(WebElements.tablefound1);
		if (rows.size() > 1) {
			Assert.assertTrue(true, "Product found with the search result");
		} else {
			Assert.assertTrue(false, "Product not found with the search result");
		}
	}

	public void verify_In_product_enquiry_table_invalid_data() throws InterruptedException {

		List<WebElement> rows = driver.findElements(WebElements.tablefound);
		if (rows.size() < 2) {
			Assert.assertTrue(true, "Product not found with the search result");
		}

		else {
			Assert.assertTrue(false, "Product found with the search result");
		}

	}

	public void verify_status_in_upload() throws InterruptedException {		
		doubleclick(WebElements.date_uploaded);
		Thread.sleep(2000);
		WebElement dated = driver.findElement(By.xpath("//table[@class='tvTreeView']/tbody/tr[1]/td[3]"));
		String status = dated.getText();
		System.out.println("Ex: " + status);
		if (status.contains("Completed")) {
			System.out.println("Validation is succesful");
			Assert.assertTrue(true, "Validation is successful ");
		} else {
			Assert.fail("Validation is unsuccessful");
		}

	}

}
