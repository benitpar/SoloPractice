package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//a[@id='accountLink']")
	public WebElement accountBtn;
	
	@FindBy(xpath="//input[@id='nameInput']")
	public WebElement nameField;
	
	@FindBy(xpath="//input[@id='personalPhoneInput']")
	public WebElement cellPhoneField;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement updatedMessage;
	
	@FindBy(xpath="//button[@id='personalUpdateBtn']")
	public WebElement updateBtn;
	
	
	
	
	
	

}
