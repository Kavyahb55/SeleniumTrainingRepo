package webdrivermethodspractise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
	Dimension size = driver.manage().window().getSize();
	driver.get("https://www.instagram.com");
	System.out.println(size.getHeight());
	System.out.println(size.getWidth());
	System.out.println("-----");
	
	driver.manage().window().maximize();
	Dimension size1 = driver.manage().window().getSize();
	
	System.out.println(size1.getHeight());
	System.out.println(size1.getWidth());

	}

}
