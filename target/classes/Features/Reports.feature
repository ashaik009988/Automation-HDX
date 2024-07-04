Feature: Reporting Scenarios



#  Scenario Outline: 01-Validate the  Confirmed Delivery report in HDX
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the Confirmed Delivery report
#    Then User should  be able to filter the date for confirmed delihvery
#    Then Confirmed orders should be shown for confirmed delhivery
#    Then User should see the details as expected for confirmed delhivery
#    Examples:
#      | orderid       |
#      | 811834-8805-V |
#
#


#  Scenario Outline: 02-Validate the Emergency Orders For Routing Report
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #Reports section
#    When User should be able to go reports for Emergency Orders For Routing Report
#    Then User should be able to select the Emergency Orders For Routing Report
#    Then User should  be able to filter the date for Emergency Orders For Routing Report
#    Then Confirmed orders should be shown for Emergency Orders For Routing Report
#    Then User should see the details as expected for Emergency Orders For Routing Report
#    Examples:
#      | orderid       |
#      | 802985-8804-V |



#  Scenario Outline: 03-Validate the Delivery Information by day report in HDX
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #Reporting section
#    When User should be able to go reports for Delivery Information by day report
#    Then User should be able to select the Delivery Information by day report
#    Then User should  be able to filter the date for Delivery Information by day report
#    Then Confirmed orders should be shown for Delivery Information by day report
#    Then User should see the details as expected for Delivery Information by day report
#    Examples:
#      | orderid       |
#      | 813273-8805-V |




#  Scenario Outline: 04-Validate the Goodwill payment report in HDX
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports for Goodwill payment report
#    Then User should be able to select the Goodwill payment report
#    Then User should  be able to filter the date for Goodwill payment report
#    Then Confirmed orders should be shown for Goodwill payment report
#    Then User should see the details as expected for Goodwill payment report
#    Examples:
#      | orderid       |
#      | 807523-8804-V |



#  Scenario Outline: 05-Validate the Items To Follow report in HDX
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports for items to follow
#    Then User should be able to select the items To Follow
#    Then User should  be able to filter the date for items To Follow
#    Then Confirmed orders should be shown for items To Follow
#    Then User should see the details as expected for items To Follow
#    Examples:
#      | orderid       |
#      | 812102-8805-V |
#
#

#  Scenario Outline: 06-Validate the Substitutions Report
##    login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports for Substitutions Report
#    Then User should be able to select the Substitutions Report
#    Then User should  be able to filter the date for Substitutions Report
#    Then Confirmed orders should be shown for Substitutions Report
#    Then User should see the details as expected for Substitutions Report
#    Examples:
#      | orderid       |
#      | 811513-8805-V |

#  Scenario Outline: 07-Validate the Order received report
#
#    #loging to hdx and searching the order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports searching  for Order received report
#    Then User should be able to select the Order received report
#    Then User should  be able to filter the date for Order received report
#    Then Confirmed orders should be shown for Order received report
    #Then User should see the details as expected for Order received report
#    Examples:
#      | orderid       |
#      | 807355-8804-V |



#  Scenario Outline: 08-Verify the TBA  Report
#
#    #Login to hdx and Searching the order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid "<orderid>" in searchbox for reporting
#
#    #Verifying the TBA report
#    When User should be able to go reports for searching TBA report
#    Then User should be able to select the for TBA report
#    Then User should  be able to filter for TBA report
    #Then Confirmed orders should be shown for TBA report
    #Then User should see the details as expected for TBA report
#    Examples:
#    | orderid       |
#    | 807355-8804-V |

#pending
  Scenario Outline: 09-Validate the Orders To Remedials Report
    #Note: You should have Remedial order before running this usecase
    #login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    #reporting section
    When User should be able to go reports for Remedials Report
    Then User should be able to select the Remedials Report
    Then User should  be able to filter the "<FilterDate>" for Remedials Report
    Then User should see the details as expected for Remedials Report for details "<NoOfRemedial>" and "<NoOfOrders>"
    Examples:
       |FilterDate     |NoOfRemedial |NoOfOrders |
       |29 January 2024|  4          |    0      |

#  Scenario Outline: 10-Validate the Orders in Pipeline Reports
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When User able able click on Go to Reports
#    Then User able Select Orders in pipeline reports
#    When User able to Filter the "<Date>" and enter "<outbase value>"
#    When User able to Click on Search
#  #6.Verify the below details Supplier category Subcategory
#  #  Day 0
#  #  Date 0 Date
#  #  Day ....to 7
#  #  Date ....to 7th days
#    Examples:
#      | Date            |outbase value|
#      | 18 January 2024 |ALL          |

