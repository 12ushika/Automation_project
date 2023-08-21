package Constracter;

public class bank {

	private String Accountname;
	private int Accountnumber;
	
	public bank(String Accountname, int Accountnumber)
	{
		this.Accountname=Accountname;
		this.Accountnumber=Accountnumber;
	}
	
	
	
	public void Accname() 
	{
		System.out.println("Rushika Nimkar");
	}	 
	
	public void Accnum() 
	{
		System.out.println(32542);
	}
	
	
	public static void main(String[] args) 
	{
		bank Account = new bank("IBM",10);
		Account.Accname();
		Account.Accnum();

	}

}
