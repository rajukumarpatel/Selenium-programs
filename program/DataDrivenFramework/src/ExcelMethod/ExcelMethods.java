package ExcelMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelMethods
{ 
public static String path;
  Workbook wb;
public ExcelMethods(String path) throws EncryptedDocumentException, InvalidFormatException, IOException
{  
  FileInputStream fis=new FileInputStream(path);
   wb=WorkbookFactory.create(fis);
		
}

 public int getRowCount(String sheetname)
 {
  return wb.getSheet(sheetname).getLastRowNum()+1;
	 }
 
  public String getCellData(String sheetname,int rownum,int cellcol)
  {
	  return wb.getSheet(sheetname).getRow(rownum).getCell(cellcol).getStringCellValue();
  }
  public void setCellData(String sheetname,int rownum,int cellColum,String CellValue) throws FileNotFoundException, IOException
  {
	
	wb.getSheet(sheetname).getRow(rownum).createCell(cellColum).setCellValue(CellValue);
	wb.write(new FileOutputStream(path));
	 }
  
}
