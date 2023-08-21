package IMPquestion;

import java.util.Arrays;

public class FindThirdLargestElement {
	// 1 way to find 3 Lasrgest element in array
	public static int getThirdElement(int a[] , int b)
	{
		int temp = 0;
		 for (int i=1; i<b; i++) 
		 {
			 for(int j=i+1; j<b; j++) 
			 {
				 if (a[i] > a[j])
					 
					temp = a[i];
				     a[i] = a[j];
				     a[j] = temp;
			 }
		 }
		 return a[b-3];
	}
	

	public static void main(String[] args) {
		
		int a [] = {5,6,8,9,4,5};
		int b [] = {8,9,6,3,2,4};
		
		System.out.println(getThirdElement(a, 6)); //--> total element getlay ithe
		System.out.println(getThirdElement(b, 6));

	}	
		
		
		// 2 way find asa lihne Find 3 largest Element in Array Thought
		public static int getThirdLargest(int[] ab, int total) 
		{
			Arrays.sort(ab); 
			return ab[total-3];
		}
		
		public static void main(String[] args) {
			
			int a [] = {5,6,8,9,4,5};
			int b [] = {8,9,6,3,2,4};
			
			System.out.println(getThirdElement(a, 6)); //--> total element getlay ithe
			System.out.println(getThirdElement(b, 6));

		}	
	

}

  