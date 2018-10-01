package Practice;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Passage_to_India {
	WebDriver driver;
	
	@Test
	public void random() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu-item-772\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu-item-773\"]/a")).click();
		driver.findElement(By.linkText("North Indian style Biryani")).click();
		driver.findElement(By.linkText("Lamb (boneless) Biryani")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"post-144\"]/header/h1/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("Lunch")).click();
        String heading= driver.findElement(By.xpath("//*[@id=\"post-269\"]/header/h1")).getText();
        assertEquals("Lunch", heading);
        String Title= driver.getTitle();
        assertEquals("Lunch – Passage to India", Title);
        String URL= driver.getCurrentUrl();
        assertEquals("https://passagetoindiaaz.com/lunch/", URL);
       
	}
	@Parameters("browser")
	@BeforeTest
	public void url(String browser) {
		
		if (browser.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\Library\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", "C:\\Library\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {

			System.setProperty("webdriver.opera.driver", "C:\\Library\\operadriver.exe");

		}
		driver.get("https://passagetoindiaaz.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	

}
