package Exception_handing;

public class Try_Catch {

	public static void main(String[] args) {
		// int [] marks = {10,20,30,40};
		// System.out.println(marks[10]); //--> error aa ha
		
		// ty sathi aapn try and catch used karto
		
		try 
		{
			int [] marks = {10,20,30,40};
			System.out.println(marks[10]);
		}
		catch (Exception e)
		{
			System.out.println("Something wrong in this program");
		}
	}

}
