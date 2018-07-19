package testscripts;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import Appmethods.Appfuncs;
import Excelmethod.XcelMethods;

public class DriverScripts 
{
 	static String keyword;
 	static String testobject;
 	static String testdata;
 	static String flag;
 	static String sheetname="Sheet1";
	
	@Test
	public void UserAcceptanceTesting() throws IOException, EncryptedDocumentException, InvalidFormatException
	{
		Appfuncs.loadProperties("C:\\Users\\rajusingh\\seleniumworkspace\\HybridFramework\\src\\ObjectRepository\\Login.frofile");
		XcelMethods xcelobj=new XcelMethods("C:\\Users\\rajusingh\\seleniumworkspace\\HybridFramework\\src\\Testdata\\keys.xlsx");
		
		 int rc=xcelobj.getRowCount(sheetname);
		 
		for(int r=1; r<rc; r++)
		{
			//flag=xcelobj.CellData(sheetname,r,1);
			
			 if(flag.equals("y"))
			 {
			//keyword=xcelobj.CellData(sheetname,r,4);
			//testobject=xcelobj.CellData(sheetname,r,5);
			 //testdata=xcelobj.CellData(sheetname,r,6);
			 Appfuncs kwords=new Appfuncs();
			 
			// Method m=kwords.getClass().getMethod(keyword,String.class,String.class);
			
			// String result=(String) m.invoke(kwords,testobject,testdata);
			
			 // xcelobj.setcellData(sheetname,r,7,result); 
			 
			 }
			 else
			 {
				 System.out.println("*************");
			 }
		}
		}
		
	}
	


