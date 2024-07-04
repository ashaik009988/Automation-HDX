Feature: Audit & Security

  Scenario Outline:01-Validate whether user is presented with the prompt window when user exit from the order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:02-Validate whether user is able to enter the reason and close the window to exit from the order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:03-Validate whether the log (Date,time & Reason) is saved

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:04-Validate whether user is presented with prompt window when user is open the same order second time and exit from the order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log
#   second time audit
    And User passes the orderid second time in searchbox
    When User should be able to click the Back button
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:05-Validate whether user is able to enter reason and close the window to exist from the order while user open same order second time

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log
#   second time audit
    And User passes the orderid second time in searchbox
    When User should be able to click the Back button
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:06-Validate whether when 2nd user is presented with the prompt window when user open and exist from the order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log
#   second time audit
    And User passes the orderid second time in searchbox
    When User should be able to click the Back button
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:07-Validate whether user is able to enter reason and close the window to exist from the order when 2nd user tries to exist from the order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log
#   second time audit
    And User passes the orderid second time in searchbox
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then User should able to Enter the "<reason>" and click on ok
    Then User is able to Check date,time,reason and userid captured in audit log

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | reason           |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | items is damaged |

  Scenario Outline:08-Validate whether user is getting prompt window when user try to exist from the order by closing an order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to order manager
    When user click on to order enquiry
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:09-Validate whether user is getting prompt window when user try to exist from the order by running a report

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to  Report wickes
    When user click on to TBA report
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:10-Validate whether user is getting prompt window when user try to exist form the order by opening another order

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Enters another "<order number>"
    Then user should presented with prompted screen


    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    | order number  |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief | 809416-8804-V |

  Scenario Outline:11-"Validate whether user is getting prompt window when user try to exist form the order by opening another order, after date the existing order"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    Then User should be able to see the selected delivery date on visit break down page
    When User Enters another "<order number>"
    Then user should not presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails    | status                                  | order number  |
      | A_SC11    | Custid   | Qty      | Fleet Delivery | Self Booking Message Queued For Sending | 809416-8804-V |

  Scenario Outline:12-"Validate whether user is getting prompt window when user try to exist form the order by opening another order, after route the existing order"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown

#    Dating process
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And click on change visit date
    When User should able to set the delivery date for the visit
    Then User should be able to see the selected delivery date on visit break down page

#   Routing process
    And User navigate to VisitDetails Screen and get depot
    When user able click on transport from main menu bar
    Then user is then able to see the sub drop down of transport
    Given user is on transport tab
    When user able to click on the Manual Routing from dropdown of transport tab
    And user able to select the date from the calendar for manual routing
    And user able to select the unrouted drops
    And user able to select the routed drops
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

#    Searching the another order
    When User Enters another "<order number>"
    Then user should not presented with prompted screen


    Examples:
      | sheetname | Prodcode | Quantity | itemDetails    | status                                  | visitafterrouting | statusafterrouting   | order number  |
      | A_SC11    | Custid   | Qty      | Fleet Delivery | Self Booking Message Queued For Sending | Fleet Delivery    | Due Stock Allocation | 809416-8804-V |
#pending
  Scenario Outline:13-"Validate whether user is getting prompt window when user try to exist form the order by opening another order, after split the existing order"

#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown

#    Spliting process
    Then User is landed on Visit break down page
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    Given User have an Excel containing order datas for split <sheetname> , with columnnames <Prodcode> and <SplittingQty>
    Then User should able to split the <itemName> visit and check status <status2>

#    entering the other order number
    When User Enters another "<order number>"
    Then user should not presented with prompted screen


    Examples:
      | sheetname | Prodcode | Quantity | itemDetails    | status                                  | order number  | SplittingQty  | itemName       | status2       |
      | A_SC11    | Custid   | Qty      | Fleet Delivery | Self Booking Message Queued For Sending | 809416-8804-V | Splitting Qty | Fleet Delivery | Awaiting Date |

  Scenario Outline:14-"Validate whether user is getting prompt window when user try to exist form the order by opening another order, after substitute the existing order"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown

  #    substitution process
    And User expand the visit in visit breakdown screen for <type> Order
    When User Select and Double click the visit line
    And User click on change substitute item
    And User click on "<Replacesku>" for substituting with particular "<sku>" with "<substitute_Quantity>"
    And User landed on item details page
    Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>

    #    entering the other order number
    When User Enters another "<order number>"
    Then user should not presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails    | status                                  | order number  | type   | Replacesku | sku    | substitute_Quantity | visitafterrouting | statusafterrouting   |
      | A_SC11    | Custid   | Qty      | Fleet Delivery | Self Booking Message Queued For Sending | 809416-8804-V | SINGLE | 195750     | 195746 | 2                   | DX Delivery       | Due Stock Allocation |

  Scenario Outline:15-"Validate whether user is getting prompt window when user try to exist from the order by go to order manager and click on order enquiry"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to order manager
    When user click on to order enquiry
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:16-"Validate whether user is getting prompt window when user try to exit from the order by go to  transport tab and click on resource monitor"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to transport tab
    When user click on to resource monitor
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:17-"Validate whether user is getting prompt window when user try to exist from the order by go to  maintenance tab and click on oos management"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to maintenance tab
    When user click on to oos management
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:18-"Validate whether user is getting prompt window when user try to exist from the order by go to tools tab and click on status monitor"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to tools tab
    When user click on to status monitor
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:19-"Validate whether user is getting prompt window when user try to exist from the order by click on logout "

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to tools tab
    When user click on to logout button
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:20-"Validate whether user is getting prompt window when user try to exist from the order by go to stock manager and click on warehouse despatch"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to stock manager
    When user click on to warehouse despatch
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:21-"Validate whether user is getting prompt window when user try to exist from the order by go to report and click on routing performance"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    When User Navigate to report
    When user click on to routing performance
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:22-Validate whether user is getting prompt window when user close the prompt and  refresh the page

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    And User navigate to summary tab to get the required data
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then  User should able to close the prompt by clicing cross mark
    Given User refresh the application
    Then User presented orderenquiry screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |

  Scenario Outline:23-Validate whether user is getting prompt window  when user close the prompt window and navigate to other tabs

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    And User navigate to summary tab to get the required data
    When User should be able to click the Back button
    Then user should presented with prompted screen
    Then  User should able to close the prompt by clicing cross mark
    When User Navigate to maintenance tab2
    When user click on to oos management
    Then user should presented with prompted screen

    Examples:
      | sheetname | Prodcode | Quantity | itemDetails       | status                    |
      | SC7       | Custid   | Qty      | Supplier Delivery | Awaiting supplier debrief |




