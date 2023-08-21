package InhertancePackage;

public class Hyrarchicle_Inheritance // --> father class
{// yat father class la extends karaych asat saglya sub class mathe 
// 1 class multipal super class	

	public static void main(String[] args) 
	{
		System.out.println("------son1 proprty-----");
		
		son1 rushika = new son1();
		rushika.money();
		rushika.car();
		rushika.home();
		
		System.out.println("------son2 proprty-----");
		
		son2 sourabh = new son2();
		sourabh.money();
		sourabh.car();
		sourabh.mobile();
		
		System.out.println("------son3 proprty-----");
		
		son3 sau = new son3();
		sau.money();
		sau.car();
		sau.bike();
		
	}
	
	public void money () 
	{
		System.out.println("money is: 1L");
	}
	
	public void car () 
	{
		System.out.println("car is: innova");
	}

}
 class son1 extends Hyrarchicle_Inheritance // --> child class
 {
	 public void home () // --> own property
		{
			System.out.println("home is: 2BHK");
		}
	 
 }
 
 class son2 extends Hyrarchicle_Inheritance // --> child class
 {
	 public void mobile () // --> own property
		{
			System.out.println("mobile is: nokia");
		}
	 
 }
 
 class son3 extends Hyrarchicle_Inheritance // --> child class
 {
	 public void bike () // --> own property
		{
			System.out.println("bike is: aventure");
		}
	 
 }