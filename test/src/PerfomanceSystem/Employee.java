package PerfomanceSystem;

 public class Employee {
	private String EmpName;
	private int EmpId;
	private String EmpDep;
	public Employee(String empName, int empId, String empDep) {
		super();
		this.EmpName = empName;
		this.EmpId = empId;
		this.EmpDep = empDep;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpDep() {
		return EmpDep;
	}
	public void setEmpDep(String empDep) {
		EmpDep = empDep;
	}
	
	public void Profile1() {
		System.out.println("Employee details");
		System.out.println("Name :"+getEmpName());
		System.out.println("Employee id"+getEmpId());
		System.out.println("Department "+getEmpDep());
	}
     
}
