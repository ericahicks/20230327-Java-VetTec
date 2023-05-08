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
	
	public E get(int index) {
		// check valid index
		if (index < 0 || index > size - 1) // if size is 0 and index = 0, index < 0 is false || 0 > 0 - 1 is true
			throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
		Node<E> n = head;
		
		for (int i = 0; i < index; i++) {
			n = n.getNext();
		}
		return n.getValue();
	}
	
	public E remove(int index) {
		if (index < 0 || index > size - 1) // if size is 0 and index = 0, index < 0 is false || 0 > 0 - 1 is true
			throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
		// case where there is 1 element
		Node<E> n = head;
		if (size == 1) {
			n = head;
			head = null;
			tail = null;
		}
		// case where index is the last element
		else if (index == size - 1) {
			n = tail;
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
		}
		// case where index is the first element
		else if (index == 0) {
			n = head;
			head.getNext().setPrev(null);
			head = head.getNext();
		} else {
			// case where index is a middle element
			n = head;
			for (int i = 0; i < index; i++) {
				n = n.getNext();
			}
			// set the prev's next to the next
			n.getPrev().setNext(n.getNext());
			// set the next's prev to the prev
			n.getNext().setPrev(n.getPrev());
		}
		size--;
		return n.getValue();
	}
	
	// package private
	Node<E> getHead() {
		return head;
	}
	
	Node<E> getTail() {
		return tail;
	}
	
}
