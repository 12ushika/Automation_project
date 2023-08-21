package InhertancePackage;

public class Tester_FT extends emplyee {
	
	private String defectlog;

	public Tester_FT(String custID, String custname) {
		super(custID, custname);
		// TODO Auto-generated constructor stub
	}

	public String defectlog() 
	{
		return defectlog;
	}
	
	
		
}

class Functinaltexter extends  Tester_FT
{
	private String textcases;
	
	public Functinaltexter(String custID, String custname) {
		super(custID, custname);
		// TODO Auto-generated constructor stub
	}
	
	
	public String textcases() 
	{
		return textcases;
	}
	
}