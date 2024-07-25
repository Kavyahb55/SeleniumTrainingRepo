package locators1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//actually we are only counting how many links present in list meaning how many anchor tag links
		//here you can iterate using for each loop also
		System.out.println(allLinks.size()); //size method belongs to list                                                                                                                     
		
		
		                                               
		
		

	}

}
