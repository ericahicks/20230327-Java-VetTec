package com.skillstorm.training.day1.custom;

import java.util.NoSuchElementException;

public class TestLinkedList {
	
	public static void main(String[] args) {
		Node<String> n = new Node<>();
		System.out.println(n);
		
		Node<String> n2 = new Node<>("something", null, null);
		
		n2.setPrev(n);
		n.setNext(n2);
		
		System.out.println(n2);
		System.out.println("Prev of n2 is " + n2.getPrev());
		System.out.println("Next of n is " + n.getNext());
		
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add("nada");
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add("more stuff");
		System.out.println(ll);
		System.out.println(ll.size());
		
		// Check the head and tail are as expected
		System.out.println(ll.getHead());
		System.out.println(ll.getTail());
		// Check the head's next field
		System.out.println(ll.getHead().getNext());
		System.out.println(ll.getTail().getPrev());
		
		// Empty List
		LinkedList<String> lst = new LinkedList<>();
		try {
			System.out.println(lst.get(0));
		} catch (IndexOutOfBoundsException e) {
//			e.printStackTrace();
		}
		
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
//		System.out.println(ll.get(2));
		
		System.out.println(ll.remove(0));
		System.out.println(ll);
		System.out.println(ll.remove(0));
		System.out.println(ll);
		try {
			System.out.println(ll.remove(0));
		} catch (IndexOutOfBoundsException e) {
		 System.out.println("Error was " + e.getMessage());
		}
		
		// Remove last test
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		System.out.println(ll.remove(4));
		System.out.println(ll);
		System.out.println(ll.remove(1));
		System.out.println(ll);
		System.out.println(ll.remove(1));
		System.out.println(ll);
		
		System.out.println("=========================");
		LinkedList<String> names = new LinkedList<>();
		names.add("Tony");
		names.add("Tenzin");
		names.add("Daun");
		names.add("Jaycie");
		names.add("Senia");
		names.add("Blake");
		// remove randomly
		for (int i = names.size(); i > 0; i--) {
			// generate random number between 0 and size
			int r = (int) (Math.random() * names.size());
			System.out.println(names.remove(r));
		}
		
		// Testing indexOf
		LinkedList<Character> nums = new LinkedList<>();
		try {
			int index = nums.indexOf('1');
			System.out.println(index);
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		nums.add('1');
		nums.add('2');
		nums.add('3');
		nums.add('4');
		System.out.println(nums.indexOf('3'));
	}

}
