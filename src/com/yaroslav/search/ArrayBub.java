package com.yaroslav.search;

public class ArrayBub {
	
	private long [] arr;
	private int nElem;
	
	public ArrayBub(int max) {
		arr = new long [max];
		nElem = 0;
	}
	
	public void insert(long value) {
		arr[nElem++] = value;
	}
	
	public void display() {
		System.out.println("There is " + nElem + " elements in the array");
		for (int i = 0; i < nElem; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void bubbleSort() {
		int out, in;	
		for(out = nElem - 1; out > 1; out--) {
			for(in = 0; in < out; in ++) {
				if (arr[in] > arr[in + 1])
					swap(in, in + 1);
			}
		}
	}
	
	private void swap (int one, int two) {
		long temp = arr[one];
		arr[one] = arr[one + 1];
		arr[one + 1] = temp;
	}
}
