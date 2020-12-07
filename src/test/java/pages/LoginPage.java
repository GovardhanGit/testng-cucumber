package pages;

import org.openqa.selenium.By;

import main.CucumberRunner;

public class LoginPage extends CucumberRunner{
	public By inputEmail = By.xpath("//input[@name='Input.Email']");
    public By inputPassword = By.xpath("//input[@id='Input_Password']");
    public By buttonSubmit = By.xpath("//button[@type='submit']");
    public By linkLogout = By.xpath("//a[@href='javascript:document.getElementById('logoutForm').submit()']");
	public void enterUserEmail() {
		String username = config.getProperty("username");
		driver.findElement(inputEmail).sendKeys(username);
	}
	public void enterUserPassword() {
		String password = config.getProperty("password");
		driver.findElement(inputPassword).sendKeys(password);
	}
	public void clickOnLogin() {
		driver.findElement(buttonSubmit).click();
	}
	
	public void logout() {
		driver.findElement(linkLogout).click();
	}
	
}
