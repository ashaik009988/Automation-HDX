package com.cucumber.stepdefinitions;

import com.cucumber.pages.RemedialsPage;

import GenericFunction.Genericfunction;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RemedialsStepDefs extends Genericfunction {
    RemedialsPage remidialPage = new RemedialsPage();

    @Then("User should able to raise the remedial for Dx Freight")
    public void user_should_able_to_raise_the_remedialfor_Dx_Freight() throws InterruptedException {
        remidialPage.remidial_button_click();
        remidialPage.remidial_item_selecting();
        remidialPage.remidial_reason_New_Damage();
        remidialPage.Remidaial_answer_functionality();
        remidialPage.remidial_end_process();
    }
    @Then("User should able to raise the remedial for Parcel force")
    public void user_should_able_to_raise_the_remedialfor_Dx_Freight_Parcel_force() throws InterruptedException {
        remidialPage.remidial_button_click();
        remidialPage.remidial_item_selecting();
        remidialPage.remidial_reason_New_Damage();
        remidialPage.Remidaial_answer_functionality();
        remidialPage.remidial_end_process();
    }
    @Then("User should able to raise the remedial for fleet delivery for settlement")
    public void user_should_able_to_raise_the_remedial_for_fleet_delivery_for_settlement() throws InterruptedException {
        remidialPage.remidial_button_click();
        remidialPage.remidial_item_selecting();
        remidialPage.remidial_reason_New_Settlement();
        remidialPage.Remidaial_answer_functionality_for_settlement();
        remidialPage.remidial_end_process();


    }
    @Then("User should able to raise the remedial for fleet delivery for faulty")
    public void user_should_able_to_raise_the_remedial_for_fleet_delivery_for_faulty() throws InterruptedException {
        remidialPage.remidial_button_click();
        remidialPage.remidial_item_selecting();
        remidialPage.remidial_reason_New_Faulty();
        remidialPage.Remidaial_answer_functionality_for_faulty();
        remidialPage.remidial_end_process();
    }

    @When("User is able to see the remidial visit {string} in visit break down screen")
    public void User_is_able_to_see_the_remidial_visit_in_visit_break_down_screen(String s) throws InterruptedException {
        remidialPage.remidial_Visit_verification(s);
    }

    @Then("User should able to raise the remedial for fleet delivery")
    public void user_should_able_to_raise_the_remedial_for_fleet_delivery() throws InterruptedException {
        remidialPage.remidial_button_click();
        remidialPage.remidial_item_selecting();
        remidialPage.remidial_reason_New_Damage();
        remidialPage.Remidaial_answer_functionality_for_fleet_delivery();
        remidialPage.remidial_end_process();
    }
    @When("User is able to cancel remedial for created remidial fleet")
    public void User_is_able_to_cancel_remedial() throws InterruptedException {
        remidialPage.Cancel_remidial_button_click();
        remidialPage.Cancel_remidial_process();
    }

    @Then("User is able to Verify the Canceled Remedial in visit breakdown Screen")
    public void User_is_able_to_Verify_the_Canceled_Remedial_in_visit_breakdown_Screen() throws InterruptedException {
        remidialPage.Canceled_remidial_Visit_verification();
    }

}