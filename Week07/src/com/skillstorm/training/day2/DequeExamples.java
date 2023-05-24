package com.skillstorm.training.day2;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExamples {
	
	public static void main(String[] args) {
		/////////////////////////////////////////////////////
		// TODO create a Deque. Put a screenshot in the chat.
		Deque<String> line = new LinkedList<>();
		line.add("Sara");
		line.addFirst("Bob");
		line.addLast("Joe");
		line.add("Jane"); // Note: add adds to the end
		System.out.println(line); // Bob, Sara, Joe, Jane
		
		line.offer("Blake"); // offer is a queue method so it adds to the back (not the front)
		line.offerFirst("Senia");
		line.offerLast("Sean");
		line.offer("Jon");
		System.out.println(line); // ??? Senia, Bob, Sara, Joe, Jane, Blake, Sean, Jon ???
		
		line.poll(); // poll is a queue method so it removes from the front (not the back)
		line.pollFirst();
		line.pollLast();
		System.out.println(line); // ??? Sara, Joe, Jane, Blake, Sean ???
		
		System.out.println(line.peek()); // Queue method looks at the front
		System.out.println(line.peekFirst()); // look at front
		System.out.println(line.peekLast()); // look at back
		System.out.println(line); // line is the same
	}

}
