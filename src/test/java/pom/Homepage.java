package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Homepage extends Baseclass {
	
	private WebDriver driver;
    
	public Homepage(WebDriver driver) {
		this.driver= driver;
	}

	
	
	public ProductDescription_checkout itemSearch() {
	 WebElement category, placeholder, search;

	 category= driver.findElement(By.xpath("//select[@Class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
	 category.sendKeys("Electronics");

	 placeholder= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	 placeholder.sendKeys("Iphone");

	 search = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	 search.click();
	
	return new ProductDescription_checkout(driver);
	
	}




}
