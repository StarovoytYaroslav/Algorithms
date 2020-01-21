package com.yaroslav.search;

public class OrdArray extends HighArray {
	public OrdArray(int max) {
		super(max);
	}

	@Override
	public void insert(long value) {
		int j;
		for (j = 0; j < nElem; j++) {
			if (a[j] > value)
				break;
		}
		for (int k = nElem; k > j; k--) {
			a[k] = a[k-1];
		}
		a[j] = value;
		nElem++;
	}
	
	@Override
	public int find(long searchKey) {
		int lowerBound = 0;
		int upperBound = nElem - 1;
		int curIn;
		
		while (true) {
			curIn = (lowerBound + upperBound) / 2;
			if (a[curIn]  == searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElem;
			else {
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else 
					upperBound = curIn - 1;
			}
		}
	}
}
