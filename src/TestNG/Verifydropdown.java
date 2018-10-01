package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Verifydropdown {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	 List<WebElement> str=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getOptions();
	 System.out.println(str.size());//print Number of values in list
	 
	 for(int i=0;i<str.size();i++)
		 	 
	 {
		 System.out.println(str.get(i).getText()); //print all values
		 		 
	 }
	 for(int i=0;i<str.size();i++)
	 	 
	 {
		 if(str.get(i).getText().equalsIgnoreCase("USD"))
		 System.out.println(str.get(i).getText()); //print value USD only
		 		 
	 }
	 for(int i=0;i<str.size();i++)
	 	 
	 {
		 if(!str.get(i).getText().equalsIgnoreCase("USD"))
		 System.out.println(str.get(i).getText()); //print all valuse except USD
		 		 
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
  }

}
