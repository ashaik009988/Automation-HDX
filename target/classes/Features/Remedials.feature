Feature: Remedial Scenarios

#  Scenario Outline: 01-Verify whether can we generate Parcel force remedial visits
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #remidial section
#    When  User should able to raise the remedial for Parcel force
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status               |
#      |802902-8804-V  |DX Freight - Remedial|



#  Scenario Outline: 02-Verify whether can we generate DX Freight remedial visits
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #remidial section
#    When  User should able to raise the remedial for Dx Freight
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status               |
#      | 808341-8804-V |DX Freight - Remedial|




#  Scenario Outline: 03-Verify whether user able to cancel the remedial visit in HDX
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #remidial section
#    When  User should able to raise the remedial for fleet delivery
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#    When User is able to cancel remedial for created remidial fleet
#    Then User is able to Verify the Canceled Remedial in visit breakdown Screen
#
#    Examples:
#      | orderid       |Status                          |Status1|
#      | 808371-8804-V |Wickes Kitchens - Remedial|Cancelled by Customer |



#  Scenario Outline: 04-Validate whether user able to create remedial visit manually from the parent visit, If the customer raised "Settlement" related concerns on recevied items
#
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should able to raise the remedial for fleet delivery for settlement
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status   |
#      | 808371-8804-V| Remedial|
#





#  Scenario Outline: 05-Validate if the user is able to re-deliver the order by raising remidial for the 'Faulty' reason of the products with collection required -N
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should able to raise the remedial for fleet delivery for faulty
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status    |
#      | 808371-8804-V | Remedial|




#  Scenario Outline: 06-Validate if the user is able to re-deliver the order by raising remidial for the 'Faulty' reason of the products with collection required - Y
#    #login to hdx application
#    Given User on Login Page of hdx application
#    When User able to enter userid and password
#    Then User landed on PROD hdx home page
#    And  User passes the orderid "<orderid>" in searchbox for reporting
#
#    #reporting section
#    When User should able to raise the remedial for fleet delivery for faulty
#    Then User is able to see the remidial visit "<Status>" in visit break down screen
#
#    Examples:
#      | orderid       |Status   |
#      | 808371-8804-V | Remedial|



  Scenario Outline: 07-Validate whether user able create remedial by adding new sku using Primary reason code as "New settlement"
    #login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And  User passes the orderid "<orderid>" in searchbox for reporting

    #reporting section
    When User should able to raise the remedial for fleet delivery for settlement
    Then User is able to see the remidial visit "<Status>" in visit break down screen

    Examples:
      | orderid       |Status   |
      | 809416-8804-V | Remedial|


