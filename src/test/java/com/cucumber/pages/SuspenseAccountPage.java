package com.cucumber.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import junit.framework.Assert;

public class SuspenseAccountPage extends Genericfunction  {

	public void clickOnToolsMenu() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		(new WebDriverWait(driver,Duration.ofSeconds(30)))
		.until(ExpectedConditions.elementToBeClickable(WebElements.toolsMenu));
		clickOnElement(WebElements.toolsMenu);
		Thread.sleep(1000);
	}

	public void clickOnSuspenseAccount() throws InterruptedException
	{
		clickOnElement(WebElements.suspenseAccountsOption);
		Thread.sleep(50);
		before_write_excel_message();//added here from clickOnOrderSearchRB 
	}

	public void clickOnOrderSearchRB() throws InterruptedException
	{
		(new WebDriverWait(driver,Duration.ofSeconds(30)))
		.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ifMain"));
		WebElement until1 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.elementToBeClickable(WebElements.orderSearchRB));
		clickOnElement(WebElements.orderSearchRB);
		Thread.sleep(50);
		//		for writing report
//		before_write_excel_message(); - it was here before
	}

	public boolean searchOrderNumber(String orderNumber) throws InterruptedException, FileNotFoundException
	{
		clearField(WebElements.orderSearchBox);
		Thread.sleep(20);
		sendkeys(WebElements.orderSearchBox, orderNumber);
		Thread.sleep(50);
		
//		added newly
		WebElement until7 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.visibilityOfElementLocated(WebElements.searchButton));
		
		//end of new
		
		clickOnElement(WebElements.searchButton);
				Thread.sleep(4000);
				
				boolean isComVisible = (new WebDriverWait(driver,Duration.ofSeconds(60)))
						.until(ExpectedConditions.invisibilityOfElementLocated(WebElements.communicatingServer));
				

		WebElement until1 = (new WebDriverWait(driver,Duration.ofSeconds(60)))
				.until(ExpectedConditions.visibilityOfElementLocated(WebElements.suspenseAccountValidationText));
		String suspenseActualText = gettext(WebElements.suspenseAccountValidationText);
		//System.out.println("suspenseActualText-->"+suspenseActualText);

		boolean isOrderPresent= WebElements.suspenseAccountPresentText.equalsIgnoreCase(suspenseActualText);
		//			return false if suspense 1-0 based on that a)put loop for remaining 3 methods b)in report write it's not found
		if(!isOrderPresent)
		{
			write_excel_message_OrderDeletion(orderNumber, "NA");
		}
		return isOrderPresent;

	}

	public void clickOnDeleteButton() throws InterruptedException
	{
		WebElement until1 = (new WebDriverWait(driver,Duration.ofSeconds(60)))
				.until(ExpectedConditions.elementToBeClickable(WebElements.orderTree));

		clickOnElement(WebElements.orderTree);
		WebElement until2 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.elementToBeClickable(WebElements.deleteButton));
		clickOnElement(WebElements.deleteButton);
	}

	public void enterReasonInDeleteWindowAndCompleteDeletion() throws InterruptedException
	{
		boolean windowCount = (new WebDriverWait(driver,Duration.ofSeconds(60)))
				.until(ExpectedConditions.numberOfWindowsToBe(2));
		//System.out.println("windowCount-->"+windowCount);
		//		(new WebDriverWait(driver,Duration.ofSeconds(60)))
		//		.until(ExpectedConditions.titleIs(title)) ;
		//		switch to reason window
		switchWindow(1);
		String currentWindowTitle= driver.getTitle();
		//System.out.println("currentWindowTitle-->"+currentWindowTitle);

		WebElement until1 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.elementToBeClickable(WebElements.reasonTextArea));
		sendkeys(WebElements.reasonTextArea, "Deleting through automation script");

		WebElement until2 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.elementToBeClickable(WebElements.reasonOkButton));
		clickOnElement(WebElements.reasonOkButton);
	}

	public void validateOrderIsDeleted(String orderNumber) throws InterruptedException, FileNotFoundException
	{
		Thread.sleep(100);
		switchWindow(0);
		Thread.sleep(100);
		(new WebDriverWait(driver,Duration.ofSeconds(60)))
		.until(ExpectedConditions.alertIsPresent());
		
		Alert successAlert = driver.switchTo().alert();


		//		String alertActualText = successAlert.getText();
		//		//System.out.println(alertActualText);
		//		Assert.assertTrue("Alert message shown as expected", alertActualText.equalsIgnoreCase(WebElements.alertMessageText));
		//		switchWindow(0);

		successAlert.accept();
		String currentWindowTitle= driver.getTitle();
				//System.out.println("currentWindowTitle-->"+currentWindowTitle);
		driver.switchTo().defaultContent();
		(new WebDriverWait(driver,Duration.ofSeconds(30)))
		.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("ifMain"));
		Thread.sleep(100);
		
