package com.jy;

public class ConcretSort extends AbstractSort {

	@Override
	protected void sort(int[] array) {
		// 冒泡排序
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}
