package IMPquestion;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		
	// Write a program which prints table of enter Star to end  number.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
     for (int i=0; i<=10; i++) 
		{
			System.out.println(num * i);
		}

		
	}

}
