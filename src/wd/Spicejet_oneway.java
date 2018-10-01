package wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet_oneway {
	
	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();		
		driver.get("http://spicejet.com/");
		
	}
	
	public void round_trip()throws Exception {
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.linkText("Chennai (MAA)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date2\"]")).click();
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		driver.findElement(By.id("hrefIncInf")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("INR");
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

		
		
	}
	public void modifysearch()throws Exception {
		driver.findElement(By.cssSelector("span.trip-expand")).click();
		new Select(driver.findElement(By.id("AvailabilitySearchInputSelectVieworiginStation1"))).selectByVisibleText("Agartala (IXA)");
		driver.findElement(By.xpath("//*[@id=\"custom_date_picker_2\"]")).click();
		driver.findElement(By.linkText("31")).click();
		driver.findElement(By.name("AvailabilitySearchInputSelectView$ButtonSubmit")).click();	
		
	}
	

	public static void main(String[] args) throws Exception{
		Spicejet_oneway s=new Spicejet_oneway();
		s.openurl();
		s.round_trip();
		s.modifysearch();

	}

}
