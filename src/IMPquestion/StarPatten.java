package IMPquestion;

import java.util.Scanner;

public class StarPatten {

	public static void main(String[] args) {
		
		// Easy Star patten whith the help of user input
		
				for (int i=0; i<=5; i++) 
				{
					for (int j=0; j<=i; j++) 
					{
						System.out.print(" * ");
					}
					System.out.println("  ");
				}
				
		System.out.println("===================================================================================");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Inter your num");
				int num = sc.nextInt();
				
				for (int i=0; i<=num; i++) 
				{
					for(int k=0; k<=i; k++) 
					{
						System.out.print(" * ");
					}
					System.out.println("  ");
				}
	}

}
