package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.rediff.com/");
	  driver.manage().window().maximize();
	  
	String s=  driver.findElement(By.xpath(".//*[@id='topcat3']")).getAttribute("value");
     
	   System.out.println(s);
	}

}
