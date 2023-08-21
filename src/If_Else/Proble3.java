package If_Else;

import java.util.Scanner;

public class Proble3 {

	public static void main(String[] args) {
	
		
		// use date of birth
				System.out.println("user date of birth print");
				Scanner sc = new Scanner(System.in);          // for birth date
				String DOB = sc.nextLine();
				
				if (DOB.equals("5/5/1993") || DOB.equals("5/may/1993")) 
				{
					System.out.println(" Sourabh Birthday");	
				}
				
				else if (DOB.equals("20/01/1998") || DOB.equals("20/jan/1998")) 
				{
					System.out.println(" rushika Birthday");	
				}
				else if (DOB.equals("01/01/2000") || DOB.equals("1/jan/2000")) 
				{
					System.out.println(" kaushal Birthday");	
				}
				else if (DOB.equals("01/02/1997") || DOB.equals("1/feb/1997")) 
				{
					System.out.println(" manasi Birthday");	
				}
				else
				{
					System.out.println("birth date is wrong");
				}
					
				

	}

}
