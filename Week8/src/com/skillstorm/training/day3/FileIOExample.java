package com.skillstorm.training.day3;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
		try (InputStream in = new FileInputStream(new File("example.txt"))) {
			int b; // for storing the byte read from the file
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
			}
		}
		
		// TODO write the contents of a string array to a file
		try (FileWriter out = new FileWriter(new File("newfile.txt"))) {
			String[] cat = {"           __..--''``---....___   _..._    __\r\n"
					, " /// //_.-'    .-/\";  `        ``<._  ``.''_ `. / // /\r\n"
					, "///_.-' _..--.'_    \\                    `( ) ) // //\r\n"
					, "/ (_..-' // (< _     ;_..__               ; `' / ///\r\n"
					, " / // // //  `-._,_)' // / ``--...____..-' /// / //\r\n"};
			for (String str : cat) {
				out.write(str);
			}
			for (String str : cat) {
				out.write(str);
			}
			for (String str : cat) {
				out.write(str);
			}
		}
		
		// TODO read from a file and write to a file
		try (InputStream in = new FileInputStream(new File("hello.txt"));
				OutputStream out = new FileOutputStream(new File("out.txt"))) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			while ((b = in.read()) != -1) { // this loop never runs, input stream is already used up
				out.write(b);
			}
		}
		
	}

	
}

