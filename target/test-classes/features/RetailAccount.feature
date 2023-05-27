@retailAccount
Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'louisben1993@gmail.com' and password 'Parlo2813!'
    And User click on login button
    And User should be logged into Account


  Scenario: Verify User can update Profile Information
  
    When User click on Account option
    And User update Name 'Louis' and Phone '703-220-7362'
    And User click on Update button
    Then user profile information should be updated
    

  Scenario: Verify User can add a payment method

When User click on Account option
And User fill Debit or credit card information with '<cardNumber>' and '<nameOnCard>' and '<expirationMonth>'
And User adds '<expirationYear>' and '<securityCode>'
And User click on Add your card button
Then a message should be displayed ‘Payment Method added successfully’

Examples:
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|2468123424681315|Chris Benitez|9|2029|342|


 Scenario: Verify User can edit Debit or Credit card
 
When User click on Account option
And User click on Edit option of card section
And user edit information with '<cardNumber>' and '<nameOnCard>' and '<expirationMonth>' and '<expirationYear>' and '<securityCode>'
And user click on Update Your Card button
Then a message should be displayed ‘Payment Method updated Successfully’

Examples:
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|4889050054872267|Nico H Zelaya|4|2028|044|


Scenario: Verify User can remove Debit or Credit card

When User click on Account option
And User click on remove option of card section
Then payment details should be removed



Scenario: Verify User can add an Address
When User click on Account option
And User click on Add address option
And User fill new address form with '<country>' and '<fullName>' and '<phoneNumber>' and '<streetAddress>'
And User fills in '<apt>' and '<city>' and '<state>' and '<zipCode>'
And User click Add Your Address button
Then Message should be displayed ‘Address Added Successfully’

Examples:
|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
|United States|Joel Benitez|7025045678|2214 Louis Cakell St.|7|Richmond|Florida|23316|


Scenario: Verify User can edit an Address added on account

When User click on Account option
And User click on edit address option
And User fills updated address form with '<country>' and '<fullName>' and '<phoneNumber>' and '<streetAddress>'
And User fills in updated '<apt>' and '<city>' and '<state>' and '<zipCode>'
And User click update Your Address button
Then A message should be displayed ‘Address Updated Successfully’

Examples:
|country|fullName|phoneNumber|streetAddress|apt|city|state|zipCode|
|El Salvador|Jenny Benitez|7035085678|2813 Louie Makell St.|8|Richmond|San Miguel|23314|


Scenario: Verify User can remove Address from Account

When User click on Account option
And User click on remove option of Address section
Then Address details should be removed

