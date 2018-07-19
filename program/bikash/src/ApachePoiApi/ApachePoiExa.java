package ApachePoiApi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoiExa 
{  
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
{
   FileInputStream fis=new FileInputStream("C:\\Users\\rajusingh\\Desktop\\Book1.xls");
     
     Workbook wb=WorkbookFactory.create(fis);
     
      Sheet s=wb.getSheet("Sheet1");
      
    int   rc=s.getLastRowNum();
      
      for(int i=0; i<=rc; i++)
      {
    	  
    	  Row r=s.getRow(i);
    	 int cc=r.getLastCellNum();
    	  for (int j=0; j<cc; j++)
    	  {
    	      Cell c=r.getCell(j);
    		  String data=c.getStringCellValue();
    		  System.out.println(data);
    		  
    		  
    	  }
    	/// run program  
    	  
    	  
      }
     
	}

}
