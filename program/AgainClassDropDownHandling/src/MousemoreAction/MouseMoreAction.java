package MousemoreAction;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMoreAction
{ @Test
	public void MouseMoreAction()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://seleniumsreekanth.blogspot.com/");
	
	WebElement wb=driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/div[2]/ul/li[3]/a"));
	 Actions actions=new Actions(driver);
	      
	     actions.moveToElement(wb).perform();
	
	}
}
