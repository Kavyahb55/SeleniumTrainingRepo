package webdrivermethodspractise;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseandQuitmethods {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.close();//server will not close thatr affects system performance
		driver.quit();//sercer also will get closed
		
	}

}
