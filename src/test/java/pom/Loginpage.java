package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseclass.Baseclass;

public class Loginpage extends Baseclass{

 private WebDriver driver;
	
public Loginpage(WebDriver driver) {
	this.driver= driver;
}

public Homepage login () {
	
	WebElement hover,signin, phoneNo,continue1, password, submit;
	
	
	
	hover= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	Actions oaction = new Actions(driver); 
	oaction.moveToElement(hover).build().perform();
	
	signin= driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
	signin.click();
	
	phoneNo= driver.findElement(By.xpath("//input[@id='ap_email']"));
	phoneNo.sendKeys("7418960263");
	
	continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
	continue1.click();
	password= driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
	password.sendKeys("Fenoy@2021");
	
	submit= driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
	submit.click();
	
	return new Homepage(driver);

}


	
	
	
	













}
