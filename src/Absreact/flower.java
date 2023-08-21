package Absreact;

abstract class flower { //--> parent class
	// class name and method name same pahije
	
	abstract public void flowername(); // abstarct method banvne and new class la extend kel ki name takne tyat
	
	public void flowercolor() // complete method 
	{
		System.out.println("red color flower we love it");
	}
	
}

class rose extends flower // sub class created // yalach concreat class boltat
	{
		public void flowername()  // than method create karne
		{
			System.out.println("i love rose");
		}
	}
	
class test{	
	public static void main(String[] args) {
		
		rose rushika = new rose();  //--> son class ch object creat karne
		rushika.flowercolor();
		rushika.flowername();
	
	}

}
