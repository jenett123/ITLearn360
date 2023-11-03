package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchField {
	WebDriver driver;

	public SearchField(WebDriver ldriver) {

		this.driver = ldriver;

		PageFactory.initElements(driver, this);
	}
	

 
 @FindBy(name="search_course") WebElement coursename;
 @FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchbutton;
 
 
 

 
public void SearchForCourse(String course) {
	 coursename.sendKeys(course);
	 searchbutton.click();
 }


}
