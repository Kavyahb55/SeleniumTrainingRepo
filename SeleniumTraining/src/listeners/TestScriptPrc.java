package listeners;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenerImplementation1Prc.class)
public class TestScriptPrc extends BaseclassPrc {
	@Test
	public void login()
	{
		Reporter.log("navigate to URL",true);
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Click on login link",true);
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Provide valid credentials",true);
		driver.findElement(By.id("Email")).sendKeys("kavyahb55@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("ABHI@123");
		Reporter.log("Click on login button",true);
		driver.findElement(By.xpath("//input[@value='Log in]")).click();
		Assert.fail();;
		
	}

}
