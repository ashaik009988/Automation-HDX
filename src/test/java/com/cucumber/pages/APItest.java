package com.cucumber.pages;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

import java.nio.file.Paths;

public class APItest {


    RequestSpecification reqspec =null;

    String xmlpayload="";


    public void createReqSpec(){
        RequestSpecBuilder reqbuilder = new RequestSpecBuilder();
        reqbuilder.setBaseUri("");
        reqbuilder.setContentType(ContentType.XML);
        reqbuilder.setBody(xmlpayload);

        reqspec=reqbuilder.build();

    }

    public void sendDynamicXML(){

     Response response= (Response) RestAssured.given()
                      .spec(reqspec)
                .when()
                  .post()
                .then()
                .statusCode(200);

    }


    @Test
    public void validatexml(){

        String filepath = "C:/Users/919976/Downloads/WAOC00826040124152122599.xml";

        XmlPath xmlPath = new XmlPath(Paths.get(filepath).toFile());
         String orderId="203399";
        // Give your expecetd price
        String expectedqty ="3";


        // Extract the qty from XML file using Xpath for given order ID
        //   String xpathOrderId = "/root/Document/OrderLine[Item/CustItem/Code/text()='" + orderId + "']/Item/CustItem/Code/text()";
        String xpathOrderId ="//CustItem[Code='" + orderId + "']";
        String actualOrderId = xmlPath.getString(xpathOrderId);

        //Ensure actual and expected orderid matches

        Assert.assertEquals(actualOrderId,orderId,"Order ID validation failed for :"+ orderId);


        //Extract the qty using the xpath for given order id

      //  String xpathqty="/root/Document/OrderLine[Item/CustItem/Code/text()='" + orderId + "']/OrderQty/Unit/text()";
        String xpathqty ="//CustItem[Code='" + orderId + "']/../../OrderQty/Unit";
        String actualqty = xmlPath.getString(xpathqty);



        Assert.assertEquals(actualqty,expectedqty,"Qty validation failed for :"+ orderId);

    }


}
