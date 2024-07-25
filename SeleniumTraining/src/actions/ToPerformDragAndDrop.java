package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo/-site/draganddrop");
		WebElement photoFrame = driver.findElement(By.xpath("iframe//[contains(data-src,'../../demoSite/practice/droppable/photo-manager.html']"));
		driver.switchTo().frame(photoFrame);
		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement trash = driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, trash).perform();
		//since you are identifying image by heading of image but once you move to trash  you are getting element not intractable exception so identify by image
		//driver.findElement(By.xpath("//img[alt='The peaks of High Tatras']"));for all 4 images
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		act.dragAndDrop(img2, trash).perform();
		
		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		act.dragAndDrop(img3, trash).perform();
		
		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		act.dragAndDrop(img4, trash).perform();
		
		//to get back to gallery
		WebElement galery = driver.findElement(By.linkText("gallery"));
		Thread.sleep(5000);
		act.dragAndDrop(img1,galery).perform();
		act.dragAndDrop(img2, galery).perform();
		act.dragAndDrop(img3, galery).perform();
		act.dragAndDrop(img4, galery).perform();
		
		
		
		
		
		

	}

}
