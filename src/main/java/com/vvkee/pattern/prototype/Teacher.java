package com.vvkee.pattern.prototype;

import java.io.Serializable;

/**
 * 实现深度克隆
 * 
 * @author xuhf
 *
 */
public class Teacher implements Serializable {

	private static final long serialVersionUID = -7629519210832022004L;

	private String name;

	private int age;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}

}
