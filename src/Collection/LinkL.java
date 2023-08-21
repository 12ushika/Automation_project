package Collection;

import java.util.Iterator;

import java.util.LinkedList;
import java.util.List;

public class LinkL {

	public static void main(String[] args) { // LinkList Collection Framework
		
	
		
		List<Integer> link = new LinkedList<>();
		link.add(1);
		link.add(2);
		link.add(5);
		
		
		List<String> link1 = new LinkedList<>();
		link1.add("Rushika");
		link1.add("Sou");
		link1.add("Mau");
		
      
       
       Iterator<Integer> itr = link.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
