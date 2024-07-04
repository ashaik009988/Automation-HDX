Feature: Workflow


#Scenario Outline: 01-Verify whether order is hit in this "Failed Pick/Despatch – High Priority" workflow if is failed in despatch phase based on priority.
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on Failed Pick/Despatch - High Priority
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|827803-8804-V    |Routing     |Custid        |Qty         |


#Scenario Outline: 02-Verify whether order hit in Collection exception - Partial failure workflow If the order is partially failed when it is delivering through collection visit
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on Collection exception - Partial failure
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|811350-8805-V    |Routing     |Custid        |Qty         |




#Scenario Outline: 03-Verify whether order hit in Collection exception - Full failure workflow If the order is partially failed when it is delivering through collection visit
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on Collection exception - Full failure
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|828035-8804-V    |Routing     |Custid        |Qty         |




#Scenario Outline: 04-Verify whether order hit in Delivery exception - Partial failure workflow If the order is partially failed when it is delivering through collection visit
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on Delivery exception - Partial failure
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|827464-8804-V    |Routing     |Custid        |Qty         |




#Scenario Outline: 05-Verify whether order hit in Delivery exception - Full failure workflow If the order is partially failed when it is delivering through collection visit
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on Delivery exception - Full failure
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|829897-8804-V    |Routing     |Custid        |Qty         |



Scenario Outline: 06-Verify whether order hit in awaiting parcel pack workflow If the non-fleet order is completed with pick and despatch
 
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid <orderid> in searchbox in HDX
    And User navigate to summary tab to get the data
    And User click on the order manager tab from main menu and navigate to workflow
    And User double click on awaiting parcel pack
    Then User should see the details as expected for the above workflow
    
Examples:
|orderid          |sheetname   |Prodcode      |Quantity    |
|829912-8804-V    |Routing     |Custid        |Qty         |



#Scenario Outline: 07-Verify whether order hit in awaiting carrier debrief  workflow If the non-fleet order is completed withParcel manager/parcel EOD
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on awaiting carrier debrief
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|811419-8805-V    |Routing     |Custid        |Qty         |





#Scenario Outline: 08-Verify whether order hit in Short on Allocation – High Priority workflow If Order failed in calidus due to short on allocation
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #And User navigate to summary tab to get the data
    #And User click on the order manager tab from main menu and navigate to workflow
    #And User double click on short on Allocation - High Priority
    #Then User should see the details as expected for the above workflow
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |
#|829836-8804-V    |Routing     |Custid        |Qty         |





