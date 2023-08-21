package NewPackage;

public class Explicit_Class 
{
     // explicit casting higher data types to lower data types
	// eg. double/float/long to int karnya sathi
	
	int c=30;
	
	double d= (int)c;  // yat only (int) use karayh asat refence denya sathi
	
	public void m2() 
	{
		System.out.println(d);
	}
	
	public static void main(String[] args)
	{
		Explicit_Class sourabh = new Explicit_Class();
		sourabh.m2();		
		
	}

}
