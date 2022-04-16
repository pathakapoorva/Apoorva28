package com.velocity.TESTclass;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.velocity.POMClass.*;
import com.saucedemo.UtilityClass.*;
public class SauceDemoLoogoutF extends TestBaseClass {	
WebDriver driver;
	
//	@BeforeMethod
//	public void setUpMethod()
//	{
//		System.setProperty("webdriver.chrome.driver", 
// 				"E:\\selenium project\\chromedriver.exe\\");
// 		
// 		WebDriver driver =  new ChromeDriver();
// 		System.out.println("Chrome Browser is opened");
// 		
// 		driver.manage().window().maximize();
// 		driver.get("https://www.saucedemo.com/");
// 		System.out.println("URL Open");
// 		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
// 	//	Thread.sleep(5000);
// 		//login
// 		//login to page
// 		SauceDemoLogin lp = new SauceDemoLogin(driver);
// 		
// 		lp.sendUserName();
// 		System.out.println("Username Entered");
// 		
// 		lp.sendPassword();
// 		System.out.println("Password Entered");
// 		
// 		lp.clickLoginButton();
// 		System.out.println("Click on login button");
//	}
		
 	@Test
 	public void verifyLogOutFunctionality()
 	{	
 		//homepage object
 		SauceDeomoLogin1 hp = new SauceDeomoLogin1 (driver);
 		hp.clickMenuButton();
 		hp.clickOnLogOut();
 		
 		String expectedTitle = "Swag Labs";
 		String actualTitle = driver.getTitle();
 		if(expectedTitle.equals(actualTitle))
 		{
 			System.out.println("logOut test is passed");
 		}
 		else
 		{
 			System.out.println("logOut test is failed");
 		}
 	}
 	
 	@AfterMethod
 	public void tearDownMethod()
 	{
 		driver.quit();
 		System.out.println("program end");
 	}


}
