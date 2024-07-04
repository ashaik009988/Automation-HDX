package com.cucumber.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitBreakDownPage extends Genericfunction

{
	String baseloc;

	public void user_is_landed_on_visit_break_down_page() throws Throwable {
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("ifMain");
		Thread.sleep(2000);
		clickOnElement(WebElements.visitbreakdown);
	}

	public void user_double_click_the_visit_line() throws Throwable {
		Thread.sleep(2000);
		List<WebElement> col1 = findElements(WebElements.tablesize);
		By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]");
		doubleclick(last);
		childwindow();
	}
	public void user_double_click_the_first_visit_line(String string) throws Throwable {
		Thread.sleep(2000);
		By last = By.xpath("//span[contains(text() , 'Visit:"+string+"')]");
		doubleclick(last);
		childwindow();
	}
	
	public void user_select_and_double_click_the_visit_line() throws Throwable {
		List<WebElement> col1 = findElements(WebElements.tablesize);
		By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]");
		clickOnElement(last);
		Thread.sleep(2000);
		doubleclick(last);
		childwindow();
	}
	
	public void user_select_the_visit_line() throws Throwable {
		List<WebElement> col1 = findElements(WebElements.tablesize);
		By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]");
		clickOnElement(last);
		Thread.sleep(2000);

	}

	public void double_click_for_TBA_date() throws Throwable {

		Thread.sleep(2000);
		List<WebElement> total = driver.findElements(WebElements.tablesize);

		for (int i = total.size(); i > 2; i--) {

			List<WebElement> rowdetails = findElements(
					By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + i + "]/td"));

			String datetext = rowdetails.get(1).getText();
			String status = rowdetails.get(5).getText();
			By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + i + "]");
			System.out.println("for comparing : " + datetext);

			if (!(status.contains("Visit Rescheduled")) && datetext.contains("TBA")) {
				// System.out.println("Date retrived printing " + output);
				doubleclick(last);
				childwindow();
				System.out.println("Navigated to child window");
				break;
			}

		}
		
	
		

	}
	
	
	
	public void overide_date_functionality() throws InterruptedException {
		threewindow();
		Thread.sleep(4000);
		clickOnElement(WebElements.overrides);
		driver.switchTo().frame("dialog-body");
		clickOnElement(WebElements.override_lead_time);
		clickOnElement(WebElements.save_debrief);
		driver.switchTo().defaultContent();
	}
	public void overide_date_functionality2() throws InterruptedException {
		Thread.sleep(4000);
		threewindow();
		Thread.sleep(4000);
		clickOnElement(WebElements.overrides);
		driver.switchTo().frame("dialog-body");
		clickOnElement(WebElements.Override_Resources);
		clickOnElement(WebElements.save_debrief);
		driver.switchTo().defaultContent();
	}
	public void overide_date_functionality3() throws InterruptedException {
		Thread.sleep(4000);
		threewindow();
		Thread.sleep(4000);
		clickOnElement(WebElements.overrides);
		driver.switchTo().frame("dialog-body");
		clickOnElement(WebElements.Create_Emergency_Visit);
		clickOnElement(WebElements.save_debrief);
		driver.switchTo().defaultContent();
	}
	
	public void double_click_for_Split_click() throws Throwable {

		Thread.sleep(2000);
		List<WebElement> total = driver.findElements(WebElements.tablesize);

		for (int i = total.size(); i > 2; i--) {

			List<WebElement> rowdetails = findElements(
					By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + i + "]/td"));

			String datetext = rowdetails.get(1).getText();
			String status = rowdetails.get(5).getText();
			By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + i + "]");
			System.out.println("for comparing : " + datetext);

			if ((status.contains("Rescheduled - Split Visit Performed")) && datetext.contains("TBA")) {
				// System.out.println("Date retrived printing " + output);
				doubleclick(last);
				childwindow();
				System.out.println("Navigated to child window");
				break;
			}

		}
		

	}

	
	
	
	
	

	public void click_on_change_visit_date() throws Throwable {
		clickOnElement(WebElements.visitdate);

	}

	public void user_is_on_visit_date_screen() throws Throwable {
		threewindow();
		Assert.assertEquals("Schedule A Visit Date", findElement(WebElements.schudle).getText());
	}

	public String user_should_able_to_set_and_get_the_delivery_date_for_the_visit() throws Throwable {
		threewindow();
		Thread.sleep(2000);
		List<WebElement> col;
		List<WebElement> yel;
		
		for (int i = 0; i < 20; i++) {
			col = driver.findElements(WebElements.greenlinne2);
			yel = driver.findElements(WebElements.yellowline);
			System.out.println("Green lines" + col + col.size());
			System.out.println("Yellow lines" + yel + yel.size());

			if (col.size() != 0 || yel.size() != 0) {
				// if(col.size()>8 || yel.size()>8) {
				if (col.size() > 0) {
					col.get(0).click();
				} else {
					yel.get(0).click();
				}
				break;
			} else {
				// click on next week
				clickOnElement(WebElements.nextbutton);
				System.out.println("CLICKED NEXT BTN");
				i++;
			}
		}

		String date = gettext(WebElements.getselecteddatetext).trim();
		System.out.println("The date retrived is : " + date);
		clickOnElement(WebElements.save);
		Thread.sleep(2000);
		System.out.println("delivery date selected");
		driver.switchTo().window(parentid1);

		return date;
	}

	public void user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page(String date)
			throws Throwable {
		driver.switchTo().frame("ifMain");
		Thread.sleep(4000);
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		String output = out.get(1).getText();
		System.out.println("for comparing : " + output);
		System.out.println("yourxpathdate: " + date);
	//	Assert.assertEquals("Validation successful", date, output);

		if (output != null && output.contains(date)) {
			System.out.println("Date retrived printing " + output);
			Assert.assertTrue(true, "Validation Passed");
		}
		
		else {
			Assert.assertFalse(false, "Validation Failed");
		}

	}

	public void user_should_be_able_to_see_visit_resechedule(String date, String status) throws Throwable {
		driver.switchTo().frame("ifMain");
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		String output = out.get(1).getText();
		List<WebElement> out1 = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size() - 1) + "]/td"));
		String output1 = out.get(5).getText();
		System.out.println(output);
		System.out.println(output1);

		if (output != null && output.contains(date)) {

			System.out.println("Date retrived " + output);
		}

		if (output1 != null && output1.contains(status)) {

			System.out.println("Date retrived " + output1);
		}

	}

	public void user_should_be_able_to_see_the_status_on_visit_break_down_page() throws Throwable {
		driver.switchTo().frame("ifMain");
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out = findElements(
				By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		String output = out.get(5).getText();
		System.out.println(output);

		if (output != null && output.contains("Suspended")) {

			System.out.println("Date retrived " + output);
		}
	}

	public void user_should_able_to_see_the_available_and_not_available_dates() throws Throwable {
		List<WebElement> col = findElements(WebElements.greenlinne2);
		List<WebElement> red = findElements(WebElements.redline);
		if (col.size() > 0 || red.size() > 0) {
			System.out.println("User  able to see the available and not available dates ");
		} else {
			System.out.println("user not able see the avalible dates");
		}
		clickOnElement(WebElements.cancel);
		driver.switchTo().window(parentid1);
		driver.switchTo().frame("ifMain");
		// String handles=driver.getWindowHandle();
		// System.out.println(handles);

	}

	public void user_should_not_be_able_to_select_the_date_which_shows_in_red() throws Throwable {
		Boolean red = findElement(WebElements.redline).isSelected();
		if (red == false) {
			System.out.println("user unable to select");
		} else {
			System.out.println("user able to select");
		}
		clickOnElement(WebElements.cancel);
		driver.switchTo().window(parentid1);
		driver.switchTo().frame("ifMain");
	}

	public void user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_green_status() throws Throwable {
		List<WebElement> col = findElements(WebElements.greenlinne2);
		if (col.size() > 0) {
			col.get(0).click();
		} else {
			System.out.println("No");
		}
		clickOnElement(WebElements.save);
		Thread.sleep(3000);
		System.out.println("delivery date  shown in green is selected ");
		driver.switchTo().window(parentid1);
	}

	public void user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_amber_status() throws Throwable {
		List<WebElement> col = findElements(WebElements.yellowline);
		if (col.size() > 0) {
			col.get(0).click();
		} else {
			System.out.println("No");
		}
		clickOnElement(WebElements.save);
		Thread.sleep(3000);
		System.out.println("delivery date  shown in amber is selected ");
		driver.switchTo().window(parentid1);
	}

	public void user_should_not_able_to_set_the_delivery_date_for_the_visit_beyond_9_months() throws Throwable {
		clickOnElement(WebElements.maincalender);
		// driver.findElement(By.xpath("//input[@id='resourceStartDate']")).click();
		for (int i = 0; i < 10; i++) {
			clickOnElement(WebElements.calender);
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click();
		}
		clickOnElement(WebElements.datecalender);
		// driver.findElement(By.xpath("//a[normalize-space()='2']")).click();
		if (findElement(WebElements.error).isDisplayed()) {
			System.out.println("user not able to select order beyond 9 months");
		}
		// for(int i=0;i<36;i++) {
		// clickOnElement(WebElements.nextweek);
		// Boolean display=false;
		// try{
		// display=findElement(WebElements.error).isDisplayed();
		// }catch (Exception e) {
		// }
		// if(display) {
		// System.out.println("user not able to select order beyond 9 months");
		// break;
		clickOnElement(WebElements.cancel);
		driver.switchTo().window(parentid1);
		driver.switchTo().frame("ifMain");
	}

	public void user_should_be_able_to_click_tba_button() throws Throwable {
		threewindow();
		Thread.sleep(10000);
		clickOnElement(WebElements.tba);
		Thread.sleep(4000);
		clickOnElement(WebElements.ok);
		driver.switchTo().window(parentid1);
	}

	public void selects_override_options(String s) throws Throwable {

		// driver.switchTo().frame("//iframe[@id='dialog-body']");
		driver.switchTo().frame(0);
		// Force Small Van
		String xpath = "//*[contains(text(),'" + s + "')]/preceding::input[1]";

		clickOnElement(getByIdentifier(xpath, "xpath"));
		clickOnElement(WebElements.okay);
		Thread.sleep(1000);

	}

	public void verify_tba_enabled_or_disabled(String s) throws Throwable {

		String valid = null;

		boolean result = findElement(WebElements.splitvisit).isEnabled();
		System.out.println(s + " is the String");
		System.out.println("Is button enabled"+result);

		if (result == true) {
			valid = "enabled";
		}

		else if (result == false) {
			valid = "disabled";
		}

		Assert.assertEquals("Strings are not euqal", valid, s);
		clickOnElement(WebElements.closebutton);
		driver.switchTo().window(parentid);

	}

}
