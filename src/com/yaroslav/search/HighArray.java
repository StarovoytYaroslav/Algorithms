package com.yaroslav.search;

public class HighArray {
	protected long [] a;
	protected int nElem;
	
	public HighArray(int max) {
		a = new long [max];
		nElem = 0;
	}
	
	public int find(long searchKey) {
		int j;
		for (j = 0; j < nElem; j++) {
			if (a[j] == searchKey)
				return j;
		}
		return nElem;
	}
	
	public void insert(long value) {
		a[nElem++] = value;
	}
	
	public boolean delete(long value) {
		int j = find(value);
		if (j != nElem) {
			for(int i = j; i < nElem; i++) {
				a[i] = a[i + 1];
			}
			nElem--;
			return true;
		}
		return false;
	}
	
	public void display() {
		for (int i = 0; i < nElem; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public int size() {
		return nElem;
	}
	
}
