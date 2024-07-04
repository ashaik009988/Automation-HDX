package com.cucumber.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.cucumber.pages.SuspenseAccountPage;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuspenseAccountStepDefs extends Genericfunction {
	SuspenseAccountPage suspenseAccount = new SuspenseAccountPage();
	
    @Then("^click on Tools menu$")
    public void click_on_tools_menu() throws InterruptedException {
    	suspenseAccount.clickOnToolsMenu();
    }

    @Then("^choose Suspense Account option$")
    public void choose_suspense_account_option() throws InterruptedException {
    	suspenseAccount.clickOnSuspenseAccount();
    }

    @Then("^click on Order Code radio button$")
    public void click_on_Order_Code_radio_button() throws InterruptedException {
    	suspenseAccount.clickOnOrderSearchRB();
    }
    
    @Then("^perform order deletion for (.*)$")
    public void perform_order_deletion_for_orderNumber(String orderNumber) throws InterruptedException, FileNotFoundException {
    	suspenseAccount.performOrderDeletion(orderNumber);
    }
    @Then("^search and delete the order from row (.*) to (.*)$")
    public void search_and_delete_the_order_from_row_start_index_to_end_index(int startIndex,int endIndex) throws InterruptedException, IOException {
    	
    	suspenseAccount.performOrderDeletion(startIndex, endIndex);
    }
    
}
