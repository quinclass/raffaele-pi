package it.quin.firstweek.ex1809;

public class Ex1809 {

	
	public static int fatt(int n) {
		if (n == 1)
			return 1;
		return n * fatt(n - 1);
	}

	public static int min(int... arr) {
		int min = Integer.MAX_VALUE;
		if (arr == null || arr.length == 0)
			return min;

		for (int val : arr) {
			if (val < min)
				min = val;
		}
		return min;

	}

	public static int max(int... arr) {
		int max = Integer.MIN_VALUE;
		if (arr == null || arr.length == 0)
			return max;

		for (int val : arr) {
			if (val > max)
				max = val;
		}
		return max;

	}

}
