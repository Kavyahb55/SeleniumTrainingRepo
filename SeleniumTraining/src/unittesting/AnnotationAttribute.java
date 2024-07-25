package unittesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(priority = 2,enabled = false)
	//or @Test(priority = 2,invocationCount = 0);
	public void demoWebshop()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com");
		Reporter.log("launched demo webshop",true);
			
	}
	
	@Test(priority = 1 ,invocationCount = 3,threadPoolSize = 3)
	public void skillrary()	
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com");
		Reporter.log("launched skillrary webshop",true);
		
	}
	
	
	

	
}
