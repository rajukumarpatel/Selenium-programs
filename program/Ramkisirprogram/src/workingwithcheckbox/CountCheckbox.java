package workingwithcheckbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountCheckbox {

	public static void main(String[] args) 
	{
	 FirefoxDriver driver=new FirefoxDriver();
	  driver.get("http://www.spicejet.com/");
	  
	  List<WebElement> checksbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	   System.out.println(checksbox.size());

	}

}
