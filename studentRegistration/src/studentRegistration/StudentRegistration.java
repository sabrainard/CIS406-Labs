package studentRegistration;

import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		
		// Welcome
		System.out.println("Student Registration");
		System.out.println();
		
		// User Prompt
		System.out.print("Enter first name: ");
		Scanner input = new Scanner(System.in);
		String firstName = input.next();
		System.out.print("Enter last name: ");
		String lastName = input.next();
		System.out.print("Enter year of birth: ");
		int birthYear = input.nextInt();
		
		//Create variables
		String fullName = firstName + " " + lastName;
		String password = lastName + "*" + birthYear;
		
		//Display
		System.out.println();
		System.out.println("Welcome " + fullName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + password);
		
		input.close();
		
		
		
	}

}
