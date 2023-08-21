package IMPquestion;

public class PrintStartingWordINstring {

	public static void main(String[] args) {
		// same program varti ahe
		
		String a = "RUshika Nimkar";
		m1(a);

	}
	
	public static void m1(String a) 
	{
		String [] b = a.split(" ");
		
		for(int i=0; i<b.length; i++) 
		{
			String c = b[i];
			System.out.println(c.charAt(0));
		}
		
	}

}
