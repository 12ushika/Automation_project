package IMPquestion;

public class RemoveDuplicateWordOfString {
	
	public static void main(String[] args) 
	
	{
		String a = "hfduugefubdslkjasyh";
		System.out.println(m1(a));
		
		
	}
	
	public static String m1(String a) 
	{
		String b = " ";
		
		for(int i=0; i<a.length(); i++) 
		{
			char ch = a.charAt(i);
			if(b.indexOf(ch)==-1) 
			{
				b = b+ch;
			}
		}
		return b;
	}

}
