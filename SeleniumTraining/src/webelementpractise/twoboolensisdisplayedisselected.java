package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twoboolensisdisplayedisselected {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//inspect on login button
		WebElement loginButton = driver.findElement(By.xpath("//button[type='submit']"));
		
		//before sending data
		System.out.println(loginButton.isDisplayed());//true
		System.out.println(loginButton.isEnabled());//false
		loginButton.click();
		
		//after sending data
		driver.findElement(By.name("username"));
		driver.findElement(By.name("password"	));
		loginButton.click();
		
		System.out.println(loginButton.isDisplayed());//true
		System.out.println(loginButton.isEnabled());//true
		
		
		
		
				
				




	}

}
