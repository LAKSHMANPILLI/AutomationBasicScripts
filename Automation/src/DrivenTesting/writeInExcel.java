package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class writeInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/seleniumScript.xlsx");
		//FileInputStream fis=new FileInputStream("C:\\Users\\L\\OneDrive\\Desktop\\lucky.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	 wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("fail");
	 FileOutputStream fos=new FileOutputStream("./Data/seleniumScript.xlsx");
	 wb.write(fos);
	 wb.close();
	}

}
