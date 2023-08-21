package IMPquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicates_from_ArrayList_by_Collections {

	public static void main(String[] args) {
		//  remove duplicate elements from list in java
		
		// 1 ways 
		
		List<Integer> list = Arrays.asList(1,1,4,5,6,8,2,4,6,8,5,9);
		
		List <Integer> updatedList = new ArrayList<>();
		
		for(Integer name : list) 
		{
			if(!updatedList.contains(name)) 
			{
				updatedList.add(name);
			}
		}
		System.out.println(updatedList);

		
		
		// 2 ways remove duplicate number in arraylist
		
		
     List<Integer> list1 = Arrays.asList(1,1,4,5,6,8,2,4,6,8,5,9);
		
		Set<Integer> updatedList1 = new HashSet<>(list1);
		
		
		System.out.println(updatedList1);
		
	}

}
