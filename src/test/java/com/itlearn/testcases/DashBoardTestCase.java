package com.itlearn.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.DashBoardPage;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.ReadExcelFile;

public class DashBoardTestCase extends BaseTest {

	String fileName=System.getProperty("user.dir")+"\\TestData\\TestInfo.xlsx";

	@Test(priority =1)
	public void testcourses() 
	{
		LoginPage lp=new LoginPage(driver);
		String username= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
		String password= ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
		System.out.println(username+" "+password);
		lp.loginToPortal(username, password);
		
		DashBoardPage dp = new DashBoardPage(driver);
		dp.dashboardclick();
			
	}
}
