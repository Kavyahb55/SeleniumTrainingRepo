package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValuemethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='login]"));
		Thread.sleep(20000);
		String color = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful]")).getCssValue("color");
		System.out.println(color);
		String weight = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful]")).getCssValue("Font weight");
		System.out.println(weight);
		
		
		
		
		
		
		
		
	}
	

}
