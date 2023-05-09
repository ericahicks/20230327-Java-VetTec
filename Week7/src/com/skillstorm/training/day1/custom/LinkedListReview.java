package com.skillstorm.training.day1.custom;

public class LinkedListReview {
	
	public static void main(String[] args) {
		// create a LinkedList
		LinkedList<String> pets = new LinkedList<>();
		pets.add("dog");
		pets.add("cat");
		pets.add("fish");
		System.out.println(pets);
		// make it circular
		Node<String> head = pets.getHead();
		Node<String> tail = pets.getTail();
		head.setPrev(tail);
		tail.setNext(head);
		print(pets); // circular
	}
	
	public static <E> void print(LinkedList<E> lst) {
		Node<E> n = lst.getHead();
		while (n != null) {
			// print the value
			System.out.println(n.getValue());
			// update n
			n = n.getNext();
		}
	}
}
