package popuppractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupPrc {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukari.com/registration/createAccount");
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\User\\Downloads//Manual Testing - Part 2.pdf");
		

	}

}
