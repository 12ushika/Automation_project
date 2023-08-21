package Exception_handing;

public class final_Keyword {

	public static void main(String[] args) {
		
		// try catch & finally use kartat  notes bookes used karne
		
		try 
		{
			int [] marks = {10,20,30,40};
			System.out.println(marks[10]);
			
		}
		catch(Exception e) 
		{
			System.out.println("Error occur");
		}
		finally 
		{
			System.out.println("finally keyword used");
		}

	}

}
