package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCourses {
	
	WebDriver driver;
	
	public MyCourses(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[2]/a") WebElement mycourses;
	
	
	public void openMyCourses() {
		mycourses.click();
	}
}
