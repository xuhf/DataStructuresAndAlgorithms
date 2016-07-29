package com.vvkee.structure.queue;

import java.util.Arrays;

/**
 * 循环队列
 * 
 * @author xuhaifei
 *
 */
public class LoopQueue {

	Object[] data;
	int front;
	int rear;

	public LoopQueue(int maxSize) {
		// 初始化队列
		data = new Object[maxSize];
		front = 0;
		rear = 0;
	}

	public int length() {
		// 返回当前队列的元素个数，也就是队列的当前长度
		return (this.rear - this.front + data.length) % data.length;
	}

	public void en(Object d) {
		// 若队列未满，则插入元素d为队列的新的队尾元素
		if ((this.rear + 1) % this.data.length == this.front) {
			// 队列已经满了
			throw new RuntimeException("queue 满");
		}
		data[this.rear] = d;
		this.rear = (this.rear + 1) % data.length;
	}

	public Object de() {
		if (this.rear == this.front) {
			return null;
		}
		Object e = data[this.front];
		data[this.front] = null;
		this.front = (this.front + 1) % data.length;
		return e;
	}

	public void print() {
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		// LoopQueue queue = new LoopQueue(5);
		// queue.en(1);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// queue.en(2);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// Object e = queue.de();
		// System.out.println(e);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// queue.en(3);
		// queue.en(4);
		// queue.en(5);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// queue.en(6);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// 第二种情况
		// LoopQueue queue = new LoopQueue(5);
		// queue.en(1);
		// queue.en(2);
		// queue.en(3);
		// queue.en(4);
		// queue.print();
		// System.out.println(queue.front + " " + queue.rear);
		// queue.en(5);

		LoopQueue queue = new LoopQueue(5);
		queue.en(1);
		queue.en(2);
		queue.en(3);
		queue.en(4);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
		Object e = queue.de();
		System.out.println(e);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
		queue.en(5);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
		Object e1 = queue.de();
		System.out.println(e1);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
		queue.en(6);
		queue.print();
		System.out.println(queue.front + " " + queue.rear);
	}
}
