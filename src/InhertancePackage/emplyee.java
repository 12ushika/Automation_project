package InhertancePackage;

public class emplyee {
	
	private String empID; // creat 2 veriable 
	private String empname;
	
	public emplyee (String empID, String empname) // creat constracter
	{
		this.empID = empID;
		this.empname= empname;
	}
	
	public String empID() // method creat karne variable name che
	{
		return empID;
	}
	
	public String empname() 
	{
		return empname;
	}
	
	
	
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	

}
