package fop_LabOne_OOPs;

import java.util.Scanner;

public class CredentialService {

	public static void main(String[] args) {

		// creating local variables to assign for the parameterized constructor while
		// creating object for EmployeeDetails class
		String first__Name = "First Name", last__Name = "Last Name";

		// creating Department object
		Department department_obj = new Department();

		// running Department method to select Department
		department_obj.select_department();

		// invoking department code for the selected department to the current class
		// variable "dc" (used while creating an email address"
		String dc = department_obj.departmentCode;

		// creating objected for EmployeeDetails
		EmployeeDetails employee_obj = new EmployeeDetails(first__Name, last__Name);

		// invoking inputdata method from EmployeeDetails to get Employee's FirstName and LastName
		employee_obj.inputdata();
		first__Name = employee_obj.firstName.toLowerCase();
		last__Name = employee_obj.lastName.toLowerCase();
		
		Passwordgenerator password_obj = new Passwordgenerator();
				
		System.out.println("Dear " + employee_obj.firstName + " " + "your generated credentials are as follows:");
		System.out.println("Email --> " + first__Name + last__Name + "@" + dc + ".greatlearning.com");
		System.out.print("Password --> "); password_obj.password_generator();
		
	}
}