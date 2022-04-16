package com.saucedemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	public static void ScreenShot(WebDriver driver) throws IOException
	{
		
		Date d = new Date();
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	TakesScreenshot s1 = (TakesScreenshot)driver;
    File source = s1.getScreenshotAs(OutputType.FILE);
    File dest = new File("E:\\velocity\\Screenshots\\" + sd.format(d) + ".jpg");
    FileHandler.copy(source, dest); 
}
}
