package com.itlearn.pages;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoardPage extends BaseTest{

	WebDriver driver;
	//constructor
	public DashBoardPage(WebDriver lDriver)
	{
		this.driver=lDriver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a") WebElement dash;
	
    @FindBy(linkText ="Offered Academies") WebElement offerAcademies;
 // Scroll the element into view
    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	
//	@FindBy(linkText  ="SUBSCRIBE NOW") WebElement subsribebtn;
	
    
//	public void dashboardportal(String dashtext) throws IOException
//	{
//		String actualdash= dash.getText();
//		System.out.println(actualdash);
//		
//		if(actualdash.equals(dashtext))
//			{
//				System.out.println("Test Passed");
//				
//			}
//			else
//			{
//				captureScreenShot(driver,"fetchDashboardText");
//			}
//		assertEquals(dashtext, actualdash);
//
//	}
	
	public void dashboardclick()
	{
		dash.click();
		offerAcademies.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstSubscribeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Subscribe Now')]")));
        
        // Scroll the element into view before clicking
        scrollIntoView(firstSubscribeButton);
        
        firstSubscribeButton.click();

		//subsribebtn.click();
	
	}
}
