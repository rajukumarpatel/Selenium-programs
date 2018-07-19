package selniumex;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebelementEx1 
{
public static void main(String[] args) 
	{

	WebDriver driver=new FirefoxDriver();
	
	   driver.get("http://www.msn.com/");

	   List<WebElement> obj=driver.findElements(By.tagName("a"));
	   
	   System.out.println(obj.size());
	  // String text=obj.get(5).getText();
	   String text=obj.get(1).getTagName();
	   
	   System.out.println(text);
	   
	}

}
