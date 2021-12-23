package mvnSonar;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	//constructor of type person
	public Person (String firstIn, String lastIn, int ageIn) {
		firstName = firstIn;
		lastName = lastIn;
		age = ageIn;
	}
	
	//set the first name
	public void setFirstName(String firstIn) {
		firstName=firstIn;
	}
	
	//set the last name
	public void setLastName(String lastIn) {
		lastName = lastIn;
	}
	
	//set age
	public void setAge(int ageIn) {
		age = ageIn;
	}
	
	//return first name
	public String getFirstName() {
		return firstName;
	}
	
	//return last name
	public String getLastName() {
		return lastName;
	}
	
	//return age
	public int getAge() {
		return age;
	}
}