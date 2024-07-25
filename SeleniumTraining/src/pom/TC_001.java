package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//welcomepage
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegisterLink().click();
		
		//register page
		RegisterPage rp=new RegisterPage(driver);
		rp.getFirstNameTextField().sendKeys("one");
		rp.getLastNameTextField().sendKeys("two");
		rp.getEmailTextField().sendKeys("three");
		
		


	}

}
  