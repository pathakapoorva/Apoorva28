package com.velocity.TESTclass;

import org.testng.annotations.Test;
import com.velocity.POMClass.*;


public class MultipleAddToCartF extends TestBaseClass {	

 	@Test
 	public void verifyAddToCartFunctionalityMultipleProduct() throws InterruptedException 
 	{	
 		
 		//product select
 		SauceDeomoLogin1 hp = new SauceDeomoLogin1(driver);
 		
 		//all products
 		hp.addToCart();
 		
 		System.out.println("add to cart mutli product test case is passed");	
	}
 	
 	

}



