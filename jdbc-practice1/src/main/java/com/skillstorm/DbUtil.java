package com.skillstorm;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/*
 * This class contains the code needed for querying the database
 */
public class DbUtil {
	
	/*
	 * JDBC = Java Database Connectivity
	 * - JDBC is a built-in API from the JRE
	 *    -- this is just a bunch of interfaces that define the methods you use to interact with the database
	 *    -- to actually use these interfaces we need concrete classes from the driver we downloaded
	 */
	
	/*
	 * 5 Steps to Use JDBC
	 * 1. Load the driver (this is done for us nowadays)
	 * 2. Create a connection (we will use DriverManager -- in production projects use DriverSource) -- use JPA actually
	 * 3. Create sql statement
	 * 4. Execute the sql statement
	 * 5. Read the results
	 */
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// STEP 1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// STEP 2
		String url = "jdbc:mysql://localhost:3306/bookstore";
		String user = "root";
		String password = "rootroot"; // NEVER DO THIS especially not if your code gets pushed to Github
		try (Connection conn = DriverManager.getConnection(url, user, password)) {
			// STEP 3
			Statement stmt = conn.createStatement();
			
			// STEP 4
			/*
			 * 3 execute methods
			 *    1. execute(str) returns boolean
			 *        - for SELECT, UPDATE, DELETE, INSERT
			 *    2. executeQuery(str) returns ResultSet
			 *        - for SELECT
			 *    3. executeUpdate(str) return int number of rows effected
			 *        - for INSERT, UPDATE, DELETE
			 */
			ResultSet rs = stmt.executeQuery("SELECT * FROM books");
			
			// STEP 5
			while (rs.next()) {
				// look at the results
//				rs.getString(4); // col number from table definition
				String title = rs.getString("title");
				int releaseYear = rs.getInt("year");
				System.out.println(title + " (" + releaseYear + ")");
			}
			
		}
	}
	

}
