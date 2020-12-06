package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import pages.CatalougePage;

public class CatalogueSteps extends CucumberRunner{
	
	CatalougePage catalogue = new CatalougePage();
	String itemName;
	
	@Given("^Item with name \"(.*?)\" is present on page (\\d+)$")
	public void verifyCatakougeItemIsPresent(String name,int pageNumber) throws Throwable {
		System.out.println("Inside Given");
		itemName = name;
		catalogue.goToPage(pageNumber);
		Assert.assertTrue(catalogue.getCatalogueItem(name).isDisplayed(), "Catalogue is not present");
		
	}
	
	@Then("^Verify that items price should be (\\d+)$")
	public void verifyPrice(String price) throws Throwable {
		System.out.println("Inside Then 1");
		Assert.assertEquals(catalogue.getPrice(itemName), price,"Price is not matching");
	}
	
	@Then("^Add item can be added to cart$")
	public void addItemToCart() throws Throwable{
		
		catalogue.getAddtoBasketButton(itemName).click();
	}
	
	

}


