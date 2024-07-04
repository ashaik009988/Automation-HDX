package com.cucumber.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;


public class SplitPage extends Genericfunction {

    VisitBreakDownPage visitBreakDown = new VisitBreakDownPage();


    public void skus_Spilit_Functionality(Boolean sp, Map<String, String> map) throws InterruptedException {
        if (sp) {
            //clicking the spilt visit option in visit screen
            findElement(WebElements.spilit).click();
            threewindow();

            //unselecting the all the skus items of spilit
            List<WebElement> l = findElements(WebElements.spilit_sku_count);
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i).isSelected()) {
                    l.get(i).click();
                }
            }

            //getting list of sku numbers
            List<WebElement> skus = driver.findElements(By.xpath("//table[@id='tblSplitVisitGridView']/thead/tr/td[3]/span"));

            //spiliting process
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                for (int i = 0; i < skus.size(); i++) {
                    int flag = 0;
                    String sku_Number = skus.get(i).getText();
                    if (entry.getKey().equalsIgnoreCase(sku_Number)) {
                        int sk_no = Integer.parseInt(entry.getValue());
                        l.get(i).click();
                        sk_no--;
                        String newvalue = Integer.toString(sk_no);
                        entry.setValue(newvalue);
                        if (sk_no == 0) {
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        break;
                    }
                }

            }

            // final submission of the split visit
            findElement(WebElements.spilit_ok_button).click();
            Thread.sleep(5000);
            fourwindow();
            findElement(WebElements.spilit_close_button).click();

            //switching to home page
            driver.switchTo().window(parentid1);
        } else {
            System.out.println("spilit visit button is not enabled");
        }
    }


    public void verify_In_Home_Page_Spilit_Is_Happend_With_Status(String item, String status) throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        Thread.sleep(4000);
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item1 = out.get(0).getText().split("-")[2].trim();
        String status1 = out.get(5).getText();

        System.out.println("Ac: " + item1);
        System.out.println("Ex: " + item);
        System.out.println("Ac: " + status1);
        System.out.println("Ex: " + status);
        if (item1.contains(item) && status1.contains(status)) {
            Assert.assertTrue(true, "Validation is succesfull");
        } else {
            Assert.assertTrue(false, "Validation Failed");
        }
    }

    public void verify_In_Home_Page_debrief_With_Status(String item, String status) throws InterruptedException {
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item1 = out.get(0).getText().split("-")[2].trim();
        String status1 = out.get(5).getText();

        System.out.println(item1);
        System.out.println(status1);
        if (item1.contains(item) && status1.contains(status)) {
            System.out.println("Validation is succesfull ");
            Assert.assertTrue(true, "Validation is succesfull");
        } else {
            Assert.assertTrue(false, "Validation Failed");
        }
    }

    public void verify_In_Home_Page_debrief_With_Status2(String item, String status) throws InterruptedException {
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item1 = out.get(0).getText().split("-")[2].trim();
        String status1 = out.get(5).getText();

        System.out.println(item1);
        System.out.println(status1);
        if (item1.contains(item) && status1.contains(status)) {
            System.out.println("Validation is succesfull ");
            Assert.assertTrue(false, "Validation is succesfull");
        } else {
            Assert.assertTrue(true, "Validation Failed");
        }
    }

    public void verify_In_Home_Page_Spilit_Is_Happend_With_multiple_Status(Map<String, String> validationmap) throws InterruptedException {
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item1 = out.get(0).getText().split("-")[2].trim();
        String status1 = out.get(5).getText();

        System.out.println(item1);
        System.out.println(status1);

        if (validationmap.containsKey(item1)) {
            String mapstatus = validationmap.get(item1);
            if (mapstatus.contains(status1)) {
                Assert.assertTrue(true, "Split is successful");
            } else {
                Assert.assertTrue(false, "Split Failed");
            }
        }

    }


    public void click_for_Split(Map<String, String> map, Map<String, String> itemMap) throws Throwable {

        for (Map.Entry<String, String> entry : map.entrySet()) {
            visitBreakDown.double_click_for_TBA_date();
            Thread.sleep(3000);
            HashMap<String, String> map1 = new HashMap<>();
            map1.put(entry.getKey(), entry.getKey());
            boolean sp = button_enabled(WebElements.spilit);
            //skus spiliting function
            skus_Spilit_Functionality(sp, map1);
            verify_In_Home_Page_Spilit_Is_Happend_With_multiple_Status(itemMap);

        }
    }

    public void verify_In_Home_Page_Override_Is_Happend_With_Status(String item, String status) throws InterruptedException {
        driver.switchTo().frame("ifMain");
        Thread.sleep(10000);
        isElementClickable(WebElements.tablesize);
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item1 = out.get(0).getText().split("-")[1].trim();
        String status1 = out.get(5).getText();

        System.out.println(item1);
        System.out.println(status1);
        if (item.contains(item1) && status.contains(status1)) {
            Assert.assertTrue(true, "Override is succesfull");
        } else {
            Assert.assertTrue(false, "Override Failed");
        }
    }

    public void verify_In_Home_Page_Override_Is_Happend_With_address() throws InterruptedException {
//      driver.switchTo().frame("ifMain");
//	    clickOnElement(WebElements.visitbreakdown);
//		Thread.sleep(2000);
//		clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String address = out.get(3).getText();
        String postalcode = out.get(4).getText();

        System.out.println(address);
        System.out.println(postalcode);
        if (address.contains("10 Chruch Bell Sound") && postalcode.contains("CF31 4QH")) {
            System.out.println("Address Override is successful ");
        }
    }


    public void verify_In_visit_breakdown_for_mixed_order_with_status(String item, String status) throws InterruptedException {

        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size() - 1) + "]/td"));
        System.out.println(out.get(0).getText());
        String item1 = out.get(0).getText().split("-")[2].trim();
        String status1 = out.get(5).getText();
        System.out.println("Ac: " + item1);
        System.out.println("Ex: Supplier Delivery");
        System.out.println("Ac: " + status1);
        System.out.println("Ex: Awaiting supplier debrief");
        if (item1.contains("Supplier Delivery") && status1.contains("Awaiting supplier debrief")) {
            System.out.println("Supplier Validation is succesful");
        }


        List<WebElement> out2 = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String item2 = out2.get(0).getText().split("-")[2].trim();
        String status2 = out2.get(5).getText();

        System.out.println("Ac: " + item2);
        System.out.println("Ex: " + item);
        System.out.println("Ac: " + status2);
        System.out.println("Ex: " + status);
        if (item2.contains(item) && status2.contains(status)) {
            System.out.println("Mixed Order Validation is succesful");
        }

    }

    public void verify_In_visit_breakdown_for_order_with_status(String item, String status) throws InterruptedException {
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        By tabledata1 = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td[6]");
        By tabledata2 = By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td[1]");
        String item1 = gettext(tabledata2).split("-")[1].trim();
        String status1 = gettext(tabledata1).trim();
        System.out.println("Ac: " + item1);
        System.out.println("Ac: " + status1);
        Assert.assertEquals(item1, item);
        Assert.assertEquals(status1, status);
    }
}
	
	
	
