package Array_p;

public class SingalDimension {
	// print student marks
	int phy;
	int math;   //--> first creat veriable
	int english;

	public static void main(String[] args) 
	{
		int [] marks = new int [5]; // --> aaray syntax
		marks[0] = 10; 
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		// aaray chi leanth calculating karaychi asel tar
		
		System.out.println(marks.length); // --> ase syntax ahe 

		// for loop sathi
		 for (int i=0; i<5; i++) 
		 {
			 System.out.println(i);
		 }
	}

}
// 2 types ne lihu shakto array la 
// 1-->  int [] marks = new int [5];
// 2--> int []marks= {10,20,30}