package findlinkurl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FindLinkAndURL {

	public static void main(String[] args)
	{
		ProfilesIni pr=new ProfilesIni();
		
		FirefoxProfile fp=pr.getProfile("rajusinghroy");
		FirefoxDriver driver=new FirefoxDriver(fp);
		    driver.get("http://bing.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++)
		{
			
		  if(links.get(i).isDisplayed())
          {
        	 String name=links.get(i).getText();
        	       links.get(i).click();
        	  String URL=driver.getCurrentUrl();
        	  System.out.println(name+"  "+URL);
        	  
        	    driver.navigate().back();
        	    links=driver.findElements(By.tagName("a"));
        	   
        	  
          }  
			
			
		}
	

	}

}
