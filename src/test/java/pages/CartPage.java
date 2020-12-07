package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.CucumberRunner;

public class CartPage extends CucumberRunner{
	public By continueShoppingButton = By.xpath("//a[text()='[ Continue Shopping..]']");
	public By checkoutButton = By.xpath("//a[text()='[ Checkout ]']");
	public By buttonPayNow = By.xpath("//input[@value='[ Pay Now ]']");
	public By messageOrderSuccess = By.xpath("//h1[text()='Thanks for your Order!']");
	
	public WebElement getProductRow(String itemName) {
		return driver.findElement(By.xpath("//section[text()='"+itemName
				+"']/ancestor::article"));
	}
	
	public String getPriceForProduct(String itemName) {
		return driver.findElement(By.xpath("//section[text()='"+itemName
				+"']/ancestor::article//section[3]")).getText();
	}
	
	public String getCostTotalCostForProduct(String itemName) {
		return driver.findElement(By.xpath("//section[text()='"+itemName
				+"']/ancestor::article//section[5]")).getText();
	}
	
	public WebElement getTextboxElement(String itemName) {
		//input[@type='number']
		return driver.findElement(By.xpath("//section[text()='"+itemName
				+"']/ancestor::article//input[@type='number']"));
	}
	
	public String getTotalCartCost() {
		return "";
	}
	
	public void changeItemQuantity(String itemName,String newQuantity) {
		WebElement item = getTextboxElement(itemName);
		item.clear();
		item.sendKeys(newQuantity);
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(By.xpath("//a[contains(@class,'esh-basket-checkout') and @href='/']"));
	}
	
	public WebElement getCheckoutButton() {
		return driver.findElement(By.xpath("//a[contains(@class,'esh-basket-checkout') and @href='/Basket/Checkout']"));
	}
	
	public WebElement getUpdateCartButton() {
		return driver.findElement(By.xpath("//button[@name='updatebutton']"));
	}
	
	public void continueShopping() {
		driver.findElement(continueShoppingButton).click();
	}
	public void clickOnCheckout() {
		driver.findElement(checkoutButton).click();
	}
	public void clickOnPayNow() {
		driver.findElement(buttonPayNow).click();
	}
	public void verifyOrderSuccess() {
		driver.findElement(messageOrderSuccess).click();
	}
	
}
