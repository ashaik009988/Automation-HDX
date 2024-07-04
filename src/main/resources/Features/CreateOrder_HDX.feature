Feature: CreateOrder_HDX

#Scenario Outline: 01-Create an Order with invalid email input
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User navigate to Order Manager and click on Add Order
#And User provide invalid email input in Customer details to create an order in HDX
#And User provide Skus and Quantity
#Then User exits from Browser
#
#Examples:
#|sheetname |Prodcode      |Quantity    |visitforvalidation     |statusforvalidation     |
#|HDX_SC1   |Custid        |Qty         |Parcel Force           |Due Stock Allocation    |



#Scenario Outline: 02-Create an Mixed Order
#
#Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User navigate to Order Manager and click on Add Order
#And User provide Customer details to create an order in HDX
#And User provide Skus and Quantity
#Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
#Then User exits from Browser
#
#Examples:
#|sheetname |Prodcode      |Quantity    |visitforvalidation     |statusforvalidation     |
#|HDX_SC2   |Custid        |Qty         |Parcel Force           |Due Stock Allocation    |


#  Scenario Outline: 03-Verify whether user able to raise a spare part using dummy sku as a remedial in an existing order
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should able to click on the remedial button
#    Then User is able to Enter the Sku and click on search add sku and hit create visit
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status          |
#      | 808371-8804-V | Postal Delivery|

#  Scenario Outline: 04-Verify whether user able to raise a spare part without using a dummy sku (Spares damaged in pack)
#        #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should able to click on the remedial button
#    Then User is able to Enter the Sku and click on search add sku and hit create visit without using a dummy sku
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status          |
#      | 808371-8804-V | Postal Delivery|

#  Scenario Outline: 05-"verify whether user able to create a mixed  PF  order and check the AXS number and VR file"
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User navigate to Order Manager and click on Add Order
#    And User provide Customer details to create an order in HDX
#    And User provide Skus and Quantity
#    Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
#    Then user clicks on Summary Tab
#    Then User is able to see AXS number of order
#
#    Examples:
#      |sheetname |Prodcode      |Quantity    |visitforvalidation     |statusforvalidation     |
#      |O_SC5     |Custid        |Qty         |Parcel Force           |Due Stock Allocation    |

  Scenario Outline: 06-"verify whether user able to create a mixed DX  order and check the AXS number and VR file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity
    Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC6     | Custid   | Qty      | DX Delivery        | Due Stock Allocation |

  Scenario Outline: 07-"verify whether user able to create a mixed  postal  order  and check the AXS number and VR file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity
    Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC7     | Custid   | Qty      | Postal Delivery    | Due Stock Allocation |

#  Scenario Outline: 08-"verify whether user able to create a mixed  Fleet  order and check the AXS number and VR file"
#
#    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And User navigate to Order Manager and click on Add Order
#    And User provide Customer details to create an order in HDX
#    And User provide Skus and Quantity
#    Then User should validate the Mixed order With Supplier Visit and Other visit <visitforvalidation> and status <statusforvalidation>
#    Then user clicks on Summary Tab
#    Then User is able to see AXS number of order
#
#    Examples:
#      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
#      | O_SC8     | Custid   | Qty      |  Fleet Delivery    | Awaiting Date        |

  Scenario Outline: 09-"verify whether user able to create a   PF  order and check the AXS number and VR file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC9     | Custid   | Qty      | Parcel Force       | Due Stock Allocation |

  Scenario Outline: 10-"verify whether user able to create a  DX  order and check the AXS number and VR file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC10    | Custid   | Qty      | DX Freight         | Due Stock Allocation |

  Scenario Outline: 11-"verify whether user able to create a   postal  order  and check the AXS number and VR file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC11    | Custid   | Qty      | Postal Delivery    | Due Stock Allocation |

  Scenario Outline: 12-"Verify whether  notes is reflected in VR file, when notes is given for fleet order in HDX "

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation |notes                    |
      | O_SC8     | Custid   | Qty      | Fleet Delivery     | Awaiting Date       |the product is added     |

  Scenario Outline: 13-Verify whether  notes is reflected in VR file, when notes is given for DX order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC10    | Custid   | Qty      | DX Freight         | Due Stock Allocation |the product is added     |

  Scenario Outline: 14-Verify whether  notes is reflected in VR file, when notes is given for PF order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC9     | Custid   | Qty      | Parcel Force       | Due Stock Allocation | the product is added    |

  Scenario Outline: 15-Verify whether  notes is reflected in VR file, when notes is given for postal order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC11    | Custid   | Qty      | Postal Delivery    | Due Stock Allocation | the product is selected |

  Scenario Outline: 16-Verify whether  notes is reflected in VR file, when notes is given for Mixed fleet order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC16    | Custid   | Qty      | Wickes Kitchens    | Awaiting Date        | the product is selected |

  Scenario Outline: 17-Verify whether  notes is reflected in VR file, when notes is given for Mixed DX order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC17    | Custid   | Qty      | DX Freight         | Due Stock Allocation | the product is selected |

  Scenario Outline: 18-Verify whether  notes is reflected in VR file, when notes is given for Mixed PF order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | O_SC18    | Custid   | Qty      | Parcel Force       | Due Stock Allocation | the product is selected |

  Scenario Outline: 19-Verify whether  notes is reflected in VR file, when notes is given for Mixed postal order in HDX

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity with "<notes>"
    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |notes                    |
      | OSC19     | Custid   | Qty      | Postal Delivery    | Due Stock Allocation | the product is selected |

  Scenario Outline: 20-"Verify whether user able to create a mixed  PF  order and suspend  check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation             |
      | O_SC20    | Custid   | Qty      | Parcel Force       | Suspended (Store Amendment Due) |

  Scenario Outline: 21-"verify whether user able to create a mixed DX  order and suspend check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation             |
      | O_SC21    | Custid   | Qty      | DX Freight         | Suspended (Store Amendment Due) |

  Scenario Outline: 22-"verify whether user able to create a mixed Postal  order and suspend check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation             |
      | O_SC22    | Custid   | Qty      | Postal Delivery    | Suspended (Store Amendment Due) |

  Scenario Outline: 23-"verify whether user able to create a mixed  Fleet  order and suspend check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation  |
      | O_SC23    | Custid   | Qty      | Wickes Kitchens    | Due Stock Allocation |

  Scenario Outline: 24-"verify whether user able to create a   PF  order and suspend check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation           |
      | O_SC24    | Custid   | Qty      | Parcel Force       | Suspended (Store Amendment Due)|

  Scenario Outline: 25-"verify whether user able to create a  DX  order and suspend  check the AXS number and VU file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation             |
      | O_SC25    | Custid   | Qty      | DX Freight         | Suspended (Store Amendment Due) |

  Scenario Outline: 26-"verify whether user able to create a   postal  order  and  suspend check the AXS number and VU  file"

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User navigate to Order Manager and click on Add Order
    And User provide Customer details to create an order in HDX
    And User provide Skus and Quantity

    When User Double click the visit line
    Then User able click on suspend button visit date screen
    Then User Select Suspended (Store amendment Due) and click on ok
    Then User is able to verify the suspended in home page

    Then User should validate the order visit <visitforvalidation> and status <statusforvalidation>
    Then user clicks on Summary Tab
    Then User is able to see AXS number of order

    Examples:
      | sheetname | Prodcode | Quantity | visitforvalidation | statusforvalidation             |
      | O_SC26    | Custid   | Qty      | Postal Delivery    | Suspended (Store Amendment Due) |