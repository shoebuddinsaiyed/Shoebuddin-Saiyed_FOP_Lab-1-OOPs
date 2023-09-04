package fop_LabOne_OOPs;

import java.util.Scanner;

public class EmployeeDetails {

	String firstName, lastName;

	void inputdata() {

		// inputing data from the user using Scanner

		System.out.println("Please enter your First Name");
		Scanner sc = new Scanner(System.in);
		firstName = sc.next();
		System.out.println("Please enter your Last Name");
		lastName = sc.next();
		
	}

	// using parameterized constructor
	EmployeeDetails(String first_Name, String last_Name) {
		first_Name = firstName;
		last_Name = lastName;
	}
}
