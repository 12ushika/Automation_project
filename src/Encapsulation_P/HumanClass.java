package Encapsulation_P;

public class HumanClass {
	// encapsulation use for security 
	// nehami use private keyword and creat veriable
	// used get and set method

	public static void main(String[] args) 
	{
		HumanClass sau = new HumanClass();
		System.out.println(sau.setage(25));
		System.out.println(sau.setname ("sourabh"));
		

	} 
	
	private int age;  // creat veriable and reture pahije tar implement sathi method creat karto
	private String name;
	
	public int getage ()// input deto only kay retun pahije he lihto yat
	{
		return age;
	}
	
	public int setage(int a) // value taknya sathi use hoto
	{
		return a;
	}
	
	public String getname ()// input deto only kay retun pahije he lihto yat
	{
		return name;
	}
	
	public String setname(String n) // value taknya sathi use hoto
	{
		String name =n;
		return name;
	}
	
}
