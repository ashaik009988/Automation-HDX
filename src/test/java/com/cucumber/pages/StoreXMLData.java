package com.cucumber.pages;


import io.restassured.path.xml.XmlPath;
import io.restassured.path.xml.element.Node;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class StoreXMLData {

    @Test
    public void storeDataInMap() {
        // Replace this path with the actual path to your XML file
        String filePath = "C:/Users/919976/Downloads/WAOC00826040124152122599.xml";

        // Read the XML file into a RestAssured XmlPath
        XmlPath xmlPath = given()
                .when()
                .get(Paths.get(filePath).toUri())
                .then()
                .extract()
                .xmlPath();

        // Create a map to store Code and OrderQty
        Map<String, String> codeOrderQtyMap = new HashMap<>();


        // Extract all CustItem elements
        List<Node> custItemNodes = xmlPath.getList("root.Document.OrderLine.Item.CustItem");

        // Iterate over each CustItem element
        for (Node custItemNode : custItemNodes) {
            // Extract the Code and OrderQty for each CustItem
            String code = custItemNode.get("Code");
            String orderQty = custItemNode.get("..OrderQty.Unit");

            // Store in the map
            codeOrderQtyMap.put(code, orderQty);
        }

        // Print the map (optional)
        for (Map.Entry<String, String> entry : codeOrderQtyMap.entrySet()) {
            System.out.println("Code: " + entry.getKey() + ", OrderQty: " + entry.getValue());
        }

        // Now, you have a map containing Code as keys and OrderQty as values
        // You can use this map for further processing or validations
    }
}
