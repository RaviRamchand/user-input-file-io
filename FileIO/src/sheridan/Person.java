package sheridan;

public class Person {
	//Field Variables
	private String _firstName;
	private String _lastName;
	private int _id;
	
	//Methods 
	//Constructors
	public Person() {
		this._firstName = "";
		this._lastName = ""; 
		this._id = 0;
	}
	
	public Person(String firstName, String lastName, int id) {
		this._firstName = firstName; 
		this._lastName = lastName;
		this._id = id;
	}
	
	public String getFirstName() {
		return this._firstName;
	}
	
	public String getLastName() {
		return this._lastName;
	}
	
	public int getId() {
		return this._id;
	}
	
	public String toString() {
		return getFirstName() +" " +getLastName() +" " +getId();
	}
	
	//End of Person class
}
