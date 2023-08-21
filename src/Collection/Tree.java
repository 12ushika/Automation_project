package Collection;

import java.util.Iterator;

import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {
		
		TreeSet<String> name1 = new TreeSet<>();
		name1.add("Rushika");
		name1.add("Rushika");
		name1.add("Sourabh"); // dupalicate and unording asato and null pan nahi ghet
		name1.add("manasi");
		name1.add("Rugved");
		
		
		Iterator<String> itr =  name1.iterator(); // tree mathe new keyword used nahi karat object sathi
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		Iterator itr1 =name1.descendingIterator(); // he method used kartat 
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println(name1.descendingSet());
	}
	

}
