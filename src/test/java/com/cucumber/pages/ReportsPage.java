package com.cucumber.pages;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportsPage extends Genericfunction {


    public void Month_and_year_selecting_function(String Date) throws InterruptedException {
        String arr[] = Date.split(" ");
        System.out.println(Date);

        //retriving the month and year from calender
        List<WebElement> date_year = findElements(WebElements.Month_year_report);
        String Month = date_year.get(0).getText();
        String year = date_year.get(1).getText();

        //Reteriving months index
        String[] Calender_of_M = Months();
        int Actual_Calender_index = 0, selection_calender_index = 0;
        for (int i = 1; i < Calender_of_M.length; i++) {
            if (Calender_of_M[i].equalsIgnoreCase(Month)) {
                Actual_Calender_index = i;
            }
            if (Calender_of_M[i].equalsIgnoreCase(arr[1])) {
                selection_calender_index = i;
            }
        }

        //selecting the month and year in actual calender
        if (Date.contains(year)) {
            if (Date.contains(Month)) {

            } else if (selection_calender_index > Actual_Calender_index) {
                while (true) {
                    clickOnElement(WebElements.Month_year_next_button);
                    date_year = findElements(WebElements.Month_year_report);
                    year = date_year.get(1).getText();
                    Month = date_year.get(0).getText();
                    if (Month.contains(arr[1])) {
                        break;
                    }
                }

            } else {
                while (true) {
                    clickOnElement(WebElements.Month_year_prev_button);
                    date_year = findElements(WebElements.Month_year_report);
                    year = date_year.get(1).getText();
                    Month = date_year.get(0).getText();
                    if (Month.contains(arr[1])) {
                        break;
                    }
                }
            }


        } else if (Integer.parseInt(arr[2]) < Integer.parseInt(year)) {

            while (true) {
                clickOnElement(WebElements.Month_year_prev_button);
                date_year = findElements(WebElements.Month_year_report);
                year = date_year.get(1).getText();
                Month = date_year.get(0).getText();
                if (Date.contains(year)) {
                    while (!arr[1].contains(Month)) {
                        clickOnElement(WebElements.Month_year_prev_button);
                        date_year = findElements(WebElements.Month_year_report);
                        year = date_year.get(1).getText();
                        Month = date_year.get(0).getText();
                    }
                    break;
                }
            }
        } else {

            while (true) {

                clickOnElement(WebElements.Month_year_next_button);
                date_year = findElements(WebElements.Month_year_report);
                year = date_year.get(1).getText();
                Month = date_year.get(0).getText();
                if (Date.contains(year)) {
                    while (!arr[1].contains(Month)) {
                        clickOnElement(WebElements.Month_year_next_button);
                        date_year = findElements(WebElements.Month_year_report);
                        year = date_year.get(1).getText();
                        Month = date_year.get(0).getText();
                    }
                    break;
                }
            }
        }

        //selecting the date
        String g = arr[0].substring(0, 1);
        if (g.equalsIgnoreCase("0")) {
            String f = arr[0].substring(1);
            String Date_x = "//td[@data-handler='selectDay']/a[text()='" + f + "']";
            clickOnElement(By.xpath(Date_x));
        } else {
            String Date_x = "//td[@data-handler='selectDay']/a[text()='" + arr[0] + "']";
            clickOnElement(By.xpath(Date_x));
        }

    }
    public void Month_and_year_selecting_function2(String Date) throws InterruptedException {
        String arr[] = Date.split(" ");
        System.out.println(Date);

        //retriving the month and year from calender
        List<WebElement> date_year = findElements(WebElements.Month_year_report2);
        String Month = date_year.get(0).getText();
        String year = date_year.get(1).getText();

        //Reteriving months index
        String[] Calender_of_M = Months();
        int Actual_Calender_index = 0, selection_calender_index = 0;
        for (int i = 1; i < Calender_of_M.length; i++) {
            if (Calender_of_M[i].equalsIgnoreCase(Month)) {
                Actual_Calender_index = i;
            }
            if (Calender_of_M[i].equalsIgnoreCase(arr[1])) {
                selection_calender_index = i;
            }
        }

        //selecting the month and year in actual calender
        if (Date.contains(year)) {
            if (Date.contains(Month)) {

            } else if (selection_calender_index > Actual_Calender_index) {
                while (true) {
                    clickOnElement(WebElements.Month_year_next_button2);
                    date_year = findElements(WebElements.Month_year_report2);
                    year = date_year.get(1).getText();
                    Month = date_year.get(0).getText();
                    if (Month.contains(arr[1])) {
                        break;
                    }
                }

            } else {
                while (true) {
                    clickOnElement(WebElements.Month_year_prev_button2);
                    date_year = findElements(WebElements.Month_year_report2);
                    year = date_year.get(1).getText();
                    Month = date_year.get(0).getText();
                    if (Month.contains(arr[1])) {
                        break;
                    }
                }
            }


        } else if (Integer.parseInt(arr[2]) < Integer.parseInt(year)) {

            while (true) {
                clickOnElement(WebElements.Month_year_prev_button2);
                date_year = findElements(WebElements.Month_year_report2);
                year = date_year.get(1).getText();
                Month = date_year.get(0).getText();
                if (Date.contains(year)) {
                    while (!arr[1].contains(Month)) {
                        clickOnElement(WebElements.Month_year_prev_button2);
                        date_year = findElements(WebElements.Month_year_report2);
                        year = date_year.get(1).getText();
                        Month = date_year.get(0).getText();
                    }
                    break;
                }
            }
        } else {

            while (true) {

                clickOnElement(WebElements.Month_year_next_button2);
                date_year = findElements(WebElements.Month_year_report2);
                year = date_year.get(1).getText();
                Month = date_year.get(0).getText();
                if (Date.contains(year)) {
                    while (!arr[1].contains(Month)) {
                        clickOnElement(WebElements.Month_year_next_button2);
                        date_year = findElements(WebElements.Month_year_report2);
                        year = date_year.get(1).getText();
                        Month = date_year.get(0).getText();
                    }
                    break;
                }
            }
        }

        //selecting the date
        String g = arr[0].substring(0, 1);
        if (g.equalsIgnoreCase("0")) {
            String f = arr[0].substring(1);
            String Date_x = "(//td[@data-handler='selectDay']/a[text()='" + f + "'])[2]";
            clickOnElement(By.xpath(Date_x));
        } else {
            String Date_x = "(//td[@data-handler='selectDay']/a[text()='" + arr[0] + "'])[2]";
            clickOnElement(By.xpath(Date_x));
        }

    }

    public Map<String, String> DataStore(Map<String, String> Order_data) throws ParseException {
        Order_data = new HashMap<String, String>();

        //clicking on summary tab
        clickOnElement(WebElements.summary_tab);

        //storing store number
        String[] parts = gettext(WebElements.store_no).split(" ");
        Order_data.put("store", parts[0]);

        //storing home,work,email value
        Order_data.put("phone", gettext(WebElements.mobile_no).trim());
        //Order_data.put("work", gettext(WebElements.work_no));
        //Order_data.put("home", gettext(WebElements.home_no));
        Order_data.put("email", gettext(WebElements.email_no));

        //storing customer name
        Order_data.put("customer name", gettext(WebElements.customer_name).split(",")[0]);

        //storeing hdi order code
        Order_data.put("HDi order code", gettext(WebElements.Hdi_order_code));

        //storeing wms order code
        List<WebElement> g = findElements(WebElements.wms_order_code);
        String j = "(//li/span[text()='WMS Order Code:'])[" + g.size() + "]/following-sibling::*";
        Order_data.put("WMS order code", gettext(By.xpath(j)));

        //Storeing Date
        Order_data.put("ordered date", gettext(WebElements.Date_ordered));
        Order_data.put("ordered formatted date", date_formatter(gettext(WebElements.Date_ordered)));

        //Storing order number
        Order_data.put("order code", gettext(WebElements.order_code));


        //clicking on visit details
        clickOnElement(WebElements.visitdetails);
        driver.switchTo().frame("WidgVisitDetails");

        //storeing outbase code
        String depot = gettext(By.xpath("//li[6]//span[2]"));
        Order_data.put("outbase value", depot);

        //storing visit date
        String visit_date = gettext(By.xpath("//span[text()='Visit Date:']/following-sibling::*"));
        Order_data.put("visit date", visit_date);

        System.out.println(Order_data);
        return Order_data;
    }

    public Map<String, String> DataStore_for_goodwill(Map<String, String> Order_data) throws ParseException {
        Order_data = new HashMap<String, String>();

        //clicking on summary tab
        clickOnElement(WebElements.summary_tab);

        //storing store number
        String[] parts = gettext(WebElements.store_no).split(" ");
        Order_data.put("store", parts[0]);

        //storing home,work,email value
        Order_data.put("phone", gettext(WebElements.mobile_no));
        //Order_data.put("work", gettext(WebElements.work_no));
        //Order_data.put("home", gettext(WebElements.home_no));
        Order_data.put("email", gettext(WebElements.email_no));

        //storing customer name
        Order_data.put("customer name", gettext(WebElements.customer_name).split(",")[0]);

        //storeing hdi order code
        Order_data.put("HDi order code", gettext(WebElements.Hdi_order_code));

        //Storeing Date
        Order_data.put("ordered date", gettext(WebElements.Date_ordered));
        Order_data.put("ordered formatted date", date_formatter(gettext(WebElements.Date_ordered)));

        //Storing order number
        Order_data.put("order code", gettext(WebElements.order_code));


        //clicking on visit details
        clickOnElement(WebElements.visitdetails);
        driver.switchTo().frame("WidgVisitDetails");

        //storeing outbase code
        String depot = gettext(By.xpath("//li[6]//span[2]"));
        Order_data.put("outbase value", depot);

        //storing visit date
        String visit_date = gettext(By.xpath("//span[text()='Visit Date:']/following-sibling::*"));
        Order_data.put("visit date", visit_date);


        System.out.println(Order_data);
        return Order_data;
    }

    public Map<String, String> DataStore_for_items_to_follow(Map<String, String> Order_data) throws ParseException {
        Order_data = new HashMap<String, String>();

        //storing date and wms code
        List<WebElement> visitlines = findElements(WebElements.visitMain);
        int i = visitlines.size();
        int wms_index = 0;
        for (int j = i + 2; j > 2; j--) {
            String p = "//table[@id='tbltreeviewVisit']/thead/tr[" + j + "]/td[2]";
            if (!gettext(By.xpath(p)).equalsIgnoreCase("tba")) {
                Order_data.put("ordered date", gettext(By.xpath(p)));
                Order_data.put("ordered formatted date", date_formatter_in_visit(Order_data.get("ordered date")));
                wms_index = j;
                break;
            }
        }

        //clicking on summary tab
        clickOnElement(WebElements.summary_tab);

        //storing wms code
        String wms = "(//li/span[text()='WMS Order Code:']/following-sibling::*)[" + (wms_index - 2) + "]";
        Order_data.put("WMS order code", gettext(By.xpath(wms)));

        //storing store number
        String[] parts = gettext(WebElements.store_no).split(" ");
        Order_data.put("store", parts[0]);

        //storing home,work,email value
        Order_data.put("phone", gettext(WebElements.mobile_no));
        //Order_data.put("work", gettext(WebElements.work_no));
        //Order_data.put("home", gettext(WebElements.home_no));
        Order_data.put("email", gettext(WebElements.email_no));

        //storing customer name
        Order_data.put("customer name", gettext(WebElements.customer_name).split(",")[0]);

        //Storing order number
        Order_data.put("order code", gettext(WebElements.order_code));


        //clicking on visit details
        clickOnElement(WebElements.visitdetails);
        driver.switchTo().frame("WidgVisitDetails");

        //storeing outbase code
        String depot = gettext(By.xpath("//li[6]//span[2]"));
        Order_data.put("outbase value", depot);

        return Order_data;
    }

    public Map<String, String> DataStore_for_substitution_report(Map<String, String> Order_data) throws ParseException, InterruptedException {
        Order_data = new HashMap<String, String>();

        //storing date and wms code
        List<WebElement> visitlines = findElements(WebElements.visitMain);
        int i = visitlines.size();
        int wms_index = 0;
        for (int j = i + 2; j > 2; j--) {
            String p = "//table[@id='tbltreeviewVisit']/thead/tr[" + j + "]/td[6]";
            if (gettext(By.xpath(p)).contains("Superseded")) {
                p = "//table[@id='tbltreeviewVisit']/thead/tr[" + j + "]/td[1]/img[1]";
                String x = "//table[@id='tbltreeviewVisit']/thead/tr[" + (j+1) + "]/td[1]/span";
                clickOnElement(By.xpath(p));
                Thread.sleep(3000);
                String s=gettext(By.xpath(x));
                String temp=s.split("\\(")[1];
                Order_data.put("substitution count",temp.split(" ")[0]);
                break;
            }


        }

        //clicking on summary tab
        clickOnElement(WebElements.summary_tab);

        //storing store number
        String[] parts = gettext(WebElements.store_no).split(" ");
        Order_data.put("store", parts[0]);

        //storing home,work,email value
        Order_data.put("phone", gettext(WebElements.mobile_no).trim());
        //Order_data.put("work", gettext(WebElements.work_no));
        //Order_data.put("home", gettext(WebElements.home_no));
        Order_data.put("email", gettext(WebElements.email_no));

        //storing customer name
        Order_data.put("customer name", gettext(WebElements.customer_name).split(",")[0]);

        //storeing hdi order code
        Order_data.put("HDi order code", gettext(WebElements.Hdi_order_code));

        //storeing wms order code
        List<WebElement> g = findElements(WebElements.wms_order_code);
        String j = "(//li/span[text()='WMS Order Code:'])[" + g.size() + "]/following-sibling::*";
        Order_data.put("WMS order code", gettext(By.xpath(j)));

        //Storeing Date
        Order_data.put("ordered date", gettext(WebElements.Date_ordered));
        Order_data.put("ordered formatted date", date_formatter(gettext(WebElements.Date_ordered)));

        //Storing order number
        Order_data.put("order code", gettext(WebElements.order_code));


        //clicking on visit details
        clickOnElement(WebElements.visitdetails);
        driver.switchTo().frame("WidgVisitDetails");

        //storeing outbase code
        String depot = gettext(By.xpath("//li[6]//span[2]"));
        Order_data.put("outbase value", depot);

        //storing visit date
        String visit_date = gettext(By.xpath("//span[text()='Visit Date:']/following-sibling::*"));
        Order_data.put("visit date", visit_date);

        System.out.println(Order_data);


        return Order_data;
    }


    public void Frameswitching_for_grid_table() {
        driver.switchTo().defaultContent();
        driver.switchTo().frame("ifMain");
        driver.switchTo().frame("fmReportGrid");
    }

    public void Frameswitching_for_date_table() throws InterruptedException {
        Thread.sleep(6000);
        driver.switchTo().frame("ifMain");
        driver.switchTo().frame("fmParameters");
    }

    public void Scrolling_particular_order_in_table(String s, String order) {
        WebElement element = findElement(By.xpath(s));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Assert.assertEquals(gettext(By.xpath(s)), order);
    }

    public void Validating_confirm_delhivery(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("store"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[7]")));
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[11]")));
    }

    public void Validating_items_to_follow(Map<String, String> Order_data) {
        String order = Order_data.get("WMS order code");
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']")));
        Assert.assertEquals(Order_data.get("ordered formatted date"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[1]")));
        Assert.assertEquals(Order_data.get("outbase value"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[2]")));
    }

    public void Validating_TBA_report(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("outbase value"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[3]")));
        Assert.assertEquals(Order_data.get("HDi order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[1]")));
    }

    public void Validating_order_received_report(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("outbase value"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[5]")));
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[11]")));
    }

    public void Validating_Delivery_Information_by_day_report(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("HDi order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[2]")));
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[1]")));
        Assert.assertEquals(Order_data.get("phone"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[12]")).trim());
        Assert.assertEquals(Order_data.get("visit date"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[1]")));
        String s = gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[10]"));
        Order_data.get("customer name").contains(s);
    }

    public void Validating_Goodwill_payment_report(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        String s = gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[3]"));
        Order_data.get("customer name").contains(s);
    }
    public void Validating_Customer_Notifications(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/following-sibling::*)[5]")));
    }

    public void Validating_Emergency_Orders(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        String s = gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[1]"));
        Order_data.get("customer name").contains(s);
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='" + order + "']/preceding-sibling::*)[15]")));
        //Assert.assertEquals(Order_data.get("phone"),gettext(By.xpath("(//table[@class='gridTable']/tbody/tr/td[text()='"+order+"']/preceding-sibling::*)[20]")).trim());
    }
    public void Validating_substution_report(Map<String, String> Order_data) {
        String order = "//tbody/tr/td[text()='"+Order_data.get("order code")+"']";
        List<WebElement> s=findElements(By.xpath(order));
        System.out.println(s.size());
        Assert.assertEquals(Order_data.get("substitution count"),String.valueOf(s.size()) );
    }
    
    
    
    public void verify_In_visit_breakdown_for_mixed_order_with_status(String cust, String contact,Map<String, String> Order_data) {
    	System.out.println("Map is:"+Order_data);
        String order = Order_data.get("order code");
        String phone = Order_data.get("phone");
        String customer_name = Order_data.get("customer name");
        Assert.assertEquals(phone.trim(), contact.trim());
        Assert.assertEquals(customer_name, cust);
    }

    public void Validating_Line_Walk(Map<String, String> Order_data) {
        String order = Order_data.get("WMS order code");
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }

    public void Validating_Spares_walk(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }
    public void Validating_Workflow_Queue_Contents_Report(Map<String, String> Order_data) {
        String order = Order_data.get("WMS order code");
        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }
    public void Validating_stock_Movement_Manifest_Report(Map<String, String> Order_data) {
//        String order = Order_data.get("WMS order code");
//        Assert.assertEquals(Order_data.get("WMS order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }
    public void Validating_delivery_and_collection(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }
    public void Validating_new_remedials(Map<String, String> Order_data) {
        String order = Order_data.get("order code");
        Assert.assertEquals(Order_data.get("order code"), gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order + "')]")));
    }
    public void Validating_catch_all_preview(String order_code) {

        Assert.assertEquals(order_code, gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td[contains(text(),'" + order_code + "')]")));
    }
    public void Validating_remedials_report(String Remedial_no,String Remedial_count) {
        int i=Integer.parseInt(Remedial_no);
        Assert.assertEquals(Remedial_count, gettext(By.xpath("//table[@class='gridTable']/tbody/tr/td["+(i+1)+"]")));
    }



}
