package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationalCommonds {
public static void main(String[] args) throws InterruptedException {
  WebDriver driver= new FirefoxDriver();
  
        driver.get("http://www.google.com");
         driver.findElement(By.linkText("Gmail")).click();
         
           driver.navigate().back();
           Thread.sleep(5000);
            driver.navigate().forward();
                
            Thread.sleep(5000);
            driver.navigate().refresh();


	}

}
