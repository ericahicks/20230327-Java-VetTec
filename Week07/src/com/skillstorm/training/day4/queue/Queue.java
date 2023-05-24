package com.skillstorm.training.day4.queue;

import java.util.NoSuchElementException;
import java.util.Objects;

public class Queue<E> {
	
	Node<E> head; // remove from the head
	Node<E> tail; // add to the tail
	int size;
	
	// 3 queue methods that throw exceptions
	// add(E e) // throws exception
	public boolean add(E e) {
		if (e == null)
			throw new NullPointerException("Element cannot be null.");
		Node<E> node = new Node<>(e, null);
		if (size == 0) {
			head = node;
			tail = node;
		} else {
			// step 1: tail.setNext
			tail.setNext(node);
			// step 2: tail = node
			tail = node;
		}
		size++;
		return true;
	}
	
	// remove()
	public E remove() {
		if (size == 0)
			throw new NoSuchElementException("The queue is empty.");
		if (size == 1) {
			E e = head.getValue();
			// set head
			head = null;
			// set tail
			tail = null;
			// decrement size
			size--;
			// return value
			return e;
		} else {
			E e = head.getValue();
			head = head.getNext();
			size--;
			return e;
		}
	}
	
	// element()
	public E element() {
		return head.getValue();
	}
	
	// 3 queue method that return a flag value (false or null)
	// offer(E e) // true or false
	public boolean offer(E e) {
		if (e == null)
			return false;
		Node<E> node = new Node<>(e, null);
		if (size == 0) {
			head = node;
			tail = node;
		} else {
			// step 1: tail.setNext
			tail.setNext(node);
			// step 2: tail = node
			tail = node;
		}
		size++;
		return true;
	}
	// poll(E e)
	public E poll() {
		if (size == 0)
			return null; // if empty
		if (size == 1) {
			E e = head.getValue();
			// set head
			head = null;
			// set tail
			tail = null;
			// decrement size
			size--;
			// return value
			return e;
		} else {
			E e = head.getValue();
			head = head.getNext();
			size--;
			return e;
		}
	}
	
	// peek()
	public E peek() {
		if (head == null)
			return null;
		return head.getValue();
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String str = "Queue: [ ";
		Node<E> node = head;
		while (node != null) {
			str += node.getValue() + " ";
			node = node.getNext();
		}
		str += "]\n";
		return str;
	}

}

class Node<E> {
	private E value;
	private Node<E> next;
	
	public Node(E value, Node<E> next) {
		this.value = value;
		this.next = next;
	}
	
	public E getValue() {
		return value;
	}
	public void setValue(E value) {
		this.value = value;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public String toString() {
		return Objects.toString(value); // null safe
	}
	
}
