package com.vvkee.structure.list;

import java.util.Arrays;

public class StaticList {

	private int MAXSIZE = 10;

	static class Element {
		Object data;
		int cur;

		public Element() {

		}

		public Element(Object data) {
			this.data = data;
		}

		public String toString() {
			return "Element [data=" + data + ", cur=" + cur + "]";
		}
	}

	Element[] elements;
	int length;

	/**
	 * 初始化静态链表<br/>
	 * 未被使用的数组元素称为备用链表 <br/>
	 * 数组的第一个元素，既nodes[0] 的元素的cur就存放备用链表的第一个结点的下标。 <br/>
	 * 而数组的最后一个元素的cur则存放第一个有数值的元素的下标
	 * 
	 * @param sl
	 */
	public StaticList() {
		elements = new Element[MAXSIZE];
		for (int i = 0; i < MAXSIZE; i++) {
			Element e = new Element();
			e.data = null;
			e.cur = i + 1;
			elements[i] = e;
		}
		elements[MAXSIZE - 1].cur = 0;
		elements[0].cur = 1;
	}

	/**
	 * 静态链表的插入操作
	 * 
	 * @param d
	 */
	public void add(Object d) {
		if (length >= MAXSIZE - 2) {
			throw new RuntimeException("static list is full");
		}
		// 指向备用链表第一个结点的cur为0
		int next = elements[0].cur;
		int c = elements[elements[0].cur].cur;
		elements[next].data = d;
		elements[next].cur = 0;
		if (elements[MAXSIZE - 1].cur == 0) {
			elements[MAXSIZE - 1].cur = next;
		} else {
			Element e = elements[elements[MAXSIZE - 1].cur];
			while (e.cur != 0) {
				e = elements[e.cur];
			}
			e.cur = next;
		}
		elements[0].cur = c;
		length++;
		if (length >= MAXSIZE - 2) {
			// 如果静态链表已经满了，那么指向备用链表第一个结点的cur为0
			elements[0].cur = 0;
		}
		System.out.println(Arrays.toString(elements));
	}

	/**
	 * 静态链表的删除操作
	 * 
	 * @param d
	 */
	public void remove(Object d) {
		int c = elements[MAXSIZE - 1].cur;
		if (c == 0) {
			throw new RuntimeException("static list is empty");
		}
		Element e = elements[c];
		while (e.data != null) {
			if (e.data.equals(d)) {
				int next = e.cur;
				e.data = null;
				e.cur = elements[MAXSIZE - 1].cur;
				elements[MAXSIZE - 1].cur = next;
			} else {
				e = elements[e.cur];
			}
		}
	}

	public static void main(String[] args) {
		StaticList sl = new StaticList();
		sl.add("D1");
		sl.add("D2");
		sl.add("D3");
		sl.add("D4");
		// sl.add("D5");
		System.out.println(sl.length);
		// sl.add("D3");
	}
}
