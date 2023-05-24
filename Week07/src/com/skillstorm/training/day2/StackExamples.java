package com.skillstorm.training.day2;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class StackExamples {
	
	public static void main(String[] args) {
		// Example 1:
		Deque<Integer> stack1 = new LinkedList<>();
//		System.out.println(stack1.pop()); // Exception in thread "main" java.util.NoSuchElementException
		System.out.println(stack1.peek());
		
		// Example 2: Add to the stack
		Deque<String> food = new LinkedList<>();
		food.push("canned tuna");
		food.push("canned chicken");
		food.push("tomato soup");
		food.push("chicken soup");
		food.push("black beans");
		food.push("garbanzo beans");
		System.out.println("My pantry has: " );
		prettyPrintStack((LinkedList<String>) food);
		
		
//		while (food.peek() != null) {
//			System.out.println(food.pop());
//		}
		

		System.out.println("For lunch I'll grab some " + food.pop());
		System.out.println();
		System.out.println("My pantry has: " );
		prettyPrintStack((LinkedList<String>) food);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		// Alternative way to print out elements in a Stack
		Iterator<String> itr = food.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		itr = food.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		prettyPrintStack((LinkedList<String>) food);
	}
	
	// Pretty Print the Stack
	public static <E> void prettyPrintStack(LinkedList<E> list ) {
		// To see the contents of my stack 
/*
 --------------
 garbanzo beans
 black beans
 chicken soup
 tomato soup
 canned chicken
 canned tuna
 --------------
*/
		System.out.println("--------------");
		System.out.println("|     TOP     |");
		System.out.println("--------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------");
	}

}
