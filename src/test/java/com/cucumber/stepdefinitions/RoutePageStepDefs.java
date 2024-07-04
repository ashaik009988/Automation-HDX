package com.cucumber.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import com.cucumber.pages.*;

public class RoutePageStepDefs extends Genericfunction{
	String baselocation;
	WebElement visit;
	RoutePage routePage = new RoutePage();
	VisitDetailsPage visitdetails  = new VisitDetailsPage();
	String depotlocation;
	String datetext;
	String datefromus;
	
	@Given("^user is on visit breakdown Home page$")
    public void user_is_on_visit_breakdown_Home_page() throws Throwable {
		 baselocation = routePage.verify_User_isOn_VisitBreakDown_page();
    }
	 @When("^user able click on transport from main menu bar$")
	    public void user_able_click_on_transport_from_main_menu_bar() throws Throwable { 
		 routePage.user_able_click_on_transport_from_main_menu_bar();
	 }
	 
	    @Then("^user is then able to see the sub drop down of transport$")
	    public void user_is_then_able_to_see_the_sub_drop_down_of_transport() throws Throwable {
	    	routePage.user_is_then_able_to_see_the_sub_drop_down_of_transport();
	    }
	    
	    @Given("^user is on transport tab$")
	    public void user_is_on_transport_tab() throws Throwable {
	    	routePage.user_is_on_transport_tab();
	    }
	    
	    @When("^user able to click on the route planning from dropdown of transport tab$")
	    public void user_able_to_click_on_the_route_planning_from_dropdown_of_transport_tab() throws Throwable { 
	    	clickOnElement(WebElements.routeplanning);
	    }
	    
	    @When("^user able to click on the Manual Routing from dropdown of transport tab$")
	    public void user_able_to_click_on_the_manual_routing_from_dropdown_of_transport_tab() throws Throwable { 
	    	clickOnElement(WebElements.manualrouting);
	    }
	    
	    
	    @Then("^user is  presented with the route planning page$")
	    public void user_is_presented_with_the_route_planning_page() throws Throwable {
	    	routePage.user_is_presented_with_the_route_planning_page();
	    }	
	    
	    @Given("^user is on route planning page$")
	    public void user_is_on_route_planning_page() throws Throwable {
	    	user_is_presented_with_the_route_planning_page();
	    }
	    
	    @When("^user able to select the date from the calendar$")
	    public void user_able_to_select_the_date_from_the_calendar() throws Throwable {
	    	routePage.user_able_to_select_the_date_from_the_calendar();
	    }

	    @And("^user able to click on search button$")
	    public void user_able_to_click_on_search_button() throws Throwable {
	    	routePage.user_able_to_click_on_search_button();
	    }
	    @Then("^user should presented with Outbase and the visit count$")
	    public void user_should_presented_with_Outbase_and_the_visit_count() throws Throwable {
	    	routePage.user_should_presented_with_Outbase_and_the_visit_count();
	    }
	    
	    @When("^user able to select the date from the calendar for manual routing$")
	    public void user_able_to_select_the_date_for_maual_routing() throws Throwable {
	    	datetext = VisitBreakDownPageStepDefs.getselecteddate();
	    	System.out.println("The retrived date text : "+datetext);
	    	
	    	System.out.println("from ours : "+datefromus);
	    	routePage.user_able_to_select_the_date_for_maual_routing(depotlocation,datefromus);
	    	
	    }
	    
	    @And("^User navigate to VisitDetails Screen and get depot$")
	    public void navigate_to_visit_details_and_get_depot() throws InterruptedException {
	    	datefromus = routePage.getDate();
		 depotlocation = visitdetails.navigate_to_visit_details_and_get_depot();
	    }
	    
	    @And("^user able to select the unrouted drops$")
	    public void user_able_to_select_the_unrouted_drops() throws Throwable {
	    	routePage.user_able_to_select_the_unrouted_drops();
	    	
	    }
	    
	    @And("^user able to select the routed drops$")
	    public void user_able_to_select_the_routed_drops() throws Throwable {
	    	routePage.user_able_to_select_the_routed_drops();
	    	
	    }
	    
	    
	    @And("^user able to select the unrouted drops and provide (.*) as route number$")
	    public void user_able_to_select_the_unrouted_drops_with_specified_route_number(String routenumber) throws Throwable {
	    	routePage.user_able_to_select_the_unrouted_drops_with_specified_route_number(routenumber);
	    	
	    }

	    
	    
	   
}