#  Scenario Outline: 11-Validate the Units in Pipeline Reports
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When User able able click on Go to Reports
#    Then User able Select Units in pipeline reports
#    When User able to Filter the "<Date>" and enter "<outbase value>"
#    When User able to Click on Search
#    #6.Verify the below details Supplier category Subcategory
#  #  Day 0
#  #  Date 0 Date
#  #  Day ....to 7
#  #  Date ....to 7th days
#
#    Examples:
#      | Date            |outbase value|
#      | 18 January 2024 |ALL          |

#  Scenario: 12-Validate the Order book
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When User able able click on Go to Reports
#    Then User able Select Order book
#    When User able to Click on Search for order book
#   #  5.Verify the below details
#   #  Supplier category
#   #  Subcategory
#   #  Day 0 to 28, then weekly 5 to 8, Later (Dated)
#   #  Non dated

#  Scenario: 13-Validate the Order book by week
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When User able able click on Go to Reports
#    Then User able Select report by week
#    When User able to Click on Search for report by week
##  5.Verify the below details
##  Supplier category
##  Sub category
##  Week 0 Week 0 date
##  To week 8
##  Later date
##  Non dated
##  Total

#  Scenario Outline: 14-Validate the Customer Notifications Report
#    #Note: user should have the fleet order
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the Customer Notifications Report
#    Then User should  be able to filter the date for Customer Notifications Report
#    Then Confirmed orders should be shown for Customer Notifications Report
#    Then User should see the details as expected for Customer Notifications Report
#    Examples:
#      | orderid       |
#      | 814411-8805-V |

#  Scenario Outline: 15- Validate the Line Walk Report
#    #Note: user should have the fleet order which is dated,routed and loaded
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<wms code>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the Line Walk Report
#    Then User should  be able to filter the date for Line Walk Report
#    Then Confirmed orders should be shown for Line Walk Report
#    Then User should see the details as expected for Line Walk Report
#    Examples:
#      | wms code     |
#      | AXS000021809 |

#  Scenario Outline: 16- Validate the Spares report
#    #Note: user should have the fleet order which is dated
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the Spares report
#    Then User should  be able to filter the date for Spares report
#    Then Confirmed orders should be shown for Spares report
#    Then User should see the details as expected for Spares report
#    Examples:
#      | orderid      |
#      |828219-8804-V |


#  Scenario Outline: 17- Validate the Catch all preview report/New Report.
#    #Note: user should have the fleet order which is dated
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    #And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports for call on preview
#    Then User should be able to select the Catch all preview report New Report.
#    Then User should  be able to filter the date for Catch all preview report New Report "<start>"  "<End>"  "<Month>".
#    Then Confirmed orders should be shown for Catch all preview report New Report for "<orderid>".
#    Then User should see the details as expected for Catch all preview report New Report for "<orderid>".
#    Examples:
#      | orderid      |start            |End              |Month  |
#      |812086-8805-V |"29 January 2024"|"30 January 2024"|January|

#  Scenario Outline: 18-Validate the Workflow Queue Contents Report
#    #Note: user should have the fleet order which is dated and checked the workflow
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<Wms code>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the Workflow Queue Contents Report
#    Then User should  be able to filter the "<Workflow Queue Number>" and "<Workflow Action Number>" in Workflow Queue Contents Report
#    Then Confirmed orders should be shown for Workflow Queue Contents Report
#    Then User should see the details as expected for Workflow Queue Contents Report
#    Examples:
#      | Wms code    |Workflow Queue Number|Workflow Action Number|
#      |AXS000015093 |Provisional Orders   |ALL                   |

#  Scenario Outline: 19-Validate the Stock Movement Manifest report
#    #Note: user should have the fleet order which is dated and  routed and failed order
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<order id>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the stock Movement Manifest report
#    Then User should  be able to filter the Filter the date and "<outbase>" for stock Movement Manifest report
#    Then Confirmed orders should be shown for stock Movement Manifest report
#    Then User should see the details as expected for stock Movement Manifest report
#    Examples:
#      | order id    |outbase|
#      |AXS000015093 |   ALL |

#  Scenario Outline: 20-Validate the delivery and collection report in HDX
#    #Note: user should have the fleet order which is dated and  routed and failed order
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<order id>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the delivery and collection report
#    Then User should be able to filter the date for delivery and collection report
#    Then Confirmed orders should be shown for delivery and collection report
#    Then User should see the details as expected for delivery and collection report
#    Examples:
#      | order id    |
#      |812419-8805-V|



#  Scenario Outline: 21-Validate the New Remedials Report
#    #Note: .User should have Orders Remedials raised for a given time period
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<order id>" in searchbox for reporting
#
#    #reporting section
#    When User should be able to go reports
#    Then User should be able to select the New Remedials Report
#    Then User should be able to filter the date for New Remedials Report
#    Then Confirmed orders should be shown for New Remedials Report
#    Then User should see the details as expected for New Remedials Report
#    Examples:
#      | order id    |
#      |812024-8805-V|



