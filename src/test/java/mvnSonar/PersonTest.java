package mvnSonar;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	
	Person p1 = new Person("David", "McDaid", 21);
	
	@Test
	public void testGetAge() {
		int age = p1.getAge();
		assertEquals(21, age);
	}
	/*
	@Test
	public void testGetFirstName() {
		String firstName = p1.getFirstName();
		assertEquals("David", firstName);
	}
	
	@Test
	public void testGetLastName() {
		String lastName = p1.getLastName();
		assertEquals("McDaid", lastName);
	}
	
	@Test
	public void testSetAge() {
		p1.setAge(10);
		assertEquals(10, p1.getAge());
	}
	
	@Test
	public void testSetFirstName() {
		p1.setFirstName("John");
		assertEquals("John", p1.getFirstName());
	}
	
	@Test
	public void testSetLastName() {
		p1.setLastName("Doe");
		assertEquals("Doe", p1.getLastName());
	}*/

}