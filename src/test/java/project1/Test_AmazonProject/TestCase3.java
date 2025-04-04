package project1.Test_AmazonProject;

import org.testng.annotations.Test;

import project1.Source_AmazonProject.AmazonLoginPage;
import project1.Source_AmazonProject.AmzHomePage;

public class TestCase3 extends LaunchQuit
{
	@Test
	public void Launch_search_wishlist_removingfromcart_logout() throws InterruptedException
	{
		AmzHomePage homepage =new AmzHomePage(driver);
		homepage.hoveroveronAccountandList(driver);
		homepage.signin_click();
		
		AmazonLoginPage login=new AmazonLoginPage(driver);
		login.un();
		login.cb();
		login.pswd();
		login.signin();
		
		homepage.searchproduct();
		
		
		homepage.hoveroveronAccountandList(driver);
		homepage.youraccount_click();
		homepage.youraddress_click();
		homepage.clickonaddAddr();
		homepage.enterfullname();
		homepage.entermobilno();
		homepage.enterpincode();
		homepage.addrline01();
		homepage.addrline02();
		homepage.landmarkhome();
		homepage.townhome();
		homepage.statehome();
		


		homepage.updateaddress_click();
		
		Thread.sleep(5000);

		
		homepage.hoveroveronAccountandList(driver);
		homepage.signout_click();
		
	}

}
