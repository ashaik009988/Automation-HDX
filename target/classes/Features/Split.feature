Feature: Spliting
#Note: Wait for some time for split btn to enable

#Scenario Outline: 01-Split an order after undating an order. 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#----Selecting date and validating from here---
#When User should able to set the delivery date for the visit
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User validate whether split button is disabled once the order is dated on visit break down page
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#Then User should be able to click TBA button
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User validate whether split button is enabled once the order is dated on visit break down page
#
#
#
#Examples:
#
#|sheetname   |Prodcode      |Quantity     |itemName     |status              |
#|Split1      |Custid        |Qty          |Parcel Force |Due Stock Allocation|
 #





#
#Scenario Outline: 02- Verify user is able to split an fleet  order into parcel force
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Then User should able to split the <itemName> visit and check status <status>
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |itemName     |status              |
#|Split2      |Custid        |Splitting Qty  |Qty          |Parcel Force |Due Stock Allocation|




#Scenario Outline: 03-complete the delivery  for the two  fleets visits after split visit 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#804850-8804-V
#And User passes the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Then User should able to split the <itemName> visit and check status <status>
#1st Fleet
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
#2nd Fleet
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
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |itemName      |status        |visitafterrouting      |statusafterrouting       |
#|Split3      |Custid        |Splitting Qty  |Qty          |Fleet Delivery|Awaiting Date |Fleet Delivery         |Due Stock Allocation          |
 







#Scenario Outline: 04- Split a fleet into postal delivery visit, parcel force visit and DX freight visit and fleet visit
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Given User have an Excel containing item details for validation <sheetname> , with columnnames <Itemdetails> and <Status>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#----Selecting date and validating from here---
#When User should able to set the delivery date for the visit
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User validate whether split button is disabled once the order is dated on visit break down page
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#Then User should be able to click TBA button
#Then User is landed on Visit break down page
#When User Double click the visit line 
#Then User validate whether split button is enabled once the order is dated on visit break down page
#Then User is landed on Visit break down page
#Then User should able to validate the visit and status
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |Itemdetails     |Status              |
#|Split4      |Custid        |Splitting Qty  |Qty          |ItemDetails     |Status              |

#Scenario Outline: 05-complete the delivery for the two  fleets visits with Non fleet skus after split visit 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Then User should able to split the <itemName> visit and check status <status>
#1st Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#2nd Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |itemName      |status        |visitafterrouting      |statusafterrouting       |
#|Split5      |Custid        |Splitting Qty  |Qty          |Fleet Delivery|Awaiting Date |Fleet Delivery         |Due Stock Allocation          |
#
#




#Scenario Outline: 06-Verify user is able to split the fleet visit in a mixed order. 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Then User should able to split the <itemName> visit and check status <status>
#1st Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#2nd Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |itemName      |status        |visitafterrouting      |statusafterrouting       |
#|Split5      |Custid        |Splitting Qty  |Qty          |Fleet Delivery|Awaiting Date |Fleet Delivery         |Due Stock Allocation          |
 #
#






#Scenario Outline: 07-Mixed Order_Validate whether the split the fleet visit and user is able to perform maunal routing for both visits 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
#Then User should able to split the <itemName> visit and check status <status>
#1st Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#2nd Fleet
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
#Then User validate the visittype
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty   |Quantity     |itemName      |status        |visitafterrouting      |statusafterrouting       |
#|Split7      |Custid        |Splitting Qty  |Qty          |Fleet Delivery|Awaiting Date |Fleet Delivery         |Due Stock Allocation          |
#



#Scenario Outline: 08-Split an order after undating an order. 
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#When User Double click the visit line 
#Then User validate whether split button is disabled once the order is dated on visit break down page
#Then User should able to validate the visit <visitforvalidation> and status <statusforvalidation>
#
#
#Examples:
#
#|sheetname   |Prodcode       |Quantity     |visitforvalidation     |statusforvalidation       |
#|Split8      |Custid1        |Qty1         |Supplier Delivery      |Awaiting supplier debrief |
#|Split8      |Custid2        |Qty2         |Postal Delivery        |Due Stock Allocation      |
#|Split8      |Custid3        |Qty3         |Parcel Force           |Due Stock Allocation      |
#|Split8      |Custid4        |Qty4         |DX Delivery            |Due Stock Allocation      |




