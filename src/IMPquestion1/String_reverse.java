package IMPquestion1;

public class String_reverse {

	public static void main(String[] args) {
	
		String a = "java";
		char [] b = a.toCharArray();
		int c = b.length;
		
		System.out.println(c);
		
		for(int i=c-1; i>=0; i--) 
		{
			System.out.println(b[i]);
		}

	}

}
