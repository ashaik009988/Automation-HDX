package com.cucumber.pages;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;

public class GoodwillPage extends Genericfunction {
	CreateOrder createOrders = new CreateOrder();
	AmendOrder amendorders = new AmendOrder();
	static String name;

	public String return_cust_name() {
		String namereturn = name + ", (Mr)";
		return namereturn;
	}

	public void user_able_click_on_order_manager_from_main_menu_bar() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement ele = findElement(WebElements.order_manager);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.workflow);
		Thread.sleep(2000);

	}

	public void create_customer() {

		name = "Auto " + getAlphaNumericString(4);

		System.out.println("Created Cust Name is : " + name);

		// clicking create customer option in home page
		clickOnElement(WebElements.order_Manager_tab);
		clickOnElement(WebElements.create_Customer_tab);

		// frame switching
		driver.switchTo().frame(0);

		// creating customer process

		// entering customer name
		clickOnElement(WebElements.title_name);
		clickOnElement(WebElements.title_name_option);
		sendkeys(WebElements.intial_Name, getAlphaNumericString(1));
		sendkeys(WebElements.sur_Name, name);

		// entering customer address
		sendkeys(WebElements.address_line1, "10 Chruch Bell Sound");
		sendkeys(WebElements.address_line3, "Bridgend");
		sendkeys(WebElements.address_line4, "Mid Galmorgan");

		// entering country value
		sendkeys(WebElements.country, "UK");

		// entering Customer postcode value
		sendkeys(WebElements.postcode, "CF314QH");

		// entering Customer mobile,home and work number
		driver.findElement(WebElements.mobile_Number).sendKeys("07709502403");
		driver.findElement(WebElements.home_Telephone_Number).sendKeys("07709502403");
		driver.findElement(WebElements.work_Telephone_Number).sendKeys("07709502403");

		// entering Customer email
		driver.findElement(WebElements.emailcu).sendKeys("afzal.shaik@wickes.co.uk");

		// confirming Customer email by re entering the same value
		driver.findElement(WebElements.confirm_email).sendKeys("afzal.shaik@wickes.co.uk");

		// entering customer contact allowed options
		clickOnElement(WebElements.delivery_email_option);
		clickOnElement(WebElements.customer_email_option);
		clickOnElement(WebElements.marketing_email_option);

		// clicking on create option
		clickOnElement(WebElements.creating_Customer);
	}

	public void verify_In_workflow_to_be_sent(String item, String status) throws InterruptedException {
		
		Thread.sleep(2000);
		doubleclick(WebElements.due_btn);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
		for (int i = 1; i <= col1.size(); i++) {
			List<WebElement> out = findElements(
					By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + i + "]/td"));
			String item1 = out.get(2).getText(); // 807523-8804-V
			String status1 = out.get(7).getText(); // Automation, SIT (Mr)

			System.out.println(item1);
			System.out.println(status1);
			if (item.contains(item1) && status.contains(status1)) {
				System.out.println("Validation is succesfull ");
				break;
			}
			System.out.println("Validation is unsuccesfull ");
		}
		
	}

	
	public void verify_In_workflow_table_failed(Map<String, String> Order_data) throws InterruptedException {
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
				if (Order_data.get("order code").contains(orderNo)
						&& Order_data.get("cust name").contains(statusar[0])
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
			else {
				break;
			}

		}

		while (!bol);

		Assert.assertFalse(bol);

	}
	
	
	public void create_a_new_thread() throws InterruptedException {
		Thread.sleep(3000);
		clickOnElement(WebElements.goodwill_payment);
/*
		List<WebElement> list = new ArrayList<>();
		list = driver.findElements(By.xpath("//select[@id='ddlThreadTypes']/option"));
		for (WebElement a : list) {
			System.out.println("option is: " + a.getText());
		}
		for (WebElement a : list) {
			if (a.getText().contains("Goodwill")) {
				a.click();
				break;
			}

		}
*/
		Thread.sleep(1000);
		clickOnElement(WebElements.order_option);
		Thread.sleep(1000);
		// clickOnElement(WebElements.customer_option);
		clickOnElement(WebElements.email);
		Thread.sleep(2000);
		sendkeys(WebElements.thread_summary, "Accept");
		Thread.sleep(1000);

	}

	public void verify_customer(String customer) throws InterruptedException {
		List<String> custlist = new ArrayList<>();
		Thread.sleep(2000);
		doubleclick(WebElements.due_btn);
		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
		List<WebElement> rows = findElements(
				By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr"));
		for (int i = 1; i <= rows.size(); i++) {
			List<WebElement> eachrow = findElements(
					By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + i + "]/td"));
			String order = eachrow.get(7).getText();
			custlist.add(order);
		}

		if (custlist.contains(customer)) {
			System.out.println("Customer Validation is succesfull");
		}
		else {
			System.out.println("");
		}
	}

	public void primary_and_secondary_reasons(String pri_reason, String sec_reason) throws InterruptedException {
		/*
		 * primary reasons Core Product Installation K&B SO MD / CEO NSR Store Incident
		 * Store Service Wickes Misc
		 */

		String primaryreason = "//select[@id='ddlPrimaryReason']/option[contains(text(),'" + pri_reason + "')]";
		clickOnElement(getByIdentifier(primaryreason, "xpath"));
		Thread.sleep(1000);
		String secondaryreason = "//select[@id='ddlSecondaryReason']/option[contains(text(),'" + sec_reason + "')]";
		clickOnElement(getByIdentifier(secondaryreason, "xpath"));
		Thread.sleep(1000);
		// sendkeys(WebElements.detail,"Accept");
	}

	public void fields_in_thread(String resp1, String pay1, String storerespon) throws InterruptedException {
		String reponsibility_1 = "//select[@id='401~1']/option[contains(text(),'" + resp1 + "')]";
		/*
		 * BVC Core Commercial Direct Channels Installation Service K&B Commercial K&B
		 * Distribution K&B Nil Stocks K&B Supply Only GWG NDS Store
		 */

		String payement_type_1 = "//select[@id='403~1']/option[contains(text(),'" + pay1 + "')]";
		/*
		 * a Head Office Cheque Bank Transfer Gift Tokens
		 */
		System.out.println("pay1 : " + pay1);
		System.out.println("storerespon : " + storerespon);
		System.out.println("resp1 : " + resp1);
		clickOnElement(getByIdentifier(reponsibility_1, "xpath"));
		clickOnElement(getByIdentifier(payement_type_1, "xpath"));

		Thread.sleep(1000);
		sendkeys(WebElements.goodwill_amount_1, "30.00");
		clickOnElement(WebElements.reponsibility_2);
		clickOnElement(WebElements.payement_type_2);
		sendkeys(WebElements.goodwill_amount_2, "20.00");
		/*
		 * Banbury Barking Extra Basingstoke Bracknell Chennai
		 */
		String store_responsible = "//select[@id='110~1']/option[contains(text(),'" + storerespon + "')]";
		clickOnElement(getByIdentifier(store_responsible, "xpath"));
		Thread.sleep(2000);
		sendkeys(WebElements.detail, "Accept");
		Thread.sleep(1000);
		clickOnElement(WebElements.click_ok);

	}

	public void double_click_goodwill_after_thread() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		driver.switchTo().frame("ifMain");
		doubleclick(WebElements.goodwill_doubleclick);
		Thread.sleep(3000);
	}

	public void accept_the_payment() throws InterruptedException {
		threewindow();
		Thread.sleep(3000);
		clickOnElement(WebElements.accepted_amount);
		Thread.sleep(2000);
		sendkeys(WebElements.thread_summary, "Accept");
		Thread.sleep(2000);
		sendkeys(WebElements.detail, "Accept");
		Thread.sleep(1000);
		clickOnElement(WebElements.click_ok);
		driver.switchTo().window(child1);
		Thread.sleep(3000);
		clickOnElement(WebElements.closebutton);

	}

	public void reject_the_payment() throws InterruptedException {
		threewindow();
		Thread.sleep(3000);
		clickOnElement(WebElements.rejected);
		Thread.sleep(2000);
		sendkeys(WebElements.thread_summary, "Rejected");
		Thread.sleep(2000);
		sendkeys(WebElements.detail, "Rejected and emailed to advisor to re-raise");
		Thread.sleep(1000);
		clickOnElement(WebElements.click_ok);
		driver.switchTo().window(child1);
		Thread.sleep(2000);

	}

	public void create_a_new_thread_customer() throws InterruptedException {
		Thread.sleep(3000);
	//	clickOnElement(WebElements.goodwill_payment);
		List<WebElement> list = new ArrayList<>();
		list = driver.findElements(By.xpath("//select[@id='ddlThreadTypes']/option"));
		for (WebElement a : list) {
			System.out.println("option is: " + a.getText());
		}
		for (WebElement a : list) {
			if (a.getText().contains("Goodwill")) {
				a.click();
				break;
			}

		}
		clickOnElement(WebElements.customer_option);
		clickOnElement(WebElements.email);
		Thread.sleep(2000);
		sendkeys(WebElements.thread_summary, "Accept");
		Thread.sleep(1000);

	}

	public void resolve_contact() throws InterruptedException {
		clickOnElement(WebElements.resolve_contact);
		threewindow();
		Thread.sleep(6000);
		sendkeys(WebElements.thread_summary, "Rejected");
		Thread.sleep(2000);
		sendkeys(WebElements.detail, "Rejected and emailed to advisor to re-raise");
		Thread.sleep(1000);
		clickOnElement(WebElements.click_ok);
		driver.switchTo().window(child1);
		Thread.sleep(2000);
		clickOnElement(WebElements.closebutton);

	}

	public void back_to_visit_breakdown_screen() throws InterruptedException {
		driver.switchTo().defaultContent();
		amendorders.searchorderids("");
		Thread.sleep(2000);
		// amendorders.searchorderids("804324-8804-V");
		createOrders.switchframehere();
		Thread.sleep(2000);
//		Thread.sleep(2000);
//		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
//		WebElement lastrow = findElement(By
//				.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + (col1.size()) + "]"));
//		Actions act = new Actions(driver);
//		act.doubleClick(lastrow).perform();
//		Thread.sleep(4000);

//		driver.switchTo().frame("ifMain");	
//		Thread.sleep(2000);

	}

	public void double_click_goodwill_to_sent() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		Thread.sleep(2000);
		doubleclick(WebElements.workflow_goodwill_sent);
		Thread.sleep(3000);
	}

	public void double_click_goodwill_to_authorized() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		Thread.sleep(2000);
		doubleclick(WebElements.workflow_goodwill_auth);
		Thread.sleep(3000);
	}

	public void double_click_short_on_allocation_high_priority() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		navigate_to_page4();
		doubleclick(WebElements.short_on_allocation_high_priority);
		Thread.sleep(3000);
		// clickOnElement(WebElements.lastpage);
		navigate_to_pagelast();
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

	public void navigate_to_pagelast() throws InterruptedException {
		WebElement page = driver.findElement(By.xpath("//select[@class='tvPageNumDropdown ItemNavListSelectSmall']"));
		Select dropdown = new Select(page);
		List<WebElement> options = dropdown.getOptions();
		WebElement lastoption = options.get(options.size() - 2);
		scrollToElement(driver, lastoption);
		lastoption.click();
		Thread.sleep(1000);
		clickOnElement(WebElements.next_btnn);
		Thread.sleep(1000);
		doubleclick(WebElements.creation_date);
		Thread.sleep(2000);

	}

	public static void scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void validate_short_on_allocation_high_priority(String item, String status) throws InterruptedException {
//	    driver.switchTo().frame("ifMain");		
//	    clickOnElement(WebElements.visitbreakdown);
//		Thread.sleep(2000);
//		clickOnElement(WebElements.refresh);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
		for (int i = 1; i <= col1.size(); i++) {
			List<WebElement> out = findElements(
					By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + i + "]/td"));
			String item1 = out.get(2).getText(); // 807523-8804-V
			String status1 = out.get(7).getText(); // Automation, SIT (Mr)

			System.out.println("AC :" + item1);
			System.out.println("EX :" + item);
			System.out.println("AC :" + status1);
			System.out.println("EX :" + status);
			if (item.contains(item1) && status.contains(status1)) {
				System.out.println("Validation is succesfull ");
				break;
			}
			System.out.println("Validation is unsuccesfull ");
		}
	}

	public void user_able_click_on_order_manager_from_main_menu_bar_directly() throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement ele = findElement(WebElements.order_manager);
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		clickOnElement(WebElements.workflow);
		Thread.sleep(2000);

	}

	public void validate_leg_history(String item, String expreason) throws InterruptedException {
//	    driver.switchTo().frame("ifMain");		
//	    clickOnElement(WebElements.visitbreakdown);
//		Thread.sleep(2000);
//		clickOnElement(WebElements.refresh);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.leg_status_history_table);
		for (int i = 2; i <= col1.size(); i++) {
			List<WebElement> out = findElements(
					By.xpath("//table[@id='tblgridviewStatusHistory']/thead/tr[" + i + "]/td"));
			String item1 = out.get(0).getText(); // 807523-8804-V
			String reason = out.get(3).getText(); // Automation, SIT (Mr)

			System.out.println("AC :" + item1);
			System.out.println("EX :" + item);
			System.out.println("AC :" + reason);
			System.out.println("EX :" + expreason);
			if (item1.contains(item) && reason.contains(expreason)) {
				System.out.println("Validation is succesfull ");
				break;
			}
			System.out.println("Validation is unsuccesfull ");
		}
	}
	
     public void verify_In_workflow_to_be_sentagain(String item, String status) throws InterruptedException {
		
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.workflow_table_final);
		for (int i = 1; i <= col1.size(); i++) {
			List<WebElement> out = findElements(
					By.xpath("//table[@class='tvTreeViewNoWidth kiketable-colsizable']/tbody[2]/tr[" + i + "]/td"));
			String item1 = out.get(2).getText(); // 807523-8804-V
			String status1 = out.get(7).getText(); // Automation, SIT (Mr)

			System.out.println(item1);
			System.out.println(status1);
			if (item.contains(item1) && status.contains(status1)) {
				System.out.println("Validation is succesfull ");
				break;
			}
			System.out.println("Validation is unsuccesfull ");
		}
		
	}
     
     
     public Map<String, String> DataStore_for_workflow_validation(Map<String, String> Order_data) throws ParseException {
 		Order_data = new HashMap<String, String>();

 		// storing date and wms code
 		List<WebElement> visitlines = findElements(WebElements.visitMain);
 		int i = visitlines.size();
 		int wms_index = 0;
 		for (int j = i + 2; j > 2; j--) {
 			String p = "//table[@id='tbltreeviewVisit']/thead/tr[" + j + "]/td[2]";
 			if (!gettext(By.xpath(p)).equalsIgnoreCase("tba")) {
 				Order_data.put("ordered date", gettext(By.xpath(p)));
 				Order_data.put("ordered formatted date", date_formatter_in_visit(Order_data.get("ordered date")));
 				wms_index = j;
 				break;
 			}
 		}

 		// clicking on summary tab
 		clickOnElement(WebElements.summary_tab);

 		//phone number
 		Order_data.put("phone", gettext(WebElements.mobile_no));
 		// storing store number
 		String[] parts = gettext(WebElements.store_no).split(" ");
 		Order_data.put("store", parts[0]);

 		// Storing order number
 		Order_data.put("order code", gettext(WebElements.order_code));
 		Order_data.put("create date", gettext(WebElements.ordered_date));
 		Order_data.put("creation date", date_formatter_for_workflow(Order_data.get("create date")));
 		Order_data.put("cust name", gettext(WebElements.cust_name));

 	
 		// storing date and wms code

 		return Order_data;
 	}

}
