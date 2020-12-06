package pages;

import org.openqa.selenium.By;

import main.CucumberRunner;

public class HomePage extends CucumberRunner{
    public By loginLink = By.xpath("//a[@href='/Identity/Account/Login']");
    public By imageLogo = By.xpath("//a/img[@src='/images/brand.png']");
	public void clickOnLoginLink() {
		driver.findElement(loginLink).click();
	}
	public void clickOnLogo() {
		driver.findElement(imageLogo).click();
	}
    
}
