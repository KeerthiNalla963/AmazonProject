package project1.Source_AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmzHomePage 
{
	WebDriver driver;
	//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement  accountsnadlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement  signin;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchproduct;
	
	@FindBy(xpath="(//a[.='Your Account'])[1]")
	WebElement youraccount;
	
	@FindBy(xpath="(//h2[@class='a-spacing-none ya-card__heading--rich a-text-normal'])[4]")
	WebElement click_youraddress;

	
	@FindBy(xpath="//div[@id='ya-myab-plus-address-icon']")
	WebElement add_address;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullname;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement mobileno;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pincode;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement addrline1;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine2']")
	WebElement addrline2;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-landmark']")
	WebElement landmark;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement town;
	
	@FindBy(xpath="//select[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId']")
	WebElement state;
	
	
	@FindBy(xpath="//span[@id='address-ui-widgets-form-submit-button']")
	WebElement useadd;

	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[4]")
	WebElement youraddress;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[3]")
	WebElement updateaddress;
	
	
	
	
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	
	
	//step 2
	public void hoveroveronAccountandList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsnadlist).perform();		
	}
	
	public void signin_click()
	{
		signin.click();
	}
	
	public void searchproduct()
	{
		searchproduct.sendKeys("Shoe"+Keys.ENTER);
	}
	public void youraccount_click()
	{
		youraccount.click();
	}
	public void youraddress_click()
	{
		youraddress.click();
	}

	public void clickonaddAddr()
	{
		add_address.click();
	}
	public void enterfullname()
	{
		fullname.sendKeys("Jayakar Jyothi");
	}
	public void entermobilno()
	{
		mobileno.sendKeys("9493405017");
	}
	
	public void enterpincode()
	{
	pincode.sendKeys("800012");
	
	}
	
	public void addrline01()
	{
		addrline1.sendKeys("Pratima sadan, Chitrakut nagar");
	}
	
	public void addrline02()
	{
		addrline2.sendKeys("Khagri road, , Danapur, Patna"); 
	}
	public void landmarkhome()
	{
		landmark.sendKeys("The Rock Fast Food Restaurant"); 
	}
	
	public void townhome()
	{
		
		town.sendKeys("Patna"); 
	}
	
	public void statehome()
	{
		 
		Select s1=new Select(state);
		s1.selectByVisibleText("BIHAR");
	}

//	public void youraddress_click()
//	{
//		youraddress.click();
//	}
//	public void editaddress_click()
//	{
//		editaddress.click();
//	}
//	
//	public void addnewpincode_click()
//	{
//		addnewpincode.clear();
//		addnewpincode.sendKeys("500055");
//	}
//	public void addnewname_click()
//	{
//		addnewname.clear();
//		addnewname.sendKeys("Jayakar Jyothi");
//	}
	public void updateaddress_click()
	{
		updateaddress.click();
	}
	
	public void signout_click()
	{
		signout.click();
	}
	
	//step 3
	public AmzHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
