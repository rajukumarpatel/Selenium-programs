package amazon;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonImplimentation
{  
	@Test
	public void amazon() throws InterruptedException
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
  WebElement wb= driver.findElement(By.xpath(".//*[@id='searchDropdownBox']"));
	Select sc=new Select(wb);
	  sc.selectByVisibleText("Baby");
	  driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
	   String s=driver.getTitle();
	   System.out.println(s);
	WebElement element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
	   Actions ac=new Actions(driver);
	    ac.moveToElement(element).perform();
	    Thread.sleep(3000);
	     driver.switchTo();
	     driver.findElement(By.xpath(".//*[@id='nav-flyout-ya-signin']/a/span")).click();
	    
	    
//	driver.close();
	  
	    
	}

}
