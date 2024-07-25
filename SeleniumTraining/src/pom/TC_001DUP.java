package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001DUP {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//welcomepage
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp1=new WelcomePage(driver);
		wp1.getRegisterLink();
		
		//Register page
		RegisterPage1 rp1=new RegisterPage1(driver);
		rp1.getFirstNameTextField().sendKeys("one");
		rp1.getLastNameTextField().sendKeys("two");
		rp1.getEmailTextField().sendKeys("three");
		


	}

}
