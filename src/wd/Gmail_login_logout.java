package wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_login_logout {
	
	public WebDriver  driver ;
	
	public void openUrl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
	}
		
	public void verifylogin()throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("harmanmaan707");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("131390005743m");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		Thread.sleep(3000);
		
	}
	
	public void verifylogout() {
		driver.findElement(By.cssSelector("span.gb_8a gbii")).click();
		driver.findElement(By.linkText("Sign out")).click();
		
		
	}
		
	

	public static void main(String[] args)throws Exception {
		Gmail_login_logout g=new Gmail_login_logout();
		g.openUrl();
		g.verifylogin();
		g.verifylogout();
	}
    
}		
	