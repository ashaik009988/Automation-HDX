package com.cucumber.pages;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import Utils.ExcelReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import java.util.concurrent.atomic.*;

public class check extends Genericfunction{
	
	 String response_code = "1";
     String response_description = "Call completed successfully";
     static String user_input_third_party_cust_code;
     public static WebDriver driver;
     Map<String, String> numMap = new HashMap<>();
     Map<String, String> oldMap;
     Map<String, String> newMap;
     static int oldInitialThirdPartyOrderLineNum = generateInitialThirdPartyOrderLineNum();
 //    static String part1String = part1string();
	  
	
	String path = System.getProperty("user.dir");
	
	

	
	// Reading the excel data and storing in Map
	public Map<String, String> DataMap(String sheetname,String columnname1,String columnname2) {
		
		  String excelFilePath = path+"\\src\\test\\resources\\TestData\\TestDataSheet.xlsx";
          String name= sheetname;	      
	      System.out.println("sheetname : " + name);
	      System.out.println("column1 name : " + columnname1);
	      System.out.println("column2 name : " + columnname2);	       
	      Map<String, String> orderMap = ExcelReader.readExcelData(excelFilePath,sheetname,columnname1,columnname2);	        
			 
	       return orderMap;			       
	}
	


    // Search the OrderID in Search box 
	public void searchorderid(String Orderid) throws InterruptedException {
	
		sendkeys(WebElements.seachbutton1,Orderid);
		clickOnElement(WebElements.clicksearch);
		
		Thread.sleep(5000);
		
		
	}
	
	
	// Validating Visit types in Visitbreakdown
	public void validatevisittypes(ArrayList<String> visittypes) throws Exception {
		
		
		List<WebElement> elementlist = new ArrayList<>();
		List<String> textlist = new ArrayList<>();
		
		elementlist = findElements(WebElements.itemdetailstext);
		
		for(WebElement element : elementlist) {
			
			String text = element.getText();
			textlist.add(text);
			
		}	
		
	
        ArrayList<String> extractedList = new ArrayList<>();
        for (String str : textlist) {          
            String[] parts = str.split(" - ", 2);         
            if (parts.length == 2) {
                extractedList.add(parts[1]);               
            }
        }
        
        verifyValuesInArrayListHDX(extractedList,visittypes);
  
		
	}
	
	
	
	//Switch the frame
	public void switchframehere() throws InterruptedException {
	    switchframe();
	}
	
	//Taking screenshot
	public void takescreenshotmethod() throws InterruptedException {
		takeScreenshotAfterStep();
	}
	
	
	
	// Validating the OrderDetails from Visitbreakdown
	public void validateorderdetails(String itemdetailstxt, String statustxt) throws InterruptedException {
	
		String datexpath = "(//span[contains(text(),'Visit:') and contains(text(),'"+itemdetailstxt+"')])/following::td[1]";
		String statusxpath = "(//span[contains(text(),'Visit:') and contains(text(),'"+itemdetailstxt+"')])/following::td[5]";
		
		String dateText = gettext(getByIdentifier(datexpath,"xpath"));
		
		String statusText = gettext(getByIdentifier(statusxpath,"xpath"));
	
		
		if(statusText.contains(statustxt))
		{
			Assert.assertTrue("Status Validation is successful", statusText.contains(statustxt));
			System.out.println("Status Validation is successful : " + statusText);
	
		}
		
		if(dateText != null) {
		
		System.out.println("Date retrived " + dateText);
	
		}
		
		
	}
	

	//Quit the driver
	public void quitdriver() {
		tearDown();
	}


    @Test
    public Response sendApiRequest(Map<String, String> orderMap) {
        // Set the base URI
        RestAssured.baseURI = "https://ubjrv9i883.execute-api.eu-west-1.amazonaws.com/test/wsdl";
       
     //   Map<String, String> orderMap = DataMap();
        
        // Generate the XML for each entry in the map
     //   String xmlOutput = generateXML(orderMap);
        String xmlOutput = generateXMLnew(orderMap, numMap);
       
        String part1String = part1string();
        
        // Construct the request payload
        String requestPayload = part1String +
               xmlOutput + part3string;
       
     // Print the generated XML string
        System.out.println("----------------------------------------");
        System.out.println(requestPayload);
        System.out.println("----------------------------------------");
               
       

        // Send the API request
        Response response = RestAssured.given()
                .contentType(ContentType.XML)
                .body(requestPayload)
                .post();
       
       
     

        // Print the response
        System.out.println("Response: " + response.asString());
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Line: " + response.getStatusLine());
        
        return response;
    }
    
 
    
