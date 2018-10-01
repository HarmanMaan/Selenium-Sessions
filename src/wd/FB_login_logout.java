package wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB_login_logout {
	
	public WebDriver driver;
	
	public void openural() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		
	}
	
	public void fblogin() throws Exception {
		driver.findElement(By.id("email")).sendKeys("jatt.alone@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("princemaan");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		
		
	}
	
	public void fblogout() {
		driver.findElement(By.id("userNavigationLabel")).click();
		driver.findElement(By.cssSelector("span._54nh")).click();
		
		
	}

	public static void main(String[] args) throws Exception {
		FB_login_logout f=new FB_login_logout();
		f.openural();
		f.fblogin();
        f.fblogout();   
	}

}
