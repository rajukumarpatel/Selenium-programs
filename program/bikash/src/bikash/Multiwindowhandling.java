package bikash;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiwindowhandling 
{     
    static String freshwid;

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.linkText("Gmail")).click();
		 driver.findElement(By.linkText("SIGN IN")).click();
		
	Set<String>	s=  driver.getWindowHandles();
		  
	Iterator<String> tr=s.iterator();
	  while(tr.hasNext()){
	
		  freshwid=tr.next();
		  
		
	  }
	   
	  driver.switchTo().window(freshwid);

	  driver.findElement(By.xpath(".//*[@id='view_container']/div/div[2]/div/form/div[3]/div/content/span")).click();
	  
	  
	  
	}

}
