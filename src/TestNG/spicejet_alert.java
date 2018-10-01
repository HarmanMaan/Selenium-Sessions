package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class spicejet_alert {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Chennai (MAA)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
 
  } 
		
  @Test
  public void verifyalert() {
	  
     //switchto command and then gettext
	  
	   new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR"); 
	   driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	  

	 
    }

	  
  
  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();		
		driver.get("http://spicejet.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
	  
  }

}
