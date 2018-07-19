package GetAttributeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetAttributeM 
{
 @Test
 public void Getattribute()
 {
	WebDriver driver=new FirefoxDriver();
	 driver.get("http://facebook.com");
	 
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	String s= driver.findElement(By.xpath(".//*[@id='email']")).getAttribute("type");
     
	System.out.println(s);
 
 }
}
