package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class yahoo_login_logout {
	
	public WebDriver driver;
	
  @Test  //test scenario
  public void verifylogin() throws Exception {
	  driver.findElement(By.id("uh-mail-link")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/p[2]/span[1]/label")).click();
	  driver.findElement(By.id("login-username")).sendKeys("peers_selenium");
	  driver.findElement(By.id("login-signin")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("login-passwd")).sendKeys("selenium123");
	  driver.findElement(By.id("login-signin")).click();
      
  }
  
  @Test 
  public void f() {
	  driver.findElement(By.xpath("/html/body/header/div/div[3]/div[1]/div/label/img")).click();
	  driver.findElement(By.cssSelector("span._yb_1vc19._yb_dwl31._yb_16o0a")).click();
	  
  }
  @BeforeTest //precondition
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
	  
  }

  @AfterTest  //postcondition
  public void afterTest() {
	 driver.quit();
	  
  }

}
