package getlinkHtmlunitdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class FindAlinkHtmlunitdriver 
{
public static void main(String[] args) 
	{
	  HtmlUnitDriver driver=new HtmlUnitDriver();
	     driver.get("http://google.com");
	     
	     List<WebElement> links=driver.findElements(By.tagName("a"));
           
	      System.out.println(links.size());
	         
	}

}
