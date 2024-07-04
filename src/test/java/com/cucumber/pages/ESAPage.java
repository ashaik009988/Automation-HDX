package com.cucumber.pages;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class ESAPage extends Genericfunction {
    Select objSelect;

    public void Maintence_tab_click_functionality() {
        clickOnElement(WebElements.Maintence_Tab);
    }

    public void Upload_tab_click_functionality() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(WebElements.Upload_Tab);
    }


    public void wickes_and_stock_avaliability_upload() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.client_select);
        objSelect = new Select(findElement(WebElements.client_select));
        objSelect.selectByVisibleText("Wickes");
        Thread.sleep(5000);
        clickOnElement(WebElements.File_Type_select);
        objSelect = new Select(findElement(WebElements.File_Type_select));
        objSelect.selectByVisibleText("Stock Availability Upload");

    }

    public void Button_search() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(WebElements.button_search);
    }

    public void file_Validation(String filename, String Status) {
        String f = "//*[contains(text(),'" + filename + "')]";
        String x = "//*[contains(text(),'" + filename + "')]/following-sibling::td[2]";
        gettext(By.xpath(f));
        System.out.println(gettext(By.xpath(f)));
    }

    public void product_maintence_tab_click_functionality() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(WebElements.product_Maintence_Tab);
    }


    public void sku_searching_functionality(String sku_number) throws InterruptedException {
        driver.switchTo().frame("ifMain");
        sendkeys(WebElements.find_search_box, sku_number);
    }

    public void user_select_sku_code_from_the_droplist(){
        objSelect = new Select(findElement(WebElements.in_select));
        objSelect.selectByVisibleText("SKU Code");
    }

    public void user_click_search_and_press_view_button() throws InterruptedException {
        clickOnElement(WebElements.button_search);
        Thread.sleep(4000);
        clickOnElement(WebElements.sku_select);
        clickOnElement(WebElements.view_button);
        Thread.sleep(3000);
    }
    public void stock_detailsm_functionality() throws InterruptedException {
       childwindow();
       clickOnElement(WebElements.stock_Detail_tab2);
    }
    public void check_the_changes_in_the_stock_figure(String sku_figure) throws InterruptedException {
        System.out.println( gettext(WebElements.Exact_Sku_Cont));
        Assert.assertEquals(sku_figure,gettext(WebElements.Exact_Sku_Cont));
    }

    public void Visit_operations() throws InterruptedException {
        List<WebElement> s=findElements(WebElements.itemdetailstext);
        String visittext=s.get(s.size()-1).getText().split("-")[0].trim();
        String Visit_no=visittext.split(" ")[1].trim();
        clickOnElement(WebElements.visitMain_plus_click);
        String visit_sub_clicks="trtreeviewVisit|-1|"+Visit_no+"|";
        Thread.sleep(3000);
        clickOnElement(By.xpath("//tr[contains(@id ,'"+visit_sub_clicks+"')]/td[1]/img[1]"));
        doubleclick(By.xpath("//tr[contains(@id ,'"+visit_sub_clicks+"')][2]"));
        Thread.sleep(3000);
        doubleclick(By.xpath("//tr[contains(@id ,'"+visit_sub_clicks+"')][2]"));
        Thread.sleep(3000);
    }

    public Map double_click_the_product(Map map){
        childwindow();
        do {
            String productKey=gettext(WebElements.product_code).split(" ")[0].trim();
            if(map.containsKey(productKey)){
                if(findElement(WebElements. product_next_button).isEnabled()){
                    clickOnElement(WebElements.product_next_button);
                }
            }
            else{
                clickOnElement(WebElements. product_detail_button);
                threewindow();
                clickOnElement(WebElements.stock_Detail_tab2);
                String product_count_value=gettext(WebElements.Exact_Sku_Cont);
                map.put(productKey,product_count_value);
                clickOnElement(WebElements.ok_button);
                switchWindow(1);
            }

        }while (findElement(WebElements. product_next_button).isEnabled());
        clickOnElement(WebElements.close_button);
        switchWindow(0);
        return map;
    }

    public void user_go_to_visit_detail_tab() throws InterruptedException {
        Thread.sleep(5000);
        switchframe();
        clickOnElement(WebElements.visit_detail_tab);
    }
    public void user_is_able_to_click_tba_in_the_top_right_side_of_visit_deatails() throws InterruptedException {
       driver.switchTo().frame("WidgVisitDetails");
        gettext(WebElements.visit_Date_tab);
        Assert.assertEquals(gettext(WebElements.visit_Date_tab),"TBA");
        clickOnElement(WebElements.visit_Date_tab);
    }

    public void stock_date_avaliable_validator(){
        childwindow();
        gettext(WebElements.stock_avaliable_date);
        System.out.println(gettext(WebElements.stock_avaliable_date));
    }

    public String double_click_particularsku(String skucode){
        String replenishment_days = null;
        childwindow();
        do {
            String productKey=gettext(WebElements.product_code).split(" ")[0].trim();
            if(productKey.equalsIgnoreCase(skucode)){
                clickOnElement(WebElements. product_detail_button);
                threewindow();
                replenishment_days=gettext(WebElements.replenishment_days);
                clickOnElement(WebElements.stock_Detail_tab2);
                String product_count_value=gettext(WebElements.Exact_Sku_Cont);
                clickOnElement(WebElements.ok_button);
                switchWindow(1);
                break;
            }
            clickOnElement(WebElements. product_next_button);
        }while (findElement(WebElements. product_next_button).isEnabled());
        clickOnElement(WebElements.close_button);
        switchWindow(0);
        return replenishment_days;
    }



}
