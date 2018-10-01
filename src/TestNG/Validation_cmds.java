package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Validation_cmds {
	
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  String str=driver.findElement(By.id("logo")).getAttribute("title");//Tool Tip
	  System.out.println(str);
	  
	  
	  driver.findElement(By.linkText("HMS")).click();
	  if(driver.findElement(By.name("username")).isDisplayed())
	  {
		  System.out.println("Username is available");
		  driver.findElement(By.name("username")).sendKeys("admin");
	  }
	  else
	  {
		  System.out.println("Username is not available");
	  }
	  
	  if(driver.findElement(By.name("password")).isDisplayed())
	  {
		  System.out.println("Password is available");
		  driver.findElement(By.name("password")).sendKeys("admin");
	  }
	  else
	  {
		  System.out.println("Password is not available");
	  }

	  if(driver.findElement(By.name("password")).isDisplayed())
	  {
		  System.out.println("Login button is available");
		  driver.findElement(By.name("submit")).click();
	  }
	  else
	  {
		  System.out.println("Login button is not available");
	  }
      Thread.sleep(3000);
      driver.findElement(By.linkText("Logout")).click();

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com");
  }

}
