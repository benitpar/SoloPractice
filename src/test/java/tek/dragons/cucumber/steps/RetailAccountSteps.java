package tek.dragons.cucumber.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User clicks on Account option")
	public void userClicksOnAccountOption() {
		click(factory.accountPage().accountBtn);
		slowDown();
	    
	}
	
	@When("User update Name to {string} and Phone to {string}")
	public void userUpdateNameToAndPhoneTo(String name, String password) {
		clearTextUsingSendKeys(factory.accountPage().nameField);
		slowDown();
	sendText(factory.accountPage().nameField,name);
	 slowDown();
	 clearTextUsingSendKeys(factory.accountPage().cellPhoneField);
	 sendText(factory.accountPage().cellPhoneField,password);
	 slowDown();
		
	}
	
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().updateBtn);
		slowDown();
	   
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		isElementDisplayed(factory.accountPage().updatedMessage);
	   
	}
	
	


}
