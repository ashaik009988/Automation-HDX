Feature: pipeline Scenarios

  Scenario Outline:01-"Verify whether new column is added for outbase in ""Units in Pipeline report"""

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Units in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to check Newly added column is displayed

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:02-Verify whether New column header "Manifest Group / Outbase" in "units in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Units in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see New column header Manifest Group is displayed

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:03-Verify whether New column should be positioned between the current columns A and B in "units in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Units in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the New column positioned between the current columns A and B in "units in Pipeline"report

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:04-Verify whether Add new filter for Outbase for all or individual outbases available in "Units in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Units in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the Newly added filter displayed as all or "<outbase>" for units in Pipeline report

    Examples:
      |outbase|
      |Cardiff|

  Scenario Outline:05-Verify whether user able to filter by selecting All or individual outbase in "units in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Units in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the Newly added filter displayed as all or "<outbase>" for units in Pipeline report

    Examples:
      |outbase|
      |Cardiff|

  Scenario Outline:06-"Verify whether new column is added for outbase in ""orders in Pipeline report"""

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Orders in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to check Newly added column is displayed

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:07-Verify whether New column header "Manifest Group / Outbase" in "orders in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Orders in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see New column header Manifest Group is displayed

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:08-Verify whether New column should be positioned between the current columns A and B in "orders in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Orders in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the New column positioned between the current columns A and B in "units in Pipeline"report

    Examples:
      |outbase|
      |ALL    |

  Scenario Outline:09-Verify whether Add new filter for Outbase for all or individual outbases available in "orders in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Orders in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the Newly added filter displayed as all or "<outbase>" for units in Pipeline report

    Examples:
      |outbase|
      |Cardiff|

  Scenario Outline:10-Verify whether user able to filter by selecting All or outbase in "orders in Pipeline"report

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    When User should able to go to reports wickes
    Then User able Select Orders in pipeline reports
    When user should able to select "<outbase>" value
    Then User should able to see the Newly added filter displayed as all or "<outbase>" for units in Pipeline report

    Examples:
      |outbase|
      |Cardiff|



