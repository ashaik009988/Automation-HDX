Feature: Dating the given order with "TBA" status scenarios

Background: Dating order reusing functionality
Given User is on the Visit break down page
When User Double click the visit line 
Then User is on  Schedule a visit date screen 
And click on change visit date

Scenario: User able to date the undated fleet order in HDX 
Given User is on visit date screen
When  User should able to set the delivery date for the visit
Then  User should be able to see the selected delivery date on visit break down page


Scenario: User able to check EAD for all the stock required for visit
Given User is on visit date screen
And User should able to see the available and not available dates 


Scenario: User able to select the delivery date is available Shows in green
Given User is on visit date screen
When User should able to set the delivery date for the visit which are in green status
Then User should be able to see the selected delivery date on the visit break down page


Scenario: User not able to select unavailable date which Shows in red
Given User is on visit date screen
And User should not be able to select the date which shows in red

Scenario: User able to select the delivery date is available Shows in amber
Given User is on visit date screen
When User should able to set the delivery date for the visit which are in amber status
Then User should be able to see the selected delivery date on visit break down page

Scenario: User should not able to date the order beyond 9 months
Given User is on visit date screen
Then User should not able to set the delivery date for the visit beyond 9 months

Scenario: User able to change the delivery date for already dated visit
Given User is on visit date screen
When User should able to set the delivery date for the visit for already dated
Then Check whether the user able to see selected date new visit line on visit breakdown

Scenario: User able to change dated visit as undated
Given User is on visit date screen
When User should be able to click TBA button 
Then Check whether the user able to see the dated line back to TBA status in visit line