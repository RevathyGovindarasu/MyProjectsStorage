package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Configuration.ConfigurationReader;

public class SetUp {
	public static ConfigurationReader conf = new ConfigurationReader();
	public static WebDriver driver;
  @BeforeSuite
  public static void setUpBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", conf.getDriverPath());
	  	 
	  	//Setting the driver to chrome driver
	  	  driver = new ChromeDriver();
	  	  String url = "https://www.google.com";
	  	  driver.get(url);
      driver.manage().window().maximize();
      
  }
  
  @AfterSuite
  public static void tearDown()
  {
	  driver.quit();
  }
}
