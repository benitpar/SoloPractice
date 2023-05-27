package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement nameInput;

	@FindBy(id = "personalPhoneInput")
	public WebElement phoneInput;
	
	@FindBy(id = "personalUpdateBtn")
	public WebElement personalUpdateButton;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement successMessage;
	
	@FindBy(xpath="//input[@id='cardNumberInput']")
	public WebElement cardNumberBox;
	
	@FindBy(xpath="//input[@id='nameOnCardInput']")
	public WebElement nameOnCard;
	
	@FindBy(xpath="//input[@id='securityCodeInput']")
	public WebElement cvcCode;
	
	@FindBy(xpath="//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmit;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement expirationMonth;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement expirationYear;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement successPayMessage;
	
    @FindBy(xpath="//div[@data-id='5972']")
    public WebElement cardSelection;
    
    @FindBy(xpath="//button[text()='Edit']")
    public WebElement editBtn;
    
  @FindBy(xpath="//button[text()='Update Your Card']")
  public WebElement updateCardBtn;
  
  @FindBy(xpath="//div[text()='Payment Method updated Successfully']")
  public WebElement paymentUpdatedMessage;
    
   @FindBy(xpath="//div[@data-id='6353']")
   public WebElement deleteCardSelection;
   
   @FindBy(xpath="//button[text()='remove']")
   public WebElement cardRemoveBtn;
   
   @FindBy(xpath="//div[@class='account__address-new']")
   public WebElement addAddressBox;
   
   @FindBy(xpath="//select[@id='countryDropdown']")
   public WebElement countryField;
   
   @FindBy(xpath="//input[@id='fullNameInput']")
   public WebElement fullNameField;
   
   @FindBy(xpath="//input[@id='phoneNumberInput']")
   public WebElement phoneNumberField;
   
   @FindBy(xpath="//input[@id='streetInput']")
   public WebElement streetInputBox;
   
   @FindBy(xpath="//input[@id='apartmentInput']")
   public WebElement apartmentInputBox;
   
   @FindBy(xpath="//input[@id='cityInput']")
   public WebElement cityInputBox;
   
   @FindBy(xpath="//select[@name='state']")
   public WebElement stateBox;
   
   @FindBy(xpath="//input[@id='zipCodeInput']")
   public WebElement zipCodeInputBox;
   
   @FindBy(xpath="//button[@id='addressBtn']")
   public WebElement submitAddressBtn;
   
   @FindBy(xpath="//div[text()='Address Added Successfully']")
   public WebElement addressMessage;
   
   @FindBy(xpath="//button[text()='Edit']")
   public WebElement editAddressBtn;
   
   @FindBy(xpath="//div[text()='Address Updated Successfully']")
   public WebElement addressUpdatedMessage;
	
	
   @FindBy(xpath="//button[text()='Remove']")
   public WebElement deleteAddress;


}
