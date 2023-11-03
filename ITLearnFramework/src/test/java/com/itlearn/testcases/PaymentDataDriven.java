package com.itlearn.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.Dashboard;
import com.itlearn.pages.LoginPage;
import com.itlearn.pages.PaymentGateway;
import com.itlearn.utility.ReadExcelFile;

public class PaymentDataDriven extends BaseClass{
	
	String fileName= System.getProperty("user.dir")+"//TestData//TestInput.xlsx";
	
	@Test
	
	void makePayment()
	{
		LoginPage lp = new LoginPage(driver);
		String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		lp.loginToPortal(username, password);
		
		String cardnumber=ReadExcelFile.getCellValue(fileName, "CardDetails", 1, 0);
		String expirydate=ReadExcelFile.getCellValue(fileName, "CardDetails", 1, 1);
		String cvc=ReadExcelFile.getCellValue(fileName, "CardDetails", 1, 2);
		String zip=ReadExcelFile.getCellValue(fileName, "CardDetails", 1, 3);
		
	
		
		Dashboard db = new Dashboard(driver);
		db.openDashboard();
		
		PaymentGateway pg = new PaymentGateway(driver);
		pg.payment(cardnumber, expirydate, cvc, zip);
		
		lp.logoutPortal();
		
		
	}
	
	
//@DataProvider (name= "paymentDataProvider")
//	public String [] [] paymentDataProvider(){
//		
//		System.out.println("The name of File is "+ fileName);
//		
//		int ttlRows = ReadExcelFile.getRowCount(fileName, "CardDetails");
//		int ttlColumns = ReadExcelFile.getColCount(fileName, "CardDetails");
//				
//		System.out.println ("Number of Rows= "+ ttlRows);
//		System.out.println("Number of Columns= "+ ttlColumns);
//		
//		String data [] [] = new String [ttlRows-1][ttlColumns];
//		
//		for (int i=1; i<ttlRows; i++)
//		{
//			for (int j=0; j<ttlColumns; j++)
//			{
//				data[i-1] [j]= ReadExcelFile.getCellValue(fileName, "CardDetails", i, j);
//			}
//		}
//		return data;
//				}
	

}
