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
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;
	
	@FindBy(xpath="//a[@id='signinLink']")
	public WebElement signInOption;
	
	@FindBy(xpath="//a[@id='accountLink']")
	public WebElement accountOption;
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement ordersOption;
	
	@FindBy(xpath="//button[@id='logoutBtn']")
	public WebElement logOutOption;
	
	
	
	
	
	

}
