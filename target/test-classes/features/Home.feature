@home
Feature: Retail Home


Scenario: Verify Shop by Department sidebar

Given User is on retail website
When User click on All section
Then Verify drop down options are present in Shop by Department sidebar


Scenario Outline: Verify department sidebar options

Given User is on retail website
When User click on All section
And User on <department>
Then below <optionOne> and <optionTwo> are present in department


Examples:

|department|optionOne|optionTwo|
|Electronics|TV & Video|Video Games|
|Computers|Accessories|Networking |
|Smart Home|Smart Home Lightning|Plugs and Outlets|
|Sports|Athletic Clothing|Exercise & Fitness|
|Automotive|Automative Parts & Accessories|MotorCycle & Powersports|