//		added newly
		WebElement until1 = (new WebDriverWait(driver,Duration.ofSeconds(30)))
				.until(ExpectedConditions.visibilityOfElementLocated(WebElements.searchButton));
		
		//end of new
		
		clickOnElement(WebElements.searchButton);
		Thread.sleep(800);
		//		check whether it's needed
		//		(new WebDriverWait(driver,Duration.ofSeconds(30)))
		//		.until(ExpectedConditions.invisibilityOfElementLocated(WebElements.communicatingServer));
		WebElement until7 = (new WebDriverWait(driver,Duration.ofSeconds(60)))
				.until(ExpectedConditions.visibilityOfElementLocated(WebElements.suspenseAccountValidationText));
		String suspenseActualText = gettext(WebElements.suspenseAccountValidationText);
		//System.out.println("suspenseActualText-->"+suspenseActualText);
		boolean isOrderDeleted= suspenseActualText.equalsIgnoreCase(WebElements.suspenseAccountText);
		//		 Assert.assertTrue("Suspend Account got deleted successfully", suspenseActualText.equalsIgnoreCase(WebElements.suspenseAccountText));
		//		 add report
		if(isOrderDeleted)
		{
			write_excel_message_OrderDeletion(orderNumber, "Pass"); 
		}else {
			write_excel_message_OrderDeletion(orderNumber, "Fail");
		}

	}

	public void performOrderDeletion(String orderNumber) throws InterruptedException, FileNotFoundException
	{
		boolean isOrderPresent=searchOrderNumber(orderNumber);
		//		if order is present delete
		if(isOrderPresent)
		{
			clickOnDeleteButton();
			enterReasonInDeleteWindowAndCompleteDeletion();
			validateOrderIsDeleted(orderNumber);
		}
		//		if order is not present print message in excel
		else {
			System.out.println(orderNumber+" is not found");
		}
	}

	public void performOrderDeletion(int startIndex,int endIndex) throws InterruptedException, IOException
	{
		//		reading orderNumber
		String orderNumber="";
		String filePath = System.getProperty("user.dir");
		String testDataPath= filePath + "\\src\\test\\resources\\TestData\\SuspendOrderDeletion.xlsx";
		FileInputStream data_file = new FileInputStream(testDataPath);
		@SuppressWarnings("resource")
		XSSFWorkbook data_workbook = new XSSFWorkbook(data_file);
		XSSFSheet sheet = data_workbook.getSheetAt(0);
		hashMap = new HashMap<String, String>();
try {
		for(int i=startIndex;i<=endIndex;i++)
		{
			Row currentRow = sheet.getRow(i);
			 orderNumber=currentRow.getCell(1).getStringCellValue().trim();
			System.out.println("RowNumber--> "+i+" order number--> "+orderNumber);

			boolean isOrderPresent=searchOrderNumber(orderNumber);
			//		if order is present delete
			if(isOrderPresent)
			{
				clickOnDeleteButton();
				enterReasonInDeleteWindowAndCompleteDeletion();
				validateOrderIsDeleted(orderNumber);
			}
			//		if order is not present print message in excel
			else {
				System.out.println(orderNumber+" is not found");
			}
		}
	}
	catch(Exception e)
	{
		write_excel_message_OrderDeletion(orderNumber, "Fail");	
	}
}
}

