Feature: Routeing order scenarios

Scenario: Verifying the user able to click transport from main menu bar
Given user is on visit breakdown Home page
When user able click on transport from main menu bar
Then user is then able to see the sub drop down of transport

Scenario: Verifying the user able to click on route planning
Given user is on transport tab
When user able to click on the route planning from dropdown of transport tab
Then user is  presented with the route planning page

Scenario: Verifying the user able select the visit date and click on Search
Given user is on route planning page
When user able to select the date from the calendar
And user able to click on search button
Then user should presented with Outbase and the visit count

