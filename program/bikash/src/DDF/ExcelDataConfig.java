package DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcelDataConfig 
{
XSSFWorkbook wb;
XSSFSheet    sheet1;
 public ExcelDataConfig(String excelpath) throws IOException 
 {
	 File src=new File(excelpath);
	FileInputStream fis;
	try {
		fis = new FileInputStream(src);
		
		wb=new XSSFWorkbook(fis);

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
  
  public int getRowCount(int sheetIndex)
  {
	int row= wb.getSheetAt(sheetIndex).getLastRowNum();  
	row=row+1;
	  return row; 
  }
  
}




