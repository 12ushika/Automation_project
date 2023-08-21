package Absreact;

abstract public class Animal { // parent class first absract method banvne
	
	abstract public void animalname(); // allowed method banvli ki 1 normal method banvavi lagte karan ti overridding hot asate mahnun
	
	public void animal_color() 
	{
		System.out.println("black");
	}

}
	
// child class banvte and extend karne parent class ch	// child class banvto karan abstract method complet sathi
	
class child_class extends Animal // concreat class implect abstract method complet karto mahnun
	{
		public void animalname() 
		{
			System.out.println("dog");
		}
	}

class text{
	public static void main(String[] args) {
		
     // child class ch onject creat karnr
		child_class sourabh = new child_class();
		sourabh.animal_color();
		sourabh.animalname();
		
	}


}