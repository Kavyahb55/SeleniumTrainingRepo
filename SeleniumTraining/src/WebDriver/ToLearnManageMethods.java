package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnManageMethods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://skillray.com");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();

	}
}
