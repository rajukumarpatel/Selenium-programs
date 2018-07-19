package selniumex;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicElemenHandling 
{
     static String Freshwid ;

public static void main(String[] args)
{
   WebDriver driver=new FirefoxDriver();
   driver.get("https://www.google.com/gmail/about/");
   
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
    driver.findElement(By.xpath(" html/body/nav/div/a[2]")).click();
    
    driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("rajukumarpatel669@gmail.com");
     
    driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
    
    
    
    Set<String> s=driver.getWindowHandles();
    Iterator<String> itr=s.iterator();
     while(itr.hasNext())
     {
    	     Freshwid = itr.next();
     }
    	 driver.switchTo().window(Freshwid);
    	 
	driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("123456789raju");
	  driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

}

}
