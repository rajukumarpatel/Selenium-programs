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
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PoiProvider
{
 public String path ;
 FileInputStream fis;
 XSSFWorkbook workbook;
 public PoiProvider(String path) throws IOException
 {
	 this.path=path;
	 FileInputStream fis=new FileInputStream(path);
	 
	 workbook=new XSSFWorkbook(fis);
	 
 }	
 
	public String getcellData(String sheetneme,String Columname,String rowname)
	{
		return rowname;
		
	}
}