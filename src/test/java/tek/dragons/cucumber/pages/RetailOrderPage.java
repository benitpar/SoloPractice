package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath="//button[@id='logoutBtn']")
	public WebElement logOutBtn;
	
	@FindBy(xpath="//select[contains(@id,'ch')]")
	public WebElement departmentDropdown;
	
	@FindBy(xpath="//input[@id='searchInput']")
	public WebElement searchBox;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement productLog;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement qtyDropdown;
	
	@FindBy(xpath="//button[@id='addToCartBtn']")
	public WebElement addToCartBtn;
	
	@FindBy(xpath="//span[text()='2']")
	public WebElement qtyConfirmation;
	
	@FindBy(xpath="//span[text()='5']")
	public WebElement qtyConfirmation5;
	
	@FindBy(xpath="//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement apexProductLog;
	
	@FindBy(xpath="//div[@id='cartBtn']")
	public WebElement cartBtn;
	
	@FindBy(xpath="//button[contains(@id,'proceedBtn')]")
	public WebElement proceedToCheck;
	
	@FindBy(xpath="//button[starts-with(@id,'placeOrderBtn')]")
	public WebElement placeOrder;
	
	@FindBy(xpath="//p[text()='Order Placed, Thanks']")
	public WebElement orderPlacedMessage;
	
	@FindBy(xpath="//a[@id='orderLink']")
	public WebElement ordersBtn;
	
	@FindBy(xpath="//p[text()='Apex Legends - 1,000 Apex Coins - PC Origin [Online Game Code]']")
	public WebElement firstOrder;
	
	@FindBy(xpath="//button[contains(@id,'cancelBtn')]")
	public WebElement cancelOrderBtn;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement reasonDropDown;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement finalCancelOrder;
	
	@FindBy(xpath="//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelledMessage;
	
	@FindBy(xpath="//button[@id='returnBtn']")
	public WebElement returnButon;
	
	@FindBy(xpath="//select[@id='reasonInput']")
	public WebElement returnDropdown;
	
	@FindBy(xpath="//select[@id='dropOffInput']")
	public WebElement providerDropoff;
	
	@FindBy(xpath="//button[@id='orderSubmitBtn']")
	public WebElement finalReturnBtn;
	
	@FindBy(xpath="//p[text()='Return was successfull']")
	public WebElement returnMessage;
	
	@FindBy(xpath="//button[@id='reviewBtn']")
	public WebElement review;
	
	@FindBy(xpath="//input[@id='headlineInput']")
	public WebElement headlineInput;
	
	@FindBy(xpath="//textarea[@id='descriptionInput']")
	public WebElement descriptionBox;
	
	@FindBy(xpath="//button[@id='reviewSubmitBtn']")
	public WebElement reviewSubmit;
	
	@FindBy(xpath="//div[text()='Your review was added successfully']")
	public WebElement reviewMessage;
	
	@FindBy(xpath="//span[text()='Delete']")
	public WebElement deleteBtn;
	
	@FindBy(xpath ="//div[@class='order']//descendant::p[7]")
	public WebElement listOfOrder;
	
	@FindBy(xpath="//p[text()='Show Details']")
	public WebElement showDetails;

}
