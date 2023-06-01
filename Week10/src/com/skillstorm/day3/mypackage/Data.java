package com.skillstorm.day3.mypackage;

import java.util.*;
import java.util.stream.Collectors;


class TestClass {
	public static void filterData(ArrayList<Data> dataList, java.util.function.Predicate<Data> f) { 
		// MyFilter is not a functional interface, so I cannot hand a lambda for this parameter
		// funtional interface = interface with one abstract method
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (f.test(i.next())) {
				i.remove();
			}
		}
	}
	
	// Built-in functional interfaces that Java provides
	/*
	 * Supplier - takes in no parameters, and returns a value
	 * Consumer - takes in one parameter and returns nothing
	 * Predicate - takes in one parameter and returns boolean
	 * Function<E, T> - takes in one parameter and returns a value of the same or different type
	 */
	// How can you write a lambda that checks if the value == 0?
	// (x) -> x == 0

	public static void main(String[] args) {
		ArrayList<Data> al = new ArrayList<Data>();
		Data d = new Data(1);
		al.add(d);
		d = new Data(2);
		al.add(d);
		d = new Data(0);
		al.add(d);
//		filterData(al, (x) -> x == 0); The target type of this expression must be a functional interface
//		filterData(al, (x) -> x == 0); // The target type of this expression must be a functional interface
//		filterData(al, (x) -> x.value == 0);
//		al.removeIf((x) -> x.value == 0);
		al = (ArrayList<Data>) al.stream().filter((x) -> x.value != 0).collect(Collectors.toList()); // TODO why is 0 not removed?
		System.out.println(al);
	}
}

public class Data {
	int value;

	public Data(int x) {
		this.value = x;
	}

	public String toString() {
		return "" + value;
	}

}

class MyFilter implements java.util.function.Predicate<Data> {
	public boolean test(Data d) {
		return d.value == 0;
	}
}
