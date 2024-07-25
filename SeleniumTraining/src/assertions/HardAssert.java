package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Email")).sendKeys();
		driver.findElement(By.id("Password")).sendKeys();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "DemoWebShop","user failed to login");
		Reporter.log("User logged in succesfully",true);//o/p=User logged in successfully
		
		//Assert.assertEquals(driver.getTitle(), "DemoWeb","user failed to login");
		//Reporter.log("User logged in succesfully",true);//o/p=User failed to login
	}

}
