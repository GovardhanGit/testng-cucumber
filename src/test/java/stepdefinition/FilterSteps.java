package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import pages.FilterPage;
import pages.HomePage;

public class FilterSteps extends CucumberRunner{
	HomePage homePage = new HomePage();
	FilterPage filters = new FilterPage();
	
	@Given("^I am on catalogue page$")
	public void showCatalog() throws Throwable {
		homePage.clickOnLogo();
	}
	@Then("^I select brand \"(.*?)\"$")
	public void selectFilterOnBrand(String brandname) throws Throwable {
		filters.selectBrandByValue("2");
		Thread.sleep(5000);
	}
	@Then("^I click on apply filter$")
	public void applyFilter() throws Throwable {
		filters.applyFilter();
	}
	@Then("^Catalog should get filtered$")
	public void verifyFilterOnBrand() throws Throwable {
		filters.verifyFilter();
		Assert.assertTrue(filters.verifyFilterResultShowsCorrectBrandItems(), "Filter result on brand name shows wrong products");
	}
}
