package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.Dashboard;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.MyCareerPaths;
import com.itlearn.utility.ReadExcelFile;

public class MyCareerPathsTest extends BaseClass {
	String fileName = System.getProperty("user.dir")+"//TestData//TestInput.xlsx";
	@Test
	void checkMyCareerPaths() {
		LoginPage lp = new  LoginPage(driver);
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginToPortal(username, password);
		
		Dashboard db = new Dashboard(driver);
		db.openDashboard1();
		
		MyCareerPaths mcp = new MyCareerPaths(driver);
		mcp.openMyCareerPaths();
		
		lp.logoutPortal();
		
	}

}
