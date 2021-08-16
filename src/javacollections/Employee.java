package javacollections;

public class Employee {
	int EmpId;
	String EmpName, EmpAddress, EmpDesignation, EmpDob;
	public Employee(int empId, String empName, String empDesignation, String empAddress, String empDob) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAddress = empAddress;
		EmpDesignation = empDesignation;
		EmpDob = empDob;
	}
	public int getEmpId() {
		return EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public String getEmpDesignation() {
		return EmpDesignation;
	}
	public String getEmpDob() {
		return EmpDob;
	}
	
}
