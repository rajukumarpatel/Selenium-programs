package KeywordFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class KWDFW
{
@Test
public void KWFramework() throws EncryptedDocumentException, InvalidFormatException, IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\rajusingh\\seleniumworkspace\\bikash\\createExcel\\exceldata.xlsx");
	
	Workbook wb=WorkbookFactory.create(fis);
	int st=wb.getSheetIndex("Sheet1");
	
	Sheet s=wb.getSheetAt(st);
	 int rowcount=s.getLastRowNum();
	 for(int i=0; i<rowcount; i++)
	 {
		 Row r=s.getRow(i+1);
		 int CellCount=r.getLastCellNum();
		 for(int j=2; j<CellCount; j++)
		 { 
			 Cell c=r.getCell(j);
			 
			 String str=c.getStringCellValue();
			  if(str.equals("y"))
			  {
				  for( j=1; j<CellCount;j++)
				  {
					  c=r.getCell(j);
					  
					  String kword=c.getStringCellValue();
					  
					  Method m=ReflectionApi.class.getMethod(kword);
					  m.invoke(m);
					  String kword1="login";
					  Method m1=ReflectionApi.class.getMethod(kword1);
					  m1.invoke(m1);
					  String kword2="closeapp";
					  Method m3=ReflectionApi.class.getMethod(kword2);
					  m3.invoke(m3);
					  
				  }
			  }  
			 
		
		 }
		 
	 }
	
	}
}
