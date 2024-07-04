package com.cucumber.stepdefinitions;

import com.cucumber.pages.SuspendPage;

import io.cucumber.java.en.Then;

public class SuspendStepDefs {

	SuspendPage suspenpage = new SuspendPage();

	@Then("^User able click on suspend button visit date screen$")
	public void User_able_click_on_suspend_button_visit_date_screen() {
		suspenpage.suspend_button_click();
	}

	@Then("^User able to verify whether only two options are available in Susupension options$")
	public void User_able_to_verify_whether_only_two_options_are_available_in_Susupension_options()
			throws InterruptedException {
		suspenpage.Suspend_options_functionality();
	}

	@Then("User Select Suspended \\(Store amendment Due) and click on ok")
	public void User_Select_Suspended_Store_amendment_Due_and_click_on_ok() throws InterruptedException {
		suspenpage.suspend_reason_option_click("Store amendment Due");
	}

	@Then("^User Select Suspended - Visit On Hold and click on ok$")
	public void User_Select_Suspended_Visit_On_Hold_and_click_on_ok() {
		suspenpage.suspend_reason_option_click("Visit On Hold");
	}

	@Then("^User is able to verify the suspended in home page$")
	public void User_is_able_to_verify_the_suspended_in_home_page() throws InterruptedException {
		suspenpage.suspend_status_Verify_functionality();
	}
}
