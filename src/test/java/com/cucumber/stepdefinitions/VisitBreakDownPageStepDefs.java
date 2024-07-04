package com.cucumber.stepdefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import com.cucumber.pages.*;

public class VisitBreakDownPageStepDefs extends Genericfunction

{
	VisitBreakDownPage visitBreakDown = new VisitBreakDownPage();
	String baseloc;
	public static String selecteddate;
	Map<String, String> visitMap = new HashMap<String, String>();
	
	public static String getselecteddate() {
		return selecteddate;
	}

	@Then("^User is landed on Visit break down page$")
	public void user_is_landed_on_visit_break_down_page() throws Throwable {
		visitBreakDown.user_is_landed_on_visit_break_down_page();
	}

	@Given("^User is on the Visit break down page$")
	public void user_is_on_the_visit_break_down_page() throws Throwable {
		Thread.sleep(3000);
		Assert.assertEquals("Visit Breakdown:", findElement(WebElements.visit).getText());
	}

	@When("^User Double click the first visit line$")
	public void user_double_click_the_first_visit_line() throws Throwable {
		List<WebElement> visit=findElements(WebElements.visitMain);
		String s = visit.get(0).getText().split(":")[2];
		visitMap.put("1", s.split("-")[0]);
		System.out.println(visitMap);

		String s1 = visit.get(1).getText().split(":")[2];
		visitMap.put("2", s1.split("-")[0]);

		visitBreakDown.user_double_click_the_first_visit_line(visitMap.get(1));
		
	}

	@When("^User Double click the second visit line$")
	public void user_double_click_the_second_visit_line() throws Throwable {
		List<WebElement> visit=findElements(WebElements.visitMain);
		String s = visit.get(visit.size()-1).getText().split(":")[2];
		visitMap.put("3", s.split("-")[0]);
		System.out.println(visitMap);
		visitBreakDown.user_double_click_the_first_visit_line(visitMap.get(2));

	}

	@When("^User Double click the visit line$")
	public void user_double_click_the_visit_line() throws Throwable {
		visitBreakDown.user_double_click_the_visit_line();

	}
	
	
	@When("^User Double click the visit line with date as TBA$")
	public void double_click_for_TBA_date() throws Throwable {
		visitBreakDown.double_click_for_TBA_date();
		
	}
	
	@When("^User Select and Double click the visit line$")
	public void user_select_and_double_click_the_visit_line() throws Throwable {
		visitBreakDown.user_select_and_double_click_the_visit_line();
		
	}
	
	@When("^User select the visit line$")
	public void user_select_the_visit_line() throws Throwable {
		visitBreakDown.user_select_the_visit_line();
		
	}

	@Then("^User is on  Schedule a visit date screen$")
	public void user_is_on_schedule_a_visit_date_screen() throws Throwable {
		Thread.sleep(3000);
		Assert.assertEquals("Visit Detail", findElement(WebElements.visitscreen).getText());
	}

	@And("^click on change visit date$")
	public void click_on_change_visit_date() throws Throwable {
		clickOnElement(WebElements.visitdate);

	}

	@And("^click on suspend button$")
	public void click_on_suspend_button() throws Throwable {
		clickOnElement(WebElements.suspend);

	}

	@And("^user confirmation for suspending the order$")
	public void user_click_on_suspend_button() throws Throwable {
		threewindow();
		Thread.sleep(3000);
		clickOnElement(WebElements.suspendokay);
		Thread.sleep(5000);
		driver.switchTo().window(parentid1);

	}

	@Given("^User is on visit date screen$")
	public void user_is_on_visit_date_screen() throws Throwable {
		visitBreakDown.user_is_on_visit_date_screen();
	}

	@When("^User should able to set the delivery date for the visit$")
	public void user_should_able_to_set_the_delivery_date_for_the_visit() throws Throwable {
		selecteddate = visitBreakDown.user_should_able_to_set_and_get_the_delivery_date_for_the_visit();
	}

