package IMPquestion1;

import java.util.Scanner;

public class String_palimdrome {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your no");
		String num = sc.nextLine();
		
		String rev = " ";
		
		for (int i=num.length()-1; i>=0; i--) 
		{
			rev = rev+num.charAt(i);
		}
		
		if(num.equals(rev)) 
		{
			System.out.println("it is palimrome");
		}
		else 
		{
			System.out.println("it is not palimdrome");
		}
		
		

	}

}
