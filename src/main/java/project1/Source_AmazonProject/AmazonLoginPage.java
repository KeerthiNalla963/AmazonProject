package project1.Source_AmazonProject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AmazonLoginPage 
{
	WebDriver driver;
	//step 1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;

	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="auth-signin-button")
	WebElement clickonsignin;
	
	//step 2
	public void un()
	{
		username.sendKeys("kaimallai7@gmail.com");		
	}
	public void cb()
	{
		continue_button.click();
	}
	public void pswd()
	{
																																		password.sendKeys("njayasheela7");		
	}
	public void signin()
	{
		clickonsignin.click();
		//Assertion a1=new Assertion();
		//SoftAssert s1=new SoftAssert();
		
		//s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Tittle is not matching");

	}
	
	//step 3
	public AmazonLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
