package com.velocity.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDeomoLogin1 {	//post conditions	
	  
	    private WebDriver driver;
		private Actions act;
		private Select s;
		
		//elements finds --> menuButton, logout button
		//TC-03 elements - logout functionality
		
		@FindBy(xpath="//button[@id='react-burger-menu-btn']")
		private WebElement menuButton;
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement logOutButton;
		
		
		//TC-04 elements -all products
		@FindBy(xpath="//button[text()='Add to cart']")
		private List<WebElement> addToButton;
		
		
		//TC-02 elements - add to cart single element
		@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagButton;
		
	   





		//constructor
		public SauceDeomoLogin1 (WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
			act = new Actions(driver);
			s = new Select(menuButton);
		}
		
		//action on the elements
		//TC-03
		public void clickMenuButton()
		{
			//webelement method
			menuButton.click();
			//or
			
			//mouse action-Actions class
			act.click(menuButton).perform();
			
			//select method for dropdown
			s.selectByVisibleText("hii");
		}
		
		//TC-03
		public void clickOnLogOut()
		{
			logOutButton.click();
		}
		
		//TC-04 
		public void addToCart() throws InterruptedException
		{
			for(int i=0; i<addToButton.size(); i++)
			{
				addToButton.get(i).click();
				Thread.sleep(3000);
			}
		}
		//TC-04 
		//assignment
		 public void checkText()
		 {
			 for(int i=0; i<addToButton.size(); i++)
			 {
				 if(addToButton.get(i).getText().contains("Remove"))
				 {
					 System.out.println("add to cart test case is passed");
				 }
				 else
				 {
					 System.out.println("add to cart test case is failed");
				 }
			 }
		 }
		
		//TC-02 
		//single element
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		
		//TC-02 //assignment
		public String getBagButtonText()
		{
			String elementText = bagButton.getText();
			return elementText;
		}
	}



