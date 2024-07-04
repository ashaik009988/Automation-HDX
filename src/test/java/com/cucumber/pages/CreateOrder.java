package com.cucumber.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.cucumber.stepdefinitions.CreateOrderStepDefs;

import GenericFunction.Genericfunction;
import GenericFunction.WebElements;
import Utils.ExcelReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import java.util.concurrent.atomic.*;

public class CreateOrder extends Genericfunction {

    String response_code = "1";
    String response_description = "Call completed successfully";
    String user_input_third_party_cust_code;
    private static final Logger logger = LogManager.getLogger(CreateOrderStepDefs.class);
    String name;

    String path = System.getProperty("user.dir");

    // Reading the excel data and storing in Map
    public Map<String, String> DataMap(String sheetname) {
        String excelFilePath = path + "\\src\\test\\resources\\TestData\\TestDataSheet.xlsx";
        String name = sheetname;
        System.out.println("sheetname" + name);
        Map<String, String> orderMap = ExcelReader.readExcelData(excelFilePath, name);
        System.out.println("Item count in OrderMap : ");

        for (Map.Entry<String, String> entry : orderMap.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        return orderMap;
    }

    // Reading the excel data and storing in Map
    public Map<String, String> DataMapp(String sheetname, String columnname1, String columnname2) {

        String excelFilePath = path + "\\src\\test\\resources\\TestData\\TestDataSheet.xlsx";
        String name = sheetname;
        System.out.println("sheetname : " + name);
        System.out.println("column1 name : " + columnname1);
        System.out.println("column2 name : " + columnname2);
        Map<String, String> orderMap = ExcelReader.readExcelData(excelFilePath, sheetname, columnname1, columnname2);
        System.out.println("Map : " + orderMap);
        return orderMap;
    }

    // Search the OrderID in Search box
    public void searchorderid(String Orderid) throws InterruptedException {

        sendkeys(WebElements.seachbutton1, Orderid);
        clickOnElement(WebElements.clicksearch);

        Thread.sleep(5000);

    }

    // Validating Visit types in Visitbreakdown
    public void validatevisittypes(ArrayList<String> visittypes) throws Exception {
        List<WebElement> elementlist = new ArrayList<>();
        List<String> textlist = new ArrayList<>();

        elementlist = findElements(WebElements.itemdetailstext);

        for (WebElement element : elementlist) {

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

        verifyValuesInArrayListHDX(extractedList, visittypes);
        logPass("Visittypes Validation is successful ");

    }

    public boolean validateskumaps(Map<String, String> map1, Map<String, String> map2) {

        // GlobalcreateMap = map1;

        for (Map.Entry<String, String> entry : map1.entrySet()) {

            String key = entry.getKey();
            String value = entry.getValue();

            // Log in the report for Sku's with Expected and Actual Quantity
            if (!map2.containsKey(key) || !map2.get(key).equals(value)) {
                return false;
            }
        }
        return true;
    }

    // Checking substring in lists
    public boolean allSubstringsContained(List<String> list1, List<String> list2) {
        for (String str2 : list2) {
            boolean substringFound = false;
            for (String str1 : list1) {
                if (str1.contains(str2)) {
                    substringFound = true;
                    break;
                }
            }
            if (!substringFound) {
                return false;
            }
        }
        return true;
    }

    // Switch the frame
    public void switchframehere() throws InterruptedException {
        switchframe();
    }

    // Taking screenshot
    public void takescreenshotmethod() throws InterruptedException {
        takeScreenshotAfterStep();
    }

    // Validating the OrderDetails from Visitbreakdown
    public void validateorderdetails(String itemdetailstxt, String statustxt) throws InterruptedException {

        String datexpath = "(//span[contains(text(),'Visit:') and contains(text(),'" + itemdetailstxt
                + "')])/following::td[1]";
        String statusxpath = "(//span[contains(text(),'Visit:') and contains(text(),'" + itemdetailstxt
                + "')])/following::td[5]";

        String dateText = gettext(getByIdentifier(datexpath, "xpath"));

        String statusText = gettext(getByIdentifier(statusxpath, "xpath"));

        if (statusText.contains(statustxt)) {
            Assert.assertTrue("Status Validation is successful", statusText.contains(statustxt));
            System.out.println("Status Validation is successful : " + statusText);
        }

        if (dateText != null) {

            System.out.println("Date retrived " + dateText);
        }

    }

    // Validating the Datevalues from Visitbreakdown
    public void validatedatefield() throws InterruptedException {
        try {
            driver.switchTo().frame("ifMain");
        } catch (Exception e) {
            System.out.println();
        }
        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(
                By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String dateText = out.get(1).getText();
        System.out.println(dateText);

        if (dateText != null && dateText.contains("2024")) {

            System.out.println("Date retrived " + dateText);
            Assert.assertTrue("Validation Passed", true);
        } else {
            Assert.assertTrue("Validation Failed", false);
        }

    }

    // Validating the Datevalues from Visitbreakdown
    public void validatedatefieldafterDating() throws InterruptedException {

        List<WebElement> col1 = driver.findElements(WebElements.tablesize);
        List<WebElement> out = findElements(
                By.xpath("//table[@id='tbltreeviewVisit']/thead/tr[" + (col1.size()) + "]/td"));
        String dateText = out.get(1).getText();
        System.out.println(dateText);

        if (dateText != null && dateText.contains("2024")) {

            System.out.println("Date retrived " + dateText);
        }

    }

    // Validating the OrderDetails from Visitbreakdown for Amned
    public void validateorderdetailsamend(String itemdetailstxt, String statustxt) throws InterruptedException {

        String datexpath = "(//span[contains(text(),'Visit:') and contains(text(),'" + itemdetailstxt
                + "')])/following::td[1]";
        String statusxpath = "(//span[contains(text(),'Visit:') and contains(text(),'" + itemdetailstxt
                + "')])/following::td[5]";

        String fold1 = "(//span[contains(text(),'" + itemdetailstxt + "')]/preceding::img[2])[last()]";
        String fold2 = "(//span[contains(text(),'" + statustxt + "')]/preceding::img[2])[last()]";

        String dateText = gettext(getByIdentifier(datexpath, "xpath"));

        String statusText = gettext(getByIdentifier(statusxpath, "xpath"));

        if (statusText.contains(statustxt)) {
            Assert.assertTrue("Status Validation is successful", statusText.contains(statustxt));
            System.out.println("Status Validation is successful : " + statusText);
            logPass("Status Validation is successful : " + statusText);
        }

        if (dateText != null) {

            System.out.println("Date retrived " + dateText);
            logPass("Date Retrived is not Null : " + dateText);
        }

    }

    // Validating skeus for Create order
    public Map<String, String> validateskus() throws Exception {

        List<WebElement> visits = findElements(WebElements.visitMain);
        String visit1 = visits.get(visits.size() - 1).getText().split(" ")[1];
        String visit2 = visits.get(visits.size() - 2).getText().split(" ")[1];

        visit_click(visit1);
        visit_click(visit2);

        String visitItemsxpath1 = "//tr[contains(@id,'" + visit1 + "|" + visit1 + "')]";
        List<WebElement> listOfVisits1 = findElements(By.xpath(visitItemsxpath1));

        String visitItemsxpath2 = "//tr[contains(@id,'" + visit2 + "|" + visit2 + "')]";
        List<WebElement> listOfVisits2 = findElements(getByIdentifier(visitItemsxpath2, "xpath"));

        listOfVisits1.addAll(listOfVisits2);
        List<String> splitList = new ArrayList<>();

        // System.out.println(String.valueOf(arr[i][0]));

        for (WebElement element : listOfVisits1) {
            String text = element.getText();
            String[] parts = text.split("-");
            splitList.add(parts[0].trim());
        }

        // Create Map to store the count of each item

        Map<String, String> countMap = new HashMap<>();

        for (String item : splitList) {
            countMap.put(item, String.valueOf(Integer.parseInt(countMap.getOrDefault(item, "0")) + 1));
        }

        System.out.println("Item count in CountMap : ");

        for (Map.Entry<String, String> entry : countMap.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return countMap;

    }

    // Returning Map (Text and count) for the required List of WebElements
    public Map<String, String> returnrequiredMap(List<String> list) {

        List<String> splitList = new ArrayList<>();

        for (String element : list) {
            // String text = element.getText();
            String[] parts = element.split("-");
            splitList.add(parts[0].trim());
        }

        Map<String, String> countMap = new HashMap<>();

        for (String item : splitList) {
            countMap.put(item, String.valueOf(Integer.parseInt(countMap.getOrDefault(item, "0")) + 1));
        }
        System.out.println("Item count in CountMap : ");

        for (Map.Entry<String, String> entry : countMap.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        return countMap;

    }

    public String[] Click_Of_buttons_and_its_counts(String visitno) throws InterruptedException {
        String ab = "//img[contains(@id,'imgtreeviewVisit" + visitno + "')]";
        // clicking main visit plus button
        By x = By.xpath("//img[contains(@id,'imgtreeviewVisit" + visitno + "')]");
        // driver.findElement(By.xpath(x)).click();
        clickOnElement(x);

        // getting actual count of plus button in a visit
        Thread.sleep(5000);
        List<WebElement> s = findElements(x);
        // driver.findElements(By.xpath("//img[contains(@id,'imgtreeviewVisit" + visitno
        // + "')]"));

        // created a array for Storing the plus elements of visit in array
        String k[] = new String[s.size() - 1];

        // iterating the plus elements and storing in array
        for (int i = 1; i < s.size(); i++) {
            s.get(i).click();
            int p = i + 1;
            By loc = By.xpath("(" + ab + "/following-sibling::span)[" + p + "]");
            k[i - 1] = findElement(loc).getText().split("\\(")[0].trim();
        }
        return k;
    }

    List<String> listAwait = new ArrayList<>();
    List<String> listCancelled = new ArrayList<>();
    Map<String, String> amendMap = new HashMap<>();
    Map<String, String> cancelledMap = new HashMap<>();

    public void visititems(String s) throws InterruptedException {

        List<WebElement> visits = findElements(WebElements.visitMain);
        int k = 0;
        // Getting last two visits only
        if (s.equalsIgnoreCase("MIXED")) {
            k = 2;
        } else if (s.equalsIgnoreCase("SINGLE")) {
            k = 1;
        }

        for (int i = visits.size() - k; i < visits.size(); i++) {
            String visit = visits.get(i).getText().split(" ")[1];
            System.out.println(visit);
            user_did(visit);
        }

        System.out.println("Await Global list :" + listAwait);
        System.out.println("Cancelled Global list :" + listCancelled);

    }

    // Click the plus button on the visit
    public void visititemsclick(String s) throws InterruptedException {

        List<WebElement> visits = findElements(WebElements.visitMain);
        int k = 0;
        // Getting last two visits only
        if (s.equalsIgnoreCase("MIXED")) {
            k = 2;
        } else if (s.equalsIgnoreCase("SINGLE")) {
            k = 1;
        }

        for (int i = visits.size() - k; i < visits.size(); i++) {
            String visit = visits.get(i).getText().split(" ")[1];
            System.out.println(visit);
            Click_Of_buttons_and_its_counts(visit);
        }

    }

    // Get the Amend SKus
    public Map<String, String> validateskusamend() {

        amendMap = returnrequiredMap(listAwait);
        System.out.println("Amend Map :" + amendMap);
        return amendMap;

    }

    // Get the Cancelled Skus
    public Map<String, String> validateskusamendcancelled() {

        cancelledMap = returnrequiredMap(listCancelled);

        System.out.println("Cancelled Map :" + cancelledMap);
        return cancelledMap;

    }

    // Getting the skus from HDX visitvreak down screen
    public void user_did(String s) throws InterruptedException {
        // Getting list of visits

        // getting plus button count
        String arr1[] = Click_Of_buttons_and_its_counts(s);

        List<WebElement> list1_Await = new ArrayList<WebElement>();
        List<WebElement> list2_Cancelled = new ArrayList<WebElement>();
        List<String> list1_AwaitS = new ArrayList<>();
        List<String> list2_CancelledS = new ArrayList<>();

        if ((arr1.length) == 1) {
            String x = "//tr[contains(@id,'" + s + "|" + s + "')]";
            List<WebElement> list1_temp = findElements(By.xpath(x));
            list1_Await = list1_temp.subList(1, list1_temp.size());
            list1_AwaitS = convert_webElements_to__text(list1_Await);
            listAwait.addAll(list1_AwaitS);

        } else {

            if (arr1[0].equalsIgnoreCase("Cancelled by Customer")) {
                String x = "//tr[contains(@id,'" + s + "|" + s + "')]";
                List<WebElement> list1_temp = findElements(By.xpath(x));
                int index = 0;
                for (int i = 1; i < list1_temp.size(); i++) {
                    String temp = list1_temp.get(i).getText().split("\\(")[0].trim();
                    if (temp.contains("Awaiting Route Finalisation") || temp.contains("Awaiting supplier debrief")
                            || temp.contains("Due Stock Allocation")) {
                        break;
                    }
                    list2_Cancelled.add(list1_temp.get(i));
                    index++;
                }
                list1_Await = list1_temp.subList(index + 2, list1_temp.size());
                list1_AwaitS = convert_webElements_to__text(list1_Await);
                listAwait.addAll(list1_AwaitS);
                list2_CancelledS = convert_webElements_to__text(list2_Cancelled);
                listCancelled.addAll(list2_CancelledS);

            } else {
                String x = "//tr[contains(@id,'" + s + "|" + s + "')]";
                List<WebElement> list1_temp = findElements(By.xpath(x));
                // System.out.println(list1_Await.size());
                int index = 1;
                for (int i = 1; i < list1_temp.size(); i++) {
                    String temp = list1_temp.get(i).getText().split("\\(")[0].trim();
                    // System.out.println(temp);
                    if (temp.contains("Cancelled by Customer")) {
                        break;
                    }
                    list1_Await.add(list1_temp.get(i));
                    index++;
                    // System.out.println("Index is : "+index);
                }
                list2_Cancelled = list1_temp.subList(index + 2, list1_temp.size());
                list1_AwaitS = convert_webElements_to__text(list1_Await);
                listAwait.addAll(list1_AwaitS);
                list2_CancelledS = convert_webElements_to__text(list2_Cancelled);
                listCancelled.addAll(list2_CancelledS);

            }
        }
    }

    // List of WebElements to Text
    public List<String> convert_webElements_to__text(List<WebElement> list) {

        List<String> textList = new ArrayList<>();

        for (WebElement s : list) {
            textList.add(s.getText());
        }

        return textList;

    }

    public void quitdriver() {
        tearDown();
    }

    @Test
    public Response sendApiRequest(Map<String, String> orderMap) {
        // Set the base URI
        RestAssured.baseURI = "https://ubjrv9i883.execute-api.eu-west-1.amazonaws.com/test/wsdl";

        // Map<String, String> orderMap = DataMap();

        // Generate the XML for each entry in the map
        String xmlOutput = generateXML(orderMap);

        String part1String = part1string();

        // Construct the request payload
        String requestPayload = part1String + xmlOutput + part3string;

        // Print the generated XML string
        System.out.println("----------------------------------------");
        System.out.println(requestPayload);
        System.out.println("----------------------------------------");

        // Send the API request
        Response response = RestAssured.given().contentType(ContentType.XML).body(requestPayload).post();

        // Print the response
        System.out.println("Response: " + response.asString());
        System.out.println("Response Code: " + response.getStatusCode());
        System.out.println("Response Line: " + response.getStatusLine());

        return response;
    }

    private void logPass(String message) {
        logger.info("[PASS]" + message);
    }

    private void logFail(String message) {
        logger.info("[FAIL]" + message);
    }

    // Validation of fields in Visit Breakdown
    public String validations(Response response) {
        // Validating the response
        Assert.assertEquals("Statuscode verification failed : " + response.getStatusCode(), response.getStatusCode(),
                200);
        Assert.assertEquals("Status line verification failed : " + response.getStatusLine(), response.getStatusLine(),
                "HTTP/1.1 200 OK");

        // Parse the XML response XmlPath
        XmlPath xmlPath = new XmlPath(response.asString());

        // Validate 'Code' and 'Description'

        String code = xmlPath.getString("**.findAll {it.name()=='Return'}[0].@Code");
        String description = xmlPath.getString("**.findAll {it.name()=='Return'}[0].@Description");

//    	String code = xmlPath.getString("soap:Envelope.soap:Body.CreateOrderWithTransformations01Response.CreateOrderWithTransformations01Result.Message.Return.@Code");	
//    	String description = xmlPath.get("soap:Envelope.soap:Body.CreateOrderWithTransformations01Response.CreateOrderWithTransformations01Result.Message.Return.@Description").toString();

        // Print the response
        System.out.println("-----------------------------------------------");
        System.out.println("Response : " + response.asString());
        System.out.println("-----------------------------------------------");
        System.out.println("Response Code : " + response.getStatusCode());
        System.out.println("Response Line : " + response.getStatusLine());
        System.out.println("Response Description : " + description);

        // Print the order
        System.out.println("Generated Order id : " + user_input_third_party_cust_code);

        Assert.assertEquals("Response description in body Validation failed ", response_description, description);
        Assert.assertEquals(" Response code in body Validation failed ", response_code, code);

        logPass("Response Description in body Verification Passed :");
        logPass("Response code in body Verification Passed :");
        return user_input_third_party_cust_code;

    }

    // Seperated third part of XML Payload
    String part3string = "&lt;OrderTenderLine TenderCode=\"01\" TenderDesc=\"Cash\" CreationDateTime=\"2023-06-06T15:40:35\" TenderAmountIncTax=\"4578.14\" /&gt;\n"
            + "&lt;/Order&gt;\n"
            + "&lt;VisitAddress VisitAddressNum=\"1\" ISOCountryCode=\"GBR\" AddrLine1=\"Holly Trees\" AddrLine2=\"High Street\" AddrLine4=\"NORTHAMPTON\" PostCode=\"NN6 6DD\" NearbyPostCode=\"0\" Title=\"Mr\" Forename=\"SIT\" Initials=\"S\" Surname=\"OmFleetone\" Telephone1=\"07709502403\" Telephone2=\"07709502403\" Telephone3=\"07709502403\" /&gt;\n"
            + "&lt;/OrderDetailXML&gt;</OrderDetailXML>\n" + "        </CreateOrderWithTransformations01>\n"
            + "    </soap:Body>\n" + "</soap:Envelope>";

    // Generation of Part1 XML Payload
    public String part1string() {
        String randomABCD = generateRandomABCD();

        // User input for ThirdPartyCustCode and ThirdPartyOrderCode
        user_input_third_party_cust_code = "80" + randomABCD + "-8804-V";

        // Increment the numeric part of AlternateOrderCode by 1 and 2 respectively
        String[] parts = user_input_third_party_cust_code.split("-");
        int numericPart = Integer.parseInt(parts[0]);

        String new_alternate_order_code_1 = (numericPart + 1) + "-" + parts[1] + "-" + parts[2];
        String new_alternate_order_code_2 = (numericPart + 2) + "-" + parts[1] + "-" + parts[2];

        String part1 = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\r\n"
                + "    <soap:Body>\r\n"
                + "        <CreateOrderWithTransformations01 xmlns=\"http://axida.com/HDi\">\r\n"
                + "            <UserID>WIXVIS</UserID>\r\n" + "            <Password>glasses</Password>\r\n"
                + "            <SystemID>VISION</SystemID>\r\n"
                + "            <CallReference>VSN-BS4U01-INT</CallReference>\r\n"
                + "            <ClientNum>700</ClientNum>\r\n"
                + "            <OrderDetailXML>&lt;OrderDetailXML xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" Version=\"1\"&gt;\n"
                + "&lt;Customer ClientNum=\"700\" ISOCountryCode=\"GBR\" ThirdPartyCustCode=\""
                + user_input_third_party_cust_code
                + "\" Title=\"Mr\" Initials=\"S\" Forename=\"SIT\" Surname=\"OmFleetone\" AddrLine1=\"Holly Trees\" AddrLine2=\"High Street\" AddrLine4=\"NORTHAMPTON\" Country=\"UK\" PostCode=\"NN6 6DD\" NearbyPostCode=\"0\" Telephone1=\"07709502403\" Telephone2=\"07709502403\" Telephone3=\"07709502403\" Email1=\"omrajarajan.d@wickes.co.uk\" MarketingPref=\" Y\" /&gt;\n"
                + "&lt;Order ClientNum=\"700\" ISOCountryCode=\"GBR\" ThirdPartyOrderCode=\""
                + user_input_third_party_cust_code
                + "\" OrderSourceType=\"VISION\" DivisionCode=\"00018\" SaleOUCode=\"008804\" ISOCurrencyCode=\"GBP\" ISOLangCode=\"EN\" OrderCurIncTaxNetPrice=\"4578.14\" OrderPriceAdjust=\"0\" OrderSalesPersonName=\"Swathy Rukmani\" OrderDeliveryCharge=\"0\" OrderPaymentStatus=\"1\" OrderDescription=\"Kitchen\" OrderType=\"11\"&gt;\n"
                + "&lt;AltOrderCode AlternateOrderCode=\"" + new_alternate_order_code_1
                + "\" AlternateOrderCodeType=\"2\" /&gt;\n" + "&lt;AltOrderCode AlternateOrderCode=\""
                + new_alternate_order_code_2 + "\" AlternateOrderCodeType=\"2\" /&gt;\n";

        return part1;
    }

    public static String generateRandomABCD() {
        Random random = new Random();
        // Generate random integers between 1000 and 9999 for ABCD
        int abcd = random.nextInt(9000) + 1000;
        return String.valueOf(abcd);
    }

    // Generation of part2 XML Payload
    public static String generateXML(Map<String, String> orderMap) {
        StringBuilder xmlOutput = new StringBuilder();

        // Counter for generating ThirdPartyOrderLineNum
        AtomicInteger counter = new AtomicInteger(generateInitialThirdPartyOrderLineNum());

        // Generate the XML for each entry in the map
        for (Map.Entry<String, String> entry : orderMap.entrySet()) {
            String prodCode = entry.getKey();
            String orderQty = entry.getValue();
            String thirdPartyOrderLineNum = String.valueOf(counter.getAndIncrement());

            // Append the output in the desired format to the string builder
            xmlOutput.append("&lt;OrderLine ProdCode=\"").append(prodCode).append("\" ");
            xmlOutput.append("ThirdPartyOrderLineNum=\"").append(thirdPartyOrderLineNum).append("\" ");
            xmlOutput.append("ThirdPartyOrderLineQty=\"").append(orderQty).append("\" ");
            xmlOutput.append(
                    "ProdOptDesc1=\"100087\" ProdOptDesc4=\"000826\" ProdPrice=\"530.01\" VisitAddressNum=\"1\"&gt;\n");
            xmlOutput.append("&lt;OrderLineService ServCode=\"1\" /&gt;\n");
            xmlOutput.append("&lt;/OrderLine&gt;\n");
        }

        // Return the generated XML as a string
        return xmlOutput.toString();
    }

    // Generating random 8 digit number
    private static int generateInitialThirdPartyOrderLineNum() {
        Random random = new Random();
        return random.nextInt(900000) + 20000000;
        // Generates a random integer between 20000000 and 20999999
    }

    public void user_able_click_on_order_manager_add_order_from_main_menu_bar() throws Throwable {
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement ele = findElement(WebElements.order_manager);
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        clickOnElement(WebElements.add_order);
        Thread.sleep(2000);
        driver.switchTo().frame(0);

    }

    public void create_customer_in_add_order() {
        // creating customer process
        name = "Auto " + getAlphaNumericString(4);

        //Selecting store
        clickOnElement(WebElements.store);

        // entering customer name
        clickOnElement(WebElements.title_name);
        clickOnElement(WebElements.title_name_option);
        sendkeys(WebElements.intial_Name, getAlphaNumericString(1));
        sendkeys(WebElements.sur_Name, name);

        // entering customer address
        sendkeys(WebElements.address_line1, "10 Chruch Bell Sound");
        sendkeys(WebElements.address_line3, "Bridgend");
        sendkeys(WebElements.address_line4, "Mid Galmorgan");

        // entering country value
//		sendkeys(WebElements.country, "UK");

        // entering Customer postcode value
        sendkeys(WebElements.postcode, "CF314QH");

        // entering Customer mobile,home and work number
        driver.findElement(WebElements.mobile_Number).sendKeys("07709502403");
        driver.findElement(WebElements.home_Telephone_Number).sendKeys("07709502403");
        driver.findElement(WebElements.work_Telephone_Number).sendKeys("07709502403");

        // entering Customer email
        driver.findElement(WebElements.emailcu).sendKeys("afzal.shaik@wickes.co.uk");

        // confirming Customer email by re entering the same value
        driver.findElement(WebElements.confirm_email).sendKeys("afzal.shaik@wickes.co.uk");

        // entering customer contact allowed options
        clickOnElement(WebElements.delivery_email_option);
        clickOnElement(WebElements.customer_email_option);
        clickOnElement(WebElements.marketing_email_option);

        // clicking on create option
        clickOnElement(WebElements.billing_checkbox);

        clickOnElement(WebElements.next_btn);
    }


    public void Provide_sku_and_quantity(Map<String, String> ordermap) throws InterruptedException {

        for (Map.Entry<String, String> entry : ordermap.entrySet()) {
            String sku = entry.getKey();
            String qty = entry.getValue();

            System.out.println("SKU" + sku);
            System.out.println("QTY" + qty);

            sendkeys(WebElements.skubox, sku);
            Thread.sleep(1000);
            sendkeys(WebElements.skubox, Keys.ENTER);
            Thread.sleep(1000);
            clearField(WebElements.qtybox);
            Thread.sleep(1000);
            sendkeys(WebElements.qtybox, qty);
            Thread.sleep(1000);
            sendkeys(WebElements.qtybox, Keys.ENTER);
            Thread.sleep(2000);

        }

        clickOnElement(WebElements.next_btn);
        Thread.sleep(2000);
        clickOnElement(WebElements.next_btn);

    }

    public void Provide_sku_and_quantity_with_notes(Map<String, String> ordermap,String note) throws InterruptedException {

        for (Map.Entry<String, String> entry : ordermap.entrySet()) {
            String sku = entry.getKey();
            String qty = entry.getValue();

            System.out.println("SKU" + sku);
            System.out.println("QTY" + qty);

            Thread.sleep(5000);
            clickOnElement(WebElements.adavanced);
            childwindow();
            sendkeys(WebElements.skucode, sku);
            clickOnElement(WebElements.search6);

            Thread.sleep(5000);
            threewindow();
            String dropdownxpath = "//select[@id='ddlSearchType']/option[contains(text(),'SKU Code')]";
            System.out.println(dropdownxpath);
            clickOnElement(getByIdentifier(dropdownxpath, "xpath"));
            Thread.sleep(2000);
            clickOnElement(WebElements.searchButton);
            Thread.sleep(2000);
            clickOnElement(WebElements.sku_table);
            clickOnElement(WebElements.ok_button);


            Thread.sleep(5000);
            childwindow();
            sendkeys(WebElements.notes, note);
            clickOnElement(WebElements.qty);
            Thread.sleep(2000);
            sendkeys(WebElements.qty, Keys.BACK_SPACE);
            sendkeys(WebElements.qty, qty);
            doubleclick(WebElements.ok_button2);
            Thread.sleep(5000);
            doubleclick(WebElements.ok_button2);
            Thread.sleep(5000);
            driver.switchTo().window(parentid);
            driver.switchTo().frame(0);
        }
        clickOnElement(WebElements.next_btn);
        Thread.sleep(2000);
        clickOnElement(WebElements.next_btn);

    }


    public void create_customer_invalid_email() {
        // creating customer process
        name = "Auto " + getAlphaNumericString(4);

        //Selecting store
        clickOnElement(WebElements.store);

        // entering customer name
        clickOnElement(WebElements.title_name);
        clickOnElement(WebElements.title_name_option);
        sendkeys(WebElements.intial_Name, getAlphaNumericString(1));
        sendkeys(WebElements.sur_Name, name);

        // entering customer address
        sendkeys(WebElements.address_line1, "10 Chruch Bell Sound");
        sendkeys(WebElements.address_line3, "Bridgend");
        sendkeys(WebElements.address_line4, "Mid Galmorgan");

        // entering country value
//		sendkeys(WebElements.country, "UK");

        // entering Customer postcode value
        sendkeys(WebElements.postcode, "CF314QH");

        // entering Customer mobile,home and work number
        driver.findElement(WebElements.mobile_Number).sendKeys("07709502403");
        driver.findElement(WebElements.home_Telephone_Number).sendKeys("07709502403");
        driver.findElement(WebElements.work_Telephone_Number).sendKeys("07709502403");

        // entering Customer email
        driver.findElement(WebElements.emailcu).sendKeys("afzal,shaik@wickes.co.uk");

        // confirming Customer email by re entering the same value
        driver.findElement(WebElements.confirm_email).sendKeys("afzal,shaik@wickes.co.uk");

        // entering customer contact allowed options
        clickOnElement(WebElements.delivery_email_option);
        clickOnElement(WebElements.customer_email_option);
        clickOnElement(WebElements.marketing_email_option);

        // clicking on create option
        clickOnElement(WebElements.billing_checkbox);

        clickOnElement(WebElements.next_btn);
    }

    public void Answer_Functionality1() throws InterruptedException {
        threewindow();
        String[] s = {"Yes", "Yes", "Store - Settlement", "Additional Miscellaneous Spares"};
        for (int i = 0; i < 4; i++) {
            if (i == 2) {
                Thread.sleep(4000);
                fourwindow();
                sendkeys(WebElements.commenter, s[i]);
                clickOnElement(WebElements.save);
                switchWindow(2);
            } else if (i == 3) {
                String question_option_selection = "(//select[@onchange='PopulateNextQuestionNum(this);'])[3]";
                Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
                objSelect.selectByVisibleText(s[i]);
            } else {
                String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i + 1) + "]/td[3]/select";
                Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
                objSelect.selectByVisibleText(s[i]);
                Thread.sleep(2000);
                String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i + 1) + "]/td[4]";
                clickOnElement(By.xpath(question_option_index));
            }
        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
    }

    public void Answer_Functionality2() throws InterruptedException {
        threewindow();
        String[] s = {"Yes", "No", "Spares Damaged From Pack"};
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                String question_option_selection = "(//select[@onchange='PopulateNextQuestionNum(this);'])[3]";
                Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
                objSelect.selectByVisibleText(s[i]);
            } else {
                String question_option_selection = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i + 1) + "]/td[3]/select";
                Select objSelect = new Select(findElement(By.xpath(question_option_selection)));
                objSelect.selectByVisibleText(s[i]);
                Thread.sleep(2000);
                String question_option_index = "//tbody[@id='ScriptQuestionsBody']/tr[" + (i + 1) + "]/td[4]";
                clickOnElement(By.xpath(question_option_index));
            }
        }
        clickOnElement(WebElements.Remedial_ok_button);
        Thread.sleep(3000);
        driver.switchTo().window(child1);
    }


}
