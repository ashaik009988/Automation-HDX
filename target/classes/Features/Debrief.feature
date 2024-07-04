Feature: Debrief

#Scenario Outline: 01- Verify that whether user able to force debrief when fleet visit is  due stock allocation
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating and Routing steps --------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#-----Selecting date and validating from here
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
#-------Force Debrief
#And User click on summary tab
#And User click on troubleshooter button
#And User selects the force debrief visit
#Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#
#
#
#Examples:
#|sheetname    |Prodcode      |SplittingQty   |Quantity     |visitafterrouting      |statusafterrouting        |visitafterdebrief      |statusafterbrief        |
#|SC1          |Custid        |Splitting Qty  |Qty          |Fleet Delivery         |Due Stock Allocation      |Fleet Delivery         |Successful Delivery     |
#
#
#Scenario Outline: 02-Verify that whether user able to force debrief the DX order when visit is suspended due to stock issues
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
#     -------------- Suspend process
#    When User Double click the visit line
#    Then User able click on suspend button visit date screen
#    Then User Select Suspended - Visit On Hold and click on ok
#    Then User is able to verify the suspended in home page
#    -------Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#
#    Examples:
#
#      | sheetname | Prodcode | Quantity |visitafterdebrief      |statusafterbrief        |
#      | SC2       | Custid   | Qty      |Fleet Delivery         |Successful Delivery     |
#
#
# Scenario Outline: 03-Verify that whether user able to regress debrief  when fleet  visit is successfully delivered
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
#    -------Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#      -------Regress Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the regress debrief visit
#    Then User should validate debrief the visit <visitafterregressdebrief> and status <statusafterregressbrief>
#
#
#    Examples:
#
#      | sheetname | Prodcode | Quantity |visitafterdebrief      |statusafterbrief        |visitafterregressdebrief |statusafterregressbrief                     |
#      | SC3       | Custid   | Qty      |Fleet Delivery         |Successful Delivery     |Fleet Delivery           |Self Booking Message Queued For Sending     |
#
#
#  Scenario Outline: 04- Verify that whether user able to force debrief  fleet order when visit is undated
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
#    -------Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#
#    Examples:
#
#      | sheetname | Prodcode | Quantity |visitafterdebrief      |statusafterbrief        |
#      | SC4       | Custid   | Qty      |Fleet Delivery         |Successful Delivery     |
#
#
# Scenario Outline: 05- Verify that whether user able to regress debrief  the supplier order when visit is successful delivery
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
##    -------Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
##      -------Regress Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the regress debrief visit
#    Then User should validate debrief the visit <visitafterregressdebrief> and status <statusafterregressbrief>
#
#
#    Examples:
#
#      | sheetname | Prodcode | Quantity |visitafterdebrief      |statusafterbrief        |visitafterregressdebrief |statusafterregressbrief      |
#      | SC5       | Custid   | Qty      |Supplier Delivery      |Successful Delivery     |Supplier Delivery        |Awaiting supplier debrief    |

#
#  Scenario Outline: 06- Verify that whether user able to force debrief when Parcel Force is  due stock allocation
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    When User send request to create a new order
#    Then orders should be successfully created in API
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the orderid in searchbox
##-------Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | sheetname | Prodcode | SplittingQty  | Quantity | visitafterdebrief | statusafterbrief    |
#      | SC6       | Custid   | Splitting Qty | Qty      | Parcel Force      | Successful Delivery |

#  Scenario Outline: 07- Verify that whether user able to force debrief when DX order visit is dated
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password"Verify that whether user able to force debrief when Parcelforce visit is  due stock allocation
#"
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief    |
#      | 000909-8804-H |   DX Delivery     | Successful Delivery |

#  Scenario Outline: 08- Verify that whether user able to force debrief when Parcelforce order visit is dated
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with <orderid_no>
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief    |
#      | 804432-8804-V | Parcel Force      | Successful Delivery |

