package ApacheDataProvider;

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

public class apachePoiApi
{ 
public static void main(String args[]) throws EncryptedDocumentException, InvalidFormatException, IOException
{    
	 Object [][] data=new Object[6][2];
	  
	FileInputStream f=new FileInputStream("C:\\Users\\rajusingh\\Desktop\\Book1.xls");
		
	Workbook wb= WorkbookFactory.create(f);
	   
	  Sheet  s=wb.getSheet("Sheet1");
	   
	  int r=s.getLastRowNum();
	 
		
	  for(int i=0; i<r; i++)
	  {
		  Row m=s.getRow(i);
		  int cc=m.getLastCellNum();
		  for(int j=0; j<cc; j++)
		   {
		     
			  Cell c=m.getCell(j);
			  data [i][j] =c.getStringCellValue();
			 
			  
			 System.out.println(data [i][j]);
		   }

	  }
		
	}
}
