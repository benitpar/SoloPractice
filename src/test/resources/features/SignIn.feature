
Feature: Retail SignIn


@signIn
Scenario: Verify user can sign in into Retail Application

Given User is on retail website
When User click on Sign in option
And User enter email 'louieben300@gmail.com' and password 'Lou@ons123'
And User click on login button
Then User should be logged in into Account


