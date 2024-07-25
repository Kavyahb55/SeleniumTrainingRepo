package locators1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkText {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		//partial link text-a.WHEN TEXT IS LENGTHY
		driver.findElement(By.partialLinkText("Forgot")).click();
		//partial link text-d.WHEN TEXT ON WEBPAGE IS IN UPPERCASE BUT INSPECT ITS IN LOWER
		
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();	
	}                                                                                                                                                                                                                                                                                                                                                                               ,

	
	
	
	
	
}
