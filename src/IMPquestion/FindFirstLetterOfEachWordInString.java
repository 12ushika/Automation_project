package IMPquestion;

public class FindFirstLetterOfEachWordInString {

	public static void main(String[] args) {
		// get first letter of each word in String Starting ch number shodhane
		// yat name ch first to last pariyat tar purn print hou shakto
		
		String a = "Rushika Chandrakant Nimkar";
		m1(a);
		

	}
	
	public static void m1(String a) 
	{
		String [] b = a.split(" ");
		
		for (int i=0; i<b.length; i++) 
		{
			String s = b[i];
			System.out.println(s.charAt(0)); // --> ithe change karne only
		}
	}

}
