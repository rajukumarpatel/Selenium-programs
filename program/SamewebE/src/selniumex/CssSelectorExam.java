package selniumex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorExam {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "C:\\seleniumwebdriver\\chromedriver_win32\\chromedriver.exe");
    
    WebDriver driver=new FirefoxDriver();
      driver.get("https://www.google.com/gmail/about/");
      
      driver.findElement(By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in")).click();
      driver.findElement(By.cssSelector("#identifierId")).sendKeys("rajukumarpatel6669@gmail.com");
      driver.findElement(By.cssSelector("#identifierNext > content > span")).click();
      driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("123456789raju");
       
      driver.findElement(By.cssSelector("#passwordNext > content > span")).click();
	}

}
