package corejava;

import org.testng.annotations.Test;

public class splitstrin1 {
  @Test
  public void f() {
	  String str;
	  str="harman,manpreet,happy,,honey,boss";
	  
	  String s[]=str.split(",");
	  System.out.println(s.length);
	  
	  for(int i=0;i<s.length;i++)
	  {
		  if(s[i].equals("manpreet"))
		  System.out.println(s[i]);
	  }
		  
  }
}
