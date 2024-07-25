package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectedpractise {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement listboxselected = driver.findElement(By.xpath("//option[@value='199']"));
		System.out.println("before perfrorming click:"+listboxselected.isSelected());
		listboxselected.click();
		System.out.println("after performing click:"+listboxselected.isSelected());
		


	}

}
