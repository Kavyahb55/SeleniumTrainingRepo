package unittestingpractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassPrc {
	public WebDriver driver;
	@BeforeSuite
	public void configReports()
	{
		Reporter.log("configureReports",true);
	}
	
	@AfterSuite
	public void flushReports()
	{
		Reporter.log("FushReports",true);
	}
	
	@BeforeClass
	public void browserSetup()
	{
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("open browser and navigate to URL",true);
	
	}
	@AfterClass
	public void closeBrowser() 
	{
	driver.quit();
	Reporter.log("Close the applicfation",true);
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("take from testcase mentioned email");
		driver.findElement(By.id("Password")).sendKeys("take from testcase mentioned password ");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout from an application",true);
	}
	
	
	
	
	
	
	
	

}
