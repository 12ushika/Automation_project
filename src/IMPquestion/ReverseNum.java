package IMPquestion;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		// reverse String number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
        int num = sc.nextInt();
        
        int re = 0;
        
        while(num>0) 
        {
        	int r = num % 10;
        	re = re * 10+r;
        	num = num /10;
        }
        System.out.println(re);	
	}

}
