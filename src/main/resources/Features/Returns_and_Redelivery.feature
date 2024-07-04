Feature: returns and redelivery scenarios

  Scenario Outline: 01-"Validate whether the user is able to perform redelivery without returns.(Stock on hold redelivery)"

    #login to hdx application
    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And  User passes the orderid "<orderid>" in searchbox for reporting

     #returns and redelivery section
    When User should able navigate to the visit details tab.
    When User should able to click on more visit action dropdown
    Then User able to select 'Return All items to warehouse' option.
    Then User should able Enter comments and click on proceed button in returns popup.
    Then User should able to Validate in more visit action dropdown, 'Return All items to warehouse' option remains enabled.
    Then User should able to Validate the visit date displayed changes to link again.
    When User should able to Select 'Return All items to warehouse' option again.
    Then User should able to Validate that return supply chain leg is not displayed under 1st deliver to customer supply chain leg and 'load to vehicle' supply chain leg, 'Deliver to customer' supply chain leg are displayed instead.
    Then User should able to  Validate visit status of the order changes to 'Awaiting date'.
    When User should able to Click on the visit date link and date the order.
    Then User should able to Navigate to visit breakdown tab and double click on the new visit with 'Awaiting route finalisation' status.
    Then User should able to  Validate the WMS Order code displayed in visit details tab of the popup.

    Examples:
      | orderid       | Status                |
      | 804713-8804-V | DX Freight - Remedial |

#