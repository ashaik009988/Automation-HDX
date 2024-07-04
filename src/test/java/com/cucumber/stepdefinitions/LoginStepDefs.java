package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.ScreenshotUtils;
import GenericFunction.WebElements;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.io.IOException;
import java.time.Duration;

import com.cucumber.pages.*;
public class LoginStepDefs extends Genericfunction {
	LoginPage loginPage= new LoginPage();

	
	@Given("^User on Login Page of hdx application$")
    public void user_on_login_page_of_hdx_application() throws Throwable {
		loginPage.user_on_login_page_of_hdx_application();
	//	ScreenshotUtils.logswithscreenshot("Launched successfully");
    }

    @When("^User able to enter userid and password$")
    public void user_able_to_enter_userid_and_password() throws Throwable {
    	loginPage.user_able_to_enter_userid_and_password();
    //	ScreenshotUtils.logswithscreenshot("Logged in successfully");
        
    }

    @Then("^User  landed on hdx home page$")
    public void user_landed_on_hdx_home_page() throws Throwable {
    	loginPage.verify_HDX_loaded();
    	minimize();
    //	ScreenshotUtils.logswithscreenshot("Landed on HDX home successfully");
//    	Assert.assertEquals("Wickes HDX", findElement(WebElements.wickeshdx).getText());
    }
    

    
    @Then("^User landed on PROD hdx home page$")
    public void user_landed_on_prod_hdx_home_page() throws Throwable {
    	try {
    	loginPage.acceptAlert();
    	}
    	catch (Exception e) {
    	loginPage.verify_HDX_loaded();   
    	minimize();
    	Thread.sleep(5000);
  //  	e.printStackTrace();
    	}
   // 	Assert.assertEquals("Wickes HDX", findElement(WebElements.wickeshdx).getText());
    }
    
    @Given("^User is on hdx home page$")
    public void user_on_hdx_home_page() throws Throwable {
    //	loginPage.user_landed_on_hdx_home_page_Change_size();
}
    
}
