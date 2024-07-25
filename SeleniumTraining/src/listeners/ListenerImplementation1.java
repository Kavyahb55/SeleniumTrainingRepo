package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation1 extends BaseClass implements ITestListener //this class is to listen to testscript class
{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script fails",true);	
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);//TEMP LOCATION
		File dest=new File("./screenshotfld/listenerImg.png");//DESTINATION
		try {
			FileHandler.copy(temp, dest);//to move from temp to dest
		} catch (IOException e) {
			
			e.printStackTrace();
		}
				
			}

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Test Started....",true);	
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Test passes...",true);	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped...",true);	


	}
	
	
	
	

}


