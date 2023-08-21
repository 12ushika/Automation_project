package polymorphism;

public class polymorphism { // overloading 

	public void sourabh (int a, int b)
	{
	 int sum = a+b;
	 System.out.println(sum);
	}	
	
	public void sourabh ()
	{
	 String name = ("rushika");
	 System.out.println(name);
	}	
	
	public void sourabh (char c)
	{
	 int r =c;
	 System.out.println(r);
	}	
	
	public void sourabh (float h)
	{
	
	 System.out.println(h);
	}	
	
	

	public static void main(String[] args) {
		
		polymorphism rushika = new polymorphism ();
		rushika.sourabh(10, 20);
		rushika.sourabh();
		rushika.sourabh('z');
		rushika.sourabh(75.1f);
		
		
	}	
	}




