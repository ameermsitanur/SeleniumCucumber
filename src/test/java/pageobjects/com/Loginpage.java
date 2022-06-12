package pageobjects.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.com.Waithelper;

public class Loginpage {

	public WebDriver ldriver;
    Waithelper waithelper;
	
	public Loginpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper=new Waithelper(rdriver);
	
	}
	
	@FindBy(name="Email")
	WebElement txtemail;
	
	@FindBy(name="Password")
	WebElement txtpassword;
	
	@FindBy(xpath="//button[@class='button-1 login-button']")
	WebElement loginbtn;
	
	@FindBy(linkText="Logout")
	WebElement logoutbtn;
	
	public void setusername(String username)
	{
	waithelper.Waitforelement(txtemail, 30);
	txtemail.clear();
	txtemail.sendKeys(username);
	}
	public void setpwd(String pwd)
	{
	waithelper.Waitforelement(txtpassword, 30);
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
	}
	public void clickloginbtn() {
		waithelper.Waitforelement(loginbtn, 30);
		loginbtn.click();
	}
	public void clicklogoutbtn()
	{
		waithelper.Waitforelement(logoutbtn, 30);
		logoutbtn.click();
	}
}



