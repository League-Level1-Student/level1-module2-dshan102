package _01_getters_and_setters;

public class Person_Runner {
	public static void main(String[] args) {
		Person1 person1 = new Person1();
		Person2 person2 = new Person2();
		Person3 person3 = new Person3();
		person1.setName("Person1");
		person2.setName("Person2");
		person3.setName("Person3");
		person1.setSuperpower("Walking");
		person2.setSuperpower("Eating");
		person3.setSuperpower("Jumping");
		person1.getName();
		person2.getName();
		person3.getName();
		person1.getSuperpower();
		person2.getSuperpower();
		person3.getSuperpower();
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
	}
	
}
