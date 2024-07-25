package assertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BasicVerification {
	@Test
		public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("Email")).sendKeys();
		driver.findElement(By.id("Password")).sendKeys();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//HARD ASSERT
		//case1:	Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "user failed to login");
		//Reporter.log("user logged in successfully",true);
		//o/p=user logged in successfully
		
		//case2:Assert.assertEquals(driver.getTitle(), "Demo Web ", "user failed to login");
		//Reporter.log("user logged in successfully",true);
		//o/p=user failed to login.
		
		//SOFTASSERT
		SoftAssert sa =new SoftAssert();
		sa.assertEquals(driver.getTitle(), "demoWebShop","User failed to login");
		Reporter.log("user logged in succesfully");
		sa.assertAll();
		
		
		
		
		
		
		
	}
		
		
	}
	

