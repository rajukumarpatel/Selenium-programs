package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {
public static void main(String[] args) 
{ 
WebDriver driver=new FirefoxDriver();
  driver.get("https://www.telugumatrimony.com/");
	
  WebElement obj=driver.findElement(By.xpath(".//*[@id='TERMS']"));
  
    if(obj.isSelected())
    {
    	obj.click();
    	 }
    else
    {
    	obj.click();
    	
    }

	}

}