#  Scenario Outline: 09- Verify that whether user able to force debrief when postal  order visit is dated
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief    |
#      | 000910-8804-H | Postal Delivery   | Successful Delivery |
#
#  Scenario Outline: 10- "Verify that whether user able to regress debrief  fleet order when visit is dated"
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And  User selects the regress debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief    |
#      | 803341-8804-V |  Fleet Delivery   | Successful Delivery |
#
#  Scenario Outline: 11- Verify that whether user able to force debrief when fleet order visit is suspended before routed
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the force debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief    |
#      | 804805-8804-V | Fleet Delivery    | Successful Delivery |

#  Scenario Outline: 12- "Verify that whether user able to regress debrief  the postal delivery  when visit is successful delivery"
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And  User selects the regress debrief for visit details not appearing
#    Then User should cross validate debrief the visit <visitafterdebrief> and status <notstatusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | notstatusafterbrief    |
#      | 000910-8804-H | Postal Delivery   | awaiting Debrief       |
#

#  Scenario Outline: 13- "Verify that whether user able to regress debrief  the DX delivery  when visit is successful delivery"
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the regress debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief     |
#      | 000909-8804-H | DX Delivery       | Due Stock Allocation |

#    Scenario Outline: 14- "Verify that whether user able to regress debrief  the parcel force when visit is successful delivery"
#    #login part
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#    And User click on summary tab
#    And User click on troubleshooter button
#    And User selects the regress debrief visit
#    Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#    Examples:
#      | orderid_no    | visitafterdebrief | statusafterbrief     |
#      | 804432-8804-V | Parcel Force      | Due Stock Allocation |

#    Scenario Outline: 15- "Verify that whether user able to force debrief when visit is  Awaiting debrief"
#    #login part
#        Given User on Login Page of hdx application
#        When User able to enter userid and password
#        Then User landed on PROD hdx home page
#        And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#        And User click on summary tab
#        And User click on troubleshooter button
#        And User selects the force debrief visit
#        Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#        Examples:
#            | orderid_no    | visitafterdebrief | statusafterbrief   |
#            | 804432-8804-V | Fleet Delivery    | Successful Delivery|

#    Scenario Outline: 16-"Verify that whether user able to force debrief  supplier order when visit is undated"
#    #login part
#        Given User on Login Page of hdx application
#        When User able to enter userid and password
#        Then User landed on PROD hdx home page
#        And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#        And User click on summary tab
#        And User click on troubleshooter button
#        And User selects the force debrief visit
#        Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#        Examples:
#            | orderid_no    | visitafterdebrief | statusafterbrief   |
#            | 803941-8804-V | Fleet Delivery    | Successful Delivery|
#
#    Scenario Outline: 17-"Verify that whether user able to regress debrief  supplier order when visit is successful cdelivery"
#    #login part
#        Given User on Login Page of hdx application
#        When User able to enter userid and password
#        Then User landed on PROD hdx home page
#        And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#        And User click on summary tab
#        And User click on troubleshooter button
#        And User selects the regress debrief visit
#        Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#        Examples:
#            | orderid_no    | visitafterdebrief | statusafterbrief                          |
#            | 803941-8804-V | Fleet Delivery    |  Self Booking Message Queued For Sending  |
#
#    Scenario Outline: 18-"Verify that whether user able to force debrief when Postal order visit is  due stock allocation"
#    #login part
#        Given User on Login Page of hdx application
#        When User able to enter userid and password
#        Then User landed on PROD hdx home page
#        And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#        And User click on summary tab
#        And User click on troubleshooter button
#        And User selects the force debrief visit
#        Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#        Examples:
#            | orderid_no    | visitafterdebrief | statusafterbrief   |
#            | 000910-8804-H | Postal Delivery   | Successful Delivery|
#
#    Scenario Outline: 19- Verify that whether user able to force debrief when fleet order visit is dated
#        #login part
#        Given User on Login Page of hdx application
#        When User able to enter userid and password
#        Then User landed on PROD hdx home page
#        And User passes the order_id in searchbox with "<orderid_no>"
#    #Force Debrief
#        And User click on summary tab
#        And User click on troubleshooter button
#        And User selects the force debrief visit
#        Then User should validate debrief the visit <visitafterdebrief> and status <statusafterbrief>
#
#        Examples:
#            | orderid_no    | visitafterdebrief | statusafterbrief   |
#            | 803341-8804-V | Fleet Delivery    | Successful Delivery|