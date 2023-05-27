package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//a[text()='TEKSCHOOL']")
	public WebElement retailLogo;
	
	@FindBy(id = "signinLink")
	public WebElement signInOption;
	
	@FindBy(linkText = "Account")
	public WebElement accountOption;
	
	@FindBy(linkText = "Orders")
	public WebElement ordersOption;
	
	@FindBy(id = "logoutBtn")
	public WebElement logOutOption;
	
	@FindBy(xpath="//button[@id='hamburgerBtn']")
	public WebElement allBtn;
	
	@FindBy(xpath="//span[text()='Electronics']")
	public WebElement electronics;
	
	@FindBy(xpath="//span[text()='Computers']")
	public WebElement computers;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHome;
	
	@FindBy(xpath="//span[text()='Sports']")
	public WebElement sports;
	
	@FindBy(xpath="//span[text()='Automative']")
	public WebElement automative;
	
    @FindBy(xpath="//span[text()='TV & Video']")
    public WebElement tvVideo;
    
    @FindBy(xpath="//span[text()='Video Games']")
    public WebElement videoGames;
    
    @FindBy(xpath="//span[text()='Accessories']")
    public WebElement accessories;
    
    @FindBy(xpath="//span[text()='Networking']")
    public WebElement networking;
    
    @FindBy(xpath="//span[text()='Smart Home Lightning']")
    public WebElement smartHomeLightning;
    
    @FindBy(xpath="//span[text()='Plugs and Outlets']")
    public WebElement plugsAndOutlets;
    
    @FindBy(xpath="//span[text()='Athletic Clothing']")
    public WebElement athleticClothing;
    
    @FindBy(xpath="//span[text()='Exercise & Fitness']")
    public WebElement exerciseFitness;
    
    @FindBy(xpath="//span[text()='Automative Parts & Accessories']")
    public WebElement automativeAccessories;
    
    @FindBy(xpath="//span[text()='MotorCycle & Powersports']")
    public WebElement motorcycleAndPower;
    
    @FindBy(xpath="//h1[text()='Shop By department']")
    public WebElement shopByDepartment;

}
