Feature: Pick Release




 #Scenario Outline: 01-Verify whether pick release file is generated with nn/SOT for fleet orders
#
     #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
     #When User send request to create a new order
     #Then orders should be successfully created in API
     #Given User on Login Page of hdx application
     #When User able to enter userid and password
     #Then User landed on PROD hdx home page
     #And User passes the orderid in searchbox
     #And User navigate to summary tab to get the required data
     #Then User validate if the data provided is valid
     #Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
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
#|sheetname  |Prodcode      |Quantity    |itemDetails            |status                                 |visitafterrouting      |statusafterrouting       |
#|SC1        |Custid        |Qty         |Fleet Delivery         |Self Booking Message Queued For Sending|Fleet Delivery         |Due Stock Allocation     |
   
   
   
   
   
   
   
   
   
#Scenario Outline: 02-Verify whether pick release file is generated with nn/SOT for fleet orders
   #
     #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
     #Given User on Login Page of hdx application
     #When User able to enter userid and password
     #Then User landed on PROD hdx home page
     #And User navigate to Order Manager and click on Add Order
     #And User provide Customer details to create an order in HDX
     #And User provide Skus and Quantity
     #And User navigate to summary tab to get the required data
     #Then User validate if the data provided is valid
     #Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
    #
     #
     #
#Examples:
#|sheetname  |Prodcode      |Quantity    |itemDetails          |status                  |
#|SC2        |Custid        |Qty         |Parcel Force         |Due Stock Allocation    |







#Scenario Outline: 03-Verify whether pick release file is generated with 4B/SON for night freight orders
#
     #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
     #When User send request to create a new order
     #Then orders should be successfully created in API
     #Given User on Login Page of hdx application
     #When User able to enter userid and password
     #Then User landed on PROD hdx home page
     #And User passes the orderid in searchbox
     #And User navigate to summary tab to get the required data
     #Then User validate if the data provided is valid
     #Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
#
#Examples:
#|sheetname  |Prodcode      |Quantity    |itemDetails          |status                  |
#|SC3        |Custid        |Qty         |DX Delivery          |Due Stock Allocation    |
  
  
  
  
  
  
#Scenario Outline: 04-Verify whether pick release file is generated with PS/SOE for postal orders
#
     #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
     #When User send request to create a new order
     #Then orders should be successfully created in API
     #Given User on Login Page of hdx application
     #When User able to enter userid and password
     #Then User landed on PROD hdx home page
     #And User passes the orderid in searchbox
     #And User navigate to summary tab to get the required data
     #Then User validate if the data provided is valid
     #Then User Validate <itemDetails> and <status> for the searched order in Visit Breakdown
#
#Examples:
#|sheetname  |Prodcode      |Quantity    |itemDetails          |status                  |
#|SC4        |Custid        |Qty         |Postal Delivery      |Due Stock Allocation    |








  #Scenario Outline: 05-Suspending order in HDX post route finalisation.Also validate user is able to redate suspended order.(Store amendment due)
#
    #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    #When User send request to create a new order
    #Then orders should be successfully created in API
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid in searchbox
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
    #And  user able to select the unrouted drops
    #And user able to select the routed drops
    #Then User should able to validate the visit <visitafterrouting> and status <statusafterrouting>
#--------- suspend order process
    #When User Double click the visit line
    #Then User able click on suspend button visit date screen
    #Then User Select Suspended (Store amendment Due) and click on ok
    #Then User is able to verify the suspended in home page
#
    #Examples:
#
      #| sheetname | Prodcode | Quantity | visitafterrouting | statusafterrouting   |
      #| SC5       | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

 
 
 
  Scenario Outline: 06-Suspending order in HDX post route finalisation.Also validate user is able to redate suspended order.(Stock on hold)

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
      | SC6       | Custid   | Qty      | Fleet Delivery    | Due Stock Allocation |

     