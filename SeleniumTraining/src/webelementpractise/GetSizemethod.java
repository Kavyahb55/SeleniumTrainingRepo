package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizemethod {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Dimension size = driver.findElement(By.id("Email")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

	}

}
