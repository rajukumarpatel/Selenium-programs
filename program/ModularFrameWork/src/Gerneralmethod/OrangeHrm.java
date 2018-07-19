package Gerneralmethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm 
{
static WebDriver driver;
Action actions;

public void openApp()

{ 
	driver = new FirefoxDriver();
	driver.navigate().to("http://opensource.demo.orangehrmlive.com/");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	String ttl = driver.getTitle();
	if(ttl.equals("OrangeHRM"))
	{
		System.out.println("OrangeHRM");
		
	}
}
	public void closeApp()
	{
		driver.close();
		driver.quit();
	}
	public void loginApp() 
	{
		WebElement objFn = driver.findElement(By.xpath(".//*[@id='txtUsername']"));
		WebElement objpwd = driver.findElement(By.xpath(".//*[@id='txtPassword']"));
		WebElement oblog =driver.findElement(By.xpath(".//*[@id='btnLogin']"));
		if(objFn.isDisplayed()&objpwd.isDisplayed()&oblog.isEnabled())
		{
			System.out.println("username field is displayed");
			System.out.println("Password field is displayed");
			System.out.println("login button is displayed");
		}	
		objFn.sendKeys("Admin");
		objpwd.sendKeys("admin");
		oblog.click();
		String ttl = driver.getTitle();
		if(ttl.equals("OrangeHRM"))
		{
			System.out.println(ttl+"you are in home page");
		}
		String  wlc = driver.findElement(By.xpath(".//*[@id='welcome']")).getText();
		if (wlc.equals("Welcome Admin"))
		{
			System.out.println(wlc+"Is displayed");
			
		}
	}
		
	public void AddEmp() throws Exception
	{
		WebElement pi = driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']"));
		Actions act = new Actions(driver);
		act.moveToElement(pi).perform();
		String Fn = "salman";
		String ln = "hooda";
		driver.findElement(By.xpath(".//*[@id='menu_pim_addEmployee']")).click();
		driver.findElement(By.xpath(".//*[@id='firstName']")).sendKeys(Fn);
		driver.findElement(By.xpath(".//*[@id='lastName']")).sendKeys(ln);
				
		driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		//AUTOIT
		Runtime.getRuntime().exec("C:\\Users\\rajusingh\\Desktop\\UploadingFile.exe");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='btnSave']")).click();
		 pi = driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']"));
		Actions actq = new Actions(driver);
		actq.moveToElement(pi).perform();
		driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
		
		
	}
	
	public void logoutApp()
	{
		// logout from page
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		driver.findElement(By.linkText("Logout")).click();
		{
		System.out.println("logout succesfully");
			}
	}
		public void viewemp(String ln)
		{
			WebElement tbl = driver.findElement(By.xpath(".//*[@id='resultTable']"));
			List<WebElement> td = tbl.findElements(By.tagName("tr"));
			for (int i = 0; i < td.size(); i++) 
			{
				String Lastname = driver.findElement(By.xpath(".//*[@id='resultTable']/thead/tr["+i+"]/th[4]")).getText();
				if (Lastname.equals(ln));
				{
					System.out.println(ln+ " is display at " +i+ "row");
					break;
				}
			}
			}
		
	}
