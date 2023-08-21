package IMPquestion;

public class Split_String {

	public static void main(String[] args) {
		
		String a = "java, selenium , testNG, API, Manual, Cucumber, SQL";
		
		String [] b = a.split("//s* ");
		//System.out.println(b.length);
		
		
		
		for(String name : b) 
		{
			System.out.println(b);
		}
		
	}

}
