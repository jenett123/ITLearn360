package com.itlearn.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;
import com.itlearn.utility.ReadExcelFile;


public class LoginDataDrivenTest extends BaseClass {
	String fileName=System.getProperty("user.dir")+"//TestData//TestInput.xlsx";
	@Test(dataProvider="loginDataProvider")
	void verifyLogin(String username, String password)
	{
		LoginPage lp= new LoginPage(driver);
		lp.loginToPortal(username, password);
		lp.logoutPortal();
	}
	
	@DataProvider (name="loginDataProvider")
	public String [][] loginDataProvider()
	{
	System.out.println("The name of file "+fileName);
		int ttlRows= ReadExcelFile.getRowCount(fileName, "LoginData");
		int ttlColumns= ReadExcelFile.getColCount(fileName, "LoginData");
		
		System.out.println("The count of row "+ttlRows);
		
		String data[][]= new String[ttlRows-1][ttlColumns];
		
		for(int i=1;i<ttlRows;i++)
		{
			for(int j=0;j<ttlColumns;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData",i,j );
			}
		}
		return data;
	}
	

}
