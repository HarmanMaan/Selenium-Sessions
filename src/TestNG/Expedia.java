package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class Expedia {
	WebDriver driver;
	
	String city = "Phoenix, Arizona";
	String checkinDate = "09/22/2018";
	String checkoutDate = "09/29/2018";
	
  @Test
  public void hotelbooking() throws InterruptedException {
	  
	  driver.findElement(By.id("tab-hotel-tab-hp")).click();
	  driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
      driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(city);
     // driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
      driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkinDate);
     // driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
      driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkoutDate);
	  driver.findElement(By.xpath("//*[@id=\"gcw-hotel-form-hp-hotel\"]/div[9]/label/button")).click();
	  
	 String conf= driver.findElement(By.xpath("//*[@id=\"hotelResultTitle\"]/h1")).getText();
	 System.out.println("CONFIRMATION :" + conf);
	 
	// WebDriverWait wd= new WebDriverWait(driver,30);
	// wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("star5-popular"))).click();;
	 
	 driver.findElement(By.cssSelector("input[id='star5'][name='star']")).click();
	 
	 driver.findElement(By.xpath("//*[@id=\"3416785\"]/div[2]/div/a")).click();
	 
	 ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(windows.get(1));
	 
	 driver.findElement(By.xpath("//*[@id=\"rooms-and-rates\"]/div/article/table/tbody[1]/tr/td[4]/div/form/div[1]/button")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = utilities.Driverfactory.openURL("chrome", "https://www.expedia.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
	  
	  
  }

}