#Scenario Outline: 10- Verify whether user able to perform split in already splitted visit
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
##---------- Dating and undating for split btn--------------
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#And click on change visit date
#When User should able to set the delivery date for the visit
#Then User is landed on Visit break down page
#When User Double click the visit line
#Then User validate whether split button is disabled once the order is dated on visit break down page
#Then User is landed on Visit break down page
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#And click on change visit date
#Then User should be able to click TBA button
#Then User is landed on Visit break down page
#When User Double click the visit line
#Then User validate whether split button is enabled once the order is dated on visit break down page
##-------- completed Dating adn undating for split btn-------------
#Then User is landed on Visit break down page
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty1>
#Then User should able to split the <itemName> visit and check status <status>
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty2>
#Then User should able to split the <itemName> visit and check status <status>
#
#
#Examples:
#|sheetname   |Prodcode      |SplittingQty1   |SplittingQty2 |Quantity     |itemName      |status        |visitafterrouting      |statusafterrouting       |
#|Split10     |Custid        |Splitting Qty1  |Splitting Qty2|Qty          |Fleet Delivery|Awaiting Date |Fleet Delivery         |Due Stock Allocation     |

  Scenario Outline: 11-Split the visit and date the both visits
##    creating the order
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API

#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
    And User passes the order_id in searchbox with "<orderid_no>"

#    spiliting the visit to  two fleet
    Then User is landed on Visit break down page
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
    Then User should able to split the <itemName> visit and check status <status>


#    dating first visit
    When User Double click the first visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit

#    dating second visit
    When User Double click the second visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit


    Examples:
      | orderid_no    | sheetname | Prodcode | SplittingQty  | Quantity | itemName       | status        |
      | 809632-8804-V | Split3    | Custid   | Splitting Qty | Qty      | Fleet Delivery | Awaiting Date |

  Scenario Outline: 12-Split the visit and route the both visits
#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"

#    performing the spilit button operation
    Then User is landed on Visit break down page
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
    Then User should able to split the <itemName> visit and check status <status>

#    dating first visit
    When User Double click the first visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    And User navigate to VisitDetails Screen and get depot
    When user able click on transport from main menu bar
    Then user is then able to see the sub drop down of transport
    Given user is on transport tab
    When user able to click on the Manual Routing from dropdown of transport tab
    And user able to select the date from the calendar for manual routing
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User validate the visittype
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

#    dating second visit and routing
    When User Double click the second visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    And User navigate to VisitDetails Screen and get depot
    When user able click on transport from main menu bar
    Then user is then able to see the sub drop down of transport
    Given user is on transport tab
    When user able to click on the Manual Routing from dropdown of transport tab
    And user able to select the date from the calendar for manual routing
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User validate the visittype
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>


    Examples:
      | orderid_no    | sheetname | Prodcode | SplittingQty  | Quantity | itemName       | status        | visitafterrouting | statusafterrouting   |
      | 807693-8804-V | Split3    | Custid   | Splitting Qty | Qty      | Fleet Delivery | Awaiting Date | Fleet Delivery    | Due Stock Allocation |

  Scenario Outline: 13-Split the visit and route the 1st  visit and date the 2nd visit
#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"

#    Dating the order verifying the spilit button is enabled or not
    Then User is landed on Visit break down page
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
    Then User should able to split the <itemName> visit and check status <status>

#    dating first visit and routing
    When  User Double click the first visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    And User navigate to VisitDetails Screen and get depot
    When user able click on transport from main menu bar
    Then user is then able to see the sub drop down of transport
    Given user is on transport tab
    When user able to click on the Manual Routing from dropdown of transport tab
    And user able to select the date from the calendar for manual routing
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User validate the visittype
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

#    dating second visit and routing
    When User Double click the second visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit

    Examples:
      | orderid_no    | sheetname | Prodcode | SplittingQty  | Quantity | itemName       | status        | visitafterrouting | statusafterrouting   |
      | 807693-8804-V | Split3    | Custid   | Splitting Qty | Qty      | Fleet Delivery | Awaiting Date | Fleet Delivery    | Due Stock Allocation |

  Scenario Outline: 14-Split the visit and route the 2nd  visit and date the 1st visit
#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"

#    spiliting operation
    Then User is landed on Visit break down page
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
    Then User should able to split the <itemName> visit and check status <status>

#    dating first visit and routing
    When User Double click the first visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit

#    dating second visit and routing
    When User Double click the second visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    And User navigate to VisitDetails Screen and get depot
    When user able click on transport from main menu bar
    Then user is then able to see the sub drop down of transport
    Given user is on transport tab
    When user able to click on the Manual Routing from dropdown of transport tab
    And user able to select the date from the calendar for manual routing
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User validate the visittype
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    Examples:
      | orderid_no    | sheetname | Prodcode | SplittingQty  | Quantity | itemName       | status        | visitafterrouting | statusafterrouting   |
      | 807693-8804-V | Split3    | Custid   | Splitting Qty | Qty      | Fleet Delivery | Awaiting Date | Fleet Delivery    | Due Stock Allocation |
