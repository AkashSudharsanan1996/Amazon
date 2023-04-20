package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class ProductDescription_checkout extends Baseclass {
	
private WebDriver driver;
    
	public ProductDescription_checkout(WebDriver driver) {
		this.driver= driver;
	}

	
	 
public CheckoutPage itemList() throws Exception {
		
  WebElement selectIphone12, checkout, checkoutConfirmation;	
			
  selectIphone12= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
  System.out.println("Before clicking the product link the window count is "+driver.getWindowHandles().size());
  selectIphone12.click();

  WebDriverWait owait= new WebDriverWait(driver, Duration.ofSeconds(2));

  driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
  System.out.println("After clicking the product link the window count is "+driver.getWindowHandles().size());

  Thread.sleep(5000);

  checkout= driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));

 Actions oaction = new Actions(driver);
 oaction.moveToElement(checkout).build().perform();
		 checkout.click();

 Thread.sleep(5000);

 checkoutConfirmation= driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"));
 checkoutConfirmation.click();

 return new CheckoutPage(driver);
	
	}




}
