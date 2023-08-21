package IMPquestion1;

public class Split_first_word_of_String {

	public static void main(String[] args) {
		
		String a = "rushika chandrakanat nimke";
		
		m1(a);

	}
	
	public static void m1(String a) 
	{
		String[] b = a.split(" ");
		
		for (int i=0; i<=a.length()-1; i++) 
		{
			String c = b[i];
			System.out.println(c.charAt(0));
			
		}
		
	}
	
}
