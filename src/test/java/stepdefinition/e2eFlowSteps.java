package stepdefinition;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import pages.CartPage;
import pages.CatalougePage;
import pages.HomePage;
import pages.LoginPage;

public class e2eFlowSteps extends CucumberRunner{
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	CatalougePage catalogue = new CatalougePage();
	CartPage cart = new CartPage();

	@Given("^I am logged in to application$")
	public void loginToApplication() throws Throwable {
		deleteAllCookies();
		homePage.clickOnLoginLink();
		loginPage.enterUserEmail();
		loginPage.enterUserPassword();
		loginPage.clickOnLogin();
		Thread.sleep(5000);
	}
	@Then("^I add product '(.*?)' to basket$")
	public void addToBasket(String product) throws Throwable {
		catalogue.addProductToBasket(product);
	}
	@Then("^I click on continue shopping$")
	public void continueShopping() throws Throwable {
		cart.continueShopping();
	}
	@Then("^I click on checkout$")
	public void clickCheckout() throws Throwable {
		cart.clickOnCheckout();
	}
	@Then("^I click on pay now$")
	public void clickOnPayNow() throws Throwable {
		cart.clickOnPayNow();
	}
	
	@Then("^I verify order is placed successfully$")
	public void verifyOrderSuccessMessage() throws Throwable {
		cart.verifyOrderSuccess();
	}
	
	
}
