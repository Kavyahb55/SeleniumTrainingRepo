package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearmethod {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(20000);
		WebElement usernameTF = driver.findElement(By.name("Username"));
		usernameTF.sendKeys("KAVYAHB55");
		Thread.sleep(20000);
		usernameTF.clear();
		
		
		



	}

}
