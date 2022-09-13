package DrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author L
 *
 */
public class GenaricFile {
	/**
	 * This is a Generic for reading the data from PropertyFile;
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Data/Comman.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
		
	}
	/**
	 * This is a Genaric method reading data from excelFile;
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExelData(String SheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/seleniumScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data=wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * This is generic method for write the data from ExcelFile;
	 * @param SheetName
	 * @param row
	 * @param cell
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExelData(String SheetName,int row,int cell,String string) throws EncryptedDocumentException, IOException ,FileNotFoundException{
		FileInputStream fis=new FileInputStream("./Data/seleniumScript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		FileOutputStream fos=new FileOutputStream("./Data/seleniumScript.xlsx");
		wb.write(fos);
		wb.close();
		
	}
}
