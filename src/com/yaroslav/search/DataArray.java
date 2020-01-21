package com.yaroslav.search;

public class DataArray {
	private Person [] arr;
	private int nElem;
	
	public DataArray(int max) {
		arr = new Person[max];
		nElem = 0;
	}
	
	public int find(String searchName) {
		int j;
		for (j = 0; j < nElem; j++) {
			if (arr[j].getLastName().equals(searchName))
				break;
		}
		if (j == nElem) {
			return nElem;
		} 
			return j;
	}
	
	public void insert(String lastName, String firstName, int age) {
		arr[nElem++] = new Person(lastName, firstName, age);
	}
	
	public boolean delete(String searchName) {
		int temp = find(searchName);  
		if (temp != nElem) {
			for (int i =temp ; i < nElem; i++) {
				arr[i] = arr[i + 1];
			}
			nElem--;
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.println("Quontity of records: " + nElem);
		for (int i = 0; i < nElem; i++) {
			arr[i].displayPerson();
		}
	}
}
