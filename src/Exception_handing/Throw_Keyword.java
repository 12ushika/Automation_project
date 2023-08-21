package Exception_handing;
import java.util.Scanner;

public class Throw_Keyword {
	
	public static void main(String[] args) {
		// throw keyword ha if else mathe used karatat
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age ");
		
		int age = sc.nextInt();
		try {
		if(age<18) 
		{
			throw new ArithmeticException("your are not conduct in this group");//--> ithe used karne and kont exception te lihne
			
		}
		else 
		{
			System.out.println("your are conducting this group");
		}
		}
		catch(Exception e) 
		{
			System.out.println("right print this box");
		}
	}

}
