package sheridan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperations{
	//Fields
	ArrayList<Person> _pList = new ArrayList<Person>();

	//Methods 
	//Constructors 
	public FileOperations(String firstName, String lastName, int id) {
		this._pList.add(new Person(firstName, lastName, id));
	}	

//Write to the file
	public void writeFile() {

		try {
			FileWriter fw = new FileWriter("student.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter writer = new PrintWriter(bw);

			
			for(Person p : _pList) {
				writer.println(p.getFirstName() +"," +p.getLastName() +"," +p.getId());
			}

			System.out.println("Write Successful \n");
			writer.close();

		}
		catch(IOException e) {
			e.printStackTrace();
		}

		//End of writerFile()
	}

	public void readFile() {
		Scanner reader = null;
		
		try {
			this._pList.clear();
			File fileDesc = new File("student.txt");
			reader = new Scanner(fileDesc);

			while(reader.hasNext()) {
				String record = reader.nextLine();
				String[] fields = record.split(",");
				this._pList.add(new Person(fields[0], fields[1], Integer.parseInt(fields[2])));
			}

			for(Person p : this._pList) {
				System.out.println(p);
			}

			System.out.println("Read Successful \n");

		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(reader != null) {
				reader.close();
			}
		}
	}

	//End of FileOperations class
}
