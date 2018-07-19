package junitprogram;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitDemo
{
	@BeforeClass
	
	public static void m1()
	{
System.out.println(" Before class firstime and one time executed ");
		
	}	
	 
	@AfterClass
	 public static void m2()
	  {
       System.out.println(" Afterclass last and one time executed ");
		}	
	
	   @Before
	   public void before()
	   {
        System.out.println(" before  executed");  
		   
	   }
	   
	   @After
	   
	   public void After()
	   {
		   System.out.println(" after  executed");
		   
	   }
	   
	   
      @Test
	 public  void m()
      {
    	  System.out.println(" Bedforeclass Main point executed ");  
      }
      
      
      
      
}
