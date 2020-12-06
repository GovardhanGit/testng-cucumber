package pages;

import org.openqa.selenium.By;

import main.CucumberRunner;

public class LoginPage extends CucumberRunner{
	public By inputEmail = By.xpath("//input[@name='Input.Email']");
    public By inputPassword = By.xpath("//input[@id='Input_Password']");
    public By buttonSubmit = By.xpath("//button[@type='submit']");
	public void enterUserEmail(String username) {
		driver.findElement(inputEmail).sendKeys(username);
	}
	public void enterUserPassword(String password) {
		driver.findElement(inputPassword).sendKeys(password);
	}
	public void clickOnLogin() {
		driver.findElement(buttonSubmit).click();
	}
}
