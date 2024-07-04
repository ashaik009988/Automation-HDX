Feature: JDA to HDX







Scenario Outline: 01-Validate whether PMD delta changes are consumed by HDX successfully 

Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User click on the maintenance tab from main menu and navigate to Upload
And User provide the search client <client> and select the <filetype> filetype
Then User should see the status as expected for the above filetype


Examples:
|client            |filetype                                |
|Wickes            |Product Master Data Upload V4           |



Scenario Outline: 03-Validate whether Store delta changes are consumed by HDX successfully

Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User click on the maintenance tab from main menu and navigate to Upload
And User provide the search client <client> and select the <filetype> filetype
Then User should see the status as expected for the above filetype


Examples:
|client            |filetype                                |
|Wickes            |Stores Upload                           |



Scenario Outline: 04-Validate whether BOM delta changes are consumed by HDX successfully

Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User click on the maintenance tab from main menu and navigate to Upload
And User provide the search client <client> and select the <filetype> filetype
Then User should see the status as expected for the above filetype


Examples:
|client            |filetype                                |
|Wickes            |Bill of Materials                       |





Scenario Outline: 05-Validate whether Supplier delta changes are consumed by HDX successfully

Given User on Login Page of hdx application
When User able to enter userid and password
Then User landed on PROD hdx home page
And User click on the maintenance tab from main menu and navigate to Upload
And User provide the search client <client> and select the <filetype> filetype
Then User should see the status as expected for the above filetype


Examples:
|client            |filetype                                |
|Wickes            |Suppliers Upload                        |

