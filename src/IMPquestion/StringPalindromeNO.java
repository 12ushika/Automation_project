package IMPquestion;

public class StringPalindromeNO {

	public static void main(String[] args) {
		
		// Check for Palindrome Number in Java
		// reverse number chi method used karto
		int no = 121;
		int temp=no;
		int rev=0,rem;
		
		while(temp !=0) 
		{
			rem = temp %10;
			rev =rev* 10+rem;
			temp=temp/10;
		}
        if(no==rev) 
        {
        	System.out.println(no + "Palidrome no");
        	
        }
        else 
        {
        	System.out.println(no + "Not Palimdrome no");
        }
	}

}
