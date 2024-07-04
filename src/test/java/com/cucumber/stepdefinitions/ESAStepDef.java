package com.cucumber.stepdefinitions;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import com.cucumber.pages.ESAPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ESAStepDef extends Genericfunction {
    ESAPage esapage = new ESAPage();
    Map product_sku_pair=new HashMap();
    String Replenishment_days=null;

    @When("User go to Maintenance tab and click on Upload")
    public void user_go_to_maintenance_tab_and_click_on_upload() throws InterruptedException {
        esapage.Maintence_tab_click_functionality();
        esapage.Upload_tab_click_functionality();
    }

    @Then("User Select Client as Wickes File type as stock availablity upload")
    public void user_select_client_as_wickes_file_type_as_stock_availablity_upload() throws InterruptedException {
        esapage.wickes_and_stock_avaliability_upload();
    }

    @Then("User click on Search")
    public void user_click_on_search() throws InterruptedException {
        esapage.Button_search();
    }

    @Then("User Check the file {string} is consumed by HDX and check the status {string}")
    public void user_check_the_file_is_consumed_by_hdx_and_check_the_status(String filename, String status) throws InterruptedException {
        esapage.file_Validation(filename, status);
    }

    @When("User go to Maintenance tab and click on product maintence")
    public void user_go_to_maintenance_tab_and_click_on_product_maintence() throws InterruptedException {
        esapage.Maintence_tab_click_functionality();
        esapage.product_maintence_tab_click_functionality();
    }

    @Then("User Enters the {string}\\(active sku) in find box")
    public void user_enters_the_sku_number_active_sku_in_find_box(String string) throws InterruptedException {
        esapage.sku_searching_functionality(string);

    }

    @Then("User Select sku code from the droplist of in")
    public void user_select_sku_code_from_the_droplist_of_in() {
        esapage.user_select_sku_code_from_the_droplist();
    }

    @When("User Click search and press view")
    public void user_click_search_and_press_view() throws InterruptedException {
        esapage.user_click_search_and_press_view_button();
    }

    @Then("User click stock detailsm")
    public void user_click_stock_detailsm() throws InterruptedException {
        esapage.stock_detailsm_functionality();

    }

    @Then("Check the changes in the stock figure {string} as per the ESA file uploaded")
    public void check_the_changes_in_the_stock_figure_as_per_the_esa_file_uploaded(String string) throws InterruptedException {
        esapage.check_the_changes_in_the_stock_figure(string);

    }

    @When("User Go to visit breakdown tab")
    public void user_go_to_visit_breakdown_tab() throws InterruptedException {
        esapage.Visit_operations();
    }

    @When("User Double click the product")
    public void user_double_click_the_product() {
        product_sku_pair=esapage.double_click_the_product(product_sku_pair);
    }

    @Then("User Check the stock level in stock details tab.")
    public void user_check_the_stock_level_in_stock_details_tab() {
        System.out.println( product_sku_pair);
    }

    @When("User Go to visit detail screen")
    public void user_go_to_visit_detail_screen() throws InterruptedException {
        esapage.user_go_to_visit_detail_tab();
    }

    @Then("User is able to Click TBA in the top right side")
    public void user_is_able_to_click_tba_in_the_top_right_side() throws InterruptedException {
        esapage.user_is_able_to_click_tba_in_the_top_right_side_of_visit_deatails();
    }

    @Then("User is able to Check whether the date is shown within replenishment lead time.")
    public void user_is_ableto_check_whether_the_date_is_shown_within_replenishment_lead_time() {
        esapage.stock_date_avaliable_validator();
    }
    @Then("User Double click the picking {string} having no stock")
    public void user_double_click_the_picking_sku_having_no_stock(String string) {
        Replenishment_days=esapage.double_click_particularsku(string);
    }

    @Then("Check the replenishment lead time in summary screen")
    public void check_the_replenishment_lead_time_in_summary_screen() {
       System.out.println( Replenishment_days+" Replenishment_days are avaliable");
    }

    @Then("Check whether the date is shown after lead time of SKU having no stock.\"")
    public void check_whether_the_date_is_shown_after_lead_time_of_sku_having_no_stock() {
        esapage. stock_date_avaliable_validator();
    }



}
