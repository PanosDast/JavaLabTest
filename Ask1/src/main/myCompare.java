package main;

public class myCompare {
	public String reduce(int x, int y) {
		int z;
		z = x - y;
		if (z >= 0) {
			return "POSITIVE";
		}
		else {
			return "NEGATIVE";
		}
	}
}