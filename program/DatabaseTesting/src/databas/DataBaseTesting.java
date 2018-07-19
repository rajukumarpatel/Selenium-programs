package databas;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
public class DataBaseTesting
{ 
	public static  Connection con;
	public static Statement st;
	WebDriver driver;
	String un,pwd;
      @Test
     public void Tc1() throws ClassNotFoundException, SQLException
     {
	     Class.forName("com.mysql.jdbc.Driver");
	     
	     con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");         
		
	     System.out.println(con);
	     

       st=(Statement) con.createStatement();
        
       String st1="insert into login values('opensourcecms','opensourcecms')";
         st.executeUpdate(st1);
         
         String se="select * from login";
         ResultSet s = st.executeQuery(se);
         
          while (s.next())
          {
          System.out.println(s.getString(1)+"\t"+s.getString(2));
			         un=s.getString(1);
			         pwd=s.getString(2);
			 
			    driver=new FirefoxDriver();
			    driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
			    driver.findElement(By.name("txtUsername")).sendKeys(un);
			    driver.findElement(By.name("txtPassword")).sendKeys(pwd);
			    driver.findElement(By.name("Submit")).click();
			    
			    driver.close();
			 
			     
			 }
         
        
        
        
      
        
        
}
      
}
