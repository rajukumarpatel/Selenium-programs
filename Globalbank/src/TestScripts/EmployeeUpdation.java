package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class EmployeeUpdation extends RootTest
{

	 AppFunc ap=new AppFunc(gf);
	  @Test
	 public void NewEmoloyUpdation() throws FileNotFoundException, IOException, InterruptedException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		//ap.employeeUpdation("ramu","1234");
		  ap. employeeDeletion();
		 ap.Logout();
		 gf.closeBrowser();
		 
	 }
	  
	   
	 
}


