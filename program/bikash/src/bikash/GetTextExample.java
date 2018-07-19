package bikash;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextExample {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		
          driver.get("http://www.facebook.com");
      String s=  driver.findElement(By.xpath(".//*[@id='u_0_o']")).getTagName();
       
      System.out.println(s);
	}

}
