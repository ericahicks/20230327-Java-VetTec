package com.skillstorm.training.day3;
import java.io.*;
import java.util.Scanner;

// File IO 
//  input/output
//  options available: InputStream/OutputStream  -- for bytes
//                     FileInputStream/FileOutputStream -- 
//                     BufferedInputStream/BufferedOutputStream
//                     FileReader/FileWriter -- for characters
//                     BufferedFileReader/BufferedFileWriter 
public class FileIOExample {

	public static void main(String[] args) throws Exception {
		// TODO read from a file and print to the console
		try (InputStream in = new FileInputStream(new File("hello.txt"))) {
			int b;
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// try-with-resources blocks -- can only be used with objects that implement AutoCloseable
		// instead of try-catch-finally
//		try (Scanner in = new Scanner(System.in); // 
//				Stuff s = new Stuff()) { // calls the close methods for us, in the opposite order the objects were created
//			in.nextLine();
//			throw new NullPointerException();
//		} catch (Exception e) {
//			System.out.println("exception was thrown");
//		}
	}

}
class Stuff implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Closing the stuff");
		
	}
	
}