	@When("^User should able to set the delivery date for the visit with selecting over lead time$")
	public void user_should_able_to_set_the_delivery_date_for_the_visitwith_selecting_over_lead_time() throws Throwable {
		visitBreakDown.overide_date_functionality();
		selecteddate = visitBreakDown.user_should_able_to_set_and_get_the_delivery_date_for_the_visit();
		switchWindow(0);
	}
	@When("^User should able to set the delivery date for the visit with selecting override resources$")
	public void user_should_able_to_set_the_delivery_date_for_the_visitwith_override_resources() throws Throwable {
		visitBreakDown.overide_date_functionality2();
		selecteddate = visitBreakDown.user_should_able_to_set_and_get_the_delivery_date_for_the_visit();
		switchWindow(0);
	}
	@When("^User should able to set the delivery date for the visit with selecting Create Emergency Visit$")
	public void user_should_able_to_set_the_delivery_date_for_the_visitwith_Create_Emergency_Visit() throws Throwable {
		visitBreakDown.overide_date_functionality3();
		selecteddate = visitBreakDown.user_should_able_to_set_and_get_the_delivery_date_for_the_visit();
		switchWindow(0);
	}

	@Then("^User should be able to see the selected delivery date on visit break down page$")
	public void user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page() throws Throwable {
		visitBreakDown.user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page(selecteddate);
	}
	
	@Then("^User should be able to see the status as (.*) for previous order on visit break down page$")
	public void user_should_be_able_to_see_visit_resechedule(String status) throws Throwable {
		visitBreakDown.user_should_be_able_to_see_visit_resechedule(selecteddate,status);
	}


	@Then("^User should be able to see the status on visit break down page$")
	public void user_should_be_able_to_see_the_status_on_visit_break_down_page() throws Throwable {
		visitBreakDown.user_should_be_able_to_see_the_status_on_visit_break_down_page();
	}
	@And("^User should able to see the available and not available dates$")
	public void user_should_able_to_see_the_available_and_not_available_dates() throws Throwable {
		visitBreakDown.user_should_able_to_see_the_available_and_not_available_dates();
	}

	@And("^User should not be able to select the date which shows in red$")
	public void user_should_not_be_able_to_select_the_date_which_shows_in_red() throws Throwable {
		visitBreakDown.user_should_not_be_able_to_select_the_date_which_shows_in_red();
	}

	@When("^User should able to set the delivery date for the visit which are in green status$")
	public void user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_green_status() throws Throwable {
		visitBreakDown.user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_green_status();
	}

	@Then("^User should be able to see the selected delivery date on the visit break down page$")
	public void user_should_be_able_to_see_the_selected_delivery_date_on_the_visit_break_down_page() throws Throwable {
		user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page();
	}

	@When("^User should able to set the delivery date for the visit which are in amber status$")
	public void user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_amber_status() throws Throwable {
		visitBreakDown.user_should_able_to_set_the_delivery_date_for_the_visit_which_are_in_amber_status();
	}

	@Then("^User should not able to set the delivery date for the visit beyond 9 months$")
	public void user_should_not_able_to_set_the_delivery_date_for_the_visit_beyond_9_months() throws Throwable {
		visitBreakDown.user_should_not_able_to_set_the_delivery_date_for_the_visit_beyond_9_months();
	}

	@When("^User should able to set the delivery date for the visit for already dated$")
	public void user_should_able_to_set_the_delivery_date_for_the_visit_for_already_dated() throws Throwable {
		user_should_able_to_set_the_delivery_date_for_the_visit();
	}

	@Then("^Check whether the user able to see selected date new visit line on visit breakdown$")
	public void check_whether_the_user_able_to_see_selected_date_new_visit_line_on_visit_breakdown() throws Throwable {
		user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page();
	}

	@When("^User should be able to click TBA button$")
	public void user_should_be_able_to_click_tba_button() throws Throwable {
		visitBreakDown.user_should_be_able_to_click_tba_button();
	}

	@Then("^Check whether the user able to see the dated line back to TBA status in visit line$")
	public void check_whether_the_user_able_to_see_the_dated_line_back_to_tba_status_in_visit_line() throws Throwable {
		user_should_be_able_to_see_the_selected_delivery_date_on_visit_break_down_page();
	}

	@And("^click on overrides$")
	public void click_on_overrides() throws Throwable {
		threewindow();	
		Thread.sleep(10000);
		//isElementClickable(WebElements.overrides);
		clickOnElement(WebElements.overrides);

	}
	
	

	@And("^selects override options as (.*)$")
	public void selects_override_options(String option) throws Throwable {
		// clickOnElement(WebElements.overrides);
		visitBreakDown.selects_override_options(option);

	}
	
	@Then("^User validate whether split button is (.*) once the order is dated on visit break down page$")
	public void user_validate_split_button_is_disabled_on_visit_break_down_page(String text) throws Throwable {
	//   Assert.assertTrue("Button is disabled", findElement(WebElements.splitvisit).isEnabled());
		visitBreakDown.verify_tba_enabled_or_disabled(text);
	
	}

}
