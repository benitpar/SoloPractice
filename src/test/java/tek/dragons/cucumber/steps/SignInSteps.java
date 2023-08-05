package tek.dragons.cucumber.steps;

import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
	
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().retailLogo));
		logger.info("user is on retail website");
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.signInPage().signInOption);
		logger.info("user cliked on Sign In option");

	}
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String emailValue, String passWordValue) {
		sendText(factory.signInPage().emailField, emailValue);
		slowDown();
		sendText(factory.signInPage().passwordField,passWordValue);
		slowDown();
		logger.info("user entered email and password");
	}
	@When("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signInPage().loginButton);
		slowDown();
		logger.info("user clicked on login button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		waitTillPresence(factory.signInPage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.signInPage().accountOption));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().ordersOption));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().logOutOption));
		logger.info("user logged in into account");
	}
	
	

	
	
	
	
}
