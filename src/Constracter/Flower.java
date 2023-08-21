package Constracter;

public class Flower {// class name and constracter name is same
	// allowerd starting public name
	// constracter la obj creat kartat
	
	public String flowername;
	public String flowercolor;
	
	public Flower() // default constracter ha aso naso program mathe asatoch
	{
		
	}
	
	public Flower(String flowername, String flowercolor) // parameter constracter
	{
		this.flowername = flowername;
		this.flowercolor = flowercolor; //
	}
	
	public void flower1() // then method creat karne 
	{
		System.out.println("rose");
	}
	
	public void flower2() 
	{
		System.out.println("red");
	}
	

	public static void main(String[] args) 
	{
		Flower fl = new Flower();
		fl.flower1();
		fl.flower2();
		

	}

}
