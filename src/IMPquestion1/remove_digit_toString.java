package IMPquestion1;

public class remove_digit_toString {

	
	public static String m1(String a) 
	{
		String b = "";
		for (int i=0; i<a.length(); i++) 
		{
			if(Character.isDigit(a.charAt(i))) 
			{
				b= b + a.charAt(i);
			}
		}
		return b;
	}
	public static void main(String[] args) {
		
		String a = "534nbvbvs554";
		System.out.println(m1(a));

	}

}
