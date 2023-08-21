package IMPquestion;

public class StringRevercePreservingPosition {
	
	// Write a Java program to reverse a given string with preserving the position of spaces?
	
	public static void StringReverce(String a) 
	{
		char [] iputArray = a.toCharArray();
		char [] result = new char[iputArray.length];
		
		for (int i=0; i<iputArray.length; i++) 
		{
			if(iputArray[i]== ' ') 
			{
				result[i] = ' ';
			}
		}
		
		int j = result.length - 1; 
		
		for (int i=0; i< result.length; i++ ) 
		{
			if(iputArray[i]!= ' ') 
			{
				if(result[j] == ' ') 
				{
					j--;
				}
				 result[j] = iputArray[i];  
	                j--;  
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
	
		StringReverce ("Rushika Chandrakant Nimkar");
		
		
	}

}
