package utilities.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waithelper {

	public WebDriver driver;
	
	public Waithelper(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Waitforelement(WebElement element,long timeOutInSecond)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeOutInSecond);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
