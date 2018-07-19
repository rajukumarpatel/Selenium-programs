package selniumex;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindTextAndLink {

public static void main(String[] args) 
	{
WebDriver driver=new FirefoxDriver();
 
 driver.get("http://www.google.com");
 
 List<WebElement> oList=driver.findElements(By.xpath("//*"));
   
 
    System.out.println(Integer.toString(oList.size()));
    
    for(WebElement s: oList)
    {
    	
    System.out.println(s.getTagName()+" "+s.getText());	
    	
    	
    }
 
	}

}
