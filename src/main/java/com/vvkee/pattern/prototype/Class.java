package com.vvkee.pattern.prototype;

public class Class {

	private String name;

	private int count;

	public Class() {
		super();
	}

	public Class(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", count=" + count + "]";
	}

}
