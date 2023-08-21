package IMPquestion;

import java.util.Scanner;

public class StringPalindrome { // palindrome String name sathi only 
	
	// Palimdrome means orignal value reverse kel tari same asate
			// eg. 121 = 121 --> he palidrome ahe 
	        // eg. nayan = nayan --> he palidrome ahe
	        // eg. 1231, Rushika = he palimdrome nahi ahe  

	public static void main(String[] args) {
		
		// palidrome kadtnata length, CharAt, and .equals used karto
		
		// Question Program to Check String reverse  is Palindrome or not in Java
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String name");
		String ab = sc.nextLine(); 
		
		String rev = "";
		
		for (int i=ab.length()-1; i>=0; i--) 
		{
			rev = rev+ab.charAt(i);
		}
		
		if(ab.equals(rev)) //--> .equals show boolean value
		{
			System.out.println("It is palimdrome String");
		}
		else 
		{
			System.out.println("It is not Palimdrome String");
		}
		
	}

}
