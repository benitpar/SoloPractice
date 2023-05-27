package tek.dragons.cucumber.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.dragons.cucumber.pages.POMFactory;
import tek.dragons.cucumber.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().logOutBtn));
		slowDown();
		logger.info("User's logged in");

	}
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String string) {
     click(factory.orderPage().departmentDropdown);
     selectByVisibleText(factory.orderPage().departmentDropdown,string);
     slowDown();
     logger.info("User has changed the category");
	}
	@When("User search for an item {string}")
	public void userSearchForAnItem(String string) {
		sendText(factory.orderPage().searchBox,string);
		slowDown();
		logger.info("User searched for item");

	}
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.orderPage().searchBtn);
		slowDown();
		logger.info("User clicked on search button");
	
	}
	
	@When("User Click on item")
	public void userClickOnItem() {
		click(factory.orderPage().productLog);
		slowDown();
		logger.info("User clicked on item in catalog");
	    
	}
	@When("User click on item")
	public void userclickOnItem() {
		click(factory.orderPage().apexProductLog);
		slowDown();
		logger.info("User clicked on item in catalog");

	}
	@When("User select quantity {string}")
	public void userSelectQuantity(String string) {
		selectByVisibleText(factory.orderPage().qtyDropdown,string);
		slowDown();
		logger.info("User selected on quantity from dropdown");
	
	}
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.orderPage().addToCartBtn);
		slowDown();
		logger.info("User added item to cart");
	 
	}
	
	@Then("The cart icon quantity should change to {string}")
	public void TheCartIconQuantityShouldChangeTo(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().qtyConfirmation));
		slowDown();
		click(factory.orderPage().cartBtn);
        click(factory.orderPage().deleteBtn);
        logger.info("Quantity of item selected icon appeared next to cart");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String string) {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().qtyConfirmation5));
		logger.info("Quantity of item selected icon appeared next to cart");
	}
	
	@When("User change the category to {string} and User search for an item {string}")
	public void userChangeTheCategoryToAndUserSearchForAnItem(String string, String string2) {
	  click(factory.orderPage().departmentDropdown);
	  slowDown();
	  selectByVisibleText(factory.orderPage().departmentDropdown,string);
	  slowDown();
	  sendText(factory.orderPage().searchBox,string2);
	  slowDown();
	  logger.info("User changed category of item and searched for item");
	}
	
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
	   click(factory.orderPage().cartBtn);
	   slowDown();
	   logger.info("User clicked on cart option");
	}
	
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	   click(factory.orderPage().proceedToCheck);
	   slowDown();
	   logger.info("User clicks on proceed to checkout button");
	}
	
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	   click(factory.orderPage().placeOrder);
	   slowDown();
	   logger.info("User clicked on place your order");
	}
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedMessage));
	    logger.info("Pop up message will be displayed saying order was placed");
	}
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	   click(factory.orderPage().ordersBtn);
	   slowDown();
	   logger.info("User clicked on orders btn");
	}
	
	@When("User click on first order in List")
	public void userClickOnFirstOrderInList() {
		Assert.assertTrue(isElementDisplayed(factory.orderPage().firstOrder));
		slowDown();
		logger.info("User clicked on first item on order list");
	}
	
	@When("User click on first order in list")
	public void userClickOnFirstOrderInlist() {
		 Assert.assertTrue(isElementDisplayed(factory.orderPage().firstOrder));
		   slowDown();
		   click(factory.orderPage().showDetails);
		   slowDown();
		   scrollPageDownWithJS();
		   slowDown();
		   logger.info("User clicked on first item on order list");
}
	
	
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	   click(factory.orderPage().cancelOrderBtn);
	   slowDown();
	   logger.info("User clicked on cancel the order button");
	}
	
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String string) {
	  click(factory.orderPage().reasonDropDown);
	  slowDown();
	  selectByVisibleText(factory.orderPage().reasonDropDown,string);
	  slowDown();
	  logger.info("User selected on cancelation reason");
	}
	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	 click(factory.orderPage().finalCancelOrder);
	 slowDown();
	 logger.info("User clicked on cancel order button");
	}
	
	@Then("a cancelation message should be displayed ‘Your Order Has Been Cancelled’")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled() {
	   Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelledMessage));
	   logger.info("Pop up message saying order has been cancelled will be displayed");
	}
	
	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
	    click(factory.orderPage().returnButon);
	    slowDown();
	    logger.info("User clicked on return items button");
	}
	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String string) {
		selectByVisibleText(factory.orderPage().reasonDropDown,string);
		slowDown();
		logger.info("User selected on return reason");
	}
	
	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String string) {
		selectByVisibleText(factory.orderPage().providerDropoff,string);
		slowDown();
		logger.info("User selected the drop off service");
	    
	}
	
	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().finalReturnBtn);
		slowDown();
		logger.info("User clicked on return order button");
	   
	}
	
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String string) {
	  Assert.assertTrue(isElementDisplayed(factory.orderPage().returnMessage));
	  logger.info("Cancelation message displayed");
	}
	
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	  click(factory.orderPage().review);
	  slowDown();
	  logger.info("User clicked on review button");
	}
	
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String string, String string2) {
      click(factory.orderPage().headlineInput);
      sendText(factory.orderPage().headlineInput,string);
      slowDown();
      click(factory.orderPage().descriptionBox);
      sendText(factory.orderPage().descriptionBox,string2);
      slowDown();
      logger.info("User writes in review in header and body");
	}
	
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().reviewSubmit);
		slowDown();
		logger.info("User clicks on add your review button");
	}
	
	@Then("a review message should be displayed ‘Your review was added successfully’")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully() {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().reviewMessage));
	logger.info("Review message displayed");
	}
	
}
