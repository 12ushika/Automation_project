package Claster_Class;

public class UpDown_Claster {  // --> super class

	public static void main(String[] args) 
	{ // sub class cha object creat karto but parent cha referent dete
		
		UpDown_Claster books = new son();
		books.money();
		books.mansi();
		books.sourabh();
		books.rushika();
	}
	
	
	public void money ()    // --> 1 create method inheritance
	{
		System.out.println("money is : 1L");
	}	
	
	public void sourabh ()
	{
		System.out.println("sourabh is : own property");
	}	
	
	public void mansi ()
	{
		System.out.println("manasi is : my mother");
	}	
	
	public void rushika ()
	{
		System.out.println("rushika  is : my self");

	}
	
	
	
}
	
class son extends UpDown_Claster // --> sub class 
   {
		public void mobile ()  // --> son own property
		{
			System.out.println("mobile   is : nokia");
		}
		
		public void money ()    // -->  overriding paretnt property
		{
			System.out.println("money is : 5L");
		}	
		
		public void sourabh ()
		{
			System.out.println("sourabh is : my husband");
		}	
		
		public void mansi ()
		{
			System.out.println("manasi is : my love");
		}	
		
		public void rushika ()
		{
			System.out.println("rushika  is : it's me ");
		}
		
		
}



