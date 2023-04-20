package pom;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.Baseclass;

public class CheckoutPage extends Baseclass{

private WebDriver driver;
    
	public CheckoutPage(WebDriver driver) {
		this.driver= driver;
	}
	
public  CheckoutPage ShippingAddress(String name, String contactno, String pincode, String address, String place, String landmark, String city) {
	
WebElement name1, contactno1, pincode1, address1, place1, landmark1, city1;	

name1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressFullName\"]"));
name1.sendKeys(name);


contactno1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]"));
contactno1.sendKeys(contactno);

pincode1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressPostalCode\"]"));
pincode1.sendKeys(pincode);

address1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine1\"]"));
address1.sendKeys(address);

place1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressLine2\"]"));
place1.sendKeys(place);

landmark1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-landmark\"]"));
landmark1.sendKeys(landmark);

city1= driver.findElement(By.xpath("//*[@id=\"address-ui-widgets-enterAddressCity\"]"));
city1.sendKeys(city);	
	
 return this;
	
	
}










}
