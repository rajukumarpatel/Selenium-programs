package yutube1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GetPageTitl
{

	public static void main(String[] args)
	{
	
		WebDriver driver=new FirefoxDriver();
		 
		  driver.get("http://www.google.com");
		  
		   String  title=driver.getTitle();
		   
		   System.err.println("Get the title of Google = "+title);
		    Assert.assertTrue(title.contains("com.google"));
		       

	}

}
