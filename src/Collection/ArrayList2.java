package Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
	
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Rushika"); //--> 1. Method 
		stringList.add("Sourabh");
		stringList.add("Sourabh");
		stringList.add("Swati");
		stringList.add("Manish");
		stringList.add("Rekha");
		
		Iterator<String> abc = stringList.iterator();
		while(abc.hasNext()) 
		{
			System.out.println(abc.hasNext());
		}
		
		stringList.remove(2);
		
		// 2. get method
		stringList.get(2);
		
		// 3. Add Element in Between (Mathecha Add karnay 1 Num kiva String)
		stringList.add(3, "Rugved");
		
		// 4. Set Element (Pahilya Input  Element/ String Change Karnya Sathi used)
		stringList.set(0, "Mau");
		
		// 5. Delete method
		stringList.remove(2);
		
		// 6. Size find karaychi aa
		stringList.size();
		
		// 7. Sorting ( Assending Order Mathe Sort karat)
		Collections.sort(stringList);
		
		// 8. Contains ha element Array list mathe ahe ka te find karnay sathi used karta
		System.out.println(stringList.contains("Manasi"));
		
	}

}
