package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFrom 
{
	@Test
	public void ExcelData() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
	FileInputStream fis=new FileInputStream("C:\\Users\\rajusingh\\seleniumworkspace\\AgainClassDropDownHandling\\excelFile\\ExcelData.xlsx");
	 Workbook wb=WorkbookFactory.create(fis);
	 Sheet s=wb.getSheet("Sheet1");
	  int r=s.getLastRowNum();
	  for(int i=0; i<r;i++)
	  {
		Row rc=s.getRow(i);
		 int cc=rc.getLastCellNum();
		 for(int j=0; j<cc; j++)
		 {
		  Cell c=rc.getCell(j);
		  
		  String data=c.getStringCellValue();
		   System.out.println(data);
		 }
	  }
	}
}
