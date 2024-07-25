package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/7");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();//to get multiple windows to compare
		Set<String> allwindowIds =driver.getWindowHandles();//to get ids of multiple windows
		
//		for(String id : allwindowIds) {
//			driver.switchTo().window(id);//To switch to multiple browser
//			Thread.sleep(1000);
//			driver.close();
//		}
		
//		To get URL of all child windows
		
//		for(String id : allwindowIds) {
//			driver.switchTo().window(id);
//			Thread.sleep(1000);
//			System.out.println(driver.getCurrentUrl());
//			driver.close();
//		}
//		To close only flipkart 
		for(String id : allwindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(1000);
			
			
				if(driver.getCurrentUrl().equals("https://www.flipkart.com/"));
			
			driver.close();
		}
		
		

	}

}

