@signIn
Feature: Retail SignIn

Background: 
    Given User is on retail website
    When User click on Sign in option
 

Scenario: Verify user can sign in into Retail Application

And User enter email 'louieben300@gmail.com' and password 'Lou@ons123'
And User click on login button
Then User should be logged into Account


Scenario: Verify user can create an account into Retail Website

And User click on Create New Account button
And User fill the signUp information with below data '<name>' and '<email>' and '<password>' and '<confirmPassword>'
And User click on SignUp button
Then User should be logged into account page

Examples:
|name|email|password|confirmPassword|
|student|newStudent72@tekschool.us|Tek@12345|Tek@12345|

