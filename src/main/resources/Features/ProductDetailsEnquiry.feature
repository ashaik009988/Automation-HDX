Feature: Product Details Enquiry

#Scenario Outline: 01-Enquiry the Product Details with valid inputs
#
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then User landed on PROD hdx home page
#And User click on the tools tab from main menu and navigate to Product Enquiry
#And User provide the search input <input> and select the <option> option
#Then User validate the results after the Enquiry with valid data
#
#
#Examples:
#|input          |option                 |
#|195750         |SKU Code               |
#|Base Cabinet   |Product Description    |
#|Standard       |Product Group          |

  Scenario Outline: 02-Enquiry the Product Details with invalid inputs

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User click on the tools tab from main menu and navigate to Product Enquiry
    And User provide the search input <input> and select the <option> option
    Then User validate the results after the Enquiry with invalid data


    Examples:
      | input   | option   |
      | 1957500 | SKU Code |
#|Basee Cab         |Product Description    |
#|Standard rock     |Product Group          |

  Scenario Outline: 03-"Verify that  user able to  search  for product by SKU"

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User click on the tools tab from main menu and navigate to Product Enquiry
    And User provide the search input <input> and select the <option> option
    Then User validate the results after the Enquiry with valid data

    Examples:
      | input  | option   |
      | 195750 | SKU Code |

  Scenario Outline: 04-"Verify that  user able to  search  for product by product description"

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User click on the tools tab from main menu and navigate to Product Enquiry
    And User provide the search input <input> and select the <option> option
    Then User validate the results after the Enquiry with valid data

    Examples:
      | input        | option              |
      | Base Cabinet | Product Description |

  Scenario Outline: 05-"Verify that user able to  postcode coverage for a given outbase graphically by entering the geo-code"

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User click on the tools tab from main menu and navigate to geosearch code
    And User provides enters the geo "<location code>" and click on search
    Then User validate the results after the Enquiry with valid data for geo location

    Examples:
      | location code |
      | CF31          |

  Scenario Outline: 06-"Verify that  user able to  search  for product by productgroup"

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then User landed on PROD hdx home page
    And User click on the tools tab from main menu and navigate to Product Enquiry
    And User provide the search input <input> and select the <option> option
    Then User validate the results after the Enquiry with valid data

    Examples:
      | input    | option        |
      | Standard | Product Group |


