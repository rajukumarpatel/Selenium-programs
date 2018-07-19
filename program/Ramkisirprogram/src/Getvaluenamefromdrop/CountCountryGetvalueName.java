package Getvaluenamefromdrop;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class CountCountryGetvalueName {

	public static void main(String[] args)
	{
	  ProfilesIni pro=new ProfilesIni();
	  FirefoxProfile fp=pro.getProfile("rajusinghroy");
	  
	  FirefoxDriver driver=new FirefoxDriver(fp);
	   driver.get("http://newtours.demoaut.com/");
	   
	   driver.findElement(By.linkText("REGISTER")).click();
	   WebElement we=driver.findElement(By.name("country"));
       Select select=new Select(we);
	   List<WebElement> values=select.getOptions();
	      int count=0;
	    for( WebElement wb: values)
	    {
	    	 count++;
	    	 
	    /*	 String name=wb.getText();
	    	 if(name.equals("INDIA"))
	    	 {
	    		System.out.println(name); 
	    	 }  */
	       System.out.println(wb.getText());
	    	
	    }
	     System.out.println(count);
	}

}
