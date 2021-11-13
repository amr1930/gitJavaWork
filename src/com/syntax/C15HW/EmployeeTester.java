package com.syntax.C15HW;

public class EmployeeTester {

	public static void main(String[] args) {
		
		Employee sarah=new Employee();
		sarah.empID=7691;
		sarah.salary=80000;
		
		System.out.println("The employee ID# "+sarah.empID+" has salary of "+sarah.salary+" and the CEO of the corporation is "+Employee.CEO);
		

		Employee mustafa=new Employee();
		mustafa.empID=2791;
		mustafa.salary=100000;
		
		System.out.println("The employee ID# "+mustafa.empID+" has salary of "+mustafa.salary+" and the CEO of the corporation is "+Employee.CEO);
	}

}
