package cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrasssB
{ static WebDriver driver;
  public static int browser;
  public static String browserName;

public static void main(String[] args)
	{
	for(browser=1; browser<=2; browser++)
	{
		if(browser==1)
		{
			driver=new FirefoxDriver();
			 browserName="Mozila FireFox Browser";
		}
		else if(browser==2)
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajusingh\\Desktop\\jar\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			browserName="Google Chrome Browser";
		}
		  
		driver.get("http://opensource.demo.orangehrmlive.com/");
		 String title=driver.getTitle();
		 
		 if(title.equals("Google"))
		 {
			System.out.println(browserName+"aplication lunched pass");
		 }
		 else
		 {
		System.out.println(browserName+"application lunched fail");
		 }
		
		 driver.close();
	}
}


}
