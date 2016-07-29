package com.vvkee.structure.stack;

public class LinkedStack {

	Node top;

	public static class Node {
		Object data;
		Node next;
	}

	int count;

	public LinkedStack() {

	}

	public void push(Object d) {
		Node n = new Node();
		n.data = d;
		n.next = top;
		top = n;
		count++;
	}

	public Object pop() {
		// 空栈
		if (top == null) {
			throw new RuntimeException("stack is empty");
		}
		Node n = top;
		top = n.next;
		count--;
		return n.data;
	}

	public static void main(String[] args) {
		LinkedStack ls = new LinkedStack();
		ls.push(1);
		System.out.println(ls.top.data);
		ls.push(2);
		System.out.println(ls.top.data);
		System.out.println("count is " + ls.count);
		Object d = ls.pop();
		System.out.println("d is " + d);
		System.out.println("top is " + ls.top.data);
	}
}
