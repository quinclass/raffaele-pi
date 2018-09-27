package it.quin.secondweek.ex2409;

public class Processor {
	private Filter f;

	public Processor(Filter f) { this.setFilter(f); }
	public Processor setFilter(Filter f) { this.f = f; return this; }
	
	public Processor process(Person p){
		if(f.filter(p)) System.out.println(p.toString());
		return this;
	}
	
	public Processor massive(Person... people) {
		for(Person p : people) {
			if(f.filter(p)) System.out.println(p.toString());
		}
		return this;
	}
	
}
