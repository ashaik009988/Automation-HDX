Feature: Dating of New Fleet Order

Scenario Outline: Create an Single Order using the API request and Date the order (Navigating to visit Screen)

Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
When User send request to create a new order
Then orders should be successfully created in API
Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User pass the orderid in searchbox
Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
#Then User exits from Browser
When User Double click the visit line 
Then User is on  Schedule a visit date screen 
And click on change visit date
When User should able to set the delivery date for the visit
Then User should be able to see the selected delivery date on visit break down page
Then User Validate date field



Examples:
|sheetname   |Prodcode      |Quantity     |itemDetails         |status                                 |      
|Dating      |Custid        |Qty          |Fleet Delivery      |Self Booking Message Queued For Sending|

