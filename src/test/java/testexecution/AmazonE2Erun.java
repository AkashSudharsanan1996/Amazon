package testexecution;


import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import baseclass.Baseclass;
import pom.CheckoutPage;
import pom.Homepage;
import pom.Loginpage;

import pom.ProductDescription_checkout;
import wrapper.FakerAPI;

public class AmazonE2Erun extends Baseclass {


@Test(priority=1)
public void log() {
	Homepage result = new Loginpage(driver)
		  .login();
           //Assert.assertEquals(result, true);
}


@Test(priority=2)
public void Home() {
	 ProductDescription_checkout result = new Homepage(driver)
   .itemSearch();
	 //Assert.assertEquals(result, true);	 
 }


@Test(priority=3)
public void proddesc() throws Exception {
	 CheckoutPage result= new ProductDescription_checkout(driver)
			.itemList();
	 //Assert.assertEquals(result, true);
 }

@Test(priority=4)
public void check() {
	 CheckoutPage result = new CheckoutPage(driver)
			.ShippingAddress(FakerAPI.getUserName(), FakerAPI.getContactNumber(), FakerAPI.getPincode()
					        ,FakerAPI.getAddress(), FakerAPI.getplace()
			                ,FakerAPI.getLandmark(), FakerAPI.getCity());
	 //Assert.assertEquals(result, true);
 
} 

}
