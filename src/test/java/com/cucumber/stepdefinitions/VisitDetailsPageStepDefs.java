package com.cucumber.stepdefinitions;

import com.cucumber.pages.CreateOrder;
import com.cucumber.pages.VisitDetailsPage;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class VisitDetailsPageStepDefs extends Genericfunction {
	
	public static String depotlocation = null;
	
	VisitDetailsPage visitdetails = new VisitDetailsPage();
	
	
	
	 @And("^User Navigate to VisitDetails Screen$")
	    public void usernavigatevisitdetails() throws InterruptedException {
		 visitdetails.navigate_to_visit_details();
	    }

	 @Then("^User validate the visittype$")
	    public void uservisitaddresslink() throws InterruptedException {
		 visitdetails.navigatebackandvalidatevisittype();
	    }   
	 
	 @And("^User selects (.*) from dropdown$")
	    public void userselectdropdown(String text) throws InterruptedException {
		// visitdetails.validateorderdetails(itemDetail,status);
		 System.out.println("Text in stepdef"+ text);
		 visitdetails.select_the_dropdown(text);
		 
	    } 
	 
	 @And("^User selects (.*) from dropdown for override$")
	    public void select_the_dropdown_for_override(String text) throws InterruptedException {
		// visitdetails.validateorderdetails(itemDetail,status);
		 System.out.println("Text in stepdef"+ text);
		 visitdetails.select_the_dropdown_for_override(text);
		 
	    }

	@And("^User selects (.*) from dropdown for override for remedial$")
	public void select_the_dropdown_for_override_for_remedial(String text) throws InterruptedException {
		 //visitdetails.validateorderdetails(itemDetail,status);
		Thread.sleep(2000);
		threewindow();
		Thread.sleep(3000);
		sendkeys(WebElements.address1,"10 Church Bell Sound");
		sendkeys(WebElements.address3,"Bridgend");
		sendkeys(WebElements.postalcode,"CF31 4QH");
		String dropdownxpath = "//select[@id='AccessLevel']/option[text()='" + text + "']";
		System.out.println(dropdownxpath);
		clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
		isElementClickable(WebElements.saveinvisit);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement save = driver.findElement(By.xpath("//input[@id='btnSave']"));
		js.executeScript("arguments[0].click();", save);
		driver.switchTo().window(parentid1);
		Thread.sleep(4000);
	}

	@And("^User click on change visit address$")
		public void click_on_change_visit_date() throws Throwable {
			clickOnElement(WebElements.visitaddresse);

		}
	
	 @And("^User change the address and selects (.*) from dropdown for override$")
	    public void change_address_select_the_dropdown_for_override(String text) throws InterruptedException {
		// visitdetails.validateorderdetails(itemDetail,status);
		 System.out.println("Text in stepdef"+ text);
		 visitdetails.change_address_select_the_dropdown_for_override(text);
		 
	    } 

}
