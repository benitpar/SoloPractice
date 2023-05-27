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
		Assert.assertTrue(isElementDisplayed(factory.homePage().retailLogo));
		logger.info("user is on retail website");
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signInOption);
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
	@Then("User should be logged into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.homePage().accountOption);
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().ordersOption));
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutOption));
		logger.info("user logged in into account");
	}
	
	@When("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createAcctBtn);
		slowDown();
		logger.info("User clicked on Create New Account Button");
	}
	@When("User fill the signUp information with below data {string} and {string} and {string} and {string}")
	public void userFillTheSignUpInformationWithBelowDataAndAndAnd(String name, String email, String password, String confirmPass) {
	   sendText(factory.signInPage().nameField,name);
	   slowDown();
	   sendText(factory.signInPage().emailbox,email);
	   slowDown();
	   sendText(factory.signInPage().passwordBox,password);
	   slowDown();
	   sendText(factory.signInPage().confirmPassword,confirmPass);
	   slowDown();
	   logger.info("User filled in sign up information");
	}
	@When("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signupBtn);
		slowDown();
		logger.info("Sign up button clicked");
	  
	}
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(isElementDisplayed(factory.signInPage().textVerify));
		Assert.assertTrue(isElementDisplayed(factory.signInPage().cardNumberverify));
		logger.info("User's logged in");
	}

	
	
	
	
}
