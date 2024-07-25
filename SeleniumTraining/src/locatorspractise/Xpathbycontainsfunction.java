package locatorspractise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbycontainsfunction {

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]")).click();
		//on contact uploading&non user

driver.findElement(By.xpath("//span[contains(text(),'Contact Uploading')]")).click();


	}

}
