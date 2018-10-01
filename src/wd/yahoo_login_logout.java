package wd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo_login_logout {

	public WebDriver driver;

	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // for webpages 

		driver.get("https://yahoo.com");
		//driver.navigate().to("https://yahoo.com");
	}

	public void verifylogin() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // For all elements

		driver.findElement(By.id("uh-mail-link")).click();
		// Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/p[2]/span[1]/label")).click();
		driver.findElement(By.id("login-username")).sendKeys("peers_selenium");
		driver.findElement(By.id("login-signin")).sendKeys(Keys.ENTER); // Click by Keyboard

		// WebDriverWait w= new WebDriverWait(driver, 20); // For specific element
		// WebElement element=
		// w.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
		// element.sendKeys("selenium123");
		// driver.findElement(By.id("login-signin")).click();

		// Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("selenium123");
		driver.findElement(By.id("login-signin")).click();

		// JavaScriptExecutor js= ((JavaScriptExecutor)driver);

	}

	public void verifylogout() {
		driver.findElement(By.xpath("/html/body/header/div/div[3]/div[1]/div/label")).click();
		driver.findElement(By.cssSelector("span._yb_rrzf1._yb_m5dik._yb_1hd4i")).click();

	}

	public static void main(String[] args) throws Exception {
		yahoo_login_logout y = new yahoo_login_logout();
		y.openurl();
		y.verifylogin();
		y.verifylogout();

	}

}
