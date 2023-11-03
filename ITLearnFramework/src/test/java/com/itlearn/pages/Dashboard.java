package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver driver;
	
	public Dashboard(WebDriver ldriver) {
		this.driver = ldriver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"login-list\"]/li[1]/a") WebElement dashboard;
	@FindBy(xpath="//*[@id=\"learn-press-user-profile\"]/ul/li[3]/a") WebElement offeredAcademies;
	@FindBy(xpath="//*[@id=\"tab-academies\"]/div/div/ul/li[1]/form/div/button") WebElement subscribeNow;
	
	
	
	public void openDashboard() {
		dashboard.click();
		offeredAcademies.click();
		subscribeNow.click();
		
		
	}
	public void openDashboard1() {
		dashboard.click();
	}

}
