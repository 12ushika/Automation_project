package Switch_Statement;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		// enter student % 
		  Scanner sc1 = new Scanner(System.in);
		  System.out.println("Enter the student name:");
		  String name = sc1.nextLine();
		  
		  switch (name) 
		  {
		  case "rushika" :
		  {
			 System.out.println("Rushika got 90%"); 
			 break;
		  }
		  case "manish" :
		  {
			 System.out.println("Manish got 80%"); 
			 break;
		  }
		  case "saghapal" :
		  {
			 System.out.println("saghapal got 85%"); 
			 break;
		  }
		  case "summaiya" :
		  {
			 System.out.println("summaiya got 75%"); 
			 break;
		  }
		  case "aaravi" :
		  {
			 System.out.println("aaravi got 60%"); 
			 break;
		  }
		  default :
		  {
			  System.out.println("select correct student name");
		  }

		  }
	}
}


