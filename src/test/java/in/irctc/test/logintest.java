package in.irctc.test;









import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.tneb.base.tnebbase;
import org.tneb.pages.homepage;
import org.tneb.pages.loginpage;

public class logintest extends tnebbase {
	@Test
	public void login()
	{
		loginpage lp = new loginpage();
		/*String accountName = lp.login();
		String expectedaccountName="Welcome adharsh,";
		//Assert.assertEquals(accountName, expectedaccountName, "The username is wrong or not displayed in the landing page");
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(accountName, expectedaccountName, "The username is wrong or not displayed in the landing page");
		homepage hp = new homepage();
		hp.logout();
		softassert.assertAll();*/
		lp.login();
	    lp.my();
	}
	
	/*@Test(priority = 1)
	public void logout()
	{
		driver.quit();
	}
	@Test
	public void urllinkvalidation()
	{
		loginpage lp = new loginpage();
		int xx = lp.loginlinks();
		System.out.println(xx);
	}*/
	

}
