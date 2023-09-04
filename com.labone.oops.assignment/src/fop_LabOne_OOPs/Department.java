package fop_LabOne_OOPs;

import java.util.Scanner;

public class Department {
	static int departmentChoice;
	String departmentCode;

	// creating department method to confirm employee's department

	void select_department() {

		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		// using Scanner class to get the input from user

		Scanner sc = new Scanner(System.in);
		departmentChoice = sc.nextInt();
		
		// using switch to action according to the input given by user and assigning the department code

		switch (departmentChoice) {
		case 1:
			// System.out.println("You have chosen Technical department");
			departmentCode = "tech";
			break;

		case 2:
			// System.out.println("You have chosen Admin department");
			departmentCode = "admin";
			break;

		case 3:
			// System.out.println("You have chosen Human Resource department");
			departmentCode = "hr";
			break;

		case 4:
			// System.out.println("You have chosen Legal department");
			departmentCode = "legal";
			break;

		default:
			System.out.println("Wrong Choice");

		}
	}
}
