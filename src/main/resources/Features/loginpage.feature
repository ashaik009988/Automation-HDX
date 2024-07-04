Feature: Login to hdx application and searching order

#Background: Login or hdx application
#
#Given User on Login Page of hdx application
#When User able to enter userid and password
#Then  User  landed on hdx home page
#
#Scenario Outline: Searching the order in homepage
#When read details from workbook <workbookName>, sheetName <sheetName>, rownumber <rowNumber>
#When User enters the order number with store number on order code field
#And  Click on Search
#Then User is landed on Visit break down page
#Then user clicks on Summary Tab
#Then verify user details Name,Home,Mobile and Email
#
#Examples:
#|workbookName					| sheetName|rowNumber|
#|UserDetailsValidation|Sheet1		 |1|

Background: Login or hdx application

Given User on Login Page of hdx application
When User able to enter userid and password
Then  User  landed on hdx home page

Scenario Outline: Searching the order in homepage
When read details from workbook <workbookName>, sheetName <sheetName>, rownumber <rowNumber>
When User enters the order number with store number on order code field
And  Click on Search
#Then User is landed on Visit break down page
Then user clicks on Summary Tab
Then verify user details Name,Home,Mobile and Email

Examples:
|workbookName					| sheetName|rowNumber|
|UserDetailsValidation|Sheet1		 |1|