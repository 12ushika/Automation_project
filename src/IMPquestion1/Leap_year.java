package IMPquestion1;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year");
		int num = sc.nextInt();
		
		if(num % 4 ==0) 
		{
			if(num% 100 ==0) 
			{
				if(num % 400 ==0) 
				{
					System.out.println("leap year");
				}
				else 
				{
					System.out.println("not leap");
				}
			}
			else 
			{
				System.out.println("it is leap");
			}
			
		}
		else 
		{
			System.out.println("it is not leap year");
		}

	}

}
