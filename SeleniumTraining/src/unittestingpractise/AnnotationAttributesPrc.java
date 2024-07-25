package unittestingpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttributesPrc {
	@Test(enabled = false)
	public void demoWebShop() {
	//WebDriver driver=new ChromeDriver();
	//  driver.get("https://demowebshop.tricentis.com");
	Reporter.log("launched demo webshop",true);
	}
	@Test(priority = -1,invocationCount = 3,threadPoolSize = 3)
	public void skillrary() 
	{
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://demoapp.skillraray.com");
		Reporter.log("launched skillraray",true);
	}
	
}
