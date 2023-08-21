package Constracter;

public class relationship {
	
	public String name = "Rushika";
	public String name2 = "Sourabh";
	
	public relationship(String name, String name2) 
	{
		this.name=name;
		this.name2=name2;
	}
	
	public void NE1() 
	{
		System.out.println("my sweety");
	}
	
	public void NE2() 
	{
		System.out.println("my husband");
	}

	public static void main(String[] args) 
	{
		relationship family = new relationship("Ruhika", "Sourabh");
		family.NE1();
		family.NE2();

	}

}


