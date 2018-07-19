package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerfiyLogin 
{
  WebDriver driver;
  
  // By username=By.xpath(".//*[@id='user_login']");
   //By password=By.xpath(".//*[@id='user_pass']");
  // By loginbutton=By.xpath(".//*[@id='wp-submit']");
   
   
  public VerfiyLogin (WebDriver driver)
   {
	   this.driver=driver;
	  } 
   public void typeuserName()
   {   
	   driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys("admin");
	   //driver.findElement(username).sendKeys("admin");
   }
   
   public void typepassword()
   {
	   driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys("demo123");
	   //driver.findElement(password).sendKeys("demo123");
	    }
   
   public void typelogin()
   {
	   //driver.findElement(loginbutton).click();
	   driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
   }
}
