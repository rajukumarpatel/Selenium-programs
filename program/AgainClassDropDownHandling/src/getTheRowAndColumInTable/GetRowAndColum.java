package getTheRowAndColumInTable;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GetRowAndColum
{
	@Test
	public void getRowAnColumn()
	{
		WebDriver driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		  
		 driver.findElement(By.xpath(".//*[@id='txtUsername']")).sendKeys("Admin");
		 driver.findElement(By.xpath(".//*[@id='txtPassword']")).sendKeys("admin");
		 driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		WebElement wb=  driver.findElement(By.xpath(".//*[@id='menu_pim_viewPimModule']"));
		  
		  Actions actions=new Actions(driver);
		    
		    actions.moveToElement(wb).perform();
		    
		    driver.findElement(By.xpath(".//*[@id='menu_pim_viewEmployeeList']")).click();
		WebElement table=driver.findElement(By.xpath(".//*[@id='resultTable']"));
		    
		
		  java.util.List<WebElement> row=table.findElements(By.tagName("tr"));
		  
		  System.out.println("Number of row"+row.size());
		     for (int i = 1; i <row.size(); i++) 
		     {
		   java.util.List<WebElement> colum=row.get(i).findElements(By.tagName("td"));
		       for (int j = 0; j <colum.size(); j++)
		       {   
		    	   
		    	   String s=colum.get(j).getText();
		    	   System.out.println(s);
				
			   }
				     
		       System.out.println("Number of colum"+colum.size());
			}

	    	  
	    	  
		         
		        // driver.close();
				
			}
		    
	}


