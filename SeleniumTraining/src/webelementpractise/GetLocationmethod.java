package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationmethod {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point location = driver.findElement(By.id("Password")).getLocation();
		System.out.println(location.getX());
		System.out.println(location.getY());
		



	}

}
