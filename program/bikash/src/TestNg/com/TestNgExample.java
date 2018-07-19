package TestNg.com;

import org.apache.log4j.Priority;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExample 
{
   @BeforeClass
    public void beforeclassex()
    {
	 System.out.println("before class method ");
    }
   
      
   @AfterClass
    public void afterclassex()
    {
	   System.out.println("afterclass method");
    }
   
   @BeforeMethod
   public void beforemethod()
   {
   	System.out.println("before method");
   }

   @AfterMethod
   public void aftermethod()
   {
	   System.out.println("aftermethod ");
   }
   
    @Test(priority=3 , enabled=true)
    public void testmethod1()
    {
    	System.out.println(" testmethod1 ");
    	Reporter.log("Logic for testmethod1 ");
    }
    
    @Test(priority=2)
    public void testmethod2()
    {
    	System.out.println(" testmethod2 ");
    	Reporter.log("Logic for testmethod2 ");
    }
   
    @Test(priority=1)
    public void testmethod3()
    {
    	System.out.println(" testmethod3 ");
     Reporter.log("Logic for testmethod3");

    }
    
     @BeforeTest
     public void beforetestmethod()
     {
    	 System.out.println("beforetestmethod");
     }
     
     @AfterTest
     public void aftertestmethod()
     {
    	 System.out.println("aftertestmethod");
     }
}
                                     