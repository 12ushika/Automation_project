package Array_p;

import java.util.Scanner;

public class MultiDimentional {
	// yat [][] as use karto row and colum calculation sathi use kartat

	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in); // --> user kadun input geych mahnun use kelay
	   System.out.println("Enter value of row");
	   int row = sc.nextInt();
	   
	   System.out.println("Enter value of coloumn");
	   int colum = sc.nextInt(); // --> creat variable
	   System.out.println(row+" "+colum);
	   
	   int [][] number = new int [row][colum]; // --> syntax multipal array cha
	  
	   // yat nested loop use karto
	   
	   // pahil loop input taynya sathi use kartat
	   
	  
	// first for loop row calculated kartoy
	   for(int i=0; i<row; i++) 
	   {
		  // 2 for loop colum calculated kartoy
		   for (int j=0; j<colum; j++) 
		   {
			   System.out.println("Enter value of" + i + j + " ");
			   number[i][j]= sc.nextInt(); //--> yat aaplya la kay return pahije aa te lihaych
		   }
	   }
	   
	   // output sathi
	   for (int i=0; i<row; i++) 
	   {
		   for (int j=0; j<colum; j++) 
		   {
			   System.out.println("Value at "+ i + "," + j +"is: ");
			   System.out.println(number[i][j]);
		   }
		
	   }
	   

	}

}
