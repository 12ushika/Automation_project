package getAndSet;

public class Animal {
	
	private String name;
	private String name2;
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
		this.name= name;
	}
	
	public String getName2() 
	{
		return this.name2;
	}
	
	public void setName2(String name2) 
	{
		this.name2 = name2;
	}

	public static void main(String[] args)
	{
		Animal AN = new Animal();
		AN.setName("DOG"); 
		AN.setName2("PANDA");
		
		System.out.println(AN.getName());
		System.out.println(AN.getName2());

	}

}
