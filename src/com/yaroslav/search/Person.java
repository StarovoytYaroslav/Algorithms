package com.yaroslav.search;

public class Person {
	private String lastName;
	private String firstName;
	private int age;
	
	public Person(String lastName, String firstName, int age) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}
	
	public void displayPerson() {
		System.out.println(lastName + " " + firstName + " : " + age);
	}
}
