package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTheIframe{
public static void main(String[] args){
	
	WebDriver driver =new FirefoxDriver();
	 
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath(" html/body/button")).click();
	   
	

	}

}
