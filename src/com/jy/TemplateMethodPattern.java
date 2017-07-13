package com.jy;

public class TemplateMethodPattern {

	public static void main(String[] args) {
		int[] testData = new int[] { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };
		AbstractSort sort = new ConcretSort();
		sort.showSortResult(testData);
	}

}
