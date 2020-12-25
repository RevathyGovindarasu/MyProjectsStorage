package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Configuration.ConfigurationReader;
import pages.SetUp;
@Listeners(pages.ListenerTest.class)
public class TestCase1 {

	
	 public static ConfigurationReader conf = new ConfigurationReader();
/*		public static WebDriver driver;
	 @BeforeSuite
	  public void beforeSuite() {
	  	  System.out.println("Starting the browser session");
	  	 System.setProperty("webdriver.chrome.driver", conf.getDriverPath());
	  	 
		  	//Setting the driver to chrome driver
		  	  driver = new ChromeDriver();
		  	  String url = "https://www.google.com";
		  	  driver.get(url);
	  }
	 
	  @AfterSuite
	  public void afterSuite() {
	  	  System.out.println("Closing the browser session");
	  	  driver.quit();
	  }
	  */
  @Test(priority=1)
  public void getURL() {
     String text = SetUp.driver.getCurrentUrl();
     System.out.println(text);
 }
  @Test(priority=3)
  public void getText()
  {
	  String tex = SetUp.driver.findElement(By.xpath("//*[@id=\"prm\"]/div/a")).getText();
	  System.out.println(tex);
	  Reporter.log("Retrieved text");
	  
  }
  
  @Test(priority=2)
  public void getTitle()
  {
	  String tex = SetUp.driver.getTitle();
	  System.out.println(tex);
	  String Expectedtitle = "Google";
	  Assert.assertEquals(tex, Expectedtitle);
	  Reporter.log("retrieved title", true);
  }

  @BeforeMethod
  public void beforeMethod() {
	  SetUp.setUpBrowser();
  	  System.out.println("test case 1 starts......");
  }
 
  @AfterMethod
  public void afterMethod() {
	  SetUp.tearDown();
  	  System.out.println("Test case 1 ends.....");
  	 // driver.quit();
  }
}
