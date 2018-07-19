package selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentUrl
{
public static void main(String[] args)
{
   WebDriver driver=new FirefoxDriver();
     driver.get("http://www.google.com");

     String ss=driver.getCurrentUrl();
     
       System.out.println(" Curren Url ="+ss);
     
	}

}
