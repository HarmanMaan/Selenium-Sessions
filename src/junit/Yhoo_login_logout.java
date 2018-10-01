package junit;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Yhoo_login_logout {
	
	public WebDriver driver;

	@BeforeEach   //precondition
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
	}

	@AfterEach  //postcondition
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test   //test scenario
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
    @Ignore
	@Test 
	public void verifylogout()  {
		 driver.findElement(By.xpath("/html/body/header/div/div[3]/div[1]/div/label")).click();
		 driver.findElement(By.cssSelector("span._yb_h4qoe._yb_f5mej._yb_17auo")).click();

	}

}
