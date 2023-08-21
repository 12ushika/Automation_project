package IMPquestion1;

import java.util.Scanner;

public class print_any_table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no");
		int ab = sc.nextInt();
		
		for (int i=0; i<=10; i++) 
		{
			System.out.println(ab*i);
		}

	}

}
