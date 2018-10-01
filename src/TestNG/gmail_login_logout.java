package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class gmail_login_logout {
	
  public WebDriver driver;
  
  @Test
  public void gmail_login() throws Exception {
	  driver.findElement(By.id("identifierId")).sendKeys("harmanmaan707");
	  driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	 /* Thread.sleep(3000);
	  driver.findElement(By.name("password")).sendKeys("010320181313m");
	  driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();*/
	  
  }
  
 
	  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://mail.google.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
