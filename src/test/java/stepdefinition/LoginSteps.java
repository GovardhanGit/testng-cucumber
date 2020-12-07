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
		homePage.clickOnLoginLink();
		String title = driver.getTitle();
		System.out.println("Login page title is: "+title);
	}
	
	@Then("^I enter username \"(.*?)\"$")
	public void enterUsername(String username) throws Throwable {
		loginPage.enterUserEmail(username);
	}
	
	@Then("^I enter password \"(.*?)\"$")
	public void enterPassword(String password) throws Throwable {
		loginPage.enterUserPassword(password);
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
	 
}