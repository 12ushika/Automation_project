package If_Else;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		
		// genter and age calculated
				System.out.println("enter gender detail ");
				Scanner sc = new Scanner (System.in);
				String gender = sc.nextLine();
				
				System.out.println("enter age detail ");
				Scanner sc1 = new Scanner (System.in);
				int age = sc1.nextInt();
				
				if (gender.equals("male")) 
				{
					if (age<21) 
					{
						System.out.println("not ready for marriage");
					}
					else 
					{
						System.out.println("ready for marriage ");
					}
					
				}
				else 
				{

		               if (age<18) 
					{
						System.out.println("not ready for marriage");
					}
					else 
					{
						System.out.println("ready for marriage ");
					}

	}

	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
