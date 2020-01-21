package com.yaroslav;

import com.yaroslav.search.HighArray;
import com.yaroslav.search.OrdArray;

public class Application {

	public static void main(String[] args) {
		arrayTest();
	}
	public static void arrayTest() {
		HighArray arr = new OrdArray(100);
		
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display();
		
		if(arr.find(19) != arr.size())
			System.out.println("Awesom");
		else 
			System.out.println("Ah shit");
		
		arr.delete(55);
		arr.delete(99);
		arr.delete(00);
		
		arr.display();
		
	}
}
