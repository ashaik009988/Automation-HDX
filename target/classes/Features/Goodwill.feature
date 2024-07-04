Feature: Goodwill


Scenario Outline: 01- Verify whether user able to add customers that are not wickes customer and authorize the goodwill payment


    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User create a customer in HDX
#    -------Goodwill using customer
    And User click on contact management tab
    And User click on new thread button
    And User create a new thread customer
    And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    And User double click goodwill after thread
    And User click on payment authorization
    And User accept payment intilized
    And User navigate to workflow through order manager
    And User double click on goodwill to sent for verification
    Then User validate the goodwill details for created customer


    Examples:

      | sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment |storeresponsible  |
      | SC1       | Custid   | Qty      |Store Incident     |Incident - Customer Property |Installation Service  |Bank Transfer  |Chennai           |
     
 
 






 #Scenario Outline: 02- Verify whether user able to raise the goodwill thread for all primary reasons other than K&B SO or Installation
#
    #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    #When User send request to create a new order
    #Then orders should be successfully created in API
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid in searchbox
    #And User navigate to summary tab to get the required data
    #-------Goodwill
    #And User click on contact management tab
    #And User click on new thread button
    #And User create a new thread
    #And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    #And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for authorization
    #Then User validate the goodwill details for authentication
    #And User back to visit breakdown screen
    #And User click on contact management tab
    #And User double click goodwill after thread
    #And User click on payment authorization
    #And User accept payment intilized
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for verification
    #Then User validate the goodwill details for authentication
  #
#
    #Examples:
#
      #| sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment      |storeresponsible  |
      #| SC2       | Custid   | Qty      |Store Incident     |Incident - Customer Property |Direct Channels       |a Head Office Cheque|Chennai|
      #| SC1       | Custid   | Qty      |Core Product       |Kitchens                     |Store                 |Bank Transfer       |Bracknell|
 #
 
 
 
  #Scenario Outline: 03- Verify whether user able to authorize goodwill payment for these stores Barking extra 
#
    #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    #When User send request to create a new order
    #Then orders should be successfully created in API
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid in searchbox
    #And User navigate to summary tab to get the required data
    #-------Goodwill
    #And User click on contact management tab
    #And User click on new thread button
    #And User create a new thread
    #And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    #And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for authorization
    #Then User validate the goodwill details for authentication
    #And User back to visit breakdown screen
    #And User click on contact management tab
    #And User double click goodwill after thread
    #And User click on payment authorization
    #And User accept payment intilized
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for verification
    #Then User validate the goodwill details for authentication
  #
#
    #Examples:
#
      #| sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment      |storeresponsible  |
      #| SC3       | Custid   | Qty      |Store Incident     |Incident - Customer Property |K&B Supply Only GWG   |Gift Tokens         |Barking Extra |
 
 
 
 
 
 #Scenario Outline: 04- Verify that whether user able to reject a goodwill payment 
#
    #
    #
    #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    #When User send request to create a new order
    #Then orders should be successfully created in API
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid in searchbox
    #And User navigate to summary tab to get the required data
    #-------Goodwill
    #And User click on contact management tab
    #And User click on new thread button
    #And User create a new thread
    #And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    #And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for authorization
    #Then User validate the goodwill details for authentication
    #And User back to visit breakdown screen
    #And User click on contact management tab
    #And User double click goodwill after thread
    #And User click on payment authorization
    #And User rejects payment intilized
    #And User click on resolve the contact
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for verification
    #Then User validate the goodwill details for authentication for rejected
    #
    #
    #
      #Examples:
#
      #| sheetname | Prodcode | Quantity |primaryreason      |secondaryreason    |primaryresponsibility |primarypayment      |storeresponsible  |
      #| SC4       | Custid   | Qty      |Core Product       |Kitchens           |K&B Commercial        |Gift Tokens         |Bracknell|
      
      
      
   
   
   
     #Scenario Outline: 05- Verify that order should be moved from "Goodwill -to be authorised" to "Goodwill- to be sent" 
#
    #Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    #When User send request to create a new order
    #Then orders should be successfully created in API
    #Given User on Login Page of hdx application
    #When User able to enter userid and password
    #Then User landed on PROD hdx home page
    #And User passes the orderid in searchbox
    #And User navigate to summary tab to get the required data
    #-------Goodwill
    #And User click on contact management tab
    #And User click on new thread button
    #And User create a new thread
    #And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    #And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for authorization
    #Then User validate the goodwill details for authentication
    #And User back to visit breakdown screen
    #And User click on contact management tab
    #And User double click goodwill after thread
    #And User click on payment authorization
    #And User accept payment intilized
    #And User navigate to workflow through order manager
    #And User double click on goodwill to sent for verification
    #Then User validate the goodwill details for authentication
  #
#
    #Examples:
#
      #| sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment      |storeresponsible  |
      #| SC5       | Custid   | Qty      |Store Incident     |Incident - Customer Property |Direct Channels       |Bank Transfer       |Basingstoke|
  #
  
  
      Scenario Outline: 06- Verify whether the Goodwill order will fall in all three workflows Goodwill - To be authorised---->Goodwill - To be sent----->Record  

    Given User have Excel file containing order datas in sheet <sheetname> , with columnnames <Prodcode> and <Quantity>
    When User send request to create a new order
    Then orders should be successfully created in API
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User passes the orderid in searchbox
    And User navigate to summary tab to get the required data
    #-------Goodwill
    And User click on contact management tab
    And User click on new thread button
    And User create a new thread
    And User input the primary reason <primaryreason> and secondary reason <secondaryreason>
    And User input fields primary responsibility <primaryresponsibility> ,store <storeresponsible> and payment <primarypayment> in thread
    And User navigate to workflow through order manager
    And User double click on goodwill to sent for authorization
    Then User validate the goodwill details for authentication
    And User back to visit breakdown screen
    And User click on contact management tab
    And User double click goodwill after thread
    And User click on payment authorization
    And User accept payment intilized
    And User navigate to workflow through order manager
    And User double click on goodwill to sent for verification
    Then User validate the goodwill details for authentication
  

    Examples:

      | sheetname | Prodcode | Quantity |primaryreason      |secondaryreason              |primaryresponsibility |primarypayment      |storeresponsible  |
      | SC6       | Custid   | Qty      |Store Incident     |Incident - Customer Property |Installation Service  |Bank Transfer       |Banbury|
    