package Operater_Java;

public class LogicalOperator {

	public static void main(String[] args) {
		// logical operator
		 
		int a = 10;    // use && and statement
		int b =20;
		int c = 30;
		
		if (a<b && a<c) 
		{
			System.out.println("Statement is ok.....");
		}
		else 
		{
			System.out.println("Statement is fail......");
		}
		
		// use || or statement
		
		if (a>b || a>c) 
		{
			System.out.println("Statement is ok.....");
		}
		else 
		{
			System.out.println("Statement is fail......");
		}
		
		
	}

}
