package wd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Launchbrowsers {

	public WebDriver driver;
	
	public void ff() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://passagetoindiaaz.com");
		
		
		
	}
		
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://passagetoindiaaz.com");
		driver.manage().window().maximize();
		
		
	}	
		
	public void ie() {
		System.setProperty("webdriver.ie.driver", "C:\\Library\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://gmail.com");
		
	}	
   
	public void opera() {
		System.setProperty("webdriver.opera.driver", "C:\\Library\\operadriver.exe");
        driver=new OperaDriver();
		driver.get("https://gmail.com");
		
	}
	public static void main(String[] args) {
		
		Launchbrowsers b=new Launchbrowsers();
		b.ff();
		b.chrome();
		b.ie();
		//b.opera();

	}

}
