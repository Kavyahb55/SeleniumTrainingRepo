package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");	
		WebElement price = driver.findElement(By.xpath("//options[@value='199']"));
		System.out.println("before performing click:"+price.isSelected());
		price.click();
		
		System.out.println("after performing click:"+price.isSelected());

		
	
	}

}
