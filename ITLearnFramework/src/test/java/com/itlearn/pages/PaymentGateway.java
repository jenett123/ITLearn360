package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGateway {
	WebDriver driver;

	public PaymentGateway(WebDriver ldriver) {
		this.driver = ldriver;

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"learn-press-payment\"]/ul/li/label") WebElement radioPayWithStripe;
	@FindBy(id="learn-press-checkout-place-order") WebElement placeOrder;
	@FindBy(xpath="//*[@id=\"card-element\"]/div/iframe")  WebElement cardframe;
	
	@FindBy(name="cardnumber") WebElement cardNumber;
	@FindBy(name="exp-date") WebElement expdate;
	@FindBy(name="cvc") WebElement cvcNo;
	@FindBy(name="postal") WebElement zipCode;
	@FindBy(id="payment-button") WebElement payNow;
	
	
	public void payment(String cardnumber, String expirydate, String cvc, String zip) {
		radioPayWithStripe.click();
		placeOrder.submit();
		driver.switchTo().frame(cardframe);
		cardNumber.sendKeys(cardnumber);
		expdate.sendKeys(expirydate);
		cvcNo.sendKeys(cvc);
		zipCode.sendKeys(zip);
		
		driver.switchTo().defaultContent();
		payNow.click();
		
	}
}
