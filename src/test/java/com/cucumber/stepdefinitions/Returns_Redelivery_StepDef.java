package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import com.cucumber.pages.Returns_Redelivery_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Returns_Redelivery_StepDef extends Genericfunction {
    Returns_Redelivery_Page returns=new  Returns_Redelivery_Page();
    @When("User should able navigate to the visit details tab.")
    public void user_should_able_navigate_to_the_visit_details_tab() {
        returns.visit_details_tab_click_functionality();
    }



    @When("User should able to click on more visit action dropdown")
    public void user_should_able_to_click_on_more_visit_action_dropdown() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User able to select {string} option.")
    public void user_able_to_select_option(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able Enter comments and click on proceed button in returns popup.")
    public void user_should_able_enter_comments_and_click_on_proceed_button_in_returns_popup() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to Validate in more visit action dropdown, {string} option remains enabled.")
    public void user_should_able_to_validate_in_more_visit_action_dropdown_option_remains_enabled(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to Validate the visit date displayed changes to link again.")
    public void user_should_able_to_validate_the_visit_date_displayed_changes_to_link_again() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should able to Select {string} option again.")
    public void user_should_able_to_select_option_again(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to Validate that return supply chain leg is not displayed under 1st deliver to customer supply chain leg and {string} supply chain leg, {string} supply chain leg are displayed instead.")
    public void user_should_able_to_validate_that_return_supply_chain_leg_is_not_displayed_under_1st_deliver_to_customer_supply_chain_leg_and_supply_chain_leg_supply_chain_leg_are_displayed_instead(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to  Validate visit status of the order changes to {string}.")
    public void user_should_able_to_validate_visit_status_of_the_order_changes_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User should able to Click on the visit date link and date the order.")
    public void user_should_able_to_click_on_the_visit_date_link_and_date_the_order() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to Navigate to visit breakdown tab and double click on the new visit with {string} status.")
    public void user_should_able_to_navigate_to_visit_breakdown_tab_and_double_click_on_the_new_visit_with_status(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should able to  Validate the WMS Order code displayed in visit details tab of the popup.")
    public void user_should_able_to_validate_the_wms_order_code_displayed_in_visit_details_tab_of_the_popup() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
