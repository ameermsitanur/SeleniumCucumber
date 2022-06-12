package pageobjects.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchcustomer {

	
	public WebDriver ldriver;
	
	public Searchcustomer(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="SearchEmail")
	WebElement searchemail;
	
	@FindBy(id="search-customers")
	WebElement searchbtn;
	
	public void searhemail(String email)
	{
		searchemail.clear();
		searchemail.sendKeys(email);
	}
	public void clicksearchbtn()
	{
		searchbtn.click();
	}
}
