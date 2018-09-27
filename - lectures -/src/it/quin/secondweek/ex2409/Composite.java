package it.quin.secondweek.ex2409;

public class Composite implements Filter{
	private Filter[] f;
	
	public Composite(Filter... f) { this.f = f; }
	public Composite() { f = new Filter[] {}; }
	
	public Composite add(Filter newFilter) {
		Filter [] temp = new Filter[f.length+1];
		System.arraycopy(f, 0, temp, 0, f.length);
		temp[f.length]=newFilter;
		f = temp;
		return this;
	}
	
	@Override
	public Boolean filter(Person p) {
		for(Filter check : f) {
			if (!check.filter(p)) {
				return false;
			}
		}
		return true;
	}

}
