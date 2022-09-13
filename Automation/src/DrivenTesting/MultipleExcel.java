package DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream fis=new FileInputStream("C:\\Users\\L\\eclipse-workspace\\Automation\\Data\\multi.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount=wb.getSheet("multiple").getLastRowNum();
		for (int i = 0; i < rowCount; i++) {
			String Username = wb.getSheet("multiple").getRow(i).getCell(0).getStringCellValue();
			String password= wb.getSheet("multiple").getRow(i).getCell(0).getStringCellValue();
			System.out.println(Username+"  "+password);
		}
	}

}
