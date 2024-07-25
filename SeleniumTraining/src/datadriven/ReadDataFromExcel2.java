package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1:Create FIS/FR  type object
				FileInputStream fis =new FileInputStream("./testdata/testScriptData.xslx");
				
				//2.create respective file type object(for excel=workbook typeobject)
				Workbook workbook = WorkbookFactory.create(fis);
				
				//3.call read method
				
				
				



	}

}
