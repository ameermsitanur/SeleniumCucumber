package stepdefinitions.com;






import java.util.Properties;

import org.openqa.selenium.WebDriver;


import pageobjects.com.Addcustomer;
import pageobjects.com.Loginpage;
import pageobjects.com.Searchcustomer;
import utilities.com.Waithelper;

public class Baseclass {

	public WebDriver driver;
	public Loginpage lp;
	public Addcustomer add;
	public Searchcustomer scus;
	//public static Logger logger;
	public Properties prop;
	public Waithelper wait;
	
	
}
