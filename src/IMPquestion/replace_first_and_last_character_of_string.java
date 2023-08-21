package IMPquestion;

public class replace_first_and_last_character_of_string {
	
	
	 static String m1(String a) 
	 {
	      char[] b = a.toCharArray();
	      
	      for (int i = 0; i < b.length; i++) 
	      {
	         int k = i;
	         while (i < b.length && b[i] != ' ')
	            i++;
	            char temp = b[k];
	            b[k] = b[i - 1];
	            b[i - 1] = temp;
	      }
	      return new String(b);
	   }

	public static void main(String[] args) {
		
		 String a = "rushika";
		 System.out.println(m1(a));

	}

}
