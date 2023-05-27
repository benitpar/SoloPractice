package tek.dragons.cucumber.steps;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import com.google.gson.Gson;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import tek.dragons.cucumber.base.BaseUITest;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{
	
	POMFactory factory = new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allBtn);
		slowDown(); 
		logger.info("User click on all section");
	}
	
	@Then("Verify drop down options are present in Shop by Department sidebar")
	public void verifyDropDownOptionsArePresentInShopByDepartmentSidebar() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		logger.info("User verified drop options are present");
	   
	}
	
	
	@When("User on Electronics")
	public void userOnElectronics() {
	  Assert.assertTrue(isElementDisplayed(factory.homePage().electronics));
	  click(factory.homePage().electronics);
	  logger.info("User is on Electronics");
	}
	
	@Then("below TV & Video and Video Games are present in department")
	public void belowTVVideoAndVideoGamesArePresentInDepartment() {
	  Assert.assertTrue(isElementDisplayed(factory.homePage().tvVideo));
	  Assert.assertTrue(isElementDisplayed(factory.homePage().videoGames));
	  logger.info("Tv & Video and Video games are present");
	}
	
	@When("User on Computers")
	public void userOnComputers() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().computers));
		  click(factory.homePage().computers);
		  logger.info("User on Computers");
	    
	}
	@Then("below Accessories and Networking are present in department")
	public void belowAccessoriesAndNetworkingArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().accessories));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().networking));
		 logger.info("Accessories and Networking present");
	}

	@When("User on Smart Home")
	public void userOnSmartHome() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().smartHome));
		  click(factory.homePage().smartHome);
		  logger.info("User on Smart Home");
	 
	}
	@Then("below Smart Home Lightning and Plugs and Outlets are present in department")
	public void belowSmartHomeLightningAndPlugsAndOutletsArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().smartHomeLightning));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().plugsAndOutlets));
		 logger.info("Smart Home Lightning and plus and outlets are present");
	}
	
	@When("User on Sports")
	public void userOnSports() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().sports));
		  click(factory.homePage().sports);
		  logger.info("User on sports");
	}
	
	@Then("below Athletic Clothing and Exercise & Fitness are present in department")
	public void belowAthleticClothingAndExerciseFitnessArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().athleticClothing));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().exerciseFitness));
		 logger.info("Athletic Clothing and Exercise & Fitness present");
	}
	
	@When("User on Automotive")
	public void userOnAutomotive() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().automative));
		  click(factory.homePage().automative);
		  logger.info("User on Automotive");
	}
	
	@Then("below Automative Parts & Accessories and MotorCycle & Powersports are present in department")
	public void belowAutomativePartsAccessoriesAndMotorCyclePowersportsArePresentInDepartment() {
		 Assert.assertTrue(isElementDisplayed(factory.homePage().automativeAccessories));
		 Assert.assertTrue(isElementDisplayed(factory.homePage().motorcycleAndPower));
		 logger.info("Automative parts & Accessories and MotorCycle & Powersports present");
	}

	
	
	
}
