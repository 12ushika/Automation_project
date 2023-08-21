package Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Hash {
	
	public static void main(String[] args) {
		
		Map<String , Integer>  name = new LinkedHashMap<>();
		name.put("Rushika", 10);
		name.put("Sourabh", 20);
		name.put("manasi", 30);
		name.put("rugved", 40);
		name.put("rakesh", 50);
		
		
		System.out.println(name);
		
		// search and loopup method
		if(name.containsKey("Rushika")) 
		{
			System.out.println("True");
		}
		else 
		{
			System.out.println("False");
		}
		
		// get method value kiva key get karaychi aa statemet mdhun
		
		name.get("Rakesh");
		
		
		// remove karaych 
		
		name.remove("Rushika");
		
		// ajun ahe te collection nantar nit karne
		
	}

}
