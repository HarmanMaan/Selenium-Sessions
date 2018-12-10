package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Ajax {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  String str;
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(5000);
	  str=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div")).getText();
	  System.out.println(str);
	  
	  String [] s=str.split("\n");
	  System.out.println(s.length);
	  
 for(int i=0;i<s.length;i++)
		  
	  {
		  if(s[i].equalsIgnoreCase("selenium tutorial"))
		  {
			  driver.findElement(By.name("q")).clear();
			  driver.findElement(By.name("q")).sendKeys(s[i]);
			  driver.findElement(By.cssSelector("input.lsb")).click();
		  }           	  
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  
  }

}
