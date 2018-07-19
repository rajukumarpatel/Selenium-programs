package datadrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFramework
{    WebDriver driver;

	@Test(dataProvider="wordpress")
	public void DataDrivenFrameEx(String username,String pwd) throws InterruptedException
	{
         driver=new FirefoxDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pwd);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		String s= driver.getTitle();
		 System.out.println(s);
		Thread.sleep(5000);
	}
	
	   @AfterMethod
	   public void closeapp()
	   {
		  driver.close(); 
	   }
	
	
      @DataProvider(name="wordpress") 
	 public Object[][] dataprovierEX()
	 { 
    	  
    	  Object [][] data=new  Object[3][2];
    	  
    	  data [0][0]="admin";
    	  data [0][1]="demo1";
    	  
    	  data [1][0]="admin";
    	  data [1][1]="demo12";
		 
    	  data [2][0]="admin";
    	  data [2][1]="demo123";
		 
		 return data;
		 
	 }
}
