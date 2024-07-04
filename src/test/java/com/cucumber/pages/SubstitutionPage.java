package com.cucumber.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;

public class SubstitutionPage extends Genericfunction {

    public void click_on_sku_for_substitute() throws Throwable {
        List<WebElement> col1 = findElements(WebElements.substitutiontable);
        By last = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]");
        doubleclick(last);
        childwindow();
    }

    public void click_on_sku_for_substitute_page(String sku) throws Throwable {
        threewindow();
        Thread.sleep(4000);
        List<WebElement> total = driver.findElements(WebElements.substitutiontable);

        for (int i = total.size(); i > 1; i--) {

            List<WebElement> rowdetails = findElements(
                    By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]/td"));

            System.out.println("Clicking the row : " + i);
            String substitutesku = rowdetails.get(4).getText();

            By last = By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]");
            System.out.println("for checking : " + substitutesku);
            Thread.sleep(2000);

            //		if (!(substitutesku !=null)) {

            doubleclick(last);
            product_enquiry(sku);

//			}

        }
        Thread.sleep(3000);

        //clickOnElement(WebElements.okay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOk']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        driver.switchTo().window(child1);
    }

    public void click_on_sku_for_substitute_page_with_replacing_quantity(String sku, int replace_quantity) throws Throwable {
        threewindow();
        Thread.sleep(4000);
        List<WebElement> total = driver.findElements(WebElements.substitutiontable);

        for (int i = 2; i <= (replace_quantity + 1); i++) {

            List<WebElement> rowdetails = findElements(
                    By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]/td"));

            System.out.println("Clicking the row : " + i);
            String substitutesku = rowdetails.get(4).getText();

            By last = By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]");
            System.out.println("for checking : " + substitutesku);
            Thread.sleep(2000);

            //		if (!(substitutesku !=null)) {

            doubleclick(last);
            product_enquiry(sku);

//			}

        }
        Thread.sleep(3000);

        //clickOnElement(WebElements.okay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOk']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        driver.switchTo().window(child1);
    }

    public void click_on_sku_for_substitute_page_with_replacing_quantity(String replace, String sku, int replace_quantity) throws Throwable {
        threewindow();
        Thread.sleep(4000);
        List<WebElement> total = driver.findElements(WebElements.substitutiontable);

        for (int i = total.size()-1; i >=2; i--) {

            WebElement rowdetails = findElement(
                    By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]/td[3]"));

            System.out.println("Clicking the row : " + i);
            String substitutesku = rowdetails.getText();

            By last = By.xpath("//table[@id='tblgvSubstituteOrderLines']/thead/tr[" + i + "]");
            Thread.sleep(2000);
            if (substitutesku.contains(replace)) {
                doubleclick(last);
                product_enquiry(sku);
                replace_quantity--;
            }
            if(replace_quantity == 0){
                break;
            }

        }
        Thread.sleep(3000);

        //clickOnElement(WebElements.okay);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOk']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        driver.switchTo().window(child1);
    }


    public void product_enquiry(String sku) throws InterruptedException {
        Thread.sleep(2000);
        fourwindow();
        Thread.sleep(2000);
        clickOnElement(WebElements.otherradiobtn);
        Thread.sleep(2000);
        // findElement(WebElements.inputsku).clear();
        sendkeys(WebElements.inputsku, sku);
        clickOnElement(WebElements.skusearch);
        Thread.sleep(2000);
        clickOnElement(WebElements.skuproductselection);
        Thread.sleep(2000);
        clickOnElement(WebElements.okaysku);

        driver.switchTo().window(child2);
    }


    public void click_landed_on_item_detail_page() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(WebElements.closesubstitute);
        driver.switchTo().window(parentid1);
    }

    // Validating the Visititems from Visitbreakdown
    public void validateVisitbreakdown() throws InterruptedException {
        driver.switchTo().frame("ifMain");
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size() - 1) + "]/td"));
        System.out.println("List is : " + out);
        String status = out.get(5).getText();
        System.out.println(status);

        if (status.contains("Superseded - Line Substituted")) {

            System.out.println("Visit Item is : " + status);
        }

    }

    public void select_the_visit() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(WebElements.force_debrief);
        Thread.sleep(2000);
        clickOnElement(WebElements.debrief_table);
        Thread.sleep(2000);
        //	clickOnElement(WebElements.save_debrief);
        //	isElementClickable(WebElements.save_debrief);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOK']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        check_alert_text_and_accept();
        Thread.sleep(2000);
        driver.switchTo().window(parentid);
    }


    public void select_the_visit_in_regress() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(WebElements.regress_debrief);
        Thread.sleep(2000);
        clickOnElement(WebElements.debrief_table);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOK']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        //	check_alert_text_and_accept();
        Thread.sleep(2000);
        driver.switchTo().window(parentid);
    }

    public void select_the_visit_in_regress2() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(WebElements.regress_debrief);
        Thread.sleep(2000);
        //clickOnElement(WebElements.debrief_table);
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement save = driver.findElement(By.xpath("//input[@id='btnOK']"));
        js.executeScript("arguments[0].click();", save);
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        WebElement close = driver.findElement(By.xpath("//input[@id='btnClose']"));
        js.executeScript("arguments[0].click();", close);
        Thread.sleep(2000);
        driver.switchTo().window(parentid);
    }


    public void check_alert_text_and_accept() {
        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        String needed = "This will successfully debrief the selected visit. Do you wish to continue?";

        if (alertText.equalsIgnoreCase(needed)) {
            alert.accept();
        } else {
            throw new AssertionError("Alert doesn't exist");
        }

    }


}
