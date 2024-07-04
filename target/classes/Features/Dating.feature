Feature: Dating

#Scenario Outline: 01-Overriding to Force small van in override tab
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#And click on change visit date
##----Selecting date and validating from here---
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#
#
#
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
#
#


#Scenario: 02-Changing the type to Emergency and redating the order
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|





#Scenario: 04-Suspending and redating the order. 
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on suspend button
#And user confirmation for suspending the order
#Then User should be able to see the status on visit break down page
#------Selecting date and validating from here
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|





#Scenario: 05-Dating for already dated order
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#When User Double click the visit line 
#----1st time Dating---
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#When User Double click the visit line 
#----2nd time Dating---
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#When User should able to set the delivery date for the visit
#Then User should be able to see the status as Visit Rescehduled for previous order on visit break down page
#
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
#

#Scenario: 06-Overriding DX Visit to Fleet Visit
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#And User Navigate to VisitDetails Screen
#And User selects Force Wickes Fleet from dropdown
#Then User validate the visittype
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|
#
#



#Scenario: 07-Overriding to Force small van in override tab 
#
#Given User have an Excel containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create an order
#Then order should be successfully created
#Given User on Login Page of hdx application
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User pass the orderid in searchbox
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Force Small Van
#----Selecting date and validating from here---
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#
#Examples:
#|sheetname|Prodcode      |Quantity    |itemDetails1                    |status1                                |visittypes                                                          |
#|Dating   |Custid        |Qty         |Wickes Kitchens - Fleet Delivery|Self Booking Message Queued For Sending|Wickes Kitchens - Fleet Delivery,Supplier Direct - Supplier Delivery|

#  Scenario Outline: 08-Verify whether user able to date order as  by overiding  stock lead time
#        #login to hdx application
#    #Note: user should have the fleet order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
##----Selecting date and validating from here---
#    When User should able to set the delivery date for the visit with selecting over lead time
#    Then User should be able to see the selected delivery date on visit break down page
#
#    Examples:
#      | orderid     |
#      |802560-8804-V|

#  Scenario Outline: 09-"Verify whether user able to date order as  by overiding  stock
#  lead time and change the date by override resources"
#        #login to hdx application
#    #Note: user should have the fleet order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
##----Selecting date and validating from here---
#    When User should able to set the delivery date for the visit with selecting over lead time
#    Then User should be able to see the selected delivery date on visit break down page
#
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
##----Selecting date and validating from here---
#    When User should able to set the delivery date for the visit with selecting override resources
#    Then User should be able to see the selected delivery date on visit break down page
#
#    Examples:
#      | orderid       |
#      | 802560-8804-V |

#  Scenario Outline: 10-Verify whether user able to TBA the order as  which is dated by overiding  stock lead time
#    #Note:User should have fleet order
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #override process
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
#    When User should able to set the delivery date for the visit with selecting over lead time
#    Then User should be able to see the selected delivery date on visit break down page
#    #TBA process
#    When User Double click the visit line
#    And click on change visit date
#    When User should be able to click TBA button
#    Then Check whether the user able to see the dated line back to TBA status in visit line
#
#    Examples:
#      | orderid_no    |
#      | 804156-8804-V |


#  Scenario Outline: 11-Verify whether user able to TBA the order as  which is dated by overriding resource time
#    #Note:User should have fleet order
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #override process
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
#    When User should able to set the delivery date for the visit with selecting override resources
#    Then User should be able to see the selected delivery date on visit break down page
#    #TBA process
#    When User Double click the visit line
#    And click on change visit date
#    When User should be able to click TBA button
#    Then Check whether the user able to see the dated line back to TBA status in visit line
#
#    Examples:
#      | orderid_no    |
#      | 802560-8804-V |
#
#
#  Scenario Outline: 12-Verify whether user able to TBA the order as  which is dated by emergency override
#    #Note:User should have fleet order
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #override process
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And click on change visit date
#    When User should able to set the delivery date for the visit with selecting Create Emergency Visit
#    Then User should be able to see the selected delivery date on visit break down page
#    #TBA process
#    When User Double click the visit line
#    And click on change visit date
#    When User should be able to click TBA button
#    Then Check whether the user able to see the dated line back to TBA status in visit line
#
#    Examples:
#      | orderid_no    |
#      | 802560-8804-V |

  Scenario Outline: 13-Verify whether user able to date order as  by emergency  and change the date by override resources
      #login to hdx application
       #Note: user should have the fleet order
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"
      # emergency overide
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    Then User should be able to see the selected delivery date on visit break down page
    When User should able to set the delivery date for the visit with selecting Create Emergency Visit
    Then User should be able to see the selected delivery date on visit break down page
    #resource override
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit with selecting override resources
    Then User should be able to see the selected delivery date on visit break down page

    Examples:
      | orderid_no    |
      | 802560-8804-V |

  Scenario Outline: 14-Verify whether user able to date order as  by overiding resource time
      #login to hdx application
       #Note: user should have the fleet order
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"
    #resource override
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit with selecting override resources
    Then User should be able to see the selected delivery date on visit break down page

    Examples:
      | orderid_no    |
      | 802560-8804-V |