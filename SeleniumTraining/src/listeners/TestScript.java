package listeners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListenerImplementation1.class)
public class TestScript extends BaseClass {
	@Test
	public void login()
	{
		
		Reporter.log("navigate to URL",true);
		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("Click on Login link",true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Provide valid credential",true);
		driver.findElement(By.id("Email")).sendKeys("kavyahb55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ABHI@123");
		Reporter.log("Click on login button",true);
		driver.findElement(By.xpath("//input[@value='Log in]")).click();
		Assert.fail();
		
	}


}
