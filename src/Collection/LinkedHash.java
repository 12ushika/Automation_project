package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHash {

	public static void main(String[] args) {
		
		Set<String> name = new LinkedHashSet<>();
		name.add("Rushika");
		name.add("Manasi");
		name.add("Chandrakanrt");
		name.add("Sourabh"); // --> Duplicate value and order ne save hota data
		name.add("Sourabh");
		name.add(null);
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

	}

}
