package InhertancePackage;

public class Developer_FS extends emplyee {
	
	private String Developsoft;

	public Developer_FS(String custID, String custname) {
		super(custID, custname);
		// TODO Auto-generated constructor stub
	}
	
	public String Developsoft() 
	{
		return Developsoft;
	}

}

class FullStackDev extends Developer_FS
{
	private String Coding;
	
	public FullStackDev(String custID, String custname) {
		super(custID, custname);
		// TODO Auto-generated constructor stub
	}
	
	public String Coding() 
	{
		return Coding;
	}
}
