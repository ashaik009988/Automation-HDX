package com.cucumber.pages;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SuspendPage extends Genericfunction {
    public void suspend_button_click() {
        childwindow();
        findElement(WebElements.suspend_button).click();
    }

    public void Suspend_options_functionality() throws InterruptedException {
        Thread.sleep(5000);
        threewindow();
        List<WebElement> options = findElements(WebElements.suspendoptions);
        int flag1 = 0, flag2 = 0;
        for (WebElement i : options) {
            if (i.getText().contains("Store Amendment Due")) {
                flag1 = 1;
            } else if (i.getText().contains("Visit On Hold")) {
                flag2 = 1;
            }
        }
        if (flag1 == 1 && flag2 == 1) {
            System.out.println("options are avaliable");
        }
    }

    public void suspend_reason_option_click(String reason) {
        threewindow();
        List<WebElement> options = findElements(WebElements.suspendoptions);
        for (WebElement i : options) {
            if (i.getText().contains(reason)) {
                i.click();
                i.getText();
            }
        }
        findElement(WebElements.suspend_ok_button).click();
    }

    public void suspend_status_Verify_functionality() throws InterruptedException {
        Thread.sleep(5000);
        switchWindow(0);
        driver.switchTo().frame("ifMain");
        clickOnElement(WebElements.visitbreakdown);
        Thread.sleep(2000);
        clickOnElement(WebElements.refresh);
        Thread.sleep(2000);
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String status1 = out.get(5).getText();
        String status = "Suspended";
        if (status1.contains(status)) {
            System.out.println("Suspend is successful ");
            Assert.assertTrue(true, "Suspend is successful ");
        }
        else {
        	 Assert.assertTrue(false, "Suspend is unsuccessful");
        }
    }
}