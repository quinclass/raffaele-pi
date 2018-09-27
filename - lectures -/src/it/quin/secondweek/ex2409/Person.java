package it.quin.secondweek.ex2409;

public class Person {
	private String name;
	private String surname;
	private int age;
	
	public Person(String name, String surname, int age) {
		this.name = name; this.surname = surname; this.age = age;
	}

	public String getName() { return name; }
	public String getSurname() { return surname; }
	public int getAge() { return age; }

	@Override
	public String toString() {
		return this.getSurname() + " " + this.getName() + " " + this.getAge();
	}	
	
	
}
