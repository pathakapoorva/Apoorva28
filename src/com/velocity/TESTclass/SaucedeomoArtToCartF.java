package com.velocity.TESTclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.velocity.POMClass.*;
public class SaucedeomoArtToCartF extends TestBaseClass{	
WebDriver driver;
	
	@BeforeMethod
	public void setUpMethod()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium project\\chromedriver.exe"
 				);
 		
 		driver =  new ChromeDriver();
 		System.out.println("Chrome Browser is opened");
 		
 		driver.manage().window().maximize();
 		driver.get("https://www.saucedemo.com/");
 		System.out.println("URL Open");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		
 		//login
 		//login to page
 		SauceDemoLogin lp = new SauceDemoLogin(driver);
 		
 		lp.sendUserName();
 		System.out.println("Username Entered");
 		
 		lp.sendPassword();
 		System.out.println("Password Entered");
 		
 		lp.clickLoginButton();
 		System.out.println("Click on login button");
    }
 	
	
 	@Test
 	public void verifyAddToCartFunctionality()	{
 		//product select
 		SauceDeomoLogin1 hp = new SauceDeomoLogin1(driver);
 		
 		//single elements
 		hp.clickBagButton();
 		//assignment
 		System.out.println("test case is passed");
 		
 	}
 	
 	@AfterMethod
 	public void tearDownMethod()
 	{
 		SauceDeomoLogin1 hp = new SauceDeomoLogin1(driver);
 		hp.clickMenuButton();
 		hp.clickOnLogOut();
 		
 		driver.quit();
 		System.out.println("program end");
 	}
 		
		


}




