package bikash;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
	 WebDriver driver=new FirefoxDriver();
	     driver.get("http://tinypic.com/");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	     driver.findElement(By.xpath(".//*[@id='the_file']")).click();    
	       Thread.sleep(300);
	     Runtime.getRuntime().exec("C:\\Users\\rajusingh\\Desktop\\UploadingFile.exe");
	     
	}

}
