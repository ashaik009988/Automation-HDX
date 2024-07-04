package com.cucumber.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPage extends Genericfunction {
	
    public void user_on_login_page_of_hdx_application() throws Throwable {
		driver= InitiateDriver();
//		commented as part of PROD
//		Assert.assertEquals(driver.getCurrentUrl().toString(), getValueFrom_Properties("urlhome"));
		
    }

    public void user_able_to_enter_userid_and_password() throws Throwable {
    	LaunchAndLogin(driver); 
//		minimize();
        
    }

    public void verify_HDX_loaded()
    {
    	
    	
    }
    
    public void user_landed_on_hdx_home_page_Change_size() {
		
		Dimension currentSize = driver.manage().window().getSize();
		int newWidth = (int)(currentSize.getWidth()*0.8);
		int newHeight = (int)(currentSize.getHeight()*0.8);
		
		Dimension newSize = new Dimension(newWidth,newHeight);
		driver.manage().window().setSize(newSize);
		
	    driver.quit();
	}
    
    public void acceptAlert()
    {
    	(new WebDriverWait(driver,Duration.ofSeconds(2)))
		.until(ExpectedConditions.alertIsPresent());
		
		Alert successAlert = driver.switchTo().alert();
		successAlert.accept();
		driver.switchTo().defaultContent();
    }
    }
