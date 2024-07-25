package datadriven;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//step1:Create FIS/FR  type object
		FileInputStream fis =new FileInputStream("./testdata/testScriptData.xslx");
		
		//2.create respective file type object(for excel=workbook typeobject)
		Workbook workbook = WorkbookFactory.create(fis);
		
		//step3:call read method
		String url = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String username = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String password = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		//to run as script
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
		
		
		



	}

}
