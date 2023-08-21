package IMPquestion;

import java.util.HashMap;
import java.util.Map;

public class Write_count_Character_Occurrencesi_in_given_string {

	public static void main(String[] args) {
		
		// Write to find the maximum & minimum occureing character in given string
		// mean charater kiti vela saglyat jast zhalay 
		
		// 1 ways
		String s = "abahsgsgdiekfbushk";

		int[]arr = new int[127];
		
		for(int i=0; i<s.length(); i++) 
		{
			arr[s.charAt(i)] = arr[s.charAt(i)]+1;
		}
		
		int max = -1;
		char c = ' ';
		
		for (int i=0; i<s.length(); i++) 
		{
			if(max<arr[s.charAt(i)]) 
			{
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println("max value = "+ c);

		
		
		
		// 2 ways
		
		String a ="RUSHIKASOURABH";
	a=a.replaceAll("\\s", ""); // space remove sathi used hot
	
		Map<Character , Integer> duplicate = new  HashMap<>();
		char []  chararr = a.toCharArray(); // --> String to convert charArray
		
		for (char keys : chararr) 
		{
			if(Character.isAlphabetic(keys)) 
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
		System.out.println(duplicate); 

	}

}
