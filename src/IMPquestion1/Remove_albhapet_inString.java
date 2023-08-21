package IMPquestion1;

import java.util.Stack;

public class Remove_albhapet_inString {

	
	 static String m1(String a)
	{
		String b = "";
	 for (int i=0; i<a.length(); i++) 
	 {
		 if(Character.isAlphabetic(a.charAt(i))) 
		 {
			 b = b+a.charAt(i);
		 }
	 }
	 return b;
	}
	public static void main(String[] args) {
		
		String a = "r124d5";
		
		System.out.println(m1(a));
		
	}
	
	

}
