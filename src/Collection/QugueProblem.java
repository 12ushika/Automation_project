package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QugueProblem {

	public static void main(String[] args) {
		
		Queue<String> name = new PriorityQueue<>();
		name.add("Rushika");
		name.add("Rushika");  // unordering asato ha null value print nahi karat
		name.add("Sourabh");
		name.add("manasi");
		name.add("Rugved");
		
		
		Iterator<String> itr = name.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
	}

}
