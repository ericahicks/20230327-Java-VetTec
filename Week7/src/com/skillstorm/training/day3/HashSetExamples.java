package com.skillstorm.training.day3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
		/*
		 * Methods available:
		 * 
		 * add(E)
		 * remove(Object)
		 * contains(Object)
		 * 
		 * size()
		 * isEmpty()
		 */
		// TODO print out the contents after running and put it in the chat
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println("Adding 3 again? " + nums.add(3));
		System.out.println(nums);
		
		Iterator<Integer> itr = nums.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().hashCode());
		}
		
		Set<String> cookies = new HashSet<>();
		cookies.add("snickerdoodle");
		cookies.add("chocolate chip");
		cookies.add("sugar cookie");
		
		System.out.println(cookies);

		Iterator<String> itr2 = cookies.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next().hashCode());
		}
		
		// example 2: Remove and check the size
		cookies.remove("sugar cookie");
		System.out.println("size is now " + cookies.size());
		System.out.println(cookies);
		System.out.println("Removing sugar cookies again? " + cookies.remove("sugar cookie"));
		
		System.out.println("because cookies contains sugar cookie is " + cookies.contains("sugar cookie"));
		
		// Does set have a remove method that takes an int? Why or why not?
		// No, because a Set does not have an order of items we can't reference the "second" etc.
		
		// Example 3: isEmpty()
		System.out.println("We can check is the set empty? " + cookies.isEmpty());
		System.out.println("We can empty the set. ");
		cookies.clear();
		System.out.println(cookies);
		System.out.println("We can check is the set empty? " + cookies.isEmpty());
	}

}
