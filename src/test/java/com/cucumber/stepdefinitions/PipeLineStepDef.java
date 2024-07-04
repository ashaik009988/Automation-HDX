package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import com.cucumber.pages.ReportsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PipeLineStepDef extends Genericfunction {
    ReportsPage reportspage = new ReportsPage();

    @When("User should able to go to reports wickes")
    public void user_should_able_to_go_to_reports_wickes() {
        clickOnElement(WebElements.Report_tab);
    }

    @Then("User should able to check Newly added column is displayed")
    public void user_should_able_to_check_newly_added_column_is_displayed() throws InterruptedException {
        reportspage.Frameswitching_for_grid_table();
        Assert.assertTrue(findElement(WebElements.Manifest_Group).isDisplayed());
    }
    @Then("User should able to see New column header Manifest Group is displayed")
    public void user_should_able_to_see_new_column_header_manifest_group_outbase_is_displayed() {
        reportspage.Frameswitching_for_grid_table();
        Assert.assertEquals("Manifest Group / Outbase",findElement(WebElements.Manifest_Group).getText());
    }

    @Then("User should able to see the New column positioned between the current columns A and B in \"units in Pipeline\"report")
    public void user_should_able_to_see_the_new_column_positioned_between_the_current_columns_a_and_b_in_units_in_pipeline_report() {
        reportspage.Frameswitching_for_grid_table();
        Assert.assertEquals("Sub Category",findElement(WebElements.Sub_Category).getText());
        Assert.assertEquals("Supplier Category",findElement(WebElements.Supplier_Category).getText());
    }

    @When("user should able to select {string} value")
    public void user_should_able_to_select_value(String string) throws InterruptedException {
        reportspage.Frameswitching_for_date_table();
        Select objSelect = new Select(findElement(WebElements.outbase3));
        objSelect.selectByVisibleText(string);
        clickOnElement(WebElements.report_view_button);
    }


    @Then("User should able to see the Newly added filter displayed as all or {string} for units in Pipeline report")
    public void user_should_able_to_see_the_newly_added_filter_displayed_as_all_or_for_units_in_pipeline_report(String string) {
        reportspage.Frameswitching_for_grid_table();
        List<WebElement> outbase=findElements(WebElements.outbase_values);
        for(int i=1;i<outbase.size();i++){
            Assert.assertEquals(string,outbase.get(i).getText());
        }
    }



}
