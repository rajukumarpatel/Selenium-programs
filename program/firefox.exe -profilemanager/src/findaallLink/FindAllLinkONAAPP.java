package findaallLink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinkONAAPP {

	public static void main(String[] args) 
	{
      FirefoxDriver driver=new FirefoxDriver();
       driver.get("https://www.amazon.com/");
       List<String> str=(List<String>) driver.findElement(By.tagName("a"));
        System.out.println(str.size());
	}

}
