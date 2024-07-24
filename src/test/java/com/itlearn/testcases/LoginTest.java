package com.itlearn.testcases;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseTest;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.ReadExcelFile;


public class LoginTest extends BaseTest {
	
	@Test()
	public void verifyLogin(String userEmail, String userPwd)
	{
		LoginPage lp=new LoginPage(driver);
		String username ="Demo12";
		String password ="Test123456$";
		lp.loginToPortal(username, password);
	}
	
}
//		if(username.equals("Demo12") && password.equals("Test123456$"))
//		{
//			System.out.println("Test Passed");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			captureScreenShot(driver,"VerifyLogin");
//			Assert.assertTrue(false);
//		}
	
//	
//	@Test(priority =2)
//	public void fetchDashboardText() throws IOException
//	{
//		
//		String dashtext= driver.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a")).getText();
//		String actualdash= "Dashboard";
//		
//		if(actualdash.equals("Dashboard"))
//		{
//			System.out.println("Test Passed");
//			
//		}
//		else
//		{
//			captureScreenShot(driver,"fetchDashboardText");
//		}
//		assertEquals(dashtext, actualdash);
//	}
//
//	
//	
//	
//}
