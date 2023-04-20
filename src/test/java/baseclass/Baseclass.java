package baseclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pom.Loginpage;

public class Baseclass {
	public  WebDriver driver;
	public  String AmazonUrl="https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn";
	
   @BeforeClass
	public  Loginpage browser() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	     driver.get(AmazonUrl);
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30));
	     driver.getTitle();
	     System.out.println("The current Title is "+driver.getTitle());
	     System.out.println("The current Url is "+driver.getCurrentUrl());
         return new Loginpage(driver);
	}


@AfterClass

public void closeBrowser() {
	driver.quit();
}

}
