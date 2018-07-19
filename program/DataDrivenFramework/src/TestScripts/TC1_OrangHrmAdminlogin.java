package TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import ExcelMethod.ExcelMethods;
import utility.Constants;

public class TC1_OrangHrmAdminlogin
{
   @Test
   
   public  void Admin_login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
   {
	 ExcelMethods xcel=new ExcelMethods("C:\\Users\\rajusingh\\seleniumworkspace\\DataDrivenFramework\\src\\testdata\\exceldata.xlsx");
	     int rc=xcel.getRowCount("Sheet1");
	      for (int r = 1; r < rc; r++)
	      {
	    	  String un=xcel.getCellData("Sheet1", r, 0);
	    	  
	    	 String pwd=xcel.getCellData("Sheet1", r, 1);
	    	  WebDriver driver=new FirefoxDriver();
	    	  driver.get("http://demosite.center/wordpress/wp-login.php");
	    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	    	   driver.manage().window().maximize();
	    	   driver.findElement(By.name("log")).sendKeys(un);
	    	   driver.findElement(By.name("pwd")).sendKeys(pwd);
	    	   
	    	   driver.findElement(By.name("wp-submit")).click();
	    	    Thread.sleep(3000);
	    	  
	    		  if(driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a")).getText().equals("Hi, admin"))
	    		     {
	    		WebElement wb= driver.findElement(By.xpath(".//*[@id='wp-admin-bar-my-account']/a"));
	    			  Actions ac=new Actions(driver);
	    			   ac.moveToElement(wb).perform();
	    			   driver.findElement(By.xpath(".//*[@id='wp-admin-bar-logout']/a")).click();
	    		      
	             xcel.setCellData("Sheet1", r, 2,Constants.pass);
	    			   
	                 driver.close();
	    			  }
	    		  else
	    	      {
	    
		       xcel.setCellData("Sheet1", r, 2,Constants.fail);	
		        driver.quit();;
	    	    
	    	   }
	    	   
		}
	      
	   
   }
}
