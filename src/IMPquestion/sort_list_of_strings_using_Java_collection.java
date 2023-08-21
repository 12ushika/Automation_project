package IMPquestion;

import java.util.Arrays;

public class sort_list_of_strings_using_Java_collection {

	public static void main(String[] args) {
		// Alphabetically order ne yenar
		
		String [] a = {"jan","feb","march", "april", "may", "june", "july", "augest"};
		
		Arrays.sort(a); // collection chi inbuid method used keli aa
		
		for(String name : a) 
		{
			System.out.print(name + " ");
		}
		
		Arrays.sort(a , String.CASE_INSENSITIVE_ORDER); // 

	}

}
