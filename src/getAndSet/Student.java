package getAndSet;

public class Student { // data prite thevnya sathi used hotat manje to koni change nahi kel pahije tar used kartat
	
	private String name ; // allowed private used kartat
	private int rollnumber;
	
	// geter sathi
	
	public int getRollNumber() // int ka used kel karan return yenar aa aalya la kahi tari mahnun
	{
		return this.rollnumber; //--> only aapan return kay pahije te takto
	}
	
	// seter sathi
	public void setRollNumber(int rollnumber) //--> void ka ghetla karan return kahi nahi yenar aa mahnu
	{
		this.rollnumber =rollnumber; //--> set mathe aapn value input karto
	}
	
	
	public String getName() 
	{
		return this.name;
	}
	
	public void setName(String name) 
	{
	   this.name = name;
		
	}
	

	public static void main(String[] args) 
	{
		Student NE = new Student();
		NE.setName("Rushika"); // --> main mathod mathe set chi value takto
		NE.setRollNumber(10);
		
	 System.out.println(NE.getName()); // --> return pahije mahnun get ka print mathe takl
	 System.out.println(NE.getRollNumber());

	}

}
