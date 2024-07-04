Feature: Creation of New Order

Scenario Outline: Create an Mixed Order using the API request

Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
When User send request to create a new order
Then orders should be successfully created in API
Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User passes the orderid in searchbox
Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
Then User will get the skus in visit breakdown screen for <type> Order
Then User validates the skus from Expected and Actual results
Then User exits from Browser



Examples:
|type   |sheetname|Prodcode      |Quantity    |itemDetails2     |status2             |
|MIXED  |SC2      |Custid        |Qty         |Postal Delivery  |Due Stock Allocation|
#|MIXED  |SC1     |Custid        |Qty         |Postal Delivery  |Due Stock Allocation|
#|MIXED  |SC2     |Custid        |Qty         |Fleet Delivery   |Self Booking Message Queued For Sending|
#|MIXED  |SC3     |Custid        |Qty         |Fleet Delivery   |Self Booking Message Queued For Sending|
#|MIXED  |SC5     |Custid        |Qty         |Postal Delivery  |Due Stock Allocation|
#|MIXED  |SC6     |Custid        |Qty         |Postal Delivery  |Due Stock Allocation|
#|MIXED  |SC10    |Custid        |Qty         |Postal Delivery  |Due Stock Allocation|
