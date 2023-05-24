package com.skillstorm.training.day2;

/*
 * Class built to hold data. Data is added and removed in a LIFO manner.
 * The Stack has a capacity restriction, so it cannot add elements indefinetely.
 */
public class Stack<E> {
	
	private final int CAPACITY;
	private int size;
	private Object[] data; // null
	
	public Stack() {
		this.CAPACITY = 16;
		this.size = 0;
		this.data = new Object[CAPACITY]; // new E[CAPACITY] does not work because we can't create an array of generics
	}
	
	public Stack(int capacity) {
		this.CAPACITY = capacity;
		this.size = 0;
		this.data = new Object[capacity]; // new E[capacity] does not work because we can't create an array of generics
	}
	
	public void push(E e) {
		// check if stack is full
		if (size == CAPACITY)
			throw new IllegalStateException("Stack is full. Cannot add more elements.");
		// check if the element is null, don't allow null elements
		if (e == null)
			throw new NullPointerException("Element cannot be null.");
		// Add the element on the end of the list
		this.data[size] = e;
		// Increment the size
		size++;
	}
	
	public E pop() {
		// check if the stack is empty
		if (size == 0) 
			throw new IllegalStateException("Stack is empty.");
		// remove the element at the end of the list
		size--;
		E e = (E) this.data[size]; 
		this.data[size] = null; // release the memory
		return e;
	}
	
	public E peek() {
		// check if the stack is empty
		if (size == 0) 
			return null;
		// return the element 
		return (E) this.data[size - 1];
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		String str = "Stack: \n";
		if (size == 0 ) str += "Stack is empty";
		for (int i = size - 1; i >= 0; i--) {
			str += "   " + this.data[i] + "\n";
		}
		return str;
	}
}
