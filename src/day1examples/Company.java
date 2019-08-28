package day1examples;

public class Company {
	Person personObj;

	public Company(Person personObj) {
		super();
		this.personObj = personObj;
	}
	
	public Person swapNames(){
		String firstName=personObj.getFirstName();
		String lastName=personObj.getLastName();
		String temp=firstName;
		firstName=lastName;
		lastName=temp;
	
		personObj.setFirstName(firstName);
		personObj.setLastName(lastName);
		
		return personObj;
		
	}
}
