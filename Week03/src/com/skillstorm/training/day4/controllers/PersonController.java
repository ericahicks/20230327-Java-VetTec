package com.skillstorm.training.day4.controllers;
import com.skillstorm.training.day4.models.Person;

public class PersonController {
	
	public static void main(String[] args) {
		Person jon = new Person();
		System.out.println(jon.getName());
		jon.setName("Jon");
		System.out.println(jon.getName());
		
		Person madonna = new Person();
		madonna.setName("Madonna");
		jon.setBestFriend(madonna);
		System.out.println("Jon is best friends with " + jon.getBestFriend().getName());
		
		madonna.setBestFriend(jon);
		System.out.println("Madonna's best friend is " + madonna.getBestFriend().getName());
	}

}
