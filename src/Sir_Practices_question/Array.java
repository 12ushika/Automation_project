package Sir_Practices_question;
import java.util.Scanner;

public class Array { //--> user kadun geych aa aaplya ka mahiti anahi aa size tya sathi [num] lihlay

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter How Many Account In your Bank");
		int num = sc.nextInt();
		
		String Accountname[]= new String[num];
		
		for (int i=0; i<Accountname.length; i++) 
		{
			System.out.println("Enter Your Account Name");
			 Accountname[i]=sc.next();
		}
		
		System.out.println("===================================");
		// for each loop 
		
		for(String abc : Accountname) 
		{
			System.out.println(abc);
		}
			
	}

}
