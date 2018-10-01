package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class iformation_commands {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  String str=driver.findElement(By.cssSelector("a.gb_P")).getText();//link name text
	  System.out.println(str);
	  
	  String str0=driver.findElement(By.linkText("Gmail")).getText();//link name text
	  System.out.println(str0);
	  
	  String str1=driver.findElement(By.name("btnK")).getAttribute("aria-label");//button text
	  System.out.println(str1);
	  
	 /* driver.findElement(By.id("lst-ib")).sendKeys("hi");
	  driver.findElement(By.name("btnK")).click();
      String str2=driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/div[1]/div[1]/h1/a/img")).getAttribute("alt");//tool tip
	  System.out.println(str2);*/
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  
  }

}
