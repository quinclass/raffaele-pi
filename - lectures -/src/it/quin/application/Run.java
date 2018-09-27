package it.quin.application;
import it.quin.firstweek.ex1809.*;
import it.quin.firstweek.ex1909.*;
import it.quin.secondweek.ex2409.*;


public class Run {
	
	public static void main(String[] args) {
		//Ex1909(30);

		new Processor(new ByLast("Ro"))
		.process(new Person("Paolo","Rossi",25)).process(new Person("Luca","Roti",17)).setFilter(new ByAge(10)).process(new Person("Carla","Livi",32));
		
		
		System.out.println("\n");
		
		new Processor(new Composite(new ByLast("Ro"), new ByAge(18)))
		.massive(
				new Person("Paolo","Rossi",25),
				new Person("Luca","Roti",17),
				new Person("Carla","Livi",32)
				);
		
		System.out.println("\n");
		
		new Processor( new Composite().add(new ByLast("R")).add(new ByAge(24)))
		.massive(
				new Person("Paolo","Rossi",25),
				new Person("Luca","Roti",27),
				new Person("Carla","Livi",32)
		);
		
	}
	
	public static void Ex1909(int n) {
		for (int i = 0; i < 10; i++) {
			System.out.println("1809   " + n + " x " + (i + 1) + " = " + n * (i + 1));
		}
		System.out.println("1809 testing fatt from fixed number " + n + " " + Ex1809.fatt(n));
		System.out.println("1809 testing min from fixed data: " + Ex1809.min(new int[] { 2, 3, 1 }));
		System.out.println("1809 testing max from fixed data: " + Ex1809.max(new int[] { 2, 3, 1 }));
	
		Ex1909 two = new Ex1909(4,3);
		System.out.println("1909  testing if same area from fixed data: " + Ex1909.compare(two, new Ex1909(2,4)));
		System.out.println("1909  output fixed data used(w h perimeter area): " + two.getW() + " " +two.getH() + " " + two.getP() + " " + two.getA());
	
	}
}
