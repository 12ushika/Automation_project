package IMPquestion1;

import java.util.Scanner;

public class factorial_number {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no");
		int num = sc.nextInt();
		int ab = 1;
		for (int i=0; i<=num; i++) 
		{
			num = num*i;
			
			System.out.println(num);
		}

	}

}
