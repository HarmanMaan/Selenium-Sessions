package ioStreams;

import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreateExcelfile {
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
	
  @Test
  public void f() throws Exception {
	  fo=new FileOutputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Results\\results.xls");
	  wb=Workbook.createWorkbook(fo);
	  ws=wb.createSheet("Results", 0);
	  
	  Label un=new Label(0, 0, "Username");
	  Label pw=new Label(1, 0, "Password");
	  Label rs=new Label(2, 0, "Results");
	  ws.addCell(un);
	  ws.addCell(pw);
	  ws.addCell(rs);
	  
	  wb.write();
	  wb.close();
  } 
}
