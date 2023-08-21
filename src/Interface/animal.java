package Interface;

public interface animal {
	public void animalsound(); // abstract method banvne
	  public void sound();
		
	}
	class Cat implements animal 
	{
		public void animalsound() // 2 ni incomplete method ithe create karne
		{
			System.out.println("i love cat");
		}

	     public void sound() 
	     {
	    	 System.out.println("mau mau");
	     }
	}

	class demo
	{
	public static void main(String[] args) 
	{
	   Cat blacky = new Cat ();
	   blacky.animalsound();
	   blacky.sound();
	}

}
