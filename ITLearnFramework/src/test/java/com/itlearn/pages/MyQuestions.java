package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyQuestions {
	
	WebDriver driver;
	
	public MyQuestions(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"learn-press-user-profile\"]/ul/li[6]/a") WebElement myquestions;
	
	public void openMyQuestions() {
		myquestions.click();
	}

}
