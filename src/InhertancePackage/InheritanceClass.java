package InhertancePackage;

public class InheritanceClass { // -->  father class 
	// yat only extends keyword used karun father chi property child kade jate

	public static void main(String[] args) 
	{
		son dhami = new son();
		dhami.mobile();
		dhami.car();
		dhami.money();
		dhami.home();

	}
	
	public void money () 
	{
		System.out.println("money is: 1L");
		
	}
	
	public void car () 
	{
		System.out.println("car is: innova");
	}
	
	public void home () 
	{
		System.out.println("home is: 2BHK");
	}
	

}

class son extends  InheritanceClass // --> child class
{
	public void mobile () // --> own proprerty 
	{
		System.out.println("mobile is: nokia");
	}
}

// yat only father chi child kade traster hote 
// abd son ch obj creat karto