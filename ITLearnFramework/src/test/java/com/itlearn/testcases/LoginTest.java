package com.itlearn.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	void verifyLogin() throws IOException
	{
		LoginPage lp=new LoginPage(driver);
		String username ="Demo12";
		String password ="Test12345$";
		lp.loginToPortal(username, password);
		
		if(username.equals("Demo12") && password.equals("Test123456$"))
		{
			Assert.assertTrue(true);
			lp.logoutPortal();
		}
		else
		{
			captureScreenShot(driver,"verifyLogin");
			Assert.assertTrue(false);
		}
	}

}
