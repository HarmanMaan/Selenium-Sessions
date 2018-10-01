package corejava;

import org.testng.annotations.Test;

public class palindrome {
  @Test
  public void f() {
	   
		  String str,reverse="";
		  str="madam";
		  System.out.println(str.length());
		  System.out.println(str);
		  
		  for (int i=str.length()-1;i>=0;i--)
		  {
			  reverse=reverse+str.charAt(i);
		  }
		  System.out.println(reverse);
		 
	      if(str.equals(reverse))
	    		  System.out.println("It is a palindrome");
	      else
	          System.out.println("It is not a palindrome");
	      
				 
  }
}
