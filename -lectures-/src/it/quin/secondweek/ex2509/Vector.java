package it.quin.secondweek.ex2509;

public class Vector {
	private int[] data;
	
	public Vector() { data = new int[] {}; }
	
	public int size() { return data.length; }

	public int get(int index) {
		if(index < 0 || index >= data.length) throw new IllegalArgumentException();
		return data[index];
	}

	public void add(int value) {
		int [] temp = new int[data.length+1];
		for(int i=0;i<data.length;i++) temp[i]=data[i];
		temp[data.length]=value;
		data = temp;
		
	}
	
}
