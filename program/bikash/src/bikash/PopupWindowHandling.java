package bikash;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopupWindowHandling {
public static void main(String[] args) throws InterruptedException 
	{

	 WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.rediff.com/");

	    driver.findElement(By.xpath(".//*[@id='queryTop']/input")).click();
	    
	 Alert  s  = driver.switchTo().alert();
	 
	    Thread.sleep(4000);
	      s.accept();
	    driver.close();
	    
	    
	}

}
