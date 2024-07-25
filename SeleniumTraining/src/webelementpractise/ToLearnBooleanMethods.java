package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		//before passing data
		System.out.println("Element is present: "+loginButton.isDisplayed());//true
		System.out.println("Elements is enabled:"+loginButton.isEnabled());///false
		loginButton.click();
		
		
		//after passing data
		
		  driver.findElement(By.name("username")).sendKeys("testing");
		  driver.findElement(By.name("passowrd")).sendKeys("kavya123");
		  loginButton.click();
		  
		  System.out.println("==============================");
		  
		  System.out.println("Element is present: "+loginButton.isDisplayed());//true
			System.out.println("Elements is enabled:"+loginButton.isEnabled());///true
		  
		  
		  



	}

}
