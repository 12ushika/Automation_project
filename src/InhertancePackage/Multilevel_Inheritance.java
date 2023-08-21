package InhertancePackage;

public class Multilevel_Inheritance // --> father class
{// 3 or more class lagtat
 // yat father class la extends karto child class 1 la
// than child class extends	extend karto child class 2 la tya veli child class 1 ha father class asto

	public static void main(String[] args) 
	{
		son5 damri = new son5();
		damri.whatapp1();
		damri.whatapp2();
		damri.whatapp3();
		
	}

	public void whatapp1() 
	{
		System.out.println("whatapp1 is : good feature");
	}
	
}

class son4 extends Multilevel_Inheritance // --> child class than super class hoto
{
	public void whatapp2() 
	{
		System.out.println("whatapp2 is : better feature");
	}
}

class son5 extends son4 // --> child class
{
	public void whatapp3() 
	{
		System.out.println("whatapp3 is : outoff stock feature");
	}
}