package IMPquestion;

public class RemoveDuplicateNumberOfString 
{
	public static void main(String[] args) {
		
		String a = "86845181487545754845454";
		System.out.println(m1(a));
		
		
	}
	
	public static String m1(String a) 
	{
		String str ="";
		
		for(int i=0; i<a.length(); i++) 
		{
			char ch = a.charAt(i);
			if(str.indexOf(ch)==-1) 
			{
				str = str+ch;
			}
		}
		return str;
	}

}
