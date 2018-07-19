package DDFW1;

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
	 public void  loginToWordpress(String uname,String password) throws InterruptedException
	 {
		 driver=new FirefoxDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   
		 driver.get("http://demosite.center/wordpress/wp-login.php");
		  driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("uname");
		  driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("password");
		 
		  driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
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
	 public Object [][] passData()
	 {
		 Object[][] data=new Object[3][2];
		
		 
		 data[0][0]="admin1";
		 data[0][1]="demo1";
		 
		 		
		 data[1][0]="admin";
		 data[1][1]="demo123";
		 
		 		
		 data[2][0]="admin2";
		 data[2][1]="demo1234";
		 
		 		
		 return data;
		 
	 }
	
}
