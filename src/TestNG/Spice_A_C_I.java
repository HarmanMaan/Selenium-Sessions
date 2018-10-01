package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Spice_A_C_I {
	public WebDriver driver;
  @Test
  public void f1() throws Exception {
	  driver.get("http://spicejet.com/");
	  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Chennai (MAA)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
		driver.findElement(By.linkText("28")).click();
		
		}
  @Test
  public void f2() throws Exception {
	  driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	  
  }
  
  /*ONLY ELIGLIBLE IN DROP DOWN By declaring variables in the main method see Ex. in WD pics (multiple spicejet)
   
   @Test
  public void f() throws Exception {
	  driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	  
  }
  @Test
  public void t3() throws Exception {
	  driver.findElement(By.id("divpaxinfo")).click();
	  new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
	  driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		  }*/

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();		
		driver.get("http://spicejet.com/");
  }

}
