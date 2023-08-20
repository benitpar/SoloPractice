
Feature: Retail Account

Background: 

Given User is on retail website
When User click on Sign in option
And User enter email 'louieben300@gmail.com' and password 'Lou@ons123'
And User click on login button
Then User should be logged in into Account

@retailAccount
Scenario: Verify User can update Profile Information
  
When User clicks on Account option
And User update Name to 'Jeff' and Phone to '7035956847'
And User click on Update button
Then user profile information should be updated
 



