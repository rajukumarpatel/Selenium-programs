package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class TC_ResetOFNewbranch extends RootTest
{
	AppFunc ap=new AppFunc(gf);
	 
	 @Test
	 public void ResetOFNewbranch() throws FileNotFoundException, IOException 
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 ap.ResetOFNewbranch("Dolara", "karma","karma2","karma1","allahabad");
		 ap.Logout();
		gf.closeBrowser();
		 
	 
}

}
