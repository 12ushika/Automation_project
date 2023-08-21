package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		
		Set<String> name = new HashSet<>();
		name.add("Rushika");
		name.add("Rushika"); //--> only duplicate value not stored and unordering form asto
		name.add("Sourabh");
		name.add(null);
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		System.out.println(name.isEmpty());
		
		

	}

}
