package project1.Test_AmazonProject;

import org.testng.annotations.Test;

import project1.Source_AmazonProject.AmazonLoginPage;
import project1.Source_AmazonProject.AmazonSearchResultPage;
import project1.Source_AmazonProject.AmzHomePage;
import project1.Source_AmazonProject.CartPage;
import project1.Source_AmazonProject.WishListPage;

public class TestCase2 extends LaunchQuit 
{
	@Test
	public void Launch_search_wishlist_removingfromcart_logout()
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
		
		AmazonSearchResultPage searchoneresult=new AmazonSearchResultPage(driver);
		searchoneresult.selectoneproduct(driver);
		
		
		WishListPage wishlist =new WishListPage(driver);
		wishlist.addingwishlist();
		wishlist.viewyourlist_click();

		
		CartPage cart=new CartPage(driver);
		cart.cart_click();
		cart.removefrmcart_click();
		
		homepage.hoveroveronAccountandList(driver);
		homepage.signout_click();
	}
}
