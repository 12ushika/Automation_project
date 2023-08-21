package IMPquestion;

public class RemoveAlphabetToString {
	
	static String m1(String a) 
	{
		String b ="";
		for (int i=0; i<a.length(); i++) 
		{
			if(Character.isAlphabetic(a.charAt(i))) 
			{
				b = b + a.charAt(i);
			}
		}
		return b;
	}

	public static void main(String[] args) {
		
		String a = "Ru$shik%a&nimkarsourabh";
		
		System.out.println(m1(a));

	}

}
