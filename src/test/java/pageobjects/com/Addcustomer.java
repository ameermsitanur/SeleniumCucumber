package pageobjects.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.com.Waithelper;

public class Addcustomer {

	 public WebDriver ldriver;
	 Waithelper waithelper;
	  public Addcustomer(WebDriver rdriver)
	  {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 waithelper=new Waithelper(rdriver);
	  }
	  
	
	@FindBy(xpath="//a[@class='nav-link']")
	  WebElement linkcustomer;
	  
	  @FindBy(xpath="//li[@class='nav-item']")
	  WebElement customermenu;
	  
	  @FindBy(xpath="//a[@class='btn btn-primary']")
	  WebElement addnewcustomer; 
	  
	  @FindBy(id="Email")
	  WebElement email; 
	  
	  @FindBy(id="Password")
	  WebElement password; 
	  
	  
	  @FindBy(id="FirstName")
	  WebElement firstname;
	  
	  @FindBy(id="LastName")
	  WebElement lastname;
	  
	  
	  @FindBy(id="Gender_Male")
	  WebElement gender;
	  
	 @FindBy(name="save")
	 WebElement savebtn; 
	
	 public void clickcustomerlink()
	 {
		 waithelper.Waitforelement(linkcustomer, 30);
		 linkcustomer.click();	 
	 }
	public void clickcustomermenu()
	{
		customermenu.click();
	}
	 public void clickaddnewcustomer()
	 {
		 addnewcustomer.click();
	 }
	  public void setemail(String Email)
	  {
		  email.sendKeys(Email); 
	  }
	  public void setpassword(String pwd)
	  {
		  password.sendKeys(pwd);
	  }
	  public void setfirstname(String fn)
	  {
		  firstname.sendKeys(fn);
	  }
	  public void setlastname(String ln)
	  {
		  lastname.sendKeys(ln);
	  }
	  public void selgender()
	  {
		  gender.click();
	  }
	  public void clicksavebtn()
	  {
		  savebtn.click();
	  }
}
