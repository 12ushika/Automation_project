package If_Else;

import java.util.Scanner;

public class Problrm8 {

	public static void main(String[] args) {
		
		// modula and == use karne even and odd number sathi used kartat
		
		
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the number");
				int number = sc.nextInt();
				
				if (number % 2 ==0) 
				{
					System.out.println("Print Even Number ");
				}
				else 
				{
					System.out.println("Print ODD Number ");
				}

	}

}
