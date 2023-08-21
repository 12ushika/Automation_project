package IMPquestion;

public class Reverse_An_Array_In_JAVA {
	
	static void m1(int [] a) 
	{
		int i = 0, j = a.length-1;
		
		while ( i < j) {
		int t = a[i];
		 a[i]= a[j];
		 a[j] = t;
		 i++;
		 j--;
		
	}
	}

	public static void main(String[] args) {
		
		int [] a = {2,4,6,8,10,12,14,16,18,20};
		
		
		for(int i=0; i<a.length; i++) 
		{
			System.out.println("Before = " + a[i] + " ");
		}
		
		m1(a);
		System.out.println("============================");
		
		for(int i=0; i<a.length; i++) 
		{
			System.out.println("After = " +a[i] + " ");
		}

	}

}
