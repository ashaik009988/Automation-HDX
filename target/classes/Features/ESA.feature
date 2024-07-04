Feature: ESA Scenarios

#  Scenario Outline:01-Validate whether EarliestStockAvailability_0701_20231020040213.csv file is consumed by HDX successfully
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When  User go to Maintenance tab and click on Upload
#    Then  User Select Client as Wickes File type as stock availablity upload
#    Then  User click on Search
#    Then  User Check the file "<file>" is consumed by HDX and check the status "<Status>"
#    Examples:
#      | file                                              | Status    |
#      | EarliestStockAvailability_0701_20240408040236.csv | Completed |

#  Scenario Outline:02-Validate the changes in the number of stock items as per ESA file
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    When User go to Maintenance tab and click on product maintence
#    Then User Enters the "<sku number>"(active sku) in find box
#    Then User Select sku code from the droplist of in
#    When User Click search and press view
#    Then User click stock detailsm
#    Then Check the changes in the stock figure "<Stock Quantity>" as per the ESA file uploaded
#    Examples:
#      |sku number|Stock Quantity|
#      | 105626   | 15           |

#  Scenario Outline:04-Validate that the when user places order for a SKU having quantity greater than the stock availability in calidus.
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#    When User Go to visit breakdown tab
#    When User Double click the product
#    Then User Check the stock level in stock details tab.
#    When User Go to visit detail screen
#    Then User is able to Click TBA in the top right side
#    Then User is able to Check whether the date is shown within replenishment lead time.
#    #-----------------Calidus Involvement for remaining steps--------------------
#  # 9.Pick and despatch the SKU in calidus and validate if short on allocation occurs in HDX.
#  #10. Click on TBA link of new visit and check the dates displayed are after replenishment lead time."
#    Examples:
#      | orderid       |
#      | 804208-8804-V |


  Scenario Outline:05-Validate that the when user places order for a SKU having quantity greater than the stock availability in calidus.
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And  User passes the orderid "<orderid>" in searchbox for reporting
    When User Go to visit breakdown tab
    Then User Double click the picking "<skucode>" having no stock
    Then Check the replenishment lead time in summary screen
    When User Go to visit detail screen
    Then User is able to Click TBA in the top right side
    Then Check whether the date is shown after lead time of SKU having no stock."
    Examples:
      | orderid       |skucode|
      | 804208-8804-V | 144362|

