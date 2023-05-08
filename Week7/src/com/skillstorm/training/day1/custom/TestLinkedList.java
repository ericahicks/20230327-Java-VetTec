package com.skillstorm.training.day1.custom;

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
	}

}
