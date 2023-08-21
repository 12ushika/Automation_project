package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeProblem {

	public static void main(String[] args) {
	
		Deque<String> name = new ArrayDeque<>();
		name.add("Rushika");
		name.add("Rushika");
		name.add("Sourabh"); // dupalicate print karto ordervalue asate and null pan nahi ghet
		name.add("manasi");
		name.add("Rugved");
	
		Iterator<String> itr =  name.iterator(); // ArrayDeque mathe new keyword used nahi karat object sathi
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
	}

}
