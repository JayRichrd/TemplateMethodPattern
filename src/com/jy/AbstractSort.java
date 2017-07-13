package com.jy;

public abstract class AbstractSort {
	/**
	 * 将数组按照有小到大的顺序排列
	 * 
	 * @param array
	 */
	protected abstract void sort(int[] array);

	/**
	 * 打印数组
	 * 
	 * @param array
	 */
	public void showSortResult(int[] array) {
		// 先对数组进行排序
		this.sort(array);

		// 打印排序后的数组
		System.out.print("排序后的数组：");
		for (int i : array) {
			System.out.printf("%3s", i);
		}
	}
}
