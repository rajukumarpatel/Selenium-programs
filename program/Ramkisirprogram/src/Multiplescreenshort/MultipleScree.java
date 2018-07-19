package Multiplescreenshort;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleScree {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://mercurytravels.co.in");
   
		 File src=driver.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src,new File("C:/Users/rajusingh/Desktop/screenshot/raju.png"));     
	     System.out.println("successful");
		 
	     
		        

	}

}
