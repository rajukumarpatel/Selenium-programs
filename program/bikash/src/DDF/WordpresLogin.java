package DDF;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class WordpresLogin 
{
		WebDriver driver;
		 @Test(dataProvider="wordpressdata")
		 public void  loginToWordpress(String amune,String password) throws InterruptedException
		 {
			 driver=new FirefoxDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			   
			 driver.get("http://opensource.demo.orangehrmlive.com/");
			  driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys(amune);
			  driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys(password);
			 
			  driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
			  Thread.sleep(3000);
			
			  //System.out.println( driver.getTitle());
	            Assert.assertTrue(driver.getTitle().contains("Dasboard"));
	             driver.quit();
		 
		 System.out.println("page title verifed user is able to login successfully");
		 
		 }
		 
		 @AfterMethod
		 public void tearDown()
		 {
			driver.quit();
		 }
		 
		 @DataProvider(name="wordpressdata")
		 public Object [][] passData() throws IOException
		 {
		 ExcelDataConfig config=new ExcelDataConfig("C:\\Users\\rajusingh\\seleniumworkspace\\bikash\\testData\\InputData.xlsx");
		 int rows=   config.getRowCount(0);
			 
		   Object[][] data=new Object[rows][2];
		   
		     for(int i=0; i<rows; i++)
		     {
		    	 
		    	 data[i][0]=config.getData(0, i, 0);
		    	 data[i][1]=config.getData(0, i, 1);
		    	 
		     }
			 return data;
			
		     
	    }
		 
}
