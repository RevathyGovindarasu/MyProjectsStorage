package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Configuration.ConfigurationReader;
import pages.SetUp;

public class TestCase2 {
	public static ConfigurationReader conf = new ConfigurationReader();
	
  @Test
  public void f() {
	  SetUp.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  SetUp.driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Love is in the air");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  SetUp.setUpBrowser();
  	  System.out.println("test case 2 starts......");
  }
 
  @AfterMethod
  public void afterMethod() {
	  SetUp.tearDown();
  	  System.out.println("Test case 2 ends.....");
  	 // driver.quit();
  }
}
