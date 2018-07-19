package Appmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.Constants;

public class Appfuncs
{
	static WebDriver wd;
	static FileInputStream fis;
	static Properties pr;
	
	public static String loadProperties(String path) throws IOException
	{  
		fis=new FileInputStream(path);
		pr=new Properties();
		
		pr.load(fis);
	
		return null;
		}
	
	public String openbrowser(String testobject,String testdata)
	{   
		try
		{
		wd=new FirefoxDriver();
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			return Constants.fail;
		}
		return Constants.pass;
		 
	     }

	public String openapp(String testobject,String testdata)
	{
		try{
		wd.get(testdata);	
		}	
		catch(Exception e)
		{
			e.printStackTrace();
			return Constants.fail;
		}
		return Constants.pass;
		}
	
	public String enterinput(String testobject,String testdata)
	{ try {
		
		WebElement el=wd.findElement(By.name(pr.getProperty(testobject)));
	    el.clear();
	    el.sendKeys(testdata);
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return Constants.fail;

	}
	return Constants.pass;
	}
	
	public String click(String testobject,String testdata)
	{ try{
		
		wd.findElement(By.name(pr.getProperty(testdata))).click();
	    wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
		return Constants.fail;

	}
	catch(Exception e)
	{
	 e.printStackTrace();
	 
	}
	return Constants.pass;
	
	}
	
	public String close(String testobject ,String testdata)
	{ try {
		
		wd.close();
		return Constants.fail;

	}
	
	catch(Exception e)
	{
		e.printStackTrace();

	}
	
	return Constants.pass;

		
	}
	
	}
	
