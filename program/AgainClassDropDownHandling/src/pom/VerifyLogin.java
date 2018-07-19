package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyLogin 
{ 
  WebDriver driver;
  public VerifyLogin (WebDriver driver)
  {this.driver=driver;
	 }
   public void userName()
   {
	 driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");  
   }
   
   public void password()
   {
	  driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
   }
    
   public void loginbtn()
   {
	   driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
   }
   
   public void Closeapp()
   {
	   driver.close();
   }
}
