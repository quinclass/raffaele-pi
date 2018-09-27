package it.quin.firstweek.ex1909;

public class Ex1909 {
	private Integer w, h;

	public Ex1909() {
		this.w = 0;
		this.h = 0;
	}

	public Ex1909(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public Integer getW() {
		return w;
	}

	public Integer getH() {
		return h;
	}

	public Integer getA() {
		return w * h;
	}

	public Integer getP() {
		return (2 * w) + (2 * h);
	}

	public static Integer compare(Ex1909 arg0, Ex1909 arg1) {
		if (arg0 == null || arg1 == null)
			throw new RuntimeException(" invalid argument in compare(Ex1909 arg) ");
		return arg0.getA() - arg1.getA();
	}

	/**
	 * Object.equals override, confronting values of height and width
	 * 
	 * @exception thrown generic null
	 * @param Object
	 * @return boolean
	 */
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null)
			throw new RuntimeException(" invalid argument in override equals(Ex1909 arg0) ");
		return ((Ex1909) arg0).getW() == this.getW() && ((Ex1909)arg0).getH() ==this.getH();
	}
	
}

