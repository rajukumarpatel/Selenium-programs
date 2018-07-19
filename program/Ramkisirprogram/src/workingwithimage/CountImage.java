package workingwithimage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountImage {

	public static void main(String[] args) 
	{
	 FirefoxDriver driver=new FirefoxDriver();
	   driver.get("https://www.flipkart.com/");
	   List<WebElement> images=driver.findElements(By.tagName("img"));
	    System.out.println(images.size());
	    
	     for(int i=0; i<images.size(); i++)
	     {
	    	System.out.println(images.get(i).getAttribute("src"));
	    	 
	     }

	}

}
