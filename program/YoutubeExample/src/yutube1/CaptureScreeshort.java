package yutube1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CaptureScreeshort 
{

	

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();

		driver.get("http://wikipedia.org");
		 File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		  try{
			
	 org.apache.commons.io.FileUtils.copyFile(sc,(File) newFile("C://seleniumwebdriver.png"));
		  }
		  catch (Exception e)
		  {
		  e.printStackTrace();  
			  
		  }
		
		
	}

	private static Object newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
