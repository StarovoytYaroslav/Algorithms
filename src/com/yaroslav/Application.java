package com.yaroslav;

import com.yaroslav.search.DataArray;
import com.yaroslav.search.HighArray;
import com.yaroslav.search.OrdArray;

public class Application {

	public static void main(String[] args) {
		dataArrayTest();
	}
	//Array Test
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
	//Data Array Test
	public static void dataArrayTest() {
		int maxSize = 100;
		DataArray arr = new DataArray(maxSize);
		
		arr.insert("Evans", "Patty", 24);
		arr.insert("Smith", "Lorraine", 37);
		arr.insert("Yee", "Tom", 43);
		arr.insert("Adams", "Henry", 63);
		arr.insert("Hashimoto", "Sato", 21);
		arr.insert("Stimson", "Henry", 29);
		arr.insert("Velasquez", "Jose", 72);
		arr.insert("Lamarque", "Henry", 54);
		arr.insert("Vang", "Minh", 22);
		arr.insert("Creswell", "Lucinda", 18);
		
		arr.display();
		
		System.out.println(arr.find("Stimson"));
		
		arr.delete("Stimson");
		arr.delete("Yee");
		arr.delete("Creswell");
		
		arr.display();
	}
}
