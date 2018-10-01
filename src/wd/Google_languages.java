package wd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_languages {
	
	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
	}
    
	public void hindi() throws Exception{
		driver.findElement(By.id("lst-ib")).sendKeys("hindi");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/h1/a/img")).click();
		
	}
	
	public void telugu() throws Exception {
		driver.findElement(By.id("lst-ib")).sendKeys("telugu");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/h1/a/img")).click();
		
	}
	
	public void bengali() throws Exception {
		driver.findElement(By.id("lst-ib")).sendKeys("bengali");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/h1/a/img")).click();
	}
	
	
	public static void main(String[] args) throws Exception {
		Google_languages l=new Google_languages();
		l.openurl();
		l.hindi();
		l.telugu();
		l.bengali();
		

	}

}
