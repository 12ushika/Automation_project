package polymorphism;

public class Problem1 {

	// overriading and overloading
	
	private int dog; // creat private variable
	private int cat;
	private int cow;
	
	
	public Problem1(int dog, int cat, int cow) { // --> generated constraction
		super();
		this.dog = dog;
		this.cat = cat;
		this.cow = cow;
	}


	public int getDog() { // creat get and set method
		return dog;
	}


	public void setDog(int dog) {
		this.dog = dog;
	}


	public int getCat() {
		return cat;
	}


	public void setCat(int cat) {
		this.cat = cat;
	}


	public int getCow() {
		return cow;
	}


	public void setCow(int cow) {
		this.cow = cow;
	}
	
	
	public void dog(String name , int b) //--> overloading zhal he
	{
		System.out.println("only 50 dog ");
		
	}
	
	public void dog(String name , String num) 
	{
		System.out.println("ok ----");
		
	}
	
}
