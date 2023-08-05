package tek.dragons.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.dragons.cucumber.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	

}
