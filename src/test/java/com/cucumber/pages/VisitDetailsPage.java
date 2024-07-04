package com.cucumber.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;

public class VisitDetailsPage extends Genericfunction {

	
	String path = System.getProperty("user.dir");
	String depot;

	public String navigate_to_visit_details_and_get_depot() throws InterruptedException {

		clickOnElement(WebElements.visitdetails);
		Thread.sleep(2000);
	//	switchframeaddress();
		driver.switchTo().frame("WidgVisitDetails");
		//span[contains(text(),'Delivery Depot')]
		depot = driver.findElement(By.xpath("//li[6]//span[2]")).getText();
		System.out.println("Depotname:"+depot);
		Thread.sleep(2000);
		return depot;

	}
	
	public void navigate_to_visit_details() throws InterruptedException {

		clickOnElement(WebElements.visitdetails);
		Thread.sleep(2000);
		switchframeaddress();
		clickOnElement(WebElements.visitaddress);
		

	}
	
	// Validating the Visititems from Visitbreakdown
		public void navigatebacktovistbreakdown() throws InterruptedException {
			//driver.switchTo().frame("ifMain");
			switchframe();
			clickOnElement(WebElements.visitbreakdown);
			Thread.sleep(2000);
			List<WebElement> col1 = driver.findElements(WebElements.tablesize);
			List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
			System.out.println("List is : "+out);
			String visititem = out.get(0).getText();
			System.out.println(visititem);

			if (visititem.contains("Fleet")) {

				System.out.println("Visit Item is : " + visititem);
			}

		}

	public void select_the_dropdown(String s) throws InterruptedException {
		Thread.sleep(2000);
		childwindow();
		Thread.sleep(3000);
        System.out.println("String"+ s);
		String dropdownxpath = "//select[@id='AccessLevel']/option[text()='" + s + "']";
		System.out.println(dropdownxpath);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
		clickOnElement(WebElements.saveinvisit);
		Thread.sleep(2000);
		//switchback();
		driver.switchTo().window(parentid);
		

		// String dateText = gettext(getByIdentifier(datexpath, "xpath"));
	}

	// Validating the Visititems from Visitbreakdown
	public void navigatebackandvalidatevisittype() throws InterruptedException {
		driver.switchTo().frame("ifMain");
		switchframe();
		clickOnElement(WebElements.visitbreakdown);
		Thread.sleep(2000);
		clickOnElement(WebElements.refresh);
		Thread.sleep(2000);
		List<WebElement> col1 = driver.findElements(WebElements.tablesize);
		List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
		System.out.println("List is : "+out);
		String status = out.get(5).getText();
		System.out.println(status);

		if (status.contains("Due Stock Allocation")) {

			System.out.println("Visit Item is : " + status);
		}

	}
	



	public void select_the_dropdown_for_override(String s) throws InterruptedException {
		Thread.sleep(2000);
		threewindow();
		Thread.sleep(3000);
        System.out.println("String"+ s);
		String dropdownxpath = "//select[@id='AccessLevel']/option[text()='" + s + "']";
		System.out.println(dropdownxpath);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
		isElementClickable(WebElements.saveinvisit);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement save = driver.findElement(By.xpath("//input[@id='btnSave']"));
		js.executeScript("arguments[0].click();", save);
		driver.switchTo().window(parentid1);
		
		Thread.sleep(4000);
	}

	
	public void change_address_select_the_dropdown_for_override(String s) throws InterruptedException {
		Thread.sleep(2000);
		threewindow();
		Thread.sleep(3000);
		// change the address
		findElement(WebElements.address1).clear();
		sendkeys(WebElements.address1, "10 Chruch Bell Sound");
		Thread.sleep(1000);
		findElement(WebElements.address2).clear();
		sendkeys(WebElements.address2, "Bridgeend");
		Thread.sleep(1000);
		findElement(WebElements.address4).clear();
		sendkeys(WebElements.address4, "Mid Glamorgan");
		Thread.sleep(1000);
		findElement(WebElements.postalcode).clear();
		sendkeys(WebElements.postalcode, "CF31 4QH");
		Thread.sleep(1000);
        System.out.println("String"+ s);
		String dropdownxpath = "//select[@id='AccessLevel']/option[text()='" + s + "']";
		System.out.println(dropdownxpath);
		Thread.sleep(2000);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
		Thread.sleep(2000);
		isElementClickable(WebElements.saveinvisit);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement save = driver.findElement(By.xpath("//input[@id='btnSave']"));
	//	js.executeScript("arguments[0].dispathEvent(new MouseEvent('click'))", WebElements.saveinvisit);
		js.executeScript("arguments[0].click();", save);
		driver.switchTo().window(parentid1);
		Thread.sleep(5000);

	}
	
	
	
	
	
}
