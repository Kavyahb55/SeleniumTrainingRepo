package pompractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_001Prc {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		//welcome page
		WelcomePrcPage1 wpp=new WelcomePrcPage1(driver);
		wpp.getRegisterLink().click();
		//register page
		RegisterPrcPage rpp=new RegisterPrcPage(driver);
		rpp.getFirstNameTextfield().sendKeys("Kavya");
		rpp.getLastNameTextField().sendKeys("HB");
		rpp.getEmailTextField().sendKeys("kavyahb55@gmail.com");
	

	}

}
