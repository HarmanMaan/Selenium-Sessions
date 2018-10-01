package ioStreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class login_OR {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook w;
	public Sheet s,s1;
	
	
  @Test
  public void verifylogin() throws Exception {
	  fi=new FileInputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\OR\\Yahoo_login_logout.xls");
	  w=Workbook.getWorkbook(fi);
	  s=w.getSheet("Sheet1");	  
		
        driver.findElement(By.id("uh-mail-link")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/form/p[2]/span[1]/label")).click();
		driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys("peers_selenium");
		driver.findElement(By.id(s.getCell(1,1).getContents())).click();
		Thread.sleep(3000);
		driver.findElement(By.id(s.getCell(2,1).getContents())).sendKeys("selenium123");
		driver.findElement(By.id(s.getCell(3,1).getContents())).click();
		Thread.sleep(9000);
  }
  
  @Test
  public void verifylogout() {
	  s1=w.getSheet("Sheet2");
	  driver.findElement(By.xpath(s1.getCell(0,1).getContents())).click();
	  driver.findElement(By.cssSelector(s1.getCell(0,2).getContents())).click();

	  
  }
  
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://yahoo.com");
  }

}
