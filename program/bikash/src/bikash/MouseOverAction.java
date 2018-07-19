package bikash;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
public static void main(String[] args) throws InterruptedException
{
  WebDriver driver=new FirefoxDriver();
   driver.navigate().to("https://www.w3schools.com");
  
   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  WebElement web= driver.findElement(By.xpath(".//*[@id='navbtn_references']"));
   
     Actions action=new Actions(driver);
     
     action.moveToElement(web).perform();
   
        Thread.sleep(4000);
        
   
	}

}
