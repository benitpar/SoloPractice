package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	@FindBy(id = "password")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[text()='Login']")
	public WebElement loginButton;
	
	@FindBy(id="newAccountBtn")
	public WebElement createAcctBtn;
	
	@FindBy(id="nameInput")
	public WebElement nameField;
	
	@FindBy(id="emailInput")
	public WebElement emailbox;
	
	@FindBy(id="passwordInput")
	public WebElement passwordBox;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPassword;
	
	@FindBy(id="signupBtn")
	public WebElement signupBtn;
	
	@FindBy(xpath="//h1[text()='Your Profile']")
	public WebElement textVerify;
	
	@FindBy(xpath="//input[contains(@id,'NumberInput')]")
	public WebElement cardNumberverify;

}
