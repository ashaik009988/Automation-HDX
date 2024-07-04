Feature: Delete Suspense accounts

  Scenario Outline: Delete Suspense accounts in UAT environment

    Given User on Login Page of hdx application
    When User able to enter userid and password
    Then  User  landed on hdx home page
    Then click on Tools menu
    Then choose Suspense Account option
    Then click on Order Code radio button
    Then search and delete the order from row <startIndex> to <endIndex>

    Examples:
      | startIndex | endIndex |
      | 1          | 6        |

