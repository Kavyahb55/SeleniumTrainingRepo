package webdrivermethodspractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandlesmethod {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(20000);
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/3");
		driver.findElement(By.id("Compare")).click();
		//driver.findElement(By.xpath("compare")).click();
		Set<String> allWondowids = driver.getWindowHandles();
		
		for(String id:allWondowids)
		{
			
			System.out.println(id);
		}

	}

}
