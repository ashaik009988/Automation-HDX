package com.cucumber.pages;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class Audit_Security_Page extends Genericfunction {
    public void propmt_verification() throws InterruptedException {
        Thread.sleep(5000);
        childwindow();
        Assert.assertEquals("Actions Performed", gettext(WebElements.prompt_page_verify));
    }
    public void propmt_not_verification() throws InterruptedException {
        Thread.sleep(5000);
        Set<String> handles = driver.getWindowHandles();
        if(handles.size()<1){
            Assert.assertTrue("Prompt not opened",true);
        }
        else{
            Assert.assertFalse("Prompt opened",true);
        }
    }

    public void reason_entering_functionality(String reason) {
        sendkeys(WebElements.sumarry_details_text_area, reason);
        clickOnElement(WebElements.save);
    }

    public void audit_log_verify_functionality() throws InterruptedException {
        Thread.sleep(3000);
        driver.switchTo().window(parentid);
        driver.switchTo().frame(0);
        clickOnElement(WebElements.contact_management_tab);
        List<WebElement> record_count = findElements(WebElements.records_count);
        if (record_count.size() > 0) {
            By reason = By.xpath("//div[@id='divContact0']/div/div[2]/div[2]");
            By Date_time = By.xpath("//div[@id='divContact0']/div/div[1]/div[1]");
            System.out.println(gettext(reason));
            System.out.println(gettext(Date_time));
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

    }

}
