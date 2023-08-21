package IMPquestion1;

import java.util.Scanner;

public class Even_and_odd_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no");
		int num = sc.nextInt();
		
		if(num % 2 ==0) 
		{
			System.out.println("it is even number");
		}
		else 
		{
			System.out.println("it is odd number");
		}

	}

}
