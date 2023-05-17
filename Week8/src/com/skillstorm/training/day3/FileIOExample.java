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
		

	}

}

