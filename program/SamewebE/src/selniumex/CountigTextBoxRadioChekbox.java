package selniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountigTextBoxRadioChekbox {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		
	       driver.get("https://www.facebook.com");
	       
	        driver.manage().window().maximize();
	        
	      int i=driver.findElements(By.xpath(".//*[@type='text']")).size();
	        		
	        		
	        		
	       System.out.println("No of Text box= "+i);

	}

}
