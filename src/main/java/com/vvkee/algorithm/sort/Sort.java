package com.vvkee.algorithm.sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] s = { 10, 3, 2, 7, 6, 0, 8, 4, 1, 9, 5 };
		insertSort(s);
		System.out.println(Arrays.toString(s));
	}

	/**
	 * 选择排序
	 * 
	 * 从左至右遍历，找到最小(大)的元素，然后与第一个元素交换。<br/>
	 * 
	 * 从剩余未排序元素中继续寻找最小（大）元素，然后与第二个元素进行交换。<br/>
	 * 
	 * 以此类推，直到所有元素均排序完毕。<br/>
	 * 
	 * 之所以称之为选择排序，是因为每一次遍历未排序的序列我们总是从中选择出最小的元素。
	 */
	public static void selectSort(int[] s) {
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] > s[j]) {
					swap(s, i, j);
					System.out.println("交换完后--->" + Arrays.toString(s));
				}
			}
		}
	}

	/**
	 * 插入排序
	 * 
	 * 从第一个元素开始，该元素可以认为已经被排序<br/>
	 * 
	 * 取出下一个元素，在已经排序的元素序列中从后向前扫描<br/>
	 * 
	 * 如果该元素小于前面的元素（已排序），则依次与前面元素进行比较如果小于则交换，直到找到大于该元素的就则停止；<br/>
	 * 
	 * 如果该元素大于前面的元素（已排序），则重复步骤2<br/>
	 * 
	 * 重复步骤2~4 直到所有元素都排好序 。<br/>
	 * 
	 * @param s
	 */
	public static void insertSort(int[] s) {
		// 从第二个元素开始
		for (int i = 1; i < s.length; i++) {
			// 从第i个元素开始，一次和前面已经排好序的i-1个元素比较，如果小于，则交换
			for (int j = i; j > 0; j--) {
				if (s[j] < s[j - 1]) {
					swap(s, j, j - 1);
					System.out.println("交换完后--->" + Arrays.toString(s));
				} else {
					// 如果大于，则不用继续往前比较了，因为前面的元素已经排好序，比较大的大就是教大的了。
					break;
				}
			}
		}
	}

	private static void swap(int[] s, int i, int j) {
		int temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}
}
