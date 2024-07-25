package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		//boolean displayStatus = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		//System.out.println(displayStatus);
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));		//to perform multiple action on one element(checking is displyaed and isenablesdtogether)
		System.out.println("Element is present:"+loginButton.isDisplayed());
		System.out.println("Element is enabled:"+loginButton.isEnabled());
		loginButton.click();
		driver.findElement(By.name("username")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("test@1232");
		System.out.println("==================================");
		
		System.out.println("Element is present:"+loginButton.isDisplayed());
		System.out.println("Element is enabled:"+loginButton.isEnabled());
		
		
		
		
	}
}
