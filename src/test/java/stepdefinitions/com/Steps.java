package stepdefinitions.com;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import junit.framework.Assert;
import pageobjects.com.Addcustomer;
import pageobjects.com.Loginpage;
import pageobjects.com.Searchcustomer;


@SuppressWarnings("deprecation")
public class Steps extends Baseclass {
	@Before
	public void setup() throws Throwable
	{
		prop=new Properties();
		FileInputStream finput=new FileInputStream("Config.properties");
		prop.load(finput);
		
		String br=prop.getProperty("browser");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
		 driver=new ChromeDriver();
		}
		 else if(br.equals("firefox")) 
		 {
		System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxpath"));
		driver=new FirefoxDriver();
		}
		 else if(br.equals("edge"))
		 {
		System.setProperty("webdriver.edge.driver", prop.getProperty("edgepath"));
		driver=new EdgeDriver();
			
		 }
	}
	
     
	

	@Given("user lunch chrome browser")
	public void user_lunch_chrome_browser() {
		//logger=Logger.getLogger("nopCommerce");
		
	 
	 lp=new Loginpage(driver);
	   
	 
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) {
	  driver.get(url);  
	  driver.manage().window().maximize();
	}

	@When("uesr enter email as {string} and password as {string}")
	public void uesr_enter_email_as_and_password_as(String email, String password) {
	  lp.setusername(email);
	  lp.setpwd(password);
	 // driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}

	@When("click on login")
	public void click_on_login() throws InterruptedException {
	  lp.clickloginbtn(); 
	  Thread.sleep(20000);
	}
	@Then("page tittle should be {string}")
	public void page_tittle_should_be(String tittle) {
	  Assert.assertEquals(tittle,driver.getTitle());  
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	    lp.clicklogoutbtn();
	    Thread.sleep(6000);
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	
	//add new customer
	
	  
		
	@Then("user can view a Dashboard")
	public void user_can_view_a_Dashboard() throws InterruptedException {
		add=new Addcustomer(driver); 
		Assert.assertEquals("Dashboard / nopCommerce administration",driver.getTitle());
		Thread.sleep(4000);
	}

	@When("click on customer menu")
	public void click_on_customer_menu() throws InterruptedException {
	    add.clickcustomerlink();
	    Thread.sleep(4000);
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException {
	   add.clickcustomermenu();
	   Thread.sleep(4000);
	}

	@When("click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
	    add.clickaddnewcustomer();
	    Thread.sleep(4000);
	}

	@Then("user can view and add a new customer page")
	public void user_can_view_and_add_a_new_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() {
	    add.setemail("admin111@yourstore.com");
	    add.setpassword("admin111");
	    add.setfirstname("amir");
	    add.setlastname("sitanur");
	    add.selgender();
	    
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	   add.clicksavebtn();
	   Thread.sleep(4000);
	}
 
	@When("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertEquals(msg,driver.getTitle());
	}

	//search customer by email
	
	
	@When("enter customer email")
	public void enter_customer_email() {
	 scus=new Searchcustomer(driver);
	 scus.searhemail("admin@yourstore.com");
	}

	@When("click on search button")
	public void click_on_search_button() {
	  scus.clicksearchbtn(); 
	}

	@Then("user should found email in the search table")
	public void user_should_found_email_in_the_search_table() {
	    Assert.assertTrue(driver.findElement(By.xpath("//*[@id='customers-grid']/tbody/tr/td[2]")).getText().contains("admin@yourstore.com"));
	}




}
