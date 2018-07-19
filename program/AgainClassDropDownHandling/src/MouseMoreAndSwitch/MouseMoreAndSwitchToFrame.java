package MouseMoreAndSwitch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMoreAndSwitchToFrame
{
	@Test
	public void MouseMoeSwitch()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://seleniumsreekanth.blogspot.com/");
		
		WebElement wb=driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/div[2]/ul/li[3]/a"));
		
		Actions actions=new Actions(driver);
	    actions.moveToElement(wb).perform();
	    
	    driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/div[2]/ul/li[3]/ul/li[5]/a")).click();
	    driver.switchTo().frame("IF1");
	    
	    driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/h1")).click();
	    
	    driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/div[2]/ul/li[2]/ul/li[1]/a")).click();
	   // driver.close();
		
	}

}
