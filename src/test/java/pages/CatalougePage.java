package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import main.CucumberRunner;

public class CatalougePage extends CucumberRunner{

	
	public List<WebElement> previousButtons = driver.findElements(By.cssSelector("a#Previous"));
	public List<WebElement> pageDetails = driver.findElements(By.cssSelector("div.col-md-8 span.esh-pager-item"));
	
	public Select getBrandDropdown() {
		return new Select(driver.findElement(By.cssSelector("select#CatalogModel_BrandFilterApplied")));
	}
	
	public Select getTypeDropdown() {
		return new Select(driver.findElement(By.cssSelector("select#CatalogModel_TypesFilterApplied")));
	}
	
	public WebElement getSearchFilterButton() {
		return driver.findElement(By.cssSelector("input.esh-catalog-send"));
	}
	
	public WebElement getNextButton() {
		return driver.findElement(By.xpath("(//a[@id='Next'])[1]"));
	}
	
	public WebElement getCatalogueItem(String name) {
		return driver.findElement(By.xpath("//div[@class='esh-catalog-name']//span[text()='"+name
				+"']/ancestor::div[contains(@class,'esh-catalog-item')]"));
	}
	
	public WebElement getAddtoBasketButton(String name) {
		return driver.findElement(By.xpath("//div[@class='esh-catalog-name']//span[text()='"
				+name+"']/ancestor::div[contains(@class,'esh-catalog-item')]//input[@class='esh-catalog-button']"));
	}
	
	public String getPrice(String name) {
		return driver.findElement(By.xpath("//div[@class='esh-catalog-name']//span[text()='"
				+name+"']/ancestor::div[contains(@class,'esh-catalog-item')]//div[@class='esh-catalog-price']//span")).getText();
	}
	
	public void goToPage(int pageNumber) {
		for(int i=0;i<pageNumber-1;i++) {
			WebElement next = getNextButton();
			next.click();
		}
	}
	
	
}
