package com.vvkee.structure.string;

public class StringMatch {

	public static void main(String[] args) {
		String s = "goodgoogleaaagoogle";
		String m = "google";
		int pos = match(s, m, 0);
		System.out.println("position is " + pos);
	}

	/**
	 * 朴素的模式匹配算法
	 * 
	 * @param s
	 * @param m
	 * @param pos
	 * @return
	 */
	private static int match(String s, String m, int pos) {
		char[] sc = s.toCharArray();
		char[] mc = m.toCharArray();
		int i = pos;
		int j = 0;
		// 若i小于sc的长度且j小于mc的长度时循环
		while (i <= sc.length - 1 && j <= mc.length - 1) {
			System.out.println(i + " " + j);
			if (sc[i] == mc[j]) {
				System.out.println("i is " + i + " , j is " + j);
				++i;
				++j;
			} else {
				i = i - j + 1;
				j = 0;
			}
		}

		if (j == mc.length) {
			return i - mc.length;
		} else {
			return -1;
		}
	}

	private int kmp(String s, String m, int pos) {
		return 0;
	}
}