    // Validation of fields in Visit Breakdown
    public String validations(Response response) {

    	//Validating the response
    	
    	Assert.assertEquals( "Statuscode verification failed : " + response.getStatusCode(),response.getStatusCode(), 200);	
    	Assert.assertEquals( "Status line verification failed : "+response.getStatusLine(),response.getStatusLine(), "HTTP/1.1 200 OK");
    	
    
    	
    	// Parse the XML response XmlPath 
    	XmlPath xmlPath = new XmlPath(response.asString()); 
    	
    	// Validate 'Code' and 'Description' 

    	String code = xmlPath.getString("**.findAll {it.name()=='Return'}[0].@Code");
    	String description = xmlPath.getString("**.findAll {it.name()=='Return'}[0].@Description");

    	
    	// Print the response
    	System.out.println("-----------------------------------------------");
        System.out.println("Response : " + response.asString());
        System.out.println("-----------------------------------------------");
        System.out.println("Response Code : " + response.getStatusCode());
        System.out.println("Response Line : " + response.getStatusLine());
        System.out.println("Response Description : " + description);
    	  
        // Print the order
         System.out.println("Generated Order id : "+user_input_third_party_cust_code);
    	
    	
    	
    	Assert.assertEquals("Response description in body Validation failed " ,response_description,description  );
    	Assert.assertEquals(" Response code in body Validation failed ",response_code, code );
    	
    
     return user_input_third_party_cust_code;
    	
    }
   
   //Seperated third part of XML 
    String part3string = "&lt;OrderTenderLine TenderCode=\"01\" TenderDesc=\"Cash\" CreationDateTime=\"2023-06-06T15:40:35\" TenderAmountIncTax=\"4578.14\" /&gt;\n" +
            "&lt;/Order&gt;\n" +
            "&lt;VisitAddress VisitAddressNum=\"1\" ISOCountryCode=\"GBR\" AddrLine1=\"Holly Trees\" AddrLine2=\"High Street\" AddrLine4=\"NORTHAMPTON\" PostCode=\"NN6 6DD\" NearbyPostCode=\"0\" Title=\"Mr\" Forename=\"SIT\" Initials=\"S\" Surname=\"OmFleetone\" Telephone1=\"07709502403\" Telephone2=\"07709502403\" Telephone3=\"07709502403\" /&gt;\n" +
            "&lt;/OrderDetailXML&gt;</OrderDetailXML>\n" +
            "        </CreateOrderWithTransformations01>\n" +
            "    </soap:Body>\n" +
            "</soap:Envelope>";
   
   
    
