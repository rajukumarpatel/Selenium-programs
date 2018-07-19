package bikash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleEx
{
public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	 driver.get("http://www.facebook.com");
	 String title=driver.getTitle();
	  //System.out.println("webpage title="+title);
	
	  if(title.equals("Facebook – log in or sign up"))
	  {
		System.out.println(title+"is  displayed");  
	  }
	  else
	  {
		  System.out.println(title+"is not  displayed");    
	  }


	}

}
