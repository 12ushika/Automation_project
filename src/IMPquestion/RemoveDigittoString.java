package IMPquestion;

public class RemoveDigittoString {
	// 1 way
	
	 static  String m1(String a)
	{
		String b =" ";
		for (int i=0; i<a.length(); i++) 
		{
			if(!Character.isDigit(a.charAt(i))) // jar number print sagitle tar ! nahi used karaych
				                                // jar charater print la sagitle tar ! used karne
			{
				b = b+a.charAt(i);
			}
		}
		return b;
	}
	 
	 // 2 way 
	 
	 static  String m2(String ab) 
	 {
		 return ab.replaceAll("\\d", "");
	 }
	

	public static void main(String[] args) {
		
		// 2 way to remove dogit 
		
		String ab = "rkfkjsad5769879guyewrgikebf9846djud5668453";
	 
	   System.out.println(m1(ab));

	}

}
