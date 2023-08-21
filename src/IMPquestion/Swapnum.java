package IMPquestion;

import java.util.Scanner;

public class Swapnum {

	public static void main(String[] args) {
		// Swap 2 Number Without using 3 variable
		
		// mean a = 10 & b=20 yat value exchange karaychi aa tar kas karnar 
		// 2 way aheat
		
		int a = 10;
		int b = 20;
		
		a =a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		
		// Scanner Class thought
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A and B value");
		
		int ab = sc.nextInt();
		int cd = sc.nextInt();
		
		ab = ab+cd;
		cd = ab-cd;
		ab = ab-cd;
		
        System.out.println(ab);
        System.out.println(cd);
	}

}
