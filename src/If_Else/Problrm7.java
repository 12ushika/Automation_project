package If_Else;

import java.util.Scanner;

public class Problrm7 {

	public static void main(String[] args) {
		
		// string days to check 
		
				System.out.println("Enter today days : ");
				Scanner sc = new Scanner (System.in); 
				String days = sc.nextLine();
				
				if (days.equals("sunday") || days.equals("Saturday")) 
				{
					if (days.equals("Saturday")) 
					{
						System.out.println(days+" today is hardworking days ");
					}
					else 
					{
						System.out.println(days + " today is holiday ");
					}
				}
				else 
				{
					if (days.equals("Wednesday")) 
					{
						System.out.println(days + " today is meeting days ");
					}
					else 
					{
						System.out.println(days + " normal days ");
					}
				}
	}

}
