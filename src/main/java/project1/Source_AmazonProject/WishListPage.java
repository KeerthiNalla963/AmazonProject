package project1.Source_AmazonProject;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage 
{
	WebDriver driver;
	@FindBy(xpath="(//span[@data-action='add-wishlist-declarative'])[1]")
	WebElement addwishlist;
	
	@FindBy(xpath="//span[@id='huc-view-your-list-button']")
	//@FindBy(linkText="View Your List")
	WebElement viewyourlist;
	
	@FindBy(xpath="(//span[@class='a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart'])[1]")
	WebElement addtocart;
	
	//@FindBy(xpath="(//span[@class='a-button a-button-base g-cart-view-btn ul-add-to-cart-response-fragment-bottom-section-buttons'])[1]")
	@FindBy(linkText="View Cart")
	WebElement viewcart;
	
	public void addingwishlist()
	{	
		addwishlist.click();
	}
	
	public void viewyourlist_click()
	{
	       
		viewyourlist.click();
	}
	
	public void addtocart_click()
	{
	       
		addtocart.click();
	}
	public void viewcart_click()
	{
	       
		viewcart.click();
	}
	public WishListPage(WebDriver driver)
	{
	       
		PageFactory.initElements(driver,this);
	}

}
