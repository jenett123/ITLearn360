package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.Dashboard;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.MyCourses;
import com.itlearn.utility.ReadExcelFile;

public class MyCoursesTest extends BaseClass {
	String fileName=System.getProperty("user.dir")+"//TestData//TestInput.xlsx";
	@Test
	void checkMyCoursesPage() {
		
		LoginPage lp= new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginToPortal(username, password);
		
		Dashboard db = new Dashboard(driver);
		db.openDashboard1();
		
		MyCourses mc = new MyCourses(driver);
		mc.openMyCourses();
		
		lp.logoutPortal();
		
		
		
	}

}