    // Generation of Part1 XML Payload
    public String part1string() {
   
        String randomABCD = generateRandomABCD();

        // User input for ThirdPartyCustCode and ThirdPartyOrderCode
         user_input_third_party_cust_code = "80"+randomABCD+"-8804-V";
     

        // Increment the numeric part of AlternateOrderCode by 1 and 2 respectively
        String[] parts = user_input_third_party_cust_code.split("-");
        int numericPart = Integer.parseInt(parts[0]);

        String new_alternate_order_code_1 = (numericPart + 1) + "-" + parts[1] + "-" + parts[2];
        String new_alternate_order_code_2 = (numericPart + 2) + "-" + parts[1] + "-" + parts[2];
       
        String part1 = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\r\n"
        + "    <soap:Body>\r\n"
        + "        <CreateOrderWithTransformations01 xmlns=\"http://axida.com/HDi\">\r\n"
        + "            <UserID>WIXVIS</UserID>\r\n"
        + "            <Password>glasses</Password>\r\n"
        + "            <SystemID>VISION</SystemID>\r\n"
        + "            <CallReference>VSN-BS4U01-INT</CallReference>\r\n"
        + "            <ClientNum>700</ClientNum>\r\n"+
                "            <OrderDetailXML>&lt;OrderDetailXML xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" Version=\"1\"&gt;\n" +
                "&lt;Customer ClientNum=\"700\" ISOCountryCode=\"GBR\" ThirdPartyCustCode=\"" + user_input_third_party_cust_code + "\" Title=\"Mr\" Initials=\"S\" Forename=\"SIT\" Surname=\"OmFleetone\" AddrLine1=\"Holly Trees\" AddrLine2=\"High Street\" AddrLine4=\"NORTHAMPTON\" Country=\"UK\" PostCode=\"NN6 6DD\" NearbyPostCode=\"0\" Telephone1=\"07709502403\" Telephone2=\"07709502403\" Telephone3=\"07709502403\" Email1=\"omrajarajan.d@wickes.co.uk\" MarketingPref=\" Y\" /&gt;\n" +
                "&lt;Order ClientNum=\"700\" ISOCountryCode=\"GBR\" ThirdPartyOrderCode=\"" + user_input_third_party_cust_code + "\" OrderSourceType=\"VISION\" DivisionCode=\"00018\" SaleOUCode=\"008804\" ISOCurrencyCode=\"GBP\" ISOLangCode=\"EN\" OrderCurIncTaxNetPrice=\"4578.14\" OrderPriceAdjust=\"0\" OrderSalesPersonName=\"Swathy Rukmani\" OrderDeliveryCharge=\"0\" OrderPaymentStatus=\"1\" OrderDescription=\"Kitchen\" OrderType=\"11\"&gt;\n" +
                "&lt;AltOrderCode AlternateOrderCode=\"" + new_alternate_order_code_1 + "\" AlternateOrderCodeType=\"2\" /&gt;\n" +
                "&lt;AltOrderCode AlternateOrderCode=\"" + new_alternate_order_code_2 + "\" AlternateOrderCodeType=\"2\" /&gt;\n";

       
        return part1;
        }
    
    
   //Genarating random 4 digit numbers
    public static String generateRandomABCD() {
        Random random = new Random();
        // Generate random integers between 1000 and 9999 for ABCD
        int abcd = random.nextInt(9000) + 1000;
        return String.valueOf(abcd);
    }
   
   
    //Generating random 8 digit number
    private static int generateInitialThirdPartyOrderLineNum() {
        Random random = new Random();
        return random.nextInt(900000) + 20000000; 
        // Generates a random integer between 20000000 and 20999999
    }
    
    
    
    //Generation of part2 XML Payload
    public static String generateXMLnew(Map<String, String> orderMap, Map<String, String> numMap) {
        StringBuilder xmlOutput = new StringBuilder();
        AtomicInteger counter = new AtomicInteger(oldInitialThirdPartyOrderLineNum);

        for (Map.Entry<String, String> entry : orderMap.entrySet()) {
            String prodCode = entry.getKey();
            String orderQty = entry.getValue();

            // Ignore if the orderQty is 0
            if (orderQty.equals("0")) {
                continue;
            }

            String thirdPartyOrderLineNum;

            if (numMap.containsKey(prodCode)) {
                thirdPartyOrderLineNum = numMap.get(prodCode);
            } else {
                thirdPartyOrderLineNum = String.valueOf(counter.getAndIncrement());
                numMap.put(prodCode, thirdPartyOrderLineNum);
            }

            xmlOutput.append("<OrderLine ProdCode=\"").append(prodCode).append("\" ");
            xmlOutput.append("ThirdPartyOrderLineNum=\"").append(thirdPartyOrderLineNum).append("\" ");
            xmlOutput.append("ThirdPartyOrderLineQty=\"").append(orderQty).append("\" ");
            xmlOutput.append("ProdOptDesc1=\"100087\" ProdOptDesc4=\"000826\" ProdPrice=\"530.01\" VisitAddressNum=\"1\">\n");
            xmlOutput.append("<OrderLineService ServCode=\"1\" />\n");
            xmlOutput.append("</OrderLine>\n");
        }

        return xmlOutput.toString();
    }
}


