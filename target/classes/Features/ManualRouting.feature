Feature: Manual Routing



#Scenario Outline: 01-Manual Route the Emergency Order 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating and Routing steps ------------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#----- Here we are going to Route the visit
#And User navigate to VisitDetails Screen and get depot
#When user able click on transport from main menu bar
#Then user is then able to see the sub drop down of transport
#Given user is on transport tab
#When user able to click on the Manual Routing from dropdown of transport tab
#And user able to select the date from the calendar for manual routing
#And user able to select the unrouted drops
#And user able to select the routed drops
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#
#
#
#
#Examples:
#|sheetname   |Prodcode      |Quantity    |itemDetails1           |status1                                  |visitafterrouting      |statusafterrouting       |
#|Routing     |Custid        |Qty         |Fleet Delivery         |Self Booking Message Queued For Sending  |Fleet Delivery         |Due Stock Allocation     |



Scenario Outline: 02-Validate if Route number is in  'ddmmrr' format where ddmm is from Delivery Date and rr is from Route when WMSRefCode='nn/SOT' and Route<98  

Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
When User send request to create a new order
Then orders should be successfully created in API
Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User passes the orderid in searchbox
#----------- From here write the Dating and Routing steps ------------------
When User Double click the visit line with date as TBA
Then User is on  Schedule a visit date screen 
And click on change visit date
And click on overrides
And selects override options as Create Emergency Visit
#---Selecting date and validating from here
When User should able to set the delivery date for the visit
Then User should be able to see the selected delivery date on visit break down page
#----- Here we are going to Route the visit
And User navigate to VisitDetails Screen and get depot
When user able click on transport from main menu bar
Then user is then able to see the sub drop down of transport
Given user is on transport tab
When user able to click on the Manual Routing from dropdown of transport tab
And user able to select the date from the calendar for manual routing
And user able to select the unrouted drops and provide <routenumber> as route number
And user able to select the routed drops
Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

Examples:
|routenumber  |sheetname   |Prodcode      |Quantity    |visitafterrouting      |statusafterrouting       |
|99           |Routing     |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation     |
|9            |Routing     |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation     |
#|8000         |Routing     |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation     |
#|97           |Routing     |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation     |
#|0            |Routing     |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation     |

