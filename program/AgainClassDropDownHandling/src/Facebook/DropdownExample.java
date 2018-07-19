package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownExample
{
    @Test
	public void openFb()
	{   WebElement   wb,wb1,wb2;
	      Select s,s1,s2;
		
	  WebDriver driver=new FirefoxDriver();	
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    
	   wb=driver.findElement(By.xpath(".//*[@id='day']"));
	    s=new Select(wb);
	   wb1=driver.findElement(By.xpath(".//*[@id='month']"));
	    s1=new Select(wb1);
	    wb2=driver.findElement(By.xpath(".//*[@id='year']"));
	    s2=new Select(wb2);
	   s.selectByValue("4");
	    s1.selectByIndex(3);
	    
	    s2.selectByVisibleText("2017");
	  //System.out.println(s);
	}
	

}
