package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCareerPaths {
	
	WebDriver driver;
	
	public MyCareerPaths(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//*[@id=\"learn-press-user-profile\"]/ul/li[5]/a") WebElement mycareerpaths;
	
	public void openMyCareerPaths() {
		mycareerpaths.click();
	}
	

}
