package IMPquestion;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number");
		int n = sc.nextInt();
		
		int arm=0, rem, c; //--> 3 Veriable Strore kele
		
		c=n;
		
		while(n>0) 
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		
		if(c==arm) 
		{
			System.out.println("It is Armstrong number");
		}
		else 
		{
			System.out.println("It is not Armstrong Number");
		}
		
		
		
	}

}
