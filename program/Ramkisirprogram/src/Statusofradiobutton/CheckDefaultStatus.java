package Statusofradiobutton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckDefaultStatus {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		 driver.get("https://www.mercurytravels.co.in/");
		  List<WebElement> radio=driver.findElements(By.xpath(".//input[@type='radio']"));
          System.out.println(radio.size());
          
          for(int i=0; i<radio.size(); i++)
          {
       	   
       	 
       	    	System.out.println(radio.get(i).getAttribute("name")+" "+radio.get(i).getAttribute("checked"));
       	    	
       	   
       	   
       	   
       	   
          }

	}

}
