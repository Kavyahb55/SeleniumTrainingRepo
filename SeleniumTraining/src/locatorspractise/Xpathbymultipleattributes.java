package locatorspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbymultipleattributes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		//and
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more' and class'desktop-searchBar' ]")).click();
		//or
		//driver.findElement(By.xpath("//input[@placeholder='Search for products, br' or class'desktop-searchBar' ]")).click();
		
		
		

	}

}
