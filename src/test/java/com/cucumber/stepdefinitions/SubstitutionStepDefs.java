package com.cucumber.stepdefinitions;

import org.openqa.selenium.By;

import com.cucumber.pages.SubstitutionPage;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SubstitutionStepDefs extends Genericfunction {

    SubstitutionPage substitute = new SubstitutionPage();


    @And("User click on change substitute item$")
    public void click_on_change_substitute_item() throws Throwable {
        clickOnElement(WebElements.substitute);
        Thread.sleep(2000);
    }

    @And("^User click on sku for substituting with another sku (.*)$")
    public void click_on_sku_for_substitute(String sku) throws Throwable {
        substitute.click_on_sku_for_substitute_page(sku);
    }

    //	@And("^User click on sku for substituting with another {sku} with {quantity} $")
//	public void click_on_sku_for_substitute_repacing_quantity(String sku,int quantity) throws Throwable {
//		substitute.click_on_sku_for_substitute_page_with_replacing_quantity(sku,quantity);
//	}
    @And("User click on sku for substituting with another {string} with {string}")
    public void user_click_on_sku_for_substituting_with_another_with(String string, String string2) throws Throwable {
        int quantity=Integer.valueOf(string2);
        substitute.click_on_sku_for_substitute_page_with_replacing_quantity(string, quantity);
    }

    @And("User click on {string} for substituting with particular {string} with {string}")
    public void user_click_on_sku_for_substituting_with_particular_sku(String string,String string1, String string2) throws Throwable {
        int quantity=Integer.valueOf(string2);
        substitute.click_on_sku_for_substitute_page_with_replacing_quantity(string,string1, quantity);
    }

    @And("^User landed on item details page$")
    public void click_landed_on_item_detail_page() throws Throwable {
        substitute.click_landed_on_item_detail_page();
    }

    @Then("^User Validate the VisitBreakDown page$")
    public void validateVisitbreakdown() throws Throwable {
        substitute.validateVisitbreakdown();
    }


    @And("^User click on summary tab$")
    public void clickonsummary() throws Throwable {
        Thread.sleep(2000);
        clickOnElement(WebElements.summaryTab);

    }

    @And("^User click on troubleshooter button$")
    public void clickontroubleshooter() throws Throwable {
        try {
            //clickOnElement(WebElements.expandbar);
            driver.findElement(By.xpath("//div[@id='divFunctionOptionsShow']")).click();
        } catch (Exception e) {
            System.out.println("No button");
        }
        Thread.sleep(2000);
        clickOnElement(WebElements.troubleshooter);
        childwindow();

    }

    @And("^User selects the force debrief visit$")
    public void clickonforcedebrief() throws Throwable {
        substitute.select_the_visit();

    }


    @And("^User selects the regress debrief visit$")
    public void clickonregressdebrief() throws Throwable {
        substitute.select_the_visit_in_regress();


    }

    @And("^User selects the regress debrief for visit details not appearing$")
    public void clickonregressdebrief2() throws Throwable {
        substitute.select_the_visit_in_regress2();


    }

}
