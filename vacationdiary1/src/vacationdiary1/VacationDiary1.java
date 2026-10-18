// Stephanie Brainard CIS406 Week 2 Vacation Diary 1 
package vacationdiary1;

import java.util.Scanner;

public class VacationDiary1 {

	public static void main(String[] args) {
		
		// Welcome
		System.out.println("Vacation Diary");
		System.out.println();
		
		// Prompt for vacation information
		System.out.print("Enter Date Vacation Started (mm/dd/yyyy): " );
		Scanner input = new Scanner(System.in);
		String date = input.next();
		System.out.print("Enter City Visited: ");
		String city = input.next();
		System.out.print("Enter Country Visited: ");
		String country = input.next();
		System.out.print("Enter Number of Days: ");
		int days = input.nextInt();
		System.out.print("Enter Mode of Travel (car, airplane, ship, train, bus):  ");
		String mode = input.next();
		System.out.println();
		
		// Display vaction details
		System.out.println("Details of your trip:");
		System.out.println("Date: " + date);
		System.out.println("City: " + city);
		System.out.println("Country : " + country);
		System.out.println("Number of Days: " + days);
		System.out.println("Traveled By: " + mode);
		System.out.println("Enjoy your vacation!!!");
		
		
		// Close Scanner object
		input.close();
		
		
		
		
	}

}
