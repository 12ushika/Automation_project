package If_Else;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		// numter 123 compare each other
		
				System.out.println("Enter num1 : ");
				Scanner sc = new Scanner (System.in);
				int num1 = sc.nextInt();
				
				System.out.println("Enter num2 :");
				int num2 = sc.nextInt();
				 
				System.out.println("Enter num3 :");
				int num3 = sc.nextInt();
				
				if (num1<num2) 
				{
					if (num2<num3) 
					{
						System.out.println(num3+ " is greater than " + num1+ " and " + num2);	
					}
					 else 
					{
						 System.out.println(num2+ " is greater than " + num1+ " and " + num3);
					}
				}
				else 
				{
					if (num1>num3) 
					{
						System.out.println(num1+ " is greater than " + num2+ " and " + num3);	
					}
					 else 
					{
						 System.out.println(num3+ " is greater than " + num1+ " and " + num2);
					}
				}


	}

}
