package IMPquestion;

public class Febinacci {

	public static void main(String[] args) {
		//--> decided 2 number 0 and 1 first we add it 0+1 =1 +1 = 2 + 1 =3 +2 =5 +3 =8
		// --> add privisous 2 number
		// used Swap method
	
		// febinooci seies for interview queation
				
		int a= 0;
		int b = 1;
		int c;
		
		for ( int i=1; i<=10; i++) 
		{
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}

}
