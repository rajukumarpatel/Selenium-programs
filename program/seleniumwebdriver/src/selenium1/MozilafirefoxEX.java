package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class MozilafirefoxEX {

	public static void main(String[] args)
	{
		//WebDriver driver=new  FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajusingh\\Desktop\\jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com");
		   //driver.close();
		
		 driver.manage().window().maximize();
	driver.findElement(By.tagName("label")).sendKeys("rajukumarpatel669@gmail.com");
	driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("nirmalaraju");
	driver.findElement(By.xpath(".//*[@id='u_0_k']")).sendKeys("raju");
	driver.findElement(By.xpath(".//*[@id='u_0_m']")).sendKeys("patel");
	driver.findElement(By.xpath(".//*[@id='u_0_p']")).sendKeys("8656476576");
	driver.findElement(By.xpath(".//*[@id='u_0_w']")).sendKeys("patel123");
	driver.findElement(By.xpath(".//*[@id='day']")).click();
	driver.findElement(By.xpath(".//*[@id='month']")).click();
	driver.findElement(By.xpath(".//*[@id='year']")).click();
	driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
	driver.findElement(By.xpath(".//*[@id='u_0_b']")).click();
	driver.findElement(By.xpath(".//*[@id='u_0_12']")).click();
         

	}

}
