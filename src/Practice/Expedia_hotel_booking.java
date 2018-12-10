package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.Driverfactory;

public class Expedia_hotel_booking {
	WebDriver driver;
	
	@Test
	public void hotel() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("Phoenix, Arizona");
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys("10/25/2018");
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys("10/29/2018");
		driver.findElement(By.id("traveler-selector-hp-hotel")).click();
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/div/div/a/span[3]")).click();
		driver.findElement(By.partialLinkText("Search")).click();
		
	}
	
	@BeforeTest 
	public void beforetest() {
		driver = Driverfactory.openURL("chrome", "https://www.expedia.com");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	

}
