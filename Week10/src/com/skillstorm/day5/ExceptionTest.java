package com.skillstorm.day5;

import java.io.IOException;
import java.sql.SQLException;

class NewException extends Exception {
}

class AnotherException extends Exception {
}

public class ExceptionTest {
	/*
	 * When is the catch block required?
	 * try (FileReader f = new FileReader(new File()) { 
	 * 
	 * } // Dont need it because it has that implied finally close everything
	 * 
	 * try {
	 *   // some code here
	 * } finally {
	 *   // more code
	 * }
	 * 
	 * try {
	 * 
	 * } // REQUIRED to have finally or catch or resource or else this try is useless
	 * 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		try {
			m2();
		} catch (Exception e) {
			throw new NullPointerException();
		}finally {
			m3();
		}
	}

	public static void m2() throws NewException {
		throw new NewException();
	}

	public static void m3() throws AnotherException{  
		throw new AnotherException();  
	}
/*
   void m1() throws Exception{
	   try{
		   myMethod();
	   }
	   catch (IOException e){
		   try {
	       throw new SQLException();
		   } catch (SQLException ex) {
		       throw new InstantiationException();
		   }
		   
	   }
	   catch(SQLException e){
	       throw new InstantiationException();
	   }
	   finally{
	      throw new CloneNotSupportedException(); // this is not a RuntimeException.
	   }
	}
   */
   void myMethod() throws IOException {
	   throw new IOException();
   }
   
   void myMethod2() throws SQLException {
	   throw new SQLException();
   }
}