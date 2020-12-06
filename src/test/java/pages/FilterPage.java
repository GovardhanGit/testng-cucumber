package pages;

import main.CucumberRunner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterPage extends CucumberRunner{
    public By selectBrand = By.id("CatalogModel_BrandFilterApplied");
    public By applyFilter = By.xpath("//input[@class='esh-catalog-send']");
    public By filterResult = By.xpath("//span[@class='esh-pager-item']");
    public By allProductNames = By.xpath("//div[@class='esh-catalog-name']/span");
  
	public void selectBrandByValue(String value) {
		Select select = new Select(driver.findElement(selectBrand));
		select.selectByValue("2");
	}
	public void applyFilter() throws InterruptedException {
		driver.findElement(applyFilter).click();
	}
	public void verifyFilter() {
		driver.findElements(filterResult).get(0).getText().contains("Showing 10 of 12 products - Page 1 - 2");
	}
	public boolean verifyFilterResultShowsCorrectBrandItems() {
		List<WebElement> allItems = driver.findElements(allProductNames);
		
		for(int i=0;i<allItems.size()-1;i++) {
			System.out.println(allItems.get(i).getText());
			if(!allItems.get(i).getText().contains(".NET")) {
				return false;
			}
		}
		return true;
	}
	

}
