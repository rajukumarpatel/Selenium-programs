package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTheKeyboardAction {
public static void main(String[] args)
	{
     
	WebDriver driver=new FirefoxDriver();
	
	  driver.navigate().to("http://www.facebook.com");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("rajukumarpatel69@gmail.com");
	    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(Keys.TAB);
	    
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("nrmalaraju");
	    driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(Keys.TAB);
	    driver.findElement(By.xpath(".//*[@id='u_0_3']")).sendKeys(Keys.ENTER);
	   
	   
	}

}
