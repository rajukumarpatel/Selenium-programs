package KeywordFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReflectionApi 
{   static WebDriver driver;
	 public static  void openapp()
	 {
	    driver=new FirefoxDriver();
	     driver.get("http://opensource.demo.orangehrmlive.com/");
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	       }
		
	 public static  void login()
	 {
		 driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		 driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();


		 
	 }
	 
	 public static  void closeapp()
	 {
		 driver.close();
	 }
		


}
