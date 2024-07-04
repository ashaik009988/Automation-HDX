Feature: Amending of New Orders

Scenario Outline: Create an Order and amend the same using the API request

Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User  landed on hdx home page
#And User passes the orderid in searchbox
#Then User will get the skus in visit breakdown screen
#Then User validates the skus from Expected and Actual results
#Then User exits from Browser
#Then User wait for amend
#--#Amend 1 --
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <AmendProdcode> and <AmendQuantity>
#Then User send request to amend an order
#Then order should be Amend successfully
Given User on Login Page of hdx application
When User able to enter userid and password
Then User  landed on hdx home page
And User passes the orderid in searchbox
Then User will get the skus in visit breakdown screen for Amend MIXED Order
Then User validates the skus from Expected and Actual results
#Then User validates the Cancelled skus from Expected and Actual results
#Then User exits from Browser
#--#Amend 2 --


Examples:
|sheetname|Prodcode      |Quantity     |AmendProdcode |AmendQuantity |
|Amend    |Custid        |Qty          |Custid        |Qty1          |   




