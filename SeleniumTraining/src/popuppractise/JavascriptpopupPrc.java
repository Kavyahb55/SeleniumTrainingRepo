package popuppractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptpopupPrc {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("//https:demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("//inpuy[@value='Search]")).click();//after this u r getting popup so switch to alert
		Thread.sleep(2000);
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		alertpopup.accept();
		//need not to switch back driver control
		driver.findElement(By.linkText("Log in")).click();//need not to switch back your driver control
		


	}

}
