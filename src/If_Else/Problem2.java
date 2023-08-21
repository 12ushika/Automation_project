package If_Else;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		// family member print
				System.out.println("my family menbar");
				Scanner sc = new Scanner(System.in);
				String familyMembar = sc.nextLine();
				
				if (familyMembar.equals("Sourabh")) // family menber if else statement 
				{
					System.out.println("my husband");
				}
				
				else if (familyMembar.equals("mansi")) 
				{
					System.out.println("my mother");
				}
				else if (familyMembar.equals("rugved")) 
				{
					System.out.println("my brother");
				}
				else
				{
					System.out.println("is not my family menber");
				}
				

	}

}
