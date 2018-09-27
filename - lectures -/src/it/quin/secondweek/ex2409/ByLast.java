package it.quin.secondweek.ex2409;

public class ByLast implements Filter {
	private String last;
	
	
	public ByLast(String last) {
		this.last = last;
	}

	@Override
	public Boolean filter(Person p) {
		return p.getSurname().contains(last);
	}

}
