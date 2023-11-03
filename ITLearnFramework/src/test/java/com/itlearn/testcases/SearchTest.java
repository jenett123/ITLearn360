package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.SearchField;
import com.itlearn.utility.ReadExcelFile;

public class SearchTest extends BaseClass{
	String fileName=System.getProperty("user.dir")+"//TestData//TestInput.xlsx";
	@Test
	void testSearch() {
		SearchField sfield = new SearchField(driver);
		
		LoginPage lp= new LoginPage(driver);
		
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		String course = ReadExcelFile.getCellValue(fileName, "search", 0, 0);
		lp.loginToPortal(username, password);
		
		// sfield.LoginToPortal(username, password);
		sfield.SearchForCourse(course);
		lp.logoutPortal();
	}

}
