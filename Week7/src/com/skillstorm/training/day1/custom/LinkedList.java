package com.skillstorm.training.day1.custom;

public class LinkedList<E> {
	
	private Node<E> head;
	private Node<E> tail;
	
	private int size;
	
	public LinkedList() { }

	public int size() {
		return size;
	}
	
	public void add(E e) {
		// check the size
		if (size == 0) {
			head = new Node<E>(e, null, null);
			tail = head;
			size++;
		} else {
			// append to end
			Node<E> n = new Node<E>(e, null, null);
			Node<E> oldTail = tail;
			// update the tail
			tail = n;
			// update the tail's prev
			n.setPrev(oldTail);
			// update the oldtail's next
			oldTail.setNext(n);
			size++;
		}
	}

	@Override
	public String toString() {
		String values = "[";
		// null checks
		if (head == null) {
			values += "]";
		} else {
			// Iterate through the nodes and get the values until find a Node with next == null
			Node<E> n = head;
			while (n != null) {
				// get the value
				values += n.getValue();
				// update n
				n = n.getNext();
				if (n != null)
					values += ", ";
			}
			values += "]";
		}
		return values;
	}
	
	// package private
	Node<E> getHead() {
		return head;
	}
	
	Node<E> getTail() {
		return tail;
	}
	
}
