package DatadrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage
{
	 static WebElement element=null;
	 
	public static WebElement text_singin(WebDriver driver)
	{
	    element =driver.findElement(By.xpath("html/body/nav/div/a[2]"));
		return element;
		
	}
	
	public static WebElement text_Email(WebDriver driver)
	{
	        element =driver.findElement(By.xpath(".//*[@id='identifierId']"));
		return element;
		
	}
	public static WebElement text_next(WebDriver driver)
	{
	        element =driver.findElement(By.xpath(".//*[@id='identifierNext']/content"));
		return element;
		
	}

	public static WebElement text_enterpass(WebDriver driver)
	{
	        element =driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input"));
		return element;
		
	}
	
	public static WebElement text_nextlast(WebDriver driver)
	{
	        element =driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span"));
		return element;
	                     
	}
}
