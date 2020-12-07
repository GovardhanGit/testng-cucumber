package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import main.CucumberRunner;
import pages.HomePage;
import pages.LoginPage;
import org.testng.Assert;

public class LoginSteps extends CucumberRunner {
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	
	@Given("^I am on login page$")
	public void clickOnLogin() throws Throwable {
		deleteAllCookies();
		homePage.clickOnLoginLink();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Login page title is: "+title);
		Assert.assertEquals(title, "Log in - Microsoft.eShopOnWeb", "Page title on login page not verified");
		
	}
	
	@Then("^I enter valid username$")
	public void enterUsername() throws Throwable {
		loginPage.enterUserEmail();
	}
	
	@Then("^I enter valid password$")
	public void enterPassword() throws Throwable {
		loginPage.enterUserPassword();
	}
	
	@Then("^I click on login button$")
	public void clickOnLoginButton() throws Throwable {
		loginPage.clickOnLogin();
		Thread.sleep(5000);
	}
	
	@Then("^I am able to login successfully$")
	public void verifyLoggedIn() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Catalog - Microsoft.eShopOnWeb", "Page title after login not verified");
	}
	

	@Then("^I logout$")
	public void logout() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Catalog - Microsoft.eShopOnWeb", "Page title after login not verified");
	}
	
	 
}