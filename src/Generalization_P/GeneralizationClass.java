package Generalization_P;

public interface GeneralizationClass // --> father class
{ // yat sub class creat karto and main mathe only refence deto
	// herachical inheritance use kartat 
	// sub class la overridding use karnar
       
	void car();  // je common proprty aa tyach ch reference deych
	void home();
	void money();
	
	
}
class creatobject
{
   public static void main(String[] args) 
   {
	   System.out.println("---------- son1 object---------");
	   
	   
	 son1 proprty1 = new son1();
	 proprty1.car();
	 proprty1.home();
	 proprty1.money();
	 proprty1.mobile();
	 
	 System.out.println("---------- son2 object---------");
	 
	 son2 proprty2 = new son2();
	  proprty2.bike();
	  proprty2.car();
	  proprty2.money();
	  proprty2.home();
	  
	  System.out.println("---------- son3 object---------");
	  
	  son3 property3 = new son3();
	  property3.fan();
	  property3.car();
	  property3.money();
	  property3.home();
	  
	  
   }	
   
}

class son1 implements GeneralizationClass // --> sun class 1
{
	public void mobile ()  // --> own property
	{
		System.out.println("mobile is : iphone");
	}
	
	public void car ()  // --> common property
	{
		System.out.println("car is : suv500");
	}
	
	public void home ()  // --> common property
	{
		System.out.println("home is : 2BHK");
	}
	
	public void money ()  // --> common property
	{
		System.out.println("money is : 1L");
	}
	
	
}

class son2 implements GeneralizationClass // --> sub class 2
{
	
	public void bike  ()  // --> own property
	{
		System.out.println("bike is : aventure");
	}
	
	public void car ()  // --> common property
	{
		System.out.println("car is : suzuki");
	}
	
	public void home ()  // --> common property
	{
		System.out.println("home is : 4bhk");
	}
	
	public void money ()  // --> common property
	{
		System.out.println("money is : 3L");
	}
}

class son3 implements GeneralizationClass // --> sub class 3
{
	
	public void fan  ()  // --> own property
	{
		System.out.println("fan is : prestige");
	}
	
	public void car ()  // --> common property
	{
		System.out.println("car is : gusto");
	}
	
	public void home ()  // --> common property
	{
		System.out.println("home is : 10bhk");
	}
	
	public void money ()  // --> common property
	{
		System.out.println("money is : 10L");
	}
}
