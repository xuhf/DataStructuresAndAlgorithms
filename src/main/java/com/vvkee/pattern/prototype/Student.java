package com.vvkee.pattern.prototype;

/**
 * 实现浅克隆
 * 
 * @author xuhf
 *
 */
public class Student implements Cloneable {

	private String name;

	private int age;

	private Class clazz;

	public Student() {
		super();
	}

	public Student(String name, int age, Class clazz) {
		super();
		this.name = name;
		this.age = age;
		this.clazz = clazz;
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

	public Class getClazz() {
		return clazz;
	}

	public void setClazz(Class clazz) {
		this.clazz = clazz;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", clazz=" + clazz + "]";
	}

}
