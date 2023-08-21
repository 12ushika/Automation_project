package NewPackage;

public class UpDown_Class {
	// up casting class
	// oobject father class cha reference and son ch results yeil
  // down casting only son ch object creat karne only new keyword cha adhi class name ghene
	public static void main(String[] args) 
	{
		UpDown_Class shete = new son();
		shete.money();
		shete.car();
		shete.home();

	}
	
	
	public void money() // --> normal method creat kar le
	{
		System.out.println("money is : 1L");
	}
	
	public void car()
	{
		System.out.println("car is : suv500");
	}	

	public void home()
	{
		System.out.println("home is : 2BHK");
	}	

}
class son extends UpDown_Class  // overriding process karaychi
{
	public void mobile()
	{
		System.out.println("mobile is : novia"); // --> own property son chi
	}
	
	public void money()
	{
		System.out.println("money is : 2L");
	}
	
	public void car()
	{
		System.out.println("car is : innova");
	}	

	public void home()
	{
		System.out.println("home is : 4BHK");
	}	
	
}