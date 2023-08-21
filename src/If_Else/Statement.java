%package If_Else;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		
		//string is special data types which is class and obj heance we need used .equals()
			Scanner sc = new Scanner(System.in);
			System.out.print("what day is today: ");
			String day = sc.nextLine();
					
			if (day.equals("monday"))
			
			{
				System.out.println("Today menu is poli bhaji");
			}
			else if (day.equals("Tuesday") ) 
			{
				System.out.println("Today menu is bhakari");
			}
			else if (day.equals("Wednesday")) 
			{
				System.out.println("Today menu is burger");
			}
			else if (day.equals("Thursday")) 
			{
				System.out.println("Today menu is noodle");
			}
			
			
		    else if (day.equals("Friday")) 
			{
				System.out.println("Today menu is biryani");
			}
		    else if (day.equals("Saturday")) 
		    {
		    	System.out.println("Today menu is khichadi");	
		    }
		    else if (day.equals("Sunday")) 
		    {
		    	System.out.println("Today menu is Pizza");	
		    }
		    else
		    {
		    	System.out.println("something wrong");
		    }

	}

}
