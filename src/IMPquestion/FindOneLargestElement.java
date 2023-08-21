package IMPquestion;

public class FindOneLargestElement {

	public static void main(String[] args) {
		// Find Maximum and Minimum values in an Array in Java
		
		int a[] = {2,4,5,8,9,6,3};
		
		int max = a[0]; //--> asumed keli aa max value hi ahe as
		
		for (int i=1; i<a.length; i++ ) 
		{
			if (a[i] > max) //--> ithe >< Change karne only
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}
	

}
