package IMPquestion;

public class Print_1_100_without_using_any_numbers_in_your_code {

	public static void main(String[] args) {
		
		int one = 'A' / 'A';
		
		String r = ".........."; //10 dot karne
		
		for(int i=one; i<(r.length() * r.length()); i++) 
		{
			System.out.println(i);
		}

		// 2 problem ch aa he
		PrintNum(1);
			
		}
	
	// 2 question
			// print 1 to 100 without using loop using recursion
	
  public static void PrintNum(int num) 
	{
		if(num<= 100) {
		System.out.println(num);
		num++;
		PrintNum(num);
		}
	}

}
