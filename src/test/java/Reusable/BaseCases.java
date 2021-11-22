package Reusable;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseCases extends Resource{
  
     
	
	
	//"webdriver.chrome.driver"
	
	
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", chromepath);
		driver=new FirefoxDriver();
		
		logger = Logger.getLogger("FrameeorkPractise");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	
    
	
	
	public void close()
	{
		driver.quit();
	}
	
}
