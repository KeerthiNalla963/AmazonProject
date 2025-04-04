package project1.Source_AmazonProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchResultPage 
{
	WebDriver driver;
	//step 1
	
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement selectproduct;
	
	
	//step 2
	public void selectoneproduct(WebDriver driver)
	{
		
		
		selectproduct.click();
		Set<String> parentchildid=driver.getWindowHandles();
	 	Iterator<String> i2=parentchildid.iterator();
		String parentid=i2.next();
		String childid=i2.next();
		driver.switchTo().window(childid);
		
//		Set<String> parentchildid=driver.getWindowHandles();
//		Iterator<String> i2=parentchildid.iterator();
//		String childid=i2.next();
//		driver.switchTo().window(childid);
	}
	
	
	//step 3
	public AmazonSearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
