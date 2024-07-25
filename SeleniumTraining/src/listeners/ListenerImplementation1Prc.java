package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation1Prc extends BaseclassPrc  implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("TestScript fails",true);
		TakesScreenshot ts =(TakesScreenshot )driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);//temp
		File dest = new File("./screenshotfld/listenerprcImg.png");//dest
		try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		


		

	}
	
	
	

	

}
