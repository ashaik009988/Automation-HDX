package com.cucumber.pages;

import java.time.Duration;
import java.util.List;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class RemedialsPage extends Genericfunction {

    public void remidial_button_click() {
        clickOnElement(WebElements.Remedial_tab);
    }

    public void Cancel_remidial_button_click() {
        clickOnElement(WebElements.Cancel_Remedial_tab);
    }

    public void remidial_item_selecting() {
        childwindow();
        doubleclick(WebElements.Remedial_item_count);
    }

    public void remidial_reason_New_Damage() {
        threewindow();
        clickOnElement(WebElements.Remedial_reason_dropdown);
        Select objSelect = new Select(findElement(WebElements.Remedial_reason_dropdown));
        objSelect.selectByVisibleText("New - Damage");
        clickOnElement(WebElements.Remedial_ok_button);
    }

    public void remidial_reason_New_Settlement() {
        threewindow();
        clickOnElement(WebElements.Remedial_reason_dropdown);
        Select objSelect = new Select(findElement(WebElements.Remedial_reason_dropdown));
        objSelect.selectByVisibleText("New - Settlement");
        clickOnElement(WebElements.Remedial_ok_button);
    }

    public void remidial_reason_New_Faulty() {
        threewindow();
        clickOnElement(WebElements.Remedial_reason_dropdown);
        Select objSelect = new Select(findElement(WebElements.Remedial_reason_dropdown));
        objSelect.selectByVisibleText("New - Faulty");
        clickOnElement(WebElements.Remedial_ok_button);
    }
    public void Remidaial_answer_functionality_for_settlement() throws InterruptedException {
        threewindow();
        String[] s={"No","Store - Settlement"};
        for(int i=0;i<2;i++){
            String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i+1) + "]/td[3]/select";
            Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
            objSelect.selectByVisibleText(s[i]);
            Thread.sleep(2000);
            String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i+1) + "]/td[4]";
            clickOnElement(By.xpath(question_option_index));
        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (w.until(ExpectedConditions.alertIsPresent()) == null)
            System.out.println("");
        else
            driver.switchTo().alert().dismiss();

    }
    public void Remidaial_answer_functionality_for_faulty() throws InterruptedException {
        threewindow();
        String[] s={"Yes","Store - Settlement"," ","","","","Yes","Yes","Yes","Yes"};
        for(int i=0;i<10;i++){
            String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i+1) + "]/td[3]/select";
            Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
            objSelect.selectByVisibleText(s[i]);
            Thread.sleep(2000);
            String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i+1) + "]/td[4]";
            clickOnElement(By.xpath(question_option_index));
            if(i==0){
                Thread.sleep(10000);
                fourwindow();
                sendkeys(By.xpath("//ul[@id='ulCustomFields']/ul/li[1]/input"),"Top right corner");
                sendkeys(By.xpath("//ul[@id='ulCustomFields']/ul/li[2]/input")," Dent");
                sendkeys(By.xpath("//ul[@id='ulCustomFields']/ul/li[3]/input"),"-");
                clickOnElement(WebElements.Remedial_ok_button);
                i=5;
                threewindow();
            }

        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (w.until(ExpectedConditions.alertIsPresent()) == null)
            System.out.println("");
        else
            driver.switchTo().alert().dismiss();

    }




    public void Remidaial_answer_functionality() throws InterruptedException {
        threewindow();
        int i = 1;
        while (true) {
            String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[3]/select";
            Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
            objSelect.selectByVisibleText("Yes");
            Thread.sleep(2000);
            String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[4]";
            clickOnElement(By.xpath(question_option_index));
            i++;
            String question_option_selection1 = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[3]/select";
            if (gettext(By.xpath(question_option_selection1)).contains("Settlement - Wickes Install Damage")) {
                break;
            }
        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (w.until(ExpectedConditions.alertIsPresent()) == null)
            System.out.println("");
        else
            driver.switchTo().alert().dismiss();

    }

    public void Remidaial_answer_functionality_for_fleet_delivery() throws InterruptedException {
        threewindow();
        int i = 1;
        while (true) {
            String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[3]/select";
            Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
            objSelect.selectByVisibleText("Yes");
            Thread.sleep(2000);
            String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[4]";
            clickOnElement(By.xpath(question_option_index));
            i++;
            String question_option_selection1 = "//tbody[@id='ScriptQuestionsBody']/tr[" + i + "]/td[3]/select";
            if (gettext(By.xpath(question_option_selection1)).contains("Settlement - Wickes Install Damage")) {
                break;
            }
        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
        if (w.until(ExpectedConditions.alertIsPresent()) == null)
            System.out.println("");
        else
            driver.switchTo().alert().accept();

        Thread.sleep(10000);
        threewindow();
        List<WebElement> items_to_select = findElements(WebElements.Remedial_item_selecting);
        for (int j = 1; j < items_to_select.size() - 2; j++) {
            items_to_select.get(i).click();
        }
        clickOnElement(WebElements.Remedial_ok_button1);
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.switchTo().window(child1);
    }


    public void remidial_end_process() throws InterruptedException {
        clickOnElement(WebElements.Remedial_create_visit);
        clickOnElement(WebElements.Remedial_ok_button);
    }

    public void remidial_Visit_verification(String r) throws InterruptedException {
        driver.switchTo().window(parentid1);
        driver.switchTo().frame("ifMain");
        List<WebElement> s = findElements(WebElements.visitMain);
        System.out.println(s.get(s.size() - 1).getText());
        Assert.assertTrue(s.get(s.size() - 1).getText().contains(r));
    }

    public void Cancel_remidial_process() throws InterruptedException {
        childwindow();
        clickOnElement(WebElements.Cancel_Remedial_count);
        Select objSelect = new Select(findElement(By.xpath("//select[@id='Select1']")));
        objSelect.selectByVisibleText("Cancelled by Customer");
        clickOnElement(WebElements.Remedial_ok_button);
    }

    public void Canceled_remidial_Visit_verification() throws InterruptedException {
        driver.switchTo().window(parentid1);
        driver.switchTo().frame("ifMain");
        List<WebElement> s = findElements(WebElements.visitMain_plus_click );
        s.get(s.size() - 1).click();
        Thread.sleep(5000);
        Assert.assertTrue(gettext(By.xpath("//*[contains(text(),'Cancelled by Customer')]")).contains("Cancelled by Customer"));
    }


}