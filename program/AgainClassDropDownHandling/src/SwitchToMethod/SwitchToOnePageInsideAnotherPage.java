package SwitchToMethod;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SwitchToOnePageInsideAnotherPage
{
  @Test
   public void switchToMethod() throws InterruptedException
   {
	 WebDriver driver=new FirefoxDriver();
	   driver.get("http://seleniumsreekanth.blogspot.com/p/frameexample.html");
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    driver.switchTo().frame("IF1");
	    driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/h1")).click();
	    Thread.sleep(3000);
	   // driver.findElement(By.xpath(".//*[@id='mastheadnbt']/nav/div[2]/ul/li[2]/ul/li[1]/a")).click();
   }
}
