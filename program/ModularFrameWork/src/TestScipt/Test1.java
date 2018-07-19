package TestScipt;

import org.testng.annotations.Test;

public class Test1 extends Root
{
	@Test
	public void verifyAdmin() throws InterruptedException
	{
	org.openApp();
	org.loginApp();
	Thread.sleep(3000);
	org.logoutApp();
	org.closeApp();
	}
	//run test suite not tes1,test2,orangHrm and create tessuitfile without any extension meanse like testsuit not testsuit.xml

}
