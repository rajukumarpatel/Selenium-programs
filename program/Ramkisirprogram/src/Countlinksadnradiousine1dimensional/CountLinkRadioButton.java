package Countlinksadnradiousine1dimensional;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLinkRadioButton {

	public static void main(String[] args) 
	{
	  FirefoxDriver driver=new FirefoxDriver();
	  
	   driver.get("https://www.mercurytravels.co.in/");
	   
	   List<WebElement> links=driver.findElements(By.tagName("a"));
	   
	     System.out.println("links="+links.size());
	     
	    links=driver.findElements(By.tagName("img"));
	     
          System.out.println("image="+links.size());
          
          links=driver.findElements(By.tagName("select"));
           System.out.println("dropdown="+links.size());
	      
            links=driver.findElements(By.xpath("//input[@type='checkbox']"));
             System.out.println("checkbox="+links.size());
             
             
             
             links=driver.findElements(By.xpath("//input[@type='radio']"));
	
	           System.out.println("radio button="+links.size());
	           
	           links=driver.findElements(By.xpath("//input[@type='text']"));
	       	
	           System.out.println("text  field="+links.size());
	
	}

}
