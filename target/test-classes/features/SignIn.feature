
Feature: Retail SignIn


@signIn
Scenario: Verify user can sign in into Retail Application

Given User is on retail website
When User click on Sign in option
And User enter email 'louieben300@gmail.com' and password 'Lou@ons123'
And User click on login button
Then User should be logged in into Account

@signIn
Scenario: Verify user can create an account into Retail Website

Given User is on retail website
When User click on Sign in option
And User click on Create New Account button
And User fill the signUp information with '<name>','<email>','<passWord>' & '<confirmPassword>'
And User click on SignUp button
Then User should be logged into account page

Examples: 
|name|email|passWord|confirmPassword|
|Mike|mikey2813@gmail.com|Lou@ons123|Lou@ons123|

