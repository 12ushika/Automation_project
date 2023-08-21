package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		
		
		List <Integer> num = new ArrayList<>(); // Parent ch referce used karne 
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(30); //--> Dupalicate Strore
		num.add(40);
		num.add(null); // --> Null valve Store hote
		
		Iterator<Integer> its = num.iterator(); // --> Method Again and again call sathi used
		while (its.hasNext())  // --> mahiti nahi aa kiti size aa naki aaraylist chi mahnun while used kel
		{
			System.out.println(its.next());
		}
	}

}
