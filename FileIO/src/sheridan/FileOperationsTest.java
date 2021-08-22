package sheridan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FileOperationsTest {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in); 
		String firstName;
		String lastName; 
		int id;	
		boolean again = true;

		while(again) {
			try {
				System.out.print("Enter your first name: ");
				firstName = input.next();

				System.out.print("Enter your last name: ");
				lastName = input.next();

				System.out.print("Enter your id: ");
				id = input.nextInt();

				if(id < 0) {
					throw new IllegalArgumentException("You must enter a number bigger than zero");
				}

				FileOperations fo = new FileOperations(firstName, lastName, id);
				fo.writeFile();

				System.out.print("Would you like to create another user? (true = yes/false = no): ");
				again = input.nextBoolean();

				System.out.println("Your file entries: \n");
				fo.readFile();	

			}
			catch(InputMismatchException e) {
				System.err.println("Invalid entry... try again.");
				input.next(); 
			}
			catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());
			}
		}

		System.exit(1);

		input.close();

		//End of main method
	}


	//End of FileOperationsTest class
}
