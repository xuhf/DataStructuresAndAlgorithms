package com.vvkee.structure.stack;

import java.util.Arrays;

public class StackUse {

	public static void main(String[] args) {
		rabbit();
		fbi();
	}

	public static void rabbit() {
		int i = 0;
		int month = 24;
		int a[] = new int[month];
		a[0] = 1;
		a[1] = 1;
		for (i = 2; i < month; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		System.out.println(Arrays.toString(a));
	}

	public static void fbi() {
		int month = 24;
		for (int i = 1; i <= month; i++) {
			System.out.println(fbi(i));
		}
	}

	private static int fbi(final int i) {
		if (i < 2) {
			return i == 0 ? 0 : 1;
		}
		return fbi(i - 1) + fbi(i - 2);
	}
}
