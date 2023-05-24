package com.skillstorm.training.day2.groupwork;

public class Node<E> {
	private E value;
	private Node<E> prev;
	
	public Node() {
		// sets value and prev to null
	}
	
	public Node(E e) {
		value = e;
		prev = null;
	}
	
	public E getValue() {
		return this.value;
	}
	
	public void setValue(E e) {
	    this.value = e;
	}
	
	public Node<E> getPrev() {
		return this.prev;
	}
	
	public void setPrev(Node<E> n) {
		this.prev = n;
	}
	
	@Override
	public String toString() {
		return "" + this.value;
	}
}
