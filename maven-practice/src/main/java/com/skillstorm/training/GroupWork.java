package com.skillstorm.training;

/**
 * Contains utility methods for parsing URLs and file names.
 *
 */
public class GroupWork {
	// all methods are static and should be called in a static way
	private GroupWork() { } // disallow creating instances of this utility class
	

	/**
	 * Finds the url path variable /user/{id} accounting for further
	 * subpaths like {@literal https://www.skillstorm.store.com/user/12345/cart_id/5?checkout=false}
	 * @param url an absolute URL that contains the userid such as
	 *            {@literal https://www.skillstorm.store.com/user/12345}
	 * @return an int containing the users id number
	 * 
	 * @author Team Apples
	 * 
	 * @throws IllegalArgumentException if the url is null, empty, or not a valid url
	 */
	public static int getUserId(String url) {
		return 0; // TODO implemented by Team Apples (NOT Team Oranges)
	}
	

	/**
	 * Extracts the value of a url's query parameter given a url.
	 * Note: A url can contain a list of key-value pairs in the format
	 * {@literal https://www.domain.com/page?key1=value1&key2=value2}
	 * 
	 * Assumes that there is only one {@literal ?} in the url String and
	 * the key-value pairs are always separated by {@literal &}. A key might be
	 * present but not have a value such as in:
	 * {@literal https://www.domain.com/page?key1=&key2=value2}
	 * in which case an empty String is returned.
	 * 
	 * @param url a url containing query parameters
	 * @param key the name of the url's query parameter to grab the value from
	 * @return String containing the value or null if the key is not present.
	 * 
	 * @author Team Oranges
	 * 
	 * @throws NullPointerException if the url or key are null
	 * @throws IllegalArgumentException if the url is not a url, 
	 * the key is empty, or the key contains an illegal character in the set
	 * of characters {@literal ";", "/", "?", ":", "@", "&", "=", "+", ",", and "$"}
	 */
	public static String getQueryParameterValue(String url, String key) {
		return null; // TODO implemented by Team Oranges (NOT Team Apples)
	}
	
	/**
	 * Checks if the given filepath is a .csv file. Accounting for the case where the file name includes .csv
	 * but the actual file extension is something else like "mydata.csv.txt"
	 * 
	 * @param filepath  an absolute or relative filepath
	 * @return true if the filepath ends in .csv
	 * 
	 * @author ehicks
	 * 
	 * @throws IllegalArgumentException if the filepath is null, empty, or does not contain a file extension
	 */
	public static boolean isCSV(String filepath) { // numbers.csv or
													// C://home/user/numbers.csv
													// etc
		// don't want it to return true if the String filepath is "csv"
		// don't want it to return true if someone named their textfile
		// data.csv.txt
		return filepath.endsWith(".csv");
	}

}