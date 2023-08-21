package IMPquestion1;

public class Star_patten {

	public static void main(String[] args) {
		
		// left to right star patten
		
	/*	for(int i=0; i<=5; i++) 
		{
			for(int j=0; j<=i; j++) 
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
		*/
		
		// right to left
		
		for(int i=5-1; i>=0; i--) 
		{
			for(int j=0; j<=i; j++) 
			{
				System.out.print("*" + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
