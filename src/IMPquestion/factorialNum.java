package IMPquestion;

import java.util.Scanner;

public class factorialNum {

	public static void main(String[] args) {
		// factorial number mean 5 = 5*4*3*2*1 = 120
		// eg. 6 = 6*5*4*3*2*1 = 720
		// Question Find Factorial number in java
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num = sc.nextInt();
		int abc = 1;
		
		for(int i=1; i<=num; i++) 
		{
			abc = abc *i;
		}
		System.out.println(abc);
		
		
		// 2 ways Decrement used karun
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num1 = sc.nextInt();
		
		int fact = 1;
		
		for(int j=num1; j>=1; j--) 
		{
			fact = fact *j;
		}
        System.out.println(fact);
        
        
        
        // Find the Factorial of the Number using Recursion in Java ? 
        // recursion mean method again and again calling same method
        
	}
	

}
