Feature: Creation of New Order

Scenario Outline: Create an Single Order using the API request

Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
When User send request to create a new order
Then orders should be successfully created in API
Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User passes the orderid in searchbox
Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
Then User will get the skus in visit breakdown screen for <type> Order
Then User validates the skus from Expected and Actual results
#Then User exits from Browser


Examples:
|type    |sheetname   |Prodcode      |Quantity    |itemDetails            |status                                |visittypes                                                          |
#|SINGLE  |SC4         |Custid        |Qty         |Fleet Delivery         |Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|

#|SINGLE|SC4   |Custid        |Qty         |Fleet Delivery           |Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
|SINGLE|SC7   |Custid        |Qty         |Fleet Delivery           |Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
#|SINGLE|SC8   |Custid        |Qty         |Fleet Delivery           |Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
#|SINGLE|SC9   |Custid        |Qty         |Fleet Delivery           |Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
