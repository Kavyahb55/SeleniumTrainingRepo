package unittesting;

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

import dev.failsafe.internal.util.Durations;

public class BaseClass {
	public WebDriver driver;//to make global variable for all required methods
	
	@BeforeSuite
	public void configReports()
	{
		Reporter.log("configure Reports",true);//actually database connection done here in real time
	}
	@AfterSuite
	public void flushReports()
	{
		Reporter.log("flush Reports",true);
	}
		//BEFORE AND AFTER TEST IS NOT REQUIRED NOT USED MUCH IN IONDUSTRY
	
	@BeforeClass
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Open browser and navigate  TO url",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
		Reporter.log("close the application",true);
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.linkText("Login")).click();//in real time we will create object of respective pageclass and with referance we call particualr element
		driver.findElement(By.id("Email")).sendKeys("kavyahb55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Kavya2123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("login to application",true);
		
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("logout from appplication",true);
	}
	
	
	
	

	
}
