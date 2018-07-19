package Excelmethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class XcelMethods
{

         Workbook wb;
         Sheet sheet1;
	public XcelMethods(String excelpath) throws IOException, EncryptedDocumentException, InvalidFormatException 
	 {
		 File src=new File(excelpath);
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			
			wb=WorkbookFactory.create(fis);

		} catch (FileNotFoundException e)
		   {
			
			e.printStackTrace();
			 System.out.println(e.getMessage());
		} 
		     
	 }

	  public String getData(int sheetNumber , int row, int colum)
	  {
		  
		  sheet1 =wb.getSheetAt(sheetNumber);
		
		  String data=sheet1.getRow(row).getCell(colum).getStringCellValue();
		  
		  
		  
		  return data;
		   }
	  
	  public int getRowCount(String sheetname)
	  {
		int row= wb.getSheet(sheetname).getLastRowNum();  
		row=row+1;
		  return row; 
	  }
	  
	}





