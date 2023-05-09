package com.skillstorm.training.day2.groupwork;
public class Stack<E> {
	
	Node<E> top;
	int size;
	
	public Stack() {
		// defaults top to null and size to 0
	}
	
	public E pop() {
		if (size == 0)
			throw new IllegalStateException("Stack is empty");
		
		// Get the top node's value
		Node<E> node = top;
		E value = node.getValue();
		// change the top to be the one below, unlink the node removed, decrease the size
		top = node.getPrev();
		node.setPrev(null); // unlink
		size--;
		return value;
	}
	
	public void push(E e) {
		// Create a node to hold the element and a pointer to the previous top
		Node<E> node = new Node<>(e); 
		node.setPrev(top);
		top = node; // update the top
		size++;
	}
	
	public E peek(E e) {
		if (size == 0) 
			return null;
		// Get the top node and value to return
		return top.getValue();
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String str = "Stack";
		if (size == 0) 
			str += " is empty.\n";
		else
			str += ": \n";
		
		Node<E> n = top;
		while (n != null) {
			str += n.getValue() + "\n";
			n = n.getPrev();
		}
		return str;
	}

}