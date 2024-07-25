package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagNameLocator {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement alllinks = driver.findElement(By.tagName("a"));
		System.out.println(alllinks.size());
		
		
		to find how many web elements have been developed using img tag
		
		//driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/");
		//WebElement alllimages = driver.findElement(By.tagName("a"));
		//System.out.println(alllimages.size());
		
		
		
	
		

	}

}
