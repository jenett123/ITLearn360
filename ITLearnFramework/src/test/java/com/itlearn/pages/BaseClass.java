package com.itlearn.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.itlearn.utility.BrowserFactory;
import com.itlearn.utility.ConfigDataProvider;
import com.itlearn.utility.ReadExcelFile;

public class BaseClass {
	
	public WebDriver driver;
	public ConfigDataProvider config;
	public ReadExcelFile excel;
	
	@BeforeSuite
	public void setUpSuite()
	{
		config= new ConfigDataProvider();
		excel= new ReadExcelFile();
	}
	
	@BeforeClass
	public void setUp()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.url());
	}
	
 @AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
 public void captureScreenShot(WebDriver driver,String testName) throws IOException
 {
	 // Convert webdriver object to TakesScreenshot interface
	 TakesScreenshot screenshot= ((TakesScreenshot)driver);
	 
	 // Step 2 :call getScreenshotAs method to capture image file
	 
	 File src= screenshot.getScreenshotAs(OutputType.FILE);
	 File srcpath=new File("."+"//Screenshots//"+ testName + ".png");
	 
	 // Step 3 : copy image file to destination 
	 FileUtils.copyFile(src, srcpath);
	 
 }
}
