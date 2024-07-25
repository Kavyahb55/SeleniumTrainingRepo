package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SoftAssert {
	@Test
	public void login() {
		
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.id("Email")).sendKeys();
	driver.findElement(By.id("Password")).sendKeys();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	SoftAssert sa=new SoftAssert();
	sa.ass
	
	

	
	

	
	
	
	}
}
