Feature: Substitution


  Scenario Outline: 01-Substitution of an order and dated the subtituted visit

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    And User expand the visit in visit breakdown screen for <type> Order
    When User Select and Double click the visit line
    And User click on change substitute item
    And User click on sku for substituting with another sku 195760
    And User landed on item details page
    Then User Validate the VisitBreakDown page
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
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    Examples:
      | type   | sheetname     | Prodcode | Quantity | visitafterrouting | statusafterrouting   |
      | SINGLE | Substitution1 | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

#
#Scenario Outline: 02-Date the visit then Substitution of an order
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
#
#And User expand the visit in visit breakdown screen for <type> Order
#When User Select and Double click the visit line
#And User click on change substitute item
#And User click on sku for substituting with another sku 195760
#And User landed on item details page
#Then User Validate the VisitBreakDown page
#
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
#Examples:
#|type    |sheetname          |Prodcode      |Quantity    |visitafterrouting      |statusafterrouting            |
#|SINGLE  |Substitution2      |Custid        |Qty         |Fleet Delivery         |Due Stock Allocation          |
#

#Scenario Outline: 03- Substitute the Fleet Sku with Non Fleet Sku order
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#And User expand the visit in visit breakdown screen for <type> Order
#When User Select and Double click the visit line
#And User click on change substitute item
#And User click on sku for substituting with another sku 195747
#And User landed on item details page
#Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#----------- From here write the Dating and Routing steps ------------------
#
#Examples:
#|type    |sheetname          |Prodcode      |Quantity    |visitafterrouting      |statusafterrouting            |
#|SINGLE  |Substitution3      |Custid        |Qty         |Parcel Force           |Due Stock Allocation          |


  Scenario Outline: 04- "Verify whether user able to do substitute the DX Sku with Fleet SKU and also check which type of visit reflected"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    And User expand the visit in visit breakdown screen for <type> Order
    When User Select and Double click the visit line
    And User click on change substitute item
    And User click on sku for substituting with another "<sku>" with "<substitute_Quantity>"
    And User landed on item details page
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    Examples:
      | type   | sheetname     | Prodcode | Quantity | sku    | substitute_Quantity | visitafterrouting | statusafterrouting   |
      | SINGLE | Substitution4 | Custid   | Qty      | 195746 | 2                   | DX Freight        | Due Stock Allocation |

  Scenario Outline: 05- "Verify whether user able to do substitute for dated Fleet order with Non Fleet Sku and also check which type of visit reflected"
#   creating the order
    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API

#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox

#    Dating the order
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    Then User should be able to see the selected delivery date on visit break down page

#    substitution process
    And User expand the visit in visit breakdown screen for <type> Order
    When User Select and Double click the visit line
    And User click on change substitute item
    And User click on sku for substituting with another sku 195747
    And User landed on item details page
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    Examples:
      | type   | sheetname     | Prodcode | Quantity | visitafterrouting | statusafterrouting          |
      | SINGLE | Substitution5 | Custid   | Qty      | Fleet Delivery    | Awaiting Route Finalisation |

  Scenario Outline: 06- Verify whether user able to perform substitution in remedial visit
#    user should have remedial order
#    login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the order_id in searchbox with "<orderid_no>"

#    substititution process
    And User expand the visit in visit breakdown screen for <type> Order
    When User Select and Double click the visit line
    And User click on change substitute item
    And User click on "<Replacesku>" for substituting with particular "<sku>" with "<substitute_Quantity>"
    And User landed on item details page
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    Examples:
      | type   | orderid_no    | Replacesku | sku    | substitute_Quantity | visitafterrouting | statusafterrouting   |
      | SINGLE |808370-8804-V | 195750     | 195746 | 2                   | DX Delivery        | Due Stock Allocation |
