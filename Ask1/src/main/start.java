package main;

import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

public class start {

	public static int[] startScan(InputStream in, PrintStream out) {
		int[] myArray = new int[2];
		Scanner scan = new Scanner(in);
		for (int i = 0; i < 2; i++) {

			out.println("Enter integer:");
			while (!scan.hasNextInt()) {
				out.println("Input is not an integer.\n");
				scan.nextLine();
			}
			myArray[i] = scan.nextInt();
		}
		scan.close();
		return myArray;
	}
}