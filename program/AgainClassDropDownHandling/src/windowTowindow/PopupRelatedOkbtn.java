package windowTowindow;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopupRelatedOkbtn
{
 @Test
 public void Popupmethod() throws InterruptedException
 {
	 WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.rediff.com/");
	 driver.findElement(By.xpath(".//*[@id='queryTop']/input")).click();
	 
	  Thread.sleep(3000);
	 Alert al=driver.switchTo().alert();
	     
	      al.accept();
 }
}
