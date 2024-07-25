package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnNavigate {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver =new ChromeDriver();
//driver.get("https://www.instagram.com/");
//driver.navigate().to("https://www.instagram.com/");
driver.navigate().to(new  URL("https://www.instagram.com/"));//doubt
driver.navigate().to(new URL("https://www.instagram.com/"));
Thread.sleep(2000);
driver.navigate().refresh();
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();




		
		

	}

}
