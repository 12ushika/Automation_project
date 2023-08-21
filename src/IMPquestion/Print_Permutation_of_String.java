package IMPquestion;

public class Print_Permutation_of_String {
	
	

	public static void main(String[] args) {
		// 1 number sagly place la fix karun check karne
		// used recursion throught
		// tyacha chat sathi online bagne kiva book mathe lohne
		
		String  name = "ABC";
		permutation(0 , name);
	
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////

	public static String swap(String name , int a ,int b) 
	{
		char ch [] = name.toCharArray();
		char p = ch[a];
		ch[a] = ch[b];
		ch[b]=p;
		return String.valueOf(ch);
		
	}
	public static void permutation(int a , String name) 
	{
		if(a==name.length()-1) 
		{
			System.out.println(name);
			return;
		}
		
		for(int i = a; i<name.length(); i++) 
		{
			name =swap(name, i, a);
			
			permutation(a+1 , name);
		}
	}
	
	

}
