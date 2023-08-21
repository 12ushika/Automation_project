package polymorphism;

public class polymorphism2 { //--> Parent CLass
	

	// overriding method
		public void money () 
		{
			System.out.println("money is  1L");
		}
		public void car () 
		{
			System.out.println("car is  SUV 500");
		}
		public void home () 
		{
			System.out.println("home is  2BHK");
		}
	}	
	 class sourabh extends polymorphism2 // ----> child class
		{
			public void mobile () 
			{
				System.out.println("mobile is  nokia100");
			}
			
			public void home () 
			{
				System.out.println("home is  4bhk with 1 table");
			}
			
		


		public static void main(String[] args) {
			
			sourabh rushika = new sourabh();
			rushika.mobile();
			rushika.home();
			
		}
		}



