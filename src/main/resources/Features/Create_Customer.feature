Feature: Create Customer


#Scenario Outline: 01- Verify whether user able to add customers that are not wickes customer and authorize the goodwill payment
 #
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User create a customer in HDX
    #-------Goodwill using customer
    #And User click on contact management tab
    #And User click on new thread button
    #And User create a new thread customer
    #And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    #And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    #And User double click goodwill after thread
    #And User click on payment authorization
    #And User accept payment intilized
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for verification
    #Then User validate the goodwill details for created customer
  #
#
    #Examples:
#
      #| sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment |storeresponsible  |
      #| SC1       | Custid   | Qty      |Store Incident     |Incident - Customer Property |Installation Service  |Bank Transfer  |Chennai           |
 #
 
 
 
 Scenario Outline: 02-Verify whether user able to add customers that are not wickes customer and reject the goodwill payment
 
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User create a customer in HDX
    #-------Goodwill using customer
    And User click on contact management tab
    And User click on new thread button
    And User create a new thread customer
    And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    And User double click goodwill after thread
    And User click on payment authorization
    And User rejects payment intilized
    And User click on resolve the contact
    And User navigate to workflow through order manager
    And User double click on goodwill to sent for authorization
    Then User validate the goodwill details for created customer
    
    
    
      Examples:

      | sheetname | Prodcode | Quantity |primaryreason      |secondaryreason    |primaryresponsibility |primarypayment      |storeresponsible  |
      | SC2       | Custid   | Qty      |Core Product       |Kitchens           |K&B Commercial        |Gift Tokens         |Bracknell|
      
      