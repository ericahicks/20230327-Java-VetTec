package com.skillstorm;

/**
 * Contains utility methods for parsing URLs.
 *
 */
public class GroupWork {
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

		if (url.contains("/user/")) {
			int user = url.indexOf("/user/");
			int endOfUsername;
			if (url.substring(user + 6, url.length() - 1).contains("/")) {
				endOfUsername = url.indexOf("/", user + 6);
			} else {
				endOfUsername = url.length();
			}
			String userId = url.substring(user + 6, endOfUsername);
			return Integer.parseInt(userId);
		} else {
			throw new IllegalArgumentException();
		}
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
	 * the key is empty, or the key handed in contains an illegal character in the set
	 * of characters {@literal ";", "/", "?", ":", "@", "&", "=", "+", ",", and "$"}
	 */
	public static String getQueryParameterValue(String url, String key) {
		String[] parts = url.split("\\?");
		if (parts.length < 2) {
			return null; // No query parameters
		}

		String query = parts[1];
		String[] params = query.split("&");
		for (String param : params) {
			String[] keyValue = param.split("=");
			if (keyValue.length == 2 && keyValue[0].equals(key)) {
				return keyValue[1];
			}
		}
		return null; // No user_id parameter found
	}

}
