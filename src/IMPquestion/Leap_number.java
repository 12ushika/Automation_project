package IMPquestion;

import java.util.Scanner;

public class Leap_number {
	
	public static void main(String[] args) {
		
		// 400 and 4 pasun divided hoyla pahije and 100 ne divided nahi hoyla pahije
		// 1 ways
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Year");
		int year = sc.nextInt();
		
		if(year % 4 ==0) 
		{
			if(year % 100 ==0)
			{
				if(year % 400 == 0) 
				{
					System.out.println("this is leap year ");
				}
				else 
				{
					System.out.println("not leap");
				}
				
			}
			else 
			{
				System.out.println(" leap year");
			}
			
		}
		else 
		{
			System.out.println("This is not Leap Year");
		}
		
		
		
		// 2 ways
		
	/*	if((year% 400  ==0)|| (year% 4 ==0 && year % 100 !=0)) 
		{
			System.out.println("this is leap year");
		}
		else 
		{
			System.out.println("this is not leap year");
		}*/
	}

}
