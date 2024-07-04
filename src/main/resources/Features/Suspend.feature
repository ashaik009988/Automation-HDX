Feature: Suspending Scenarios

  Scenario Outline: 01-Verify whether only two options are available in Susupension options while suspend the
  order.

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    When User Double click the visit line
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
    And  user able to select the unrouted drops
    And user able to select the routed drops
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#--------- suspend order process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User able to verify whether only two options are available in Susupension options

    Examples:
      | sheetname | Prodcode | Quantity | visitafterrouting | statusafterrouting   |
      | SC1       | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

  Scenario Outline: 02-Suspending the given fleet order with a reason Suspended (Store amendment Due).

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
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
    And  user able to select the unrouted drops
    And user able to select the routed drops
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
##--------- suspend order process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Examples:

      | sheetname | Prodcode | Quantity | visitafterrouting | statusafterrouting   |
      | SC2       | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

  Scenario Outline: 03-Suspending the given fleet order with a reason Suspended - Visit On Hold.

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
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
    And  user able to select the unrouted drops
    And user able to select the routed drops
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#--------- suspend order process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended - Visit On Hold and click on ok
    Then User is able to verify the suspended in home page

    Examples:

      | sheetname | Prodcode | Quantity | visitafterrouting | statusafterrouting   |
      | SC3       | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

  Scenario Outline: 04-Suspending the given Postal Delivery with a reason Suspended (Store amendment Due).

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
#     -------------- Suspend process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page
    Then User Select Suspended - Visit On Hold and click on ok
    Examples:

      | sheetname | Prodcode | Quantity |
      | SC4       | Custid   | Qty      |

  Scenario Outline: 05-Suspending the given Parcel Force with a reason Suspended - Visit On Hold
    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
#     -------------- Suspend process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended - Visit On Hold and click on ok
    Then User is able to verify the suspended in home page

    Examples:

      | sheetname | Prodcode | Quantity |
      | SC5       | Custid   | Qty      |

  Scenario Outline: 06-Suspending the given DX Freight with a reason Suspended - Visit On Hold
    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
     #-------------- Suspend process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended - Visit On Hold and click on ok
    Then User is able to verify the suspended in home page

    Examples:

      | sheetname | Prodcode | Quantity |
      | SC6       | Custid   | Qty      |

      
      
      
      