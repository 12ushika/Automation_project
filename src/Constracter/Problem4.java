package Constracter;

public class Problem4 {
	
	private int no1;            
	private int no2;
	

 public Problem4 (int no1, int no2)  // parametervise constructor
	{
		this.no1=no1;
		this.no2=no2;
	}

	 public void num() {System.out.println("Positive Number");}
	 public void num2() {System.out.println("Negative Number");}

  
  

	public static void main(String[] args) {
		
		Problem4 pp = new Problem4(10, 20);
		pp.num();
		pp.num2();
		
	}
		
	

}

