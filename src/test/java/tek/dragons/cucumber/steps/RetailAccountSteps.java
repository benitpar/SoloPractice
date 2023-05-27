package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");
	 
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput,nameValue);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput,phoneValue);
		slowDown();
		logger.info("user updated the name and the phone value");

	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateButton);
		logger.info("user clicked on update button");
	    
	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().successMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successMessage));
		logger.info("user profile information updated");
	}
	
	@When("User fill Debit or credit card information with {string} and {string} and {string}")
	public void userFillDebitOrCreditCardInformationWithAndAnd(String cardNumber, String nameOnCard, String expMonth) {
		sendText(factory.accountPage().cardNumberBox,cardNumber);
		slowDown();
		sendText(factory.accountPage().nameOnCard,nameOnCard);
		slowDown();
		selectByVisibleText(factory.accountPage().expirationMonth,expMonth);
		slowDown();
		logger.info("User filled in credit card information");
	}
	
	@When("User adds {string} and {string}")
	public void userAddsAnd(String expYear, String securityCode) {
		selectByVisibleText(factory.accountPage().expirationYear,expYear);
		slowDown();
		sendText(factory.accountPage().cvcCode,securityCode);
		slowDown();
		logger.info("User filled in credit card information");
	}
	
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().paymentSubmit);
		logger.info("User clicked on add your card button");
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().successPayMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().successPayMessage));
		logger.info("Pop up message displayed saying payment method added successfully");
	}
	
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    click(factory.accountPage().cardSelection);
	    slowDown();
	    click(factory.accountPage().editBtn);
	    slowDown();
	    logger.info("User click on edit option of card selection");
	}
	
	@When("user edit information with {string} and {string} and {string} and {string} and {string}")
	public void userEditInformationWithAndAndAndAnd(String cardNumber, String name, String expMonth, String expYear, String securityCode) {
		clearTextUsingSendKeys(factory.accountPage().cardNumberBox);
		sendText(factory.accountPage().cardNumberBox,cardNumber);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		sendText(factory.accountPage().nameOnCard,name);
		slowDown();
		selectByVisibleText(factory.accountPage().expirationMonth,expMonth);
		slowDown();
		selectByVisibleText(factory.accountPage().expirationYear,expYear);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().cvcCode);
		sendText(factory.accountPage().cvcCode,securityCode);
		slowDown();
		logger.info("User eneter new card information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCardBtn);
		slowDown();
		logger.info("User click on update your card button");
	
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().paymentUpdatedMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentUpdatedMessage));  
		logger.info("Message displayed saying payment updated");
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
	   click(factory.accountPage().deleteCardSelection);
	   slowDown();
	   click(factory.accountPage().cardRemoveBtn);
	   logger.info("User click on remove option");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
	}
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressBox);
		slowDown();
		logger.info("User clicked on add address option");
	}
	
	@When("User fill new address form with {string} and {string} and {string} and {string}")
	public void userFillNewAddressFormWithAndAndAnd(String country, String fullName, String phoneNumber, String streetAddress){
		selectByVisibleText(factory.accountPage().countryField,country);
		slowDown();
		sendText(factory.accountPage().fullNameField,fullName);
		slowDown();
		sendText(factory.accountPage().phoneNumberField,phoneNumber);
		slowDown();
		sendText(factory.accountPage().streetInputBox,streetAddress);
		slowDown();
		logger.info("User filled in address form");
	}
	
	
	@When("User fills in {string} and {string} and {string} and {string}")
	public void userFillsInAndAndAnd(String apt, String city, String state, String zip) {
		sendText(factory.accountPage().apartmentInputBox,apt);
		slowDown();
		sendText(factory.accountPage().cityInputBox,city);
		slowDown();
		selectByVisibleText(factory.accountPage().stateBox,state);
		slowDown();
		sendText(factory.accountPage().zipCodeInputBox,zip);
		slowDown();
		logger.info("User filled in address form");
		
	}
	
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().submitAddressBtn);
		slowDown();
		logger.info("User clicked on add address button");
	}
	
	@Then("Message should be displayed ‘Address Added Successfully’")
	public void messageShouldBeDisplayedAddressAddedSuccessfully() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressMessage));
		logger.info("Message displayed saying address added");
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	    click(factory.accountPage().editAddressBtn);
	    slowDown();
	    logger.info("User click on edit address option");
	}
	
	@When("User fills updated address form with {string} and {string} and {string} and {string}")
	public void userFillsUpdatedAddressFormWithAndAndAnd(String country, String FullName, String phoneNumber, String streetAddress) {
		selectByVisibleText(factory.accountPage().countryField,country);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().fullNameField);
		slowDown();
		sendText(factory.accountPage().fullNameField,FullName);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().phoneNumberField);
		slowDown();
		sendText(factory.accountPage().phoneNumberField,phoneNumber);
		slowDown();
		clearTextUsingSendKeys(factory.accountPage().streetInputBox);
		slowDown();
		sendText(factory.accountPage().streetInputBox,streetAddress);
		slowDown();
		logger.info("User fills address form with updated info");
	}
	
	@When("User fills in updated {string} and {string} and {string} and {string}")
	public void userFillsInUpdatedAndAndAnd(String apt, String city, String state, String zip) {
	   clearTextUsingSendKeys(factory.accountPage().apartmentInputBox);
	   slowDown();
	   sendText(factory.accountPage().apartmentInputBox,apt);
	   slowDown();
	   clearTextUsingSendKeys(factory.accountPage().cityInputBox);
	   slowDown();
	   sendText(factory.accountPage().cityInputBox,city);
	   slowDown();
	   selectByVisibleText(factory.accountPage().stateBox,state);
	   slowDown();
	   clearTextUsingSendKeys(factory.accountPage().zipCodeInputBox);
	   slowDown();
	   sendText(factory.accountPage().zipCodeInputBox,zip);
	   slowDown();
	   logger.info("User fills address form with updated info");
	}
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	 click(factory.accountPage().submitAddressBtn);
	 logger.info("User clicks on update address button");
	}
	
	@Then("A message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		slowDown();
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedMessage));
		logger.info("Message displayed saying address updated successfully");
	}

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		click(factory.accountPage().deleteAddress);
		logger.info("User click on remove option");
	   
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	}


}
