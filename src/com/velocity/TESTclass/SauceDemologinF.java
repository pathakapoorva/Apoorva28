package com.velocity.TESTclass;

import java.time.Duration;

import javax.security.auth.spi.LoginModule;

//import com.saucedemo.UtilityClass.*;
import com.velocity.POMClass.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemologinF extends TestBaseClass {	
	WebDriver driver;      //declare only -gloabally
@BeforeMethod
public void setUpMethod()
{
	System.setProperty("webdriver.chrome.driver", 
				"E:\\selenium project\\chromedriver.exe\\");
	WebDriver driver =  new ChromeDriver();        //initialize
		System.out.println("Chrome Browser is opened");

		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login to page
		SauceDemoLogin lp = new SauceDemoLogin (driver);
		lp.sendUserName();
		System.out.println("Username Entered");
		
		lp.sendPassword();
		System.out.println("Password Entered");
		
		lp.clickLoginButton();
		System.out.println("Click on login button");
   }


	


	@Test
	public void verifyLoginFunctionality() 
	{
    String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";
		
		String actualHomePageUrl = driver.getCurrentUrl();
	    
		System.out.println("Checking the logi test case");
		
		if(expectedHomePageUrl.equals(actualHomePageUrl))
		{
			System.out.println("login test passed-we have successfully login on sauce demo website");
		}
		else
		{
			System.out.println("Login test failed");
		}
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		SauceDeomoLogin1  hp = new SauceDeomoLogin1 (driver);
		hp.clickMenuButton();
		hp.clickOnLogOut();
		
		driver.quit();
		System.out.println("program end");
	}
		
	
}


