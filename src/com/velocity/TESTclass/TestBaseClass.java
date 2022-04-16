package com.velocity.TESTclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.velocity.POMClass.*;
public class TestBaseClass {	
	WebDriver driver;      //declare only -gloabally

@BeforeMethod
public void setUpMethod()
{
	System.setProperty("webdriver.chrome.driver", 
			"E:\\selenium project\\chromedriver.exe\\");
		System.out.println("Chrome Browser is opened");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL Open");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login to page
		SauceDemoLogin lp = new SauceDemoLogin  (driver);
		lp.sendUserName();
		System.out.println("Username Entered");
		
		lp.sendPassword();
		System.out.println("Password Entered");
		
		lp.clickLoginButton();
		System.out.println("Click on login button");
   }



@AfterMethod
	public void tearDownMethod()
	{
		driver.quit();
		System.out.println("program end");
	}


}


