package Multiplescreenshort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleScreenShirt {

	public static void main(String[] args) throws IOException, InterruptedException 
	{ 
		FirefoxDriver driver=new FirefoxDriver();
		  driver.get("http://mercurytravels.co.in");
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  String name=driver.getTitle();
		
		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
	     for(int i=0; i<links.size(); i++)
	      {
	    	 
	    	 if(links.get(i).isDisplayed())
	    	 {
	    		
	    	         links.get(i).click();
	    	
	    		  File src=driver.getScreenshotAs(OutputType.FILE);
	    		  FileUtils.copyFile(src,new File("C:\\Users\\rajusingh\\Desktop\\screenshot\\"+name+".png"));
	    		   
	    		  driver.navigate().back();
	    		  links=driver.findElements(By.tagName("a"));
		    		 	    	 
	    		 	  
	    	 }
	}
	}
}
