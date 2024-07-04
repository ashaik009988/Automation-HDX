package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import com.cucumber.pages.AmendOrder;
import com.cucumber.pages.Audit_Security_Page;
import com.cucumber.pages.CreateOrder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Audit_Security_Step_Def extends Genericfunction {
    AmendOrder amendorders = new AmendOrder();
    CreateOrder createOrders = new CreateOrder();

    Audit_Security_Page auditSecurityPage = new Audit_Security_Page();

    @When("User should be able to click the Back button")
    public void user_should_be_able_to_click_the_back_button() throws InterruptedException {
        Thread.sleep(4000);
        clickOnElement(WebElements.back_button);
    }

    @Then("user should presented with prompted screen")
    public void user_should_presented_with_prompted_screen() throws InterruptedException {
        auditSecurityPage.propmt_verification();
    }

    @Then("User should able to Enter the {string} and click on ok")
    public void user_should_able_to_enter_the_and_click_on_ok(String string) {
        auditSecurityPage.reason_entering_functionality(string);
    }

    @Then("User is able to Check date,time,reason and userid captured in audit log")
    public void user_is_able_to_check_date_time_reason_and_userid_captured_in_audit_log() throws InterruptedException {
        auditSecurityPage.audit_log_verify_functionality();
    }

    @Given("User refresh the application")
    public void user_refresh_the_application() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(4000);
    }

    @When("User Navigate to order manager")
    public void user_navigate_to_order_manager() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.order_Manager_tab);
    }

    @When("user click on to order enquiry")
    public void user_click_on_to_order_enquiry() {
        clickOnElement(WebElements.order_enquiry_option);
    }

    @When("User Navigate to  Report wickes")
    public void user_navigate_to_report_wickes() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.Report_tab);
    }

    @When("user click on to TBA report")
    public void user_click_on_to_tba_report() {
        clickOnElement(WebElements.TBA_Report);
    }

    @When("User Enters another {string}")
    public void user_enters_another(String string) throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        amendorders.searchorderids2(string);
        createOrders.switchframehere();
        Thread.sleep(5000);
    }

    @Then("user should not presented with prompted screen")
    public void user_should_not_presented_with_prompted_screen() throws InterruptedException {
        auditSecurityPage.propmt_not_verification();
    }

    @When("User Navigate to transport tab")
    public void user_navigate_to_transport_tab() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.transport);
    }

    @When("user click on to resource monitor")
    public void user_click_on_to_resource_monitor() {
        clickOnElement(WebElements.resource);
    }

    @When("User Navigate to maintenance tab")
    public void user_navigate_to_maintenance_tab() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.maintenance);
    }
    @When("User Navigate to maintenance tab2")
    public void user_navigate_to_maintenance_tab2() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(WebElements.maintenance);
    }

    @When("user click on to oos management")
    public void user_click_on_to_oos_management() {
        clickOnElement(WebElements.Out_of_Stock_Management);
    }

    @When("User Navigate to tools tab")
    public void user_navigate_to_tools_tab() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.toolsMenu);
    }

    @When("user click on to status monitor")
    public void user_click_on_to_status_monitor() {
        clickOnElement(WebElements.Status_Monitor);
    }

    @When("user click on to logout button")
    public void user_click_on_to_logout_button() {
        clickOnElement(WebElements.log_out_tab);
    }


    @When("User Navigate to stock manager")
    public void user_navigate_to_stock_manager() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.Stock_Manager);
    }

    @When("user click on to warehouse despatch")
    public void user_click_on_to_warehouse_despatch() {
        clickOnElement(WebElements.Warehouse_Despatch);
    }


    @When("User Navigate to report")
    public void user_navigate_to_report() {
        driver.switchTo().defaultContent();
        clickOnElement(WebElements.Reports);
    }

    @When("user click on to routing performance")
    public void user_click_on_to_routing_performance() {
        clickOnElement(WebElements.Routing_Performance);
    }

    @Then("User should able to close the prompt by clicing cross mark")
    public void user_should_able_to_close_the_prompt_by_clicing_cross_mark() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
        driver.switchTo().window(parentid);
    }

    @Then("User presented orderenquiry screen")
    public void user_presented_orderenquiry_screen() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame(0);
        Assert.assertEquals(gettext(WebElements.enquiry),"Enquiry");
    }

}
