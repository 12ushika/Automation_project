package Operater_Java;

public class TernaryOperator {

	public static void main(String[] args) {
		// ternary operator
     int num1 = 20;
     int num2 = 40;
     
     if (num1<num2)
     {
    	 System.out.println("condition is ok....");
     }	
     else 
     {
    	 System.out.println("condition is fail.....");
     }
     
     // ternary operator
     
      String result = ((num1<num2)? "condition is ok" : "condition is fail");
    	  
    	  System.out.println(result);
     
     
	}

}
