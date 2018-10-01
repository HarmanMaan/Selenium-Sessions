package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driverfactory {

	 static WebDriver driver;

	public static WebDriver openURL(String browser, String url) {

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
		driver.manage().window().maximize();
		driver.get(url);

		return driver;

	}

}
