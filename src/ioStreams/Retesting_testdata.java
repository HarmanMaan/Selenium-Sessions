package ioStreams;

import org.testng.annotations.Test; 

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Retesting_testdata {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Testdata\\hms.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");
	  
	
	  
	  for(int i=1;i<s.getRows();i++)
	  {
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
      driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
      driver.findElement(By.name("submit")).click();
      
    /*  if(driver.findElement(By.linkText("Logout")).isDisplayed())    	  
       {
          System.out.println("Valid credentials");
          driver.findElement(By.linkText("Logout")).click();

      }
      else
      {
          driver.switchTo().alert().accept();
    	  System.out.println("Invalid credentials");
    	  
	      
      }*/
      try{
          driver.findElement(By.linkText("Logout")).isDisplayed();
          System.out.println("Valid credentials"); 
          driver.findElement(By.linkText("Logout")).click();
  } 
      catch(Exception e) {
	      System.out.println("Invalid credentials");
	      Thread.sleep(3000);
  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");
  }

}
