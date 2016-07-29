package com.vvkee.structure.stack;

import java.util.Arrays;

public class ArrayStack {

	int maxSize = 10;

	Object[] data;

	int top = -1;

	public ArrayStack() {
		data = new Object[maxSize];
	}

	public void push(Object d) {
		if (top == maxSize - 1) {
			throw new RuntimeException("stack is full");
		}
		top++;
		data[top] = d;
		System.out.println(Arrays.toString(data));
	}

	public Object pop() {
		if (top < 0) {
			throw new RuntimeException("stack is empty");
		}
		Object d = data[top];
		data[top] = null;
		top--;
		System.out.println(Arrays.toString(data));
		return d;
	}

	public static void main(String[] args) {
		ArrayStack as = new ArrayStack();
		as.push(1);
		Object d = as.pop();
		System.out.println(d);
	}
}
