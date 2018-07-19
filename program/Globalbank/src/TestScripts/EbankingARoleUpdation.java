package TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import GlobalFunc.AppFunc;
import Utilities.Constants;

public class EbankingARoleUpdation extends RootTest
{
	 AppFunc ap=new AppFunc(gf);
	 
	 @Test
	 public void ebankingARoleUpdation() throws FileNotFoundException, IOException
	 {
		 gf.startBrowserFirefox("http://bank.uftselenium.com/");
		 
		 gf.maximixeBrowser();
		 ap.Loadpropfile();
		 ap.login(Constants.Uname,Constants.pword);
		 
		 ap.ebankingARoleUpdation("developer","softwaredevlopment");
		 
		  ap.Logout();
		  gf.closeBrowser();
	 }
	 

	}
