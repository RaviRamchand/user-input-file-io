package sheridan;

import java.util.Scanner;

public class FileOperationsTest {
	public static void main(String []args) {
		Scanner input = new Scanner(System.in); 
		String firstName;
		String lastName; 
		int id;
		
		System.out.print("Enter your first name: ");
		firstName = input.next();
		
		System.out.print("Enter your last name: ");
		lastName = input.next();
		
		System.out.print("Enter your id: ");
		id = input.nextInt();
		
		FileOperations fo = new FileOperations(firstName, lastName, id);
		
		fo.writeFile();
		
		fo.readFile();
		
		input.close();
		
		//End of main method
	}
	
	//End of FileOperationsTest class
}
