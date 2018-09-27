package it.quin.secondweek.ex2409;

public class ByAge implements Filter {
	private int age;

	public ByAge(int age) {
		this.age = age;
	}

	public Boolean filter(Person p) {
		return p.getAge()>age;
	}

}
