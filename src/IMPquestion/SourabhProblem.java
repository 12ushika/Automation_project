package IMPquestion;

import java.util.HashMap;
import java.util.Map;

public class SourabhProblem {
	
	public static void main(String[] args) {
		
		String abc = "pr123*$!Pp sourabh _$$";
		
	/*	Map<Character , Integer> duplicate = new  HashMap<>(); // count kadla yat
		char []  chararr = abc.toCharArray();
		
		for(char keys : chararr) 
		{
			if(Character.isAlphabetic(keys));
			{
				if (duplicate.containsKey(keys)) 
				{
					duplicate.put(keys, duplicate.get(keys));
				}
				else 
				{
					duplicate.put(keys, 1);
				}
			}
		}
		System.out.println(duplicate);*/
	    

		
		
		// Sourabh name Extract karne
		
		String [] word = abc.split(" ");
		System.out.println(word.length);
		
		for (int i=0; i<word.length; i++) 
		{
			System.out.println( "word["+i+"] = " +word[i]);
		}
	}

}
