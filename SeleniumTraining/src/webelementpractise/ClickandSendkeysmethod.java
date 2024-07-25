package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickandSendkeysmethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//type 1
		driver.findElement(By.xpath("//input[@value='Search store]")).sendKeys("mobile",Keys.ENTER);
		//type2
		driver.findElement(By.xpath("//input[@value='Search store]")).sendKeys("testingdemo");
		driver.findElement(By.xpath("//input[@value='Search store]")).click();
		//type3
		driver.findElement(By.xpath("//input[@value='Search store]")).sendKeys("testingdemo");
		driver.findElement(By.xpath("//input[@value='Search store]")).submit();
		
		
		
		



		
		
		



	}

}
