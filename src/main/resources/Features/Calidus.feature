Feature: Calidus


#Scenario Outline: 01-Verify the status in hdx if the order is failed in calidus due to short on allocation -High Priority
 #----- Order should be Dated and Routed with Failed in Calidus
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #Then User should able to validate the visit <itemDetails> and status <status>
    #And User navigate to workflow through order manager directly
    #And User navigate to page and double click on Short on Allocation – High Priority
    #Then User validate the short on allocation high priority details for ordercode <orderid> and custname <custname>
    #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |custname        |
#|803994-8804-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Auto, SIT (Mr)  |




#Scenario Outline: 02-Verify the status in  HDX after completed the pick and despatch in  Calidus for DX frieght order
# ----- Order should be Dated and Routed with Failed in Calidus 
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #Then User should able to validate the visit <itemDetails> and status <status>
    #When User should be able to go reports for items to follow
    #Then User should able to validate the Customer <customer> , contact <contact> and order details are valid
    #Then User should be able to select the items To Follow
    #Then User should  be able to filter the date for items To Follow
    #Then Confirmed orders should be shown for items To Follow
    #Then User should see the details as expected for items To Follow
   #
   #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |customer         |contact      |
#|811410-8805-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Mr T NF          |07709502403  |







#Scenario Outline: 03-Verify the status in  HDX after completed the pick and despatch in  Calidus for postal order
 # ----- Order should be Dated and Routed with Failed in Calidus 
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #Then User should able to validate the visit <itemDetails> and status <status>
    #When User should be able to go reports for items to follow
    #Then User should able to validate the Customer <customer> , contact <contact> and order details are valid
    #Then User should be able to select the items To Follow
    #Then User should  be able to filter the date for items To Follow
    #Then Confirmed orders should be shown for items To Follow
    #Then User should see the details as expected for items To Follow
   #
   #
#Examples:
#|orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |customer         |contact      |
#|811410-8805-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Mr T NF          |07709502403  |






#Scenario Outline: 04-Verify the supply chain leg if the order undergoes underpick -High priority
# ----- Order should be Dated and Routed
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #Then User should able to validate the visit <itemDetails> and status <status>
    #And User expand the visit in visit breakdown screen for <type> Order
    #When User select the visit line
    #Then User validate the supply chain leg history for status <Supplychainstatus> and reason <Supplychainreason>
   #
#Examples:
#|type  |orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |Supplychainstatus                |Supplychainreason       |
#|SINGLE|811410-8805-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Warehouse Despatch Failed        |WH despatch failed      |





#Scenario Outline: 05-Verify the supply chain leg if the order undergoes underpick 
# ----- Order should be Dated and Routed
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid <orderid> in searchbox in HDX
    #Then User should able to validate the visit <itemDetails> and status <status>
    #And User expand the visit in visit breakdown screen for <type> Order
    #When User select the visit line
    #Then User validate the supply chain leg history for status <Supplychainstatus> and reason <Supplychainreason>
   #
#Examples:
#|type  |orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |Supplychainstatus                |Supplychainreason       |
#|SINGLE|811410-8805-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Warehouse Despatch Failed        |WH despatch failed      |







Scenario Outline: 06-Verify whether user able to complete the pick and despatch the remaining
 #----- Order should be Dated and Routed with Failed in Calidus 
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid <orderid> in searchbox in HDX
    Then User should able to validate the visit <itemDetails> and status <status>
    When User should be able to go reports for items to follow
    Then User should able to validate the Customer <customer> , contact <contact> and order details are valid
    Then User should be able to select the items To Follow
    Then User should  be able to filter the date for items To Follow
    Then Confirmed orders should be shown for items To Follow
    Then User should see the details as expected for items To Follow
    
Examples:
|orderid          |sheetname   |Prodcode      |Quantity    |itemDetails                |status       |customer         |contact      |
|811410-8805-V    |Routing     |Custid        |Qty         |Fleet Delivery             |MIXED        |Mr T NF          |07709502403  |


