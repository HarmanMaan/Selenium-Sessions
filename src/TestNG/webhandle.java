package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class webhandle {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	  String str=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTNR")).getText();
	  System.out.println(str);
	  
	  String [] s=str.split("\n");
	  System.out.println(s.length);
	  
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].equalsIgnoreCase("Colombo (CMB)" ))
			  System.out.println(s[i]);
		  else if(s[i].equalsIgnoreCase("Kabul (KBL)" ))
		  System.out.println(s[i]);
		  else if(s[i].equalsIgnoreCase("Dubai (DXB)" ))
			  System.out.println(s[i]);
		  else if(s[i].equalsIgnoreCase("Male (MLE)" ))
			  System.out.println(s[i]);
	   
		  
			  
	  }
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://spicejet.com");
  }

}
