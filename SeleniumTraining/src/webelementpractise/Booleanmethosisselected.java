package webelementpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booleanmethosisselected {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//inspecting on list box INR100-INR199
		
		WebElement listboxselect = driver.findElement(By.xpath("//option[@value='199]"));
		System.out.println("before performing click: "+listboxselect.isSelected());
		listboxselect.click();
		System.out.println("after performing click: "+listboxselect.isSelected());
		
		
		
		
		


	}

}
