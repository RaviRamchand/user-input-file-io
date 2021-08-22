package sheridan;

import java.util.Scanner;

public class FileOperationsTest {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in); 
		String firstName;
		String lastName; 
		int id;	
		boolean again = true;

		while(again) {
			System.out.print("Enter your first name: ");
			firstName = input.next();

			System.out.print("Enter your last name: ");
			lastName = input.next();

			System.out.print("Enter your id: ");
			id = input.nextInt();

			FileOperations fo = new FileOperations(firstName, lastName, id);
			fo.writeFile();
			
			System.out.print("Would you like to create another user? (true = yes/false = no): ");
			again = input.nextBoolean();
			
			System.out.println("Your file entries: \n");
			fo.readFile();			
		}
		
		System.exit(1);
		
		input.close();

		//End of main method
	}


	//End of FileOperationsTest class
}
