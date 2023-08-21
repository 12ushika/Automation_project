package IMPquestion;

public class PrimeNumber {

	public static void main(String[] args) {
		// Prime Number Meanin 1 and itself nech divided hoyl pahije 1khada no. eg. 3 , 5, 7 is prime number
		// 4 , 9 , 12 he prime number nahi aa
		// 1 is not prime number beause he devided into itself only 
		
		int no = 7;
		int temp = 0;
		
		for (int i= 2 ; i<=no; i++) //--> 2 ka ghetal karan 2 to 6 mathe 7 la bhag jatoy ka te bagnya sathi
		{
			if(no % i ==0) 
			{
				temp = temp+1;
			}
		}
		 if(temp > 0) 
           {
        	   System.out.println("No is Prime");
           }
           else 
           {
        	   System.out.println("It is no prime");
        	   
           }
           
           
           
           
           
           
	}

}
