package com.cucumber.pages;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class SummaryPage extends Genericfunction {
	public void user_click_on_Summary_Tab() throws Throwable {
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
    	driver.switchTo().frame("ifMain");
    	findElement(WebElements.summaryTab);
    	clickOnElement(WebElements.summaryTab);   
    	Thread.sleep(1000);
    }
	
	public void verifyUserDetails()
	{
//		Name
		compareText(getValue("Name"), getDetailsInSummaryPage("Order For"), "Name");
//		Home
		compareText(getValue("Home"), getDetailsInSummaryPage("Home"), "Home");
//		Mobile
		compareText(getValue("Mobile"), getDetailsInSummaryPage("Mobile"), "Mobile");
//		Email
		compareText(getValue("E-mail"), getDetailsInSummaryPage("E-mail"), "E-mail");
	}
	
	public String getDetailsInSummaryPage(String valueName)
	{
		String detailXpath="//span[@class='HighlightLabel' and contains(text(),'"+valueName+"')]//following-sibling::span";
		String actualValue=gettext(getByIdentifier(detailXpath, "xpath"));
		return actualValue;
	}
	
	/*public void POST_REQUEST(String inputEntity) {
		try {

			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpPost postRequest = new HttpPost("http://localhost:8080/RESTfulExample/json/product/post");

			StringEntity input = new StringEntity(inputEntity);
			input.setContentType("application/json");
			postRequest.setEntity(input);

			HttpResponse response = httpClient.execute(postRequest);

			if (response.getStatusLine().getStatusCode() != 201) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}*/
	
	

}
