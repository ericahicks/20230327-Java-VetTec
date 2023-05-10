package com.skillstorm.training.day3;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO put a screenshot in the chat of map containing 3 entries
		// Example 1: Adding entries
		Map<String, String> dictionary = new HashMap<>();
		dictionary.put("accuracy", "n. A certain uninteresting quality carefully excluded from human statements.");
		dictionary.put("precision", "n. Repeatable results.");
		System.out.println(dictionary);
		
		// What does put do when given the same key? It overwrites the old value
		// Example 2: Adding duplicate keys
		System.out.println("Adding accuracy again:");
		dictionary.put("accuracy", "n. Results close to the exact value.");
		System.out.println(dictionary);
		System.out.println("Adding precision definition only if absent:");
		dictionary.putIfAbsent("precision", "n. Part of the Stormer pledge of Urgent Precise Engaged.");
		System.out.println(dictionary);

		// Example 3: Integer keys and autoboxing 
		// Note: keys with numbers that start with 0 are treated as octal 0311 becomes decimal 201
		Map<Integer, String> codes = new HashMap<>();
		codes.put(0311, "Grunt");
		System.out.println(codes);
		// To preserve the 0 in a code, use a String
		Map<String, String> moreCodes = new HashMap<>();
		moreCodes.put("0311", "Grunt");
		System.out.println(moreCodes);
		
		// Example 4: Try putting a null key
		moreCodes.put(null, null); // works fine no exceptions
		System.out.println(moreCodes);
		System.out.println("Adding entry with null as key again:");
		moreCodes.put(null, "nothin'");
		System.out.println(moreCodes);
		
		// Example 5: replace(K key, V value)
		System.out.println("replacing the values stored at the keys: null and \"none\"");
		moreCodes.replace(null, "not specified"); // gets replaced
		moreCodes.replace("none", "unknown"); // no because it doesn't find the key, there is nothing to replace
		System.out.println(moreCodes);
		
		// Example 6: Adding duplicate values
		System.out.println("Adding duplicate value of \"not specified\" for the key \"none\"");
		moreCodes.put("none", "not specified");
		System.out.println(moreCodes);
		
		// Summary:
		// put - creates or overwrites if doesn't exist
		// putIfAbsent - creates (doesn't overwrite)
		// replace - overwrites (doesn't create)
		
		// Retrieval Options
		// .get(Object key) - get one value
		// .entrySet() - get all the (key, value) pairs
		// .keySet() - get all the keys
		// .values() - gets a collection of all the values
		
		// Example 7:
		Collection<String> values = moreCodes.values(); // not a snapshot, this tracks what is in the map!
		System.out.println(values);
		moreCodes.put("2336", "EOD");
		System.out.println("values is now: " + values);
		
		// Example 8:
		// Get returns the value at the key or null if no key found
		System.out.println("Get the value for key: 0311");
		System.out.println("  value is " + moreCodes.get("0311")); // "Grunt"
		System.out.println("Get the value for key: 0310");
		System.out.println("  value is " + moreCodes.get("0310")); // null
		
		// Example 9:
		Set<String> keys = moreCodes.keySet();
		System.out.println(keys);
		
		// How can I use my set of keys to iterate through my map?
		// iterator or a while loop or for loop or for each
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			// make all the values capslock
			// get the key
			String key = itr.next();
			String oldValue = moreCodes.get(key);
			String newValue = oldValue.toUpperCase();
			moreCodes.replace(key, newValue);
		}
		System.out.println("Capslock all the values:");
		System.out.println(moreCodes);
		
		// Challenge: use .entrySet() to loop through the map and put all the values to lowercase
	}
}
