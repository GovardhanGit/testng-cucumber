package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import pages.CartPage;

public class CartSteps extends CucumberRunner{
	
	CartPage cart = new CartPage();
	String itemName;
	@Then("^Item with name \"(.*?)\" is present on cart$")
	public void verifyItemPresent(String name) throws Throwable {
		itemName = name;
		Assert.assertTrue(cart.getProductRow(name).isDisplayed(), "Product is not present in cart");
	}
	
	@Then("^Item \"([^\"]*)\" quantity is updated to \"([^\"]*)\"$")
	public void editQuantity(String item,String newQuantity) {
		cart.changeItemQuantity(item,newQuantity);
		cart.getUpdateCartButton().click();
		
	}
	
	@Then("^Item \"([^\"]*)\" total cost should be \"([^\"]*)\"$")
	public void verifyProductCost(String item,String totalCost) {
		Assert.assertEquals(cart.getCostTotalCostForProduct(item), totalCost,"Total cost for product "+item+" is NOT matching");
	}
	
	@Then("^Total cart cost should be \"(.*?)\"$")
	public void verifyTotalCartCost(String totalCartCost) {
		Assert.assertEquals(cart.getTotalCartCost(), totalCartCost, "Total cart cost is NOT matching");
	}
	
	@Then("^Continue shopping$")
	public void continueShopping() {
		explicitWait(cart.getContinueShoppingButton());
		cart.getContinueShoppingButton().click();
	}
	
}
