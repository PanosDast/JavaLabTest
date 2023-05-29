package main;

public class myMain {

	public static void main(String[] args) {
		myCompare c = new myCompare();
		int[] myAr = start.startScan(System.in, System.out);
		String res = c.reduce(myAr[0], myAr[1]);
		System.out.println("The result is " + res);

	}
}
