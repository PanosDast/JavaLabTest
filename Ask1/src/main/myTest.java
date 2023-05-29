package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import java.io.*;
//import java.nio.file.*;
//import java.nio.*;

class myTest {

	@Test
	void testPOS() {
	myCompare tester = new myCompare();
	assertEquals("POSITIVE", tester.reduce(10, 5), "10-5 must be >0");
	}
	
	@Test
	void testNEG() {
	myCompare tester = new myCompare();
	assertEquals("NEGATIVE", tester.reduce(5, 10), "5-10 must be >0");
	}
	
	@Test
	void testInputNotInt() throws Exception {
		
	
	int[] testArr = start.startScan(System.in, System.out);
	Class arrClass = testArr.getClass();
	assertEquals(int.class, arrClass.getComponentType(), "Array doesn't contain integers.");
	}

	//String filePath = "C:\\Users\\ELiZA\\eclipse-workspace\\Ask1\\src\\main\\data.txt";
		//byte[] bytes = Files.readAllBytes(Paths.get(filePath));	
		//InputStream inp = new FileInputStream("C:\\Users\\ELiZA\\eclipse-workspace\\Ask1\\src\\main\\data.txt");
		//final ByteBuffer inp = ByteBuffer.wrap(bytes);
	    //bb.order(ByteOrder.LITTLE_ENDIAN);
	    //InputStream input = inp.getInt();
		//System.setIn(input);
		
}
