package selniumex;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webelementg 
{
public static void main(String ss[])throws Exception
{
	
 WebDriver driver=new FirefoxDriver();
    driver.get("http://seleniumsreekanth.blogspot.in/2015/08/radio-button-example.html");
    driver.manage().window().maximize();
    List<WebElement> olist=driver.findElements(By.name("gender"));
            olist.get(1).click();
            Thread.sleep(1000);
            olist.get(2).click();
            Thread.sleep(1000);
            olist.get(3).click();
            Thread.sleep(1000);
            olist.get(4).click();
            Thread.sleep(1000);
            olist.get(5).click();
            Thread.sleep(1000);
            olist.get(6).click();
            Thread.sleep(1000);
            olist.get(7).click();
           
   
}
	

}
