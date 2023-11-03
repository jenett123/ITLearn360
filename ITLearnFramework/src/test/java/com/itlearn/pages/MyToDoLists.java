package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyToDoLists {

	WebDriver driver;
	
	public MyToDoLists(WebDriver ldriver) {
		this.driver= ldriver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath= "//*[@id=\"learn-press-user-profile\"]/ul/li[4]/a") WebElement mytodolists;
	
	public void openMyToDo() {
		mytodolists.click();
	}

}
