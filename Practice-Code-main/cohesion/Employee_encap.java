package cohesion;

public class Employee_encap {

	private String empname = "taj";
	private String empid = "123";
	private String empaddress = "CDA";
	private double empsal = 2900f;
	
	public String getEmpName()
	{
		return empname;
	}
	public void setEmpName(String empname) {
		this.empname = empname;
		empname = "Taj";
	}
	public String getEmpId()
	{
		return empid;
	}
	public void setEmpId(String empid) {
		this.empid = empid;
		empid = "2060";
	}
	public String getEmpAddress() {
		return empaddress;
	}
	public void setEmpAddress(String empaddress) {
		this.empaddress = empaddress;
		empaddress = "CDA";
	}
	public double getSalary() {
		return empsal;
	}
	public void setEmpSal(double empsal) {
		this.empsal = empsal;
		empsal=2900f;
	}
	
	public String toString() {
		return "Employee_encap [ empname" + empname + ", empid " + empid + ", empaddress" + empaddress + ", salary " + empsal + "]";
	}
	
	
}
