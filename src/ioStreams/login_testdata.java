package ioStreams;

import org.testng.annotations.Test; 

import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_testdata {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  FileInputStream fi=new FileInputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Testdata\\hms.xls");
	  Workbook w=Workbook.getWorkbook(fi);
	  Sheet s=w.getSheet("Sheet1");
	  
	  driver.findElement(By.linkText("HMS")).click();
	  driver.findElement(By.name("username")).sendKeys(s.getCell(0, 1).getContents());
      driver.findElement(By.name("password")).sendKeys(s.getCell(1,1).getContents());
      driver.findElement(By.name("submit")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com");

  }

}
