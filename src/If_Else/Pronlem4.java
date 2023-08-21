package If_Else;

import java.util.Scanner;

public class Pronlem4 {

	public static void main(String[] args) {
		
//	 	range of this to this lower to upper
			System.out.println("Enter Time ");
			Scanner sc = new Scanner(System.in);
			int timing = sc.nextInt();
			
			if (timing <= 8)
			{
				System.out.println("office is not open");	
			}
			else if (timing >=9 &&  timing <=12)
			{
				System.out.println("good morning ");	
			}
			else if (timing >=13 &&  timing <=17)
			{
				System.out.println("good afternoor ");	
			}
			else if (timing >=18 &&  timing <=20)
			{
				System.out.println("good evening ");	
			}
			else if (timing >=21 &&  timing <=24)
			{
				System.out.println("good night ");	
			}
			else 
			{
				System.out.println("error");	
			}
			
		
		
			
	}

}
