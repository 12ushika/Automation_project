package Switch_Statement;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		
 //IT slab rate calculation
		
		Scanner sc3 = new Scanner(System.in);
	    System.out.println("Enter the salary bracket:");
		 String rate = sc3.nextLine();
		 
		 switch (rate) 
		 {
		 case "0 to 2,50,000":
		 {
			 System.out.println("nill");
			 break;
		 }
		 case "2,50,001 to 5,00,000":
		 {
			 System.out.println("slab rate 5%");
			 break;
		 }
		 case "5,00,001 to 10,00,000 ":
		 {
			 System.out.println("slab rate 10%");
			 break;
		 }
		 case "7,50,001 to 10,00,000":
		 {
			 System.out.println("slab rate 15 %");
			 break;
		 }
		 case "10,00,001 to 12,50,000":
		 {
			 System.out.println("slab rate 20 %");
			 break;
		 }
		 case "12,50,001 to 15,00,000":
		 {
			 System.out.println("slab rate 25 %");
			 break;
		 }
		 case "Above 15,00,000":
		 {
			 System.out.println("slab rate 30 %");
			 break;
		 }
		 default:
		 {
			 System.out.println("enter correct slab rate");
		 }
		 }
		  

	}

}
