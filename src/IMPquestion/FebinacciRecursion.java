package IMPquestion;

public class FebinacciRecursion {

	static int a=0, b=1, c;
	
	public static void main(String[] args)  
	{
		System.out.println(a+b);
		FebinacciRecursion abc = new FebinacciRecursion();
		abc.printf(10);
		

	}
	void printf(int i) 
	{
		if(i>=1) {
		c = a+b;
		System.out.println(c);
		a=b;
		b=c;
		printf(i-1);
		}
	}

}
