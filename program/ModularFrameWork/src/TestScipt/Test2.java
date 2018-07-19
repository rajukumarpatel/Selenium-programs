package TestScipt;

import org.testng.annotations.Test;

public class Test2 extends Root
{
	@Test
	public void Addemp() throws Exception
	{
		org.openApp();
		org.loginApp();
		org.AddEmp();
		org.logoutApp();
		org.closeApp();
	}

}
