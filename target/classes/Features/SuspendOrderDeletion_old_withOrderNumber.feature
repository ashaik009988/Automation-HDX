Feature: Delete Suspense accountws

Scenario Outline: Delete Suspense accounts

Given User on Login Page of hdx application
When User able to enter userid and password
Then  User  landed on hdx home page
Then click on Tools menu
Then choose Suspense Account option
Then click on Order Code radio button
#Then perform order deletion for <orderNumber>
Then search and delete the order from row <startIndex> to <endIndex>

Examples:
|workbookName					| sheetName|rowNumber|orderNumber|startIndex|endIndex|
|UserDetailsValidation|Sheet1		 |1				 |854793-8804-V|1|5|