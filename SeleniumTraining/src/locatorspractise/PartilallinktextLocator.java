package locatorspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartilallinktextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		//driver.findElement(By.linkText("Login")).click();
		//driver.findElement(By.partialLinkText("Forgot")).click();
		//driver.findElement(By.partialLinkText("Apparel & Shoes"));
		//driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		
		driver.get("https://demowebshop.tricentis.com/Register");
		
		
		driver.findElement(By.id("FirstName")).sendKeys("Kavya");
		driver.findElement(By.id("LastName")).sendKeys("HB");
		driver.findElement(By.id("Email")).sendKeys("kavyahb66@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("testing@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("testing@123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Jewelry")).click();
				
		
		
		

				
	
	}

}
