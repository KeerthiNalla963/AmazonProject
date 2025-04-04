package project1.Source_AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	@FindBy(xpath="//div[@id='nav-cart-count-container']")
	WebElement cart;
	
	@FindBy(xpath="//span[@class='a-icon a-icon-small-remove']")
	WebElement removefrmcart;
	
	public void cart_click()
	{
		cart.click();
	}
	public void removefrmcart_click()
	{
		removefrmcart.click();
	}
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
