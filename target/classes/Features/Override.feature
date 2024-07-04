Feature: Override

#Scenario Outline: 01- Change Fleet visit to Parcel force
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
#And User click on change visit address
#And User selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#
#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC1         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 02- Change visit Parcel force to Fleet
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
#And User click on change visit address
#And User selects Force Wickes Fleet from dropdown for override
#Then User should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#-----Wickes Kitchens - Fleet Delivery

#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC2         |Custid           |Qty              |Fleet Delivery          |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 03- Change the address and also force to parcel the dated fleet order
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating steps ------------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#---Changing address and Type
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen
#And User click on change visit address
#And User change the address and selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#Then User validate the address after changing the address
#
#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC3         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 04- Change the address and also force to parcel the dated fleet order
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating steps ------------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#---Changing address and Type
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen
#And User click on change visit address
#And User change the address and selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#Then User validate the address after changing the address

#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC4         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 05- Change DX to Fleet
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
#And User click on change visit address
#And User change the address and selects Force Wickes Fleet from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#Then User validate the address after changing the address
#
#
#-----Wickes Kitchens - Fleet Delivery
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC5         |Custid           |Qty              |Fleet Delivery          |Due Stock Allocation     |SINGLE  | 

#Scenario Outline: 06- Change Fleet Visit with Fleet one sku to Force Parcel
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating steps --------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here ---
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#---Changing address and Type----
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen
#And User click on change visit address
#And User change the address and selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#Then User validate the address after changing the address
#
#
#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC6         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 07- Change Fleet Visit with Fleet one sku and one Non Fleet sku to Force Parcel
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#----------- From here write the Dating steps --------------
#When User Double click the visit line with date as TBA
#Then User is on  Schedule a visit date screen 
#And click on change visit date
#And click on overrides
#And selects override options as Create Emergency Visit
#---Selecting date and validating from here ---
#When User should able to set the delivery date for the visit
#Then User should be able to see the selected delivery date on visit break down page
#---Changing address and Overriding from one type to another -----------
#When User Double click the visit line 
#Then User is on  Schedule a visit date screen
#And User click on change visit address
#And User change the address and selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#Then User validate the address after changing the address
#
#
#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC7         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#Scenario Outline: 08- Change Fleet visit to Parcel force After Routing
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#When User send request to create a new order
#Then orders should be successfully created in API
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User passes the orderid in searchbox
#-------- Overriding from one type to another -----------
#When User Double click the visit line
#Then User is on  Schedule a visit date screen
#And User click on change visit address
#And User selects Force Parcel from dropdown for override
#Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#
#----Parcel Force - Parcel Force 24
#
#Examples:
#|sheetname   |Prodcode         |Quantity         |visitafteroverride      |statusafteroverride      |type    |
#|SC8         |Custid           |Qty              |Parcel Force            |Due Stock Allocation     |SINGLE  |

#  Scenario Outline: 09-Verify whether user able to change visit small van  to Fleet
#        #login to hdx application
#    #Note: user should have the smallvan order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
##    When User Double click the visit line
##    Then User is on  Schedule a visit date screen
##    And User click on change visit address
##    And User selects Force Wickes Fleet from dropdown for override
#    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#    Examples:
#      | orderid       |visitafteroverride                      |statusafteroverride      |
#      | 000137-8805-H |Wickes Kitchens - Fleet Delivery        |Awaiting Date           |
#

#  Scenario Outline: 10-"Verify whether user able change the address and also force to parcel the dated remedial fleet order and also check the status"
#        #login to hdx application
#    #Note: user should have the remedial order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And User click on change visit address
#    And User selects Force Parcel from dropdown for override for remedial
#    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#    Examples:
#      | orderid       |visitafteroverride |statusafteroverride  |
#      | 808054-8804-V |Parcel Force       |Due Stock Allocation |

#  Scenario Outline: 11-Override Fleet to Small Van
#        #login to hdx application
#    #Note: user should have the fleet order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And User click on change visit address
#    And User selects Force Small Van from dropdown for override
#    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#    Examples:
#      | orderid       |visitafteroverride                     |statusafteroverride  |
#      | 804656-8804-V |Wickes Van deliveries - Fleet Delivery |Awaiting Date        |
#

#  Scenario Outline: 12-Mixed order and override the Fleet visit to  parcel force
#        #login to hdx application
#    #Note: user should have the mixed order
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And User click on change visit address
#    And User selects Force Parcel from dropdown for override
#    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#    Examples:
#      | orderid       |visitafteroverride|statusafteroverride  |
#      | 807426-8804-V |Parcel            |Due Stock Allocation |
#
#  Scenario Outline: 13-Place fleet order, Split into two fleet visit  and override 2nd fleet visit to parcel force
#        #login to hdx application
#    #Note: user should have Split into two fleet visit
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Double click the visit line
#    Then User is on  Schedule a visit date screen
#    And User click on change visit address
#    And User selects Force Parcel from dropdown for override
#    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override
#
#    Examples:
#      | orderid       |visitafteroverride|statusafteroverride  |
#      | 807426-8804-V |Parcel            |Due Stock Allocation |

  Scenario Outline: 14-Suspend order and override to pf
        #login to hdx application
    #Note: user should have the fleet order which is dated and routed
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And  User passes the orderid "<orderid>" in searchbox for reporting

    # suspend process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    #override process
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And User click on change visit address
    And User selects Force Parcel from dropdown for override
    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override

    Examples:
      | orderid       | visitafteroverride | statusafteroverride  |
      | 803127-8804-V|   Parcel   | Due Stock Allocation |


  Scenario Outline: 15-Suspend order and override to Fleet
        #login to hdx application
    #Note: user should have the fleet order which is dated and routed
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And  User passes the orderid "<orderid>" in searchbox for reporting

    # suspend process
    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    #override process
    When User Double click the visit line
    Then User is on  Schedule a visit date screen
    And User click on change visit address
    And User selects Force Wickes Fleet from dropdown for override
    Then After override user should able to validate the visit <visitafteroverride> and status <statusafteroverride> after override


    Examples:
      | orderid       | visitafteroverride | statusafteroverride  |
      | 807426-8804-V |  Wickes Fleet      | Due Stock Allocation |


