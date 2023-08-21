package IMPquestion;

import java.util.Map;
import java.util.HashMap;

public class FindDuplicateCharaterInString {

	public static void main(String[] args) {
		
		// Find Duplicate Charater In String with check position
		
		String a ="RUSHIKASOURABH";
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
