package ioStreams;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Login_Results {
	public WebDriver driver;
	public String str;
	
	public FileInputStream fi;//read data from xls
	public Workbook w;
	public Sheet s;
	
	public FileOutputStream fo;//Create & write data to xls
	public WritableWorkbook wb;
	public WritableSheet ws;
	
	
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Testdata\\hms.xls");//Read xls
		w=Workbook.getWorkbook(fi);
		s=w.getSheet("Sheet1");
		
		fo=new FileOutputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Results\\results_IO.xls");//Create xls
		wb=Workbook.createWorkbook(fo);
		ws=wb.createSheet("Results", 0);
  
  
  for(int i=1;i<s.getRows();i++)      // Login & logout with credentials
  {
  driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
  driver.findElement(By.name("password")).sendKeys(s.getCell(1,i).getContents());
  driver.findElement(By.name("submit")).click();
  

  try{                                // Print PASS or FAIL in console 
      driver.findElement(By.linkText("Logout")).isDisplayed();
      System.out.println("Valid credentials"); 
      str="PASS";
      driver.findElement(By.linkText("Logout")).click();
      } 
  catch(Exception e) {
      System.out.println("Invalid credentials");
      str="FAIL";
      Thread.sleep(3000);
      }
  
  Label results=new Label(2, i, str);   // Write PASS or FAIL in xls
  ws.addCell(results);
  
	for(int j=0;j<s.getColumns();j++) {
		
		System.out.println(s.getCell(j, i).getContents()); // Write credentials in xls
		Label a=new Label(j, i, s.getCell(j, i).getContents());
		ws.addCell(a);
	}
  }
  Label un=new Label(0, 0, "Username");  // Write headings in xls
  Label pw=new Label(1, 0, "Password");
  Label rs=new Label(2, 0, "Results");
  ws.addCell(un);
  ws.addCell(pw); 
  ws.addCell(rs);
  
  wb.write();
  wb.close();
  
}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://seleniumbymahesh.com/HMS");

  }

}
