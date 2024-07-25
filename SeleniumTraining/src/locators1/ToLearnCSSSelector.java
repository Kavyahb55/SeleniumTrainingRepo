package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCSSSelector {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.cssSelector("input[value='Search']")).click();//here keep search in singlecoat or else we gwtexctra slash whgile pastingbhere
	}

}
