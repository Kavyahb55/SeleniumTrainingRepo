package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		
		//getheight() and getwidth() present in Dimension just because we stored in size variable in line 11 we are calling size.getHeight() and size.getwidth()
		System.out.println("hello java");
		
		driver.manage().window().maximize();
		Dimension size2 = driver.manage().window().getSize();
		System.out.println(size2.getHeight());
		System.out.println(size2.getWidth());
		
		
		

	}

}
