package ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Adddatato_outputfile {
	public FileInputStream fi;
	public Workbook w;
	public Sheet s;
	
	public FileOutputStream fo;
	public WritableWorkbook wb;
	public WritableSheet ws;
	
  @Test
  public void f() throws Exception {
	fi=new FileInputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Testdata\\hms.xls");
	w=Workbook.getWorkbook(fi);
	s=w.getSheet("Sheet1");
	
	fo=new FileOutputStream("C:\\Users\\manpreet\\eclipse-workspace\\seleniumautomatin\\Results\\results2.xls");
	wb=Workbook.createWorkbook(fo);
	ws=wb.createSheet("Results", 0);
	
	for(int i=0;i<s.getRows();i++)
		for(int j=0;j<s.getColumns();j++) {
			
			System.out.println(s.getCell(j, i).getContents());
			Label a=new Label(j, i, s.getCell(j, i).getContents());
			ws.addCell(a);
		}
	Label rs=new Label(2, 0, "Results");
	ws.addCell(rs);
		wb.write();
		wb.close();
	

  }
}
